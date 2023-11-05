import Table from "./Table.tsx";
import {useEffect} from "react";
import {OpeningSchedule} from "../../../../context/opening-schedule/OpeningScheduleProvider.tsx";
import useOpeningSchedule from "../../../../context/opening-schedule/useOpeningSchedule.ts";

const Body = () => {
  const {openingScheduleList, getAllOpeningSchedule} = useOpeningSchedule();
  useEffect(() => {
    return getAllOpeningSchedule();
  }, [getAllOpeningSchedule]);
  return (
    <tbody className="text-stone-900 text-[15px]">
    {openingScheduleList.map((openingSchedule: OpeningSchedule) => (
      <Table openingSchedule={openingSchedule} key={openingSchedule.openingScheduleId}/>
      )
    )}
    </tbody>
  );
};

export default Body;