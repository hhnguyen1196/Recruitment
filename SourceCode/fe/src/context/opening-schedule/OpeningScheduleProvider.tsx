import {createContext, ReactNode, useReducer} from "react";
import axios from "axios";
import {host} from "../../environments/host.ts";
import {API} from "../../environments/api.ts";

enum OpeningScheduleAction {
  LOADING = 'loading',
  GET_ALL_OPENING_SCHEDULE = 'openingSchedules/getAll',
  GET_BY_ID_OPENING_SCHEDULE = 'openingSchedules/getById',
  CREATE_OPENING_SCHEDULE = 'openingSchedules/create',
  UPDATE_OPENING_SCHEDULE = 'openingSchedules/update',
  DELETE_OPENING_SCHEDULE = 'openingSchedules/delete',
}

export type OpeningSchedule = {
  openingScheduleId: number,
  courseName: string,
  openingDay: Date,
  schedule: string,
  time: number,
  numberOfStudent: number,
  provinceName: string
}

type State = {
  openingScheduleList: OpeningSchedule[],
  openingSchedule: OpeningSchedule,
  isLoading: boolean,
  error: string
}

type ContextValue = State & {
  getAllOpeningSchedule: () => void;
}

type Action = {
  type: OpeningScheduleAction,
  payload?: State
}

type Props = {
  children?: ReactNode
}

const initialState: State = {
  openingScheduleList: [],
  openingSchedule: {
    openingScheduleId: 0,
    courseName: '',
    openingDay: new Date(),
    schedule: '',
    time: 0,
    numberOfStudent: 0,
    provinceName: ''
  },
  isLoading: false,
  error: ''
}

export const OpeningScheduleContext = createContext<ContextValue | null>(null);

function reducer(state: State, action: Action): State {
  switch (action.type) {
    case OpeningScheduleAction.LOADING:
      return {...state, isLoading: true};
    case OpeningScheduleAction.GET_ALL_OPENING_SCHEDULE:
      return {...state, openingScheduleList: action.payload?.openingScheduleList} as State;
    case OpeningScheduleAction.GET_BY_ID_OPENING_SCHEDULE:
      return {...state};
    case OpeningScheduleAction.CREATE_OPENING_SCHEDULE:
      return {...state};
    case OpeningScheduleAction.UPDATE_OPENING_SCHEDULE:
      return {...state};
    case OpeningScheduleAction.DELETE_OPENING_SCHEDULE:
      return {...state};
    default:
      throw new Error("Unknown action type");
  }
}

const OpeningScheduleProvider = ({children}: Props) => {
  const [{openingScheduleList, openingSchedule, isLoading, error},
    dispatch] = useReducer(reducer, initialState);
  async function getAllOpeningSchedule() {
    try {
      const {data} = await axios.get(host(`${API.OPENING_SCHEDULE}`),
        {
          headers: {
            Accept: 'application/json'
          }
        },
      )
      dispatch({type: OpeningScheduleAction.GET_ALL_OPENING_SCHEDULE, payload: data})
    } catch (error) {
      throw new Error("Network Error");
    }
  }
  return (
    <OpeningScheduleContext.Provider 
      value={{
        openingScheduleList,
        openingSchedule, 
        isLoading, 
        error,
        getAllOpeningSchedule
    }}>
      {children}
    </OpeningScheduleContext.Provider>
  );
};

export default OpeningScheduleProvider ;