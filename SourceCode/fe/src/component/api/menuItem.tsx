import {Navigate, RouteObject} from "react-router-dom";
import Home from "../../model/menu-item/home/Home.tsx";
import OpeningSchedule from "../../model/menu-item/opening-schedule/OpeningSchedule.tsx";
import Recruitment from "../../model/menu-item/recruitment/Recruitment.tsx";
import Contact from "../../model/menu-item/contact/Contact.tsx";

export const menuItem: RouteObject[] = [
  {
    index: true,
    element: <Navigate replace to={"/home"}/>
  },
  {
    path: "/home",
    element: <Home/>,
  },
  {
    path: "/recruitment",
    element: <Recruitment/>
  },
  {
    path: "opening-schedule",
    element: <OpeningSchedule/>
  },
  {
    path: "contact",
    element: <Contact/>
  }
]