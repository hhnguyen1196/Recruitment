import {AiFillFacebook} from "react-icons/ai";
import {AiOutlineGithub} from "react-icons/ai";
import {BiLogoGmail} from "react-icons/bi";

const Footer = () => {
  const date = new Date().getFullYear();
  return (
    <footer className="text-center py-2 bg-stone-100">
      <div className="flex gap-2 justify-center mb-2">
        <a href="https://www.facebook.com/nghoanghaii/"><AiFillFacebook size={32}/></a>
        <a href="https://github.com/hhnguyen1196"><AiOutlineGithub size={32}/></a>
        <a href="mailto:nghhai1196@gmail.com"><BiLogoGmail size={32}/></a>
      </div>
      <span>&copy; {date} by HaiNH69@fpt.com</span>
    </footer>
  );
};

export default Footer;