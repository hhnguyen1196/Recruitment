import MenuNav from "./MenuNav.tsx";
import Button from "./Button.tsx";
import {Link} from "react-router-dom";

const Header = () => {
  return (
      <header className="flex justify-between items-center px-10 py-2 bg-stone-100">
        <div>
          <Link to="home">
            <img src="../src/assets/image/header/logo.png" alt="img" className="h-10 w-10"/>
          </Link>
        </div>
        <div>
          <MenuNav/>
        </div>
        <div>
          <Button type="goHome" onClick={() => {}}>Login</Button>
        </div>
      </header>

  );
};

export default Header;