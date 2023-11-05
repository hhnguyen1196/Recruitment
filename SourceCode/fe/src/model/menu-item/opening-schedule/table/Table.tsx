import {OpeningSchedule} from "../../../../context/opening-schedule/OpeningScheduleProvider.tsx";

type Props = {
  openingSchedule: OpeningSchedule
}

const Table = ({openingSchedule}: Props) => {
  const styles = "px-3 py-2";
  const styleButton = "px-3 py-1 bg-lime-500 text-white rounded";
  return (
    <tr className="border-b-2">
      <td className={styles + " font-bold"}>{openingSchedule.courseName}</td>
      <td className={styles}>{openingSchedule.openingDay.toString()}</td>
      <td className={styles}>{openingSchedule.provinceName}</td>
      <td className={styles}>{openingSchedule.schedule}</td>
      <td className={styles}>{openingSchedule.time}</td>
      <td className={styles}>{openingSchedule.numberOfStudent}</td>
      <td className={styles + " text-center"}>
        <button className={styleButton}>Đăng ký</button>
      </td>
    </tr>
  );
};

export default Table;