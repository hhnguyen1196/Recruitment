import {useContext} from "react";
import {OpeningScheduleContext} from "./OpeningScheduleProvider.tsx";

const useOpeningSchedule = () => {
  const context = useContext(OpeningScheduleContext);
  if (context === null) {
    throw new Error("OpeningScheduleProvider was used out of scope access");
  }
  return context;
};

export default useOpeningSchedule;