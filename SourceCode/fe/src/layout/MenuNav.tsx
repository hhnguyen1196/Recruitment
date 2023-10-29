import {NavLink} from "react-router-dom";

const styles = "font-bold";

const MenuNav = () => {
  return (
    <ul className="flex gap-4">
      <li className={styles}>
        <NavLink to={"/home"}>Trang chủ</NavLink>
      </li>
      <li className={styles}>
        <NavLink to={"/recruitment"}>Tuyển dụng</NavLink>
      </li>
      <li className={styles}>
        <NavLink to={"/opening-schedule"}>Lịch khai giảng</NavLink>
      </li>
      <li className={styles}>
        <NavLink to={"/contact"}>Liên hệ</NavLink>
      </li>
    </ul>
  );
}

export default MenuNav;