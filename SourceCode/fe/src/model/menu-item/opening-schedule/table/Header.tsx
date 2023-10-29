const Header = () => {
  const styles = "px-3 py-3";
  const widthColumn = {
    courses: " w-[322px]",
    openingDay: " w-[150px]",
    area: " w-[108px]",
    schedule: " w-[280px]",
    time: " w-[108px]",
    blank: " w-[108px]",
    register: " w-[108px]"
  }
  return (
    <thead className="bg-gray-800 text-white text-[15px]">
      <tr className="text-left font-bold">
        <th className={styles + widthColumn.courses}>Khoá học</th>
        <th className={styles + widthColumn.openingDay}>Ngày khai giảng</th>
        <th className={styles + widthColumn.area}>Khu vực</th>
        <th className={styles + widthColumn.schedule}>Lịch học</th>
        <th className={styles + widthColumn.time}>Thời lượng</th>
        <th className={styles + widthColumn.blank}>Chỗ trống</th>
        <th className={styles + widthColumn.register}>Đăng ký</th>
      </tr>
    </thead>
  );
};

export default Header;