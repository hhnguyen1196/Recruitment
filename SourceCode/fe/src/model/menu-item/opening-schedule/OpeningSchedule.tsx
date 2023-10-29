import Header from "./table/Header.tsx";
import Body from "./table/Body.tsx";

const OpeningSchedule = () => {
  return (
    <div className="px-[320px]">
      <h1 className="uppercase font-bold text-4xl text-stone-600 pt-40 mb-10">Lịch khai giảng</h1>
      <div className="w-full">
        <div className="shadow overflow-hidden rounded border-gray-200">
          <table className="table table-fixed min-w-full bg-white">
            <Header/>
            <Body/>
          </table>
        </div>
      </div>
    </div>
  );
};

export default OpeningSchedule;