const Body = () => {
  const styles = "px-3 py-2";
  const styleButton = "px-3 py-1 bg-lime-500 text-white rounded";
  return (
    <tbody className="text-stone-900 text-[15px]">
      <tr className="border-b-2">
        <td className={styles + " font-bold"}>[ĐN] IT – Business Analyst Foundation</td>
        <td className={styles}>23-10-2023</td>
        <td className={styles}>Đà Nẵng</td>
        <td className={styles}>18h00 - 21h00 thứ 3, 5, 7 hàng tuần</td>
        <td className={styles}>70 giờ</td>
        <td className={styles}>10/25</td>
        <td className={styles + " text-center"}>
          <button className={styleButton}>Đăng ký</button>
        </td>
      </tr>
      <tr className="border-b-2">
        <td className={styles + " font-bold"}>[Online – Virtual Training] IT – Business Analyst Foundation</td>
        <td className={styles}>23-10-2023</td>
        <td className={styles}>Hà Nội</td>
        <td className={styles}>18h00 - 21h00 thứ 3, 5 8h30 - 11h30 thứ 7</td>
        <td className={styles}>70 giờ</td>
        <td className={styles}>10/20</td>
        <td className={styles + " text-center"}>
          <button className={styleButton}>Đăng ký</button>
        </td>
      </tr>
    </tbody>
  );
};

export default Body;