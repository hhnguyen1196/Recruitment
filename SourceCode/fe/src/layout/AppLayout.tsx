import Header from "./Header.tsx";
import Footer from "./Footer.tsx";
import {Outlet} from "react-router-dom";

const AppLayout = () => {
  return (
    <>
      <Header/>
      <main className="min-h-[818px] px-10">
        <Outlet/>
      </main>
      <Footer/>
    </>
  );
}

export default AppLayout;