import Header from "./Header.tsx";
import Footer from "./Footer.tsx";
import {useNavigate} from "react-router-dom";
import Button from "./Button.tsx";

const Error = () => {
  const navigate = useNavigate();
  return (
    <>
      <Header/>
        <div className="flex flex-col items-center justify-center py-16 min-h-[818px]">
          <div className="text-9xl font-bold py-4 text-blue-900">404</div>
          <h1 className="text-2xl mb-6">Truy cập của bạn bị lỗi hoặc không tìm thấy nội dung</h1>
          <Button onClick={() => navigate("/home")} type="goHome">Quay lại trang chủ</Button>
        </div>
      <Footer/>
    </>
  );
};

export default Error;