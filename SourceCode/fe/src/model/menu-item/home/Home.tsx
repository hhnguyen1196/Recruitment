const Home = () => {
  const styles = "text-center font-bold uppercase";
  return (
    <div className="flex justify-between">
      <div className="w-[700px]">
        <h1 className={styles + " text-8xl pt-12 mt-6 text-lime-500"}>Software</h1>
        <p className={styles + " text-8xl mt-2 mb-10 text-lime-700"}>Academy</p>
        <p className="text-3xl font-bold text-stone-600 mb-4">Học viện đào tạo kỹ sư Công nghệ thông tin</p>
        <hr/>
        <p className="text-4xl font-bold text-stone-600 my-8 text-center">Đối tượng tham gia</p>
        <div className="flex gap-4">
          <div className="w-1/3 bg-blue-800 text-stone-100 px-2 min-h-[340px] rounded-lg">
            <h4 className={styles + " my-8"}>Bạn muốn được đào tạo?</h4>
            <p className="text-center">Bạn là người mới bắt đầu hoặc mong muốn được đào tạo về những kỹ năng, công nghệ mới.</p>
          </div>
          <div className="w-1/3 bg-green-800 text-stone-100 px-2 min-h-[340px] rounded-lg">
            <h4 className={styles + " my-8"}>Bạn muốn được thực tập?</h4>
            <p className="text-center">Bạn đang tìm kiếm cơ hội thực tập với những trải nghiệm thực tế, giúp nâng cao kỹ năng chuyên môn & kỹ năng mềm, làm quen với môi trường và văn hóa doanh nghiệp.</p>
          </div>
          <div className="w-1/3 bg-orange-800 text-stone-100 px-2 min-h-[340px] rounded-lg">
            <h4 className={styles + " my-8"}>Bạn muốn tìm cơ hội việc làm?</h4>
            <p className="text-center">Bạn đã và đang theo đuổi ngành Công nghệ, muốn thử sức với vị trí Fresher hoặc làm việc tại dự án.</p>
          </div>
        </div>
      </div>
      <div>
        <h3 className={styles + " text-5xl pt-12 mt-6 text-lime-500"}>Học thử miễn phí</h3>
        <p className={styles + " text-3xl pt-4 py-8 mb-3 text-blue-800"}>Cùng chuyên gia công nghệ thông tin</p>
        <img src="../src/assets/image/model/home/recruitment.png" alt="image-content" className="rounded-lg"/>
      </div>
    </div>
  );
};

export default Home;