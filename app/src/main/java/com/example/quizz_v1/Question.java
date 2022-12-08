package com.example.quizz_v1;

import java.util.ArrayList;
import java.util.Arrays;

public class Question {
    private final String questionText;
    private final String optionA,optionB,optionC,optionD,correctAns;

    public Question(String questionText, String optionA, String optionB, String optionC, String optionD, String correctAns) {
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAns = correctAns;
    }

        public static ArrayList<Question> lichsu_de = new ArrayList<>(
                Arrays.asList(
                        new Question("Trong chiến dịch Điện Biên Phủ, binh chủng nào được ưu tiên tấn công đầu tiên?", "Pháo binh","Bộ binh","Thủy binh","Không binh","A"),
                        new Question("Văn miếu Quốc tử giám - Trường Đại học đầu tiên của Việt Nam được xây dưới triều đại nào?", "Nguyễn","Hồ","Lý","Lê","C"),
                        new Question("Cuộc khởi nghĩa Lê Lợi kéo dài mấy năm?", "10","6","14","13","A"),
                        new Question("Ai là vị trạng nguyên trẻ tuổi nhất nước Nam?", "Nguyễn Hiền","Lương Thế Vinh","Nguyễn Bỉnh Khiêm","Mạc Đĩnh Tri","A"),
                        new Question("Tình hình nổi bật của châu Á trước Chiến tranh thế giới thứ hai là gì?", "Tất cả các nước châu Á đều là nước độc lập.","Hầu hết các nước châu Á đều sự bóc lột, nô dịch của các nước đế quốc thực dân.","Các nước châu Á đều là thuộc địa kiểu mới của Mĩ.","Các nước châu Á đều là thuộc địa kiểu mới của Mĩ.","B"),
                        new Question("Cuộc Tổng tiến công và nổi dậy mùa Xuân năm 1975, đã lần lượt trải qua các chiến dịch", "Tây Nguyên, Huế - Đà Nẵng, Hồ Chí Minh.","Huế - Đà Nẵng, Khe Sanh, Hồ Chí Minh","Khe Sanh, Huế - Đà Nẵng, Hồ Chí Minh.","Tây Nguyên, Phước Long, Đường 9 - Nam Lào","A"),
                        new Question("Năm 1975, tỉnh nào ở miền Nam Việt Nam được giải phóng cuối cùng?", " Đồng Nai.","Châu Đốc.","Bến Tre.","Kiên Giang.","B"),
                        new Question("Ngày 29/3/1975 là ngày giải phóng thành phố", "Huế","Đà Nẵng","Sài Gòn","Nha Trang","B"),
                        new Question("Nava đề ra kế hoạch quân sự mới, hi vọng sẽ giành thắng lợi trong thời gian bao lâu ?", "12 tháng","16 tháng","18 tháng","20 tháng","C"),
                        new Question("Để thực hiện kế hoạch Na-va, Pháp đã tập trung ở Bắc Bộ một lực lượng cơ động mạnh lên đến bao nhiêu tiểu đoàn?", "40","44","46","84","B"),
                        new Question("Hội nghị Giơ-ne-vơ bàn về việc chấm đứt chiến tranh lập lại hoà bình ở Đông Dương họp từ ngày nào?", "26 – 4 - 1954","1 - 5 - 1954","7 - 5 - 1954","8 - 3 - 1954","D")
                ));
    public static ArrayList<Question> lichsu_trungbinh = new ArrayList<>(
            Arrays.asList(
                    new Question("Tham dự Hội nghị Giơ-ne-vơ về Đông Dương gồm có những nước nào", "Mĩ, Anh, Pháp, Việt Nam, Liên Xô"," Liên Xô, Việt Nam, Lào, Mĩ, Pháp","Liên Xô, Trung Quốc, Việt Nam, Mĩ, Anh, Pháp","Liên Xô, Việt Nam, Lào, Cam-pu-chia, Mĩ, Pháp","C"),
                    new Question("Tổng Bí thư Đảng gắn liền với công cuộc đổi mới đất nước là", "Nguyễn Văn Linh","Lê Duẩn","Đỗ Mười","Lê Khả Phiêu","A"),
                    new Question("Sự kiện đánh dấu việc Việt Nam hoàn thành thống nhất đất nước về mặt nhà nước là", "Đại thắng mùa Xuân năm 1975","Tổng tuyển cử bầu Quốc hội khóa VI (1976)","kì họp thứ nhất của Quốc hội khóa VI (1976)","hội nghị hợp thương chính trị tại Sài Gòn (1975)","C"),
                    new Question("Ngày 26/3/1975 là ngày giải phóng thành phố", "Huế","Nha Trang","Sài Gòn","Đà Nẵng","A"),
                    new Question("Tổng thống Mĩ nào đã chịu sự thất bại cuối cùng trong chiến tranh xâm lược Việt Nam?", "Ford.","Giônxơn","Kennơđi.","Níchxơn","A"),
                    new Question("Trong đường lối đổi mới đất nước (từ tháng 12/1986), Đảng Cộng sản Việt Nam chủ trương", "tập trung đổi mới về kinh tế - xã hội.","đổi mới toàn diện và đồng bộ","đổi mới căn bản và toàn diện","tập trung đổi mới về chính trị, tư tưởng","B"),
                    new Question("Một trong những điểm khác nhau giữa chiến dịch Hồ Chí Minh (1975) với chiến dịch Điện Biên Phủ (1954) ở Việt Nam là về", "quyết tâm giành thắng lợi.","địa bàn mở chiến dịch","sự huy động lực lượng đến mức cao nhất."," kết cục quân sự.","B"),
                    new Question("Hãy nêu mâu thuẫn cơ bản của xã hội Việt Nam sau chiến tranh thế giới lần thứ nhất ?", "giữa dân tộc Việt Nam với thực dân Pháp.","giữa giai cấp tư sản với giai cấp vô sản.","giữa  giai cấp nông dân với phong kiến","giữa giai cấp nông dân với tư sản","B"),
                    new Question("Vì sao ta phát động kháng chiến toàn quốc vào ngày 19/12/1946?", "Pháp vi phạm hiệp đĩnh sơ bộ.","ta không thể hòa được nữa.","Pháp gửi tối hậu thư cho ta."," Pháp bội ước tấn công ta.","C"),
                    new Question("Nha bình dân học vụ là cơ quan chuyên trách về chống:", "nội phản","giặc dốt.","ngoại xâm.","giặc đói","A"),
                    new Question("Hãy kể tên hai đảng ở Việt Nam là tay sai của quân Tưởng?", "Thanh Niên Cao Vọng, Tân Việt","Việt Quốc, Việt Cách","Đảng Tân Việt, Phục Việ","Đại Việt, Việt Quốc.","B")
            ));
    public static ArrayList<Question> lichsu_kho = new ArrayList<>(
            Arrays.asList(
                    new Question("Văn minh Văn Lang - Âu Lạc được hình thành trên khu vực nào của Việt Nam hiện nay?", "Bắc Bộ và Bắc Trung Bộ","Đông Nam Bộ và Tây Nam Bộ","Nam Trung Bộ và Tây Nguyên","Bắc Trung Bộ và Nam Trung Bộ","A"),
                    new Question("Văn minh Văn Lang - Âu Lạc ra đời vào khoảng thế kỉ VII TCN, gắn với nền văn hóa nào dưới đây?", "Văn hóa Óc Eo","Văn hóa Đông Sơn","Văn hóa Sa Huỳnh"," Văn hóa Hòa Bình","B"),
                    new Question("Văn minh Văn Lang - Âu Lạc còn được gọi là", "văn minh Đại Việt","văn minh sông Mã.","văn minh Việt Na"," văn minh sông Hồng","D"),
                    new Question("Loại hình nhà ở phổ biến của người Việt cổ là","nhà tranh vách đất"," nhà mái bằng xây từ gạch","nhà trệt xây từ gạch","nhà sàn làm từ gỗ, tre, nứa","D"),
                    new Question("Người Việt cổ không có phong tục nào dưới đây","Ăn trầu","Xăm mình"," Làm bánh chưng, bánh dày"," Lì xì cho trẻ em vào dịp Tết","D"),
                    new Question("Nhà nước Văn Lang ra đời vào khoảng thời gian nào?", "Thế kỉ VII TCN","Thế kỉ III TCN","Thế kỉ I","Thế kỉ V","A"),
                    new Question("Kinh đô của nhà nước Văn Lang được đặt tại đâu?", "Phong Châu (Việt Trì, Phú Thọ)","Phong Khê (Đông Anh, Hà Nội)","Vùng cửa sông Tô Lịch (Hà Nội)","Vùng cửa sông Bạch Đằng (Hải Phòng)","A"),
                    new Question("Nhà nước Âu Lạc ra đời vào khoảng thời gian nào?", "Thế kỉ VII TCN","Thế kỉ III TCN","Thế kỉ I","Thế kỉ V","B"),
                    new Question("Thời Văn Lang - Âu Lạc, đứng đầu các chiềng, chạ là", "Quan Lang","Lạc hầu"," Lạc tướng","Bồ chính","D"),
                    new Question("Thời Văn Lang - Âu Lạc, đứng đầu các bộ là", "Quan Lang","Lạc hầu","Lạc tướng","Bồ chính","C"),
                    new Question("Nhân vật lịch sử nào được đề cập đến trong câu đố sau?\n" +
                            "\n" +
                            "Vua nào công đức lưu danh,\n" +
                            "\n" +
                            "Dựng nước Âu Lạc, xây thành Cổ Loa?", "An Dương Vương","Hùng vương","Lý Nam Đế","Triệu Việt Vương","A")
            ));
    public static ArrayList<Question> dialy_de = new ArrayList<>(
            Arrays.asList(
                    new Question("Các đồng bằng châu thổ sông ở nước ta gồm:", "đồng bằng sông Hồng và đồng bằng sông Thái Bình","đồng bằng sông Cửu Long và đồng bằng sông Đồng Nai","đồng bằng sông Hồng và đồng bằng sông Cửu Long","đồng bằng sông Tiền và đồng bằng sông Hậu","C"),
                    new Question("ở đồng bằng sông Hồng, khu vực vẫn được bồi tụ phù sa vào mùa nước lũ là", " vùng trong đê","vùng ngoài đê","các ô trũng ngập nước","ria phía tây và tây bắc","B"),
                    new Question("so với đồng bằng sông Hồng thì đồng bằng sông Cửu Long", "Thấp hơn và bằng phẳng hơn","thấp hơn và ít bằng phẳng hơn","Cao hơn và bằng phẳng hơn"," Cao hơn và ít bằng phẳng hơn","A"),
                    new Question(" Đồng bằng sông Cửu Long có nhiều vùng Trũng lớn chưa được bồi lấp xong như", " Đồng Tháp Mười, Tứ giác Long Xuyên","Dọc sông Tiền, sông Hậu","Ven biển Đông và vịnh Thái Lan","Cà Mau, Bạc Liêu","A"),
                    new Question("“Về mùa lũ, nước ngập trên diện rộng; về mùa cạn, nước triều lấn mạnh” là đặc điểm của", "đồng bằng sông Hồng","đồng bằng sông Cửu Long","đồng bằng Quảng Nam","đồng bằng Tuy Hòa","B"),
                    new Question("\"2/3 diện tích đồng bằng là đất mặn, đất phèn\" là đặc điểm của", "đồng bằng sông Hồng","đồng bằng thanh hóa","đồng bằng Nghệ An","đồng bằng sông Cửu Long","D"),
                    new Question("thế mạnh nào dưới đây không có ở khu vực đồi núi?", " Khoáng sản ","nguồn thủy năng","nguồn hải sản ","rừng và đất trồng","C"),
                    new Question("thiên tai nào dưới đây không xảy ra ở khu vực đồi núi?", "lũ ống, lũ quét ","triều cường, ngập mặn","động đất, trượt lở đất ","sương muối, rét hại","B"),
                    new Question("Căn cứ vào Atlat địa lí Việt Nam trang 8, mỏ khoáng sản không phải mỏ than đá là", "Quỳnh Nhai","Vàng Danh","Phong Thổ","Nông Sơn","C"),
                    new Question("mỏ sắt có trữ lượng lớn nhất ở vùng Bắc Trung Bộ là", " Cổ Định","Thạch Khê","Lệ Thúy","Thạch Hà","B"),
                    new Question("các mỏ đá vôi xi măng lớn nhất phía nam phân bố ở tỉnh", "Đồng Nai","An Giang","Kiên Giang","Cà Mau","C")
            ));
    public static ArrayList<Question> dialy_trungbinh = new ArrayList<>(
            Arrays.asList(
                    new Question("Đặc điểm nào sau đây không phải của biển Đông?", "Nằm ở phía Đông của Thái Bình Dương","Là một biển rộng","Là biển tương đối kín ","Nằm trong vùng nhiệt đới ẩm gió mùa","A"),
                    new Question("Loại tài nguyên khoáng sản có giá trị nhất ở Biển Đông là", "Muối ","Dầu khí","hải sản","Cát trắng","B"),
                    new Question("Thiên tai mang lại thiệt hại lớn nhất cho cư dân vùng biển là", "Sạt lở bờ biển","Nạn cát bay","Triều cường","Bão","D"),
                    new Question("Loại thiên tai không xảy ra ở vùng biển nước ta là", "Sạt lở bờ biển","Nạn cát bay","Triều cường","Bão","C"),
                    new Question("Trong chế độ khi hậu, ở miền Bắc phân chia thành 2 mùa là", "Mùa đông lạnh, nhiều mưa và mùa hạ nóng, ít mưa","Mùa đông ấm áp, ít mưa và mùa hạ mát mẻ, ít mưa","Mùa đông lạnh, ít mưa và mùa hạ nóng ẩm, mưa nhiều","Mừa đông ấm áp, ít mưa và mùa hạ mát mẻ, mưa nhiều","C"),
                    new Question("Trong chế độ khí hậu, Nam BỘ và Tây Nguyên có hai mùa rõ rệt là", "Mùa gió Đông Bắc và mùa gió Tây Nam","Mùa nóng và mùa lạnh","Mùa nóng mưa nhiều và mùa lạn, khô","Mùa mưa và mùa khô","D"),
                    new Question("Trong chế độ khí hậu, giữa Tây Nguyên và đồng bằng ven biển Trung Trung Bộ có sự đối lập về", "Hướng gió","Mùa mưa và mùa khô","Mùa nóng và mùa lạnh ","Tất cả đều đúng","B"),
                    new Question("khu vực nòa có mưa lớn tập chung về thu – đông ở nước ta là", "Bắc Bộ","Nam Bộ","Ven biển Trung BỘ","Tây Nguyên","C"),
                    new Question("Gió mùa Đông Nam hoạt động ở miền bắc nước ta vào thời gian", " Cuối mùa đông","Đầu và giữa mùa hạ","Giữa và cuối mùa hạ","Đầu mùa đông","C"),
                    new Question("Vào nửa cuối mùa đông khối khí lạnh di chuyển qua biển nước nào?", "Hoa Kì, Trung Quốc","Trung Quốc, Hàn Quốc","Nhật Bản, Trung Quốc","Trung Quốc, Việt Nam","C"),
                    new Question("Gió mùa là nhân tố quan trọng dẫn tới", "sự phân mùa khí hậu khác nhau giữa các khu vực của nước ta","sự phân mùa khí hậu khác nhau giữa Tây Bắc và Đông Bắc.","sự phân hóa thiên nhiên đa dạng và phức tập giữa các vùng.","sự phân hóa thiên nhiên theo hướng Tây – Đông và độ cao.","A")
            ));
    public static ArrayList<Question> dialy_kho = new ArrayList<>(
            Arrays.asList(
                    new Question("Thiên nhiên nước ta có sự phân hóa theo chiều", "Bắc – Nam, Đông Bắc- Tây Nam và theo độ cao","Bắc – Nam, Đông – Tây và theo độ cao","Bắc – Nam, Đông – Tây và Đông Bắc- Tây Nam","Đông – Tây và Đông Bắc- Tây Nam và theo độ cao","B"),
                    new Question("cảnh quan thiên nhiên tiêu biểu củ phần lãnh thổ phía Bắc ( từ dãy Bạch Mã trở ra)", "Đới rừng cận xích đạo gió mùa","Đới rừng nhiệt đới gió mùa","Đới rừng xích đạo"," Đới rừng lá kim","B"),
                    new Question("Cảnh quan thiên nhiên tiêu biểu củ phần lãnh thổ phía Nam ( từ dãy Bạch Mã trở vào)", "Đới rừng cận xích đạo gió mùa","Đới rừng xích đạo","Đới rừng nhiệt đới gió mùa","Đới rừng lá kim","A"),
                    new Question("Đai ôn đới gió mùa trên núi( độ cao từ 2600m trở lên) có đặc điểm khí hậu", "Mát mẻ, nhiệt độ trung bình dưới 20oC","Quanh năm nhiệt độ dưới 15oC, mùa đông dưới 5oC","Mùa hạ nóng (trung bình trên 25oC), mùa đông lạnh dưới 10oC","Quanh năm lạnh, nhiệt độ trung bình dưới 10oC","B"),
                    new Question("Miền Bắc và Đông Bắc Bắc Bộ có đặc điểm khí hậu nào dưới đây?", "Khí hậu cận xích đạo gió mùa, biên độ nhiệt độ trong năm nhỏ","Trong năm chia thành mùa mưa, mùa khô rõ rệt","Gió mùa Đông Bắc hoạt động mạnh nhất, tạo nên một mùa đong lạnh","Vào mùa hạ, nhiều nơi có gió fơn ( gió Lào) khô nóng hoạt động","C"),
                    new Question("Miền Nam TRung BỘ và Nam Bộ có khí hậu", "Xích đạo ẩm","Cận nhiệt đới gió mùa","Cận nhiệt đới khô","Cận nhiệt đới gió mùa","D"),
                    new Question("Nhìn chung trên toàn quốc, mùa bão nằm trong khoảng thời gian nào", "Từ tháng III đến tháng X","Từ tháng VI đến Tháng XI","Từ tháng V đến tháng XII","Từ tháng V đến tháng V","B"),
                    new Question("Bão ở Việt Nam có đặc điểm nào dưới đây?", "Mùa bão chậm dần từ bắc vào nam","Bão đổ bộ vào miền Bắc có cường độ yếu hơn bào đổ bộ vào miền Nam"," Bão tập chung nhiều nhất vào các tháng V, VI, VII","Trung bình mỗi năm có 8-10 cơn bão đổ bộ vào bờ biển nước ta","A"),
                    new Question("Ở Trung Bộ, nguyên nhân gây ngập lụt mạnh vào các tháng IX – X là do", "các hệ thống sông lớn, lưu vực sông lớn","Mưa kết hợp với triều cường","Mưa bão lớn, nước biển dâng và lũ nguồn về"," Mưa diện rộng, mặt đát thấp xung quanh lại có đê bao bọc","C"),
                    new Question("Lũ quét xảy ra ở những nơi có điều kiện nào dưới đây?", "Sườn các cao nguyên, nơi đổ dốc xuống các bề mặt thấp hơn","Những lưu vực sông suối miền núi có địa hình cắt mạnh, độ dốc lớn, mất lớp phủ thực vật, đất dễ bị bóc mòn","Ở những đồng bằng thấp, nước sông dâng cao vào mùa lũ","Tất cả các nơi trên","B"),
                    new Question("Hai vấn đề lớn nhất trong bảo vệ môi trường ở nước ta là", "Suy giảm tài nguyên rừng và suy giảm tài nguyên đất","Suy giảm đa dạng sinh vật và suy giảm tài nguyên nước","Suy giảm tài nguyên rừng và suy giảm đa dạnh sinh vật","Mất cân bằng sinh thái môi trường và ô nhiễm môi trường","D")
            ));
    public static ArrayList<Question> thethao_de = new ArrayList<>(
            Arrays.asList(
                    new Question("Đâu không là tên một lọa môn thể thao?", "Bóng đá","BÓng chuyền","Bóng rổ","BÓng bay","D"),
                    new Question("Trong bóng đá, mỗi đội gồm bao nhiêu cầu thủ?", "7","8","11","12","C"),
                    new Question("Liên đòan bóng đá Việt Nam là?", "VFF","VFC","AFC","FIFA","A"),
                    new Question("Quốc gia nào vô địch World Cup 2018?", "Pháp","Đức","Ý","Brazil","A"),
                    new Question("Môn thể thao nào được coi là “môn thể thao vua”?", "Bóng đá","Tennis","Bóng rổ","Điền kinh","A"),
                    new Question("Cuộc đua ma ra tông kéo dài bao nhiêu km?", "42.195","20","34.195","56.183","A"),
                    new Question("Đại hội thể thao Olympic hiện đại lần đầu tiên năm 1886 có mấy môn thể thao dành cho phụ nữ, là những môn nào?", "0","1","2","3","A"),
                    new Question(" World Cup lần đầu tiên có bao nhiêu đội tham dự", "10","32","13","14","C"),
                    new Question(" World Cup lần đầu tiên tổ chức ở", "Uruguay","Anh","Pháp","Mỹ","A"),
                    new Question("Đội bóng nào của Ý đoạt được cả 3 Cup Châu Âu?", "Juventus","AC Milan","Inter","AS Roma","A"),
                    new Question("Môn võ nào được gọi là Hiệp khí đạo?", "Judo","Pencat silat","Karatedo","Aikido","D")
            ));
    public static ArrayList<Question> thethao_trungbinh = new ArrayList<>(
            Arrays.asList(
                    new Question("Đội tuyển bóng đá nước nào vô địch Euro năm 1976", "Đức","Ý","Pháp","Cả 3 đều sai","D"),
                    new Question("Trong bóng chày, đội nào được chơi trước?", "Đội thắng khi phân định bằng đồng xu"," Quyết định của trọng tài","Đội chủ nhà chơi trứơc","Đội khách chơi trước","D"),
                    new Question("cầu thủ nào là vua phá lưới tại WC 1994, Mỹ", "Hristo Stoichkov","Paolo Rossi","Gary Linker","Salvatore Schillacc","A"),
                    new Question("Thế vận hội năm 1940 được tổ chức ở nước nào", "Anh","Úc","Canada","Không tổ chức","D"),
                    new Question("Trong lịch sử vòng chung kết worldcup, có bao nhiêu đội vô địch với tư cách chủ nhà", "3","4","5","6","D"),
                    new Question("Michael Platini 3 lần đoạt giải quả bóng vàng Châu Âu khi đang chơi cho câu lạc bộ nào,", "Juventus","Inter","AC milan","AS Roma","A"),
                    new Question("Quốc gia nào tổ chức Seagames nhiều lần nhất ?", "Thái Lan","Indo","Việt Nam","Lào","A"),
                    new Question("Euro 1970 tổ chức tại nước nào?", "Anh","Pháp","Tây Ban Nha","Không tổ chức","D"),
                    new Question("Đội tuyển bóng đá vào nhiều trận chung kết World Cup nhất là bao nhiêu lần?", "4","5","6","7","D"),
                    new Question("Đội bóng nào lần đầu tiên vào WC đã đoạt chức vô địch thế giới?", " Uruguay","Tây Ban Nha","Brazil","Đức","A"),
                    new Question("Đội tuyển bóng đá nào vào nhiều trận chung kết World Cup nhất?", "Đức","Argentina","Pháp","Anh","A")
            ));

    public static ArrayList<Question> thethao_kho = new ArrayList<>(
            Arrays.asList(
                    new Question("Quốc gia nào đã tham dự Thế vận hội Mùa hè nhiều lần nhất nhưng vẫn chưa giành được huy chương vàng?", "philippines","Thái Lan","MAlaysia","Nhật Bản","A"),
                    new Question("Bán kính vòng tròn trung tâm sân bóng đá là:", "9m15","9m30","10m","9m","A"),
                    new Question("Cầu thủ xuất sắc nhất thế giới 2004", "Zidane","Giggs","Ronaldinho","Backham","C"),
                    new Question("Sadio Mane có hat-trick nhanh nhất tại Ngoại Hạng Anh ở:", "2m51s","1m12s","2m56s","3m4s","C"),
                    new Question("Ở World Cup mà Maradona ghi bàn thắng 'bàn tay của chúa' được tổ chức tại:", "Mỹ","Mexico","Pháp","Brazil","B"),
                    new Question("Đội đầu tiên dành danh hiệu Premier Leauge là:", "ManChester United","Chelsea","Nottingham fogrest","Dearby county","A"),
                    new Question("Shane Long có bàn thắng nhanh nhất lịch sử Ngoại hạng anh tại:", "8.24s","6.45s","7.69s","11.2s","C"),
                    new Question("Vua về nhì tại World Cup là:", "Đức","Hà lan","Anh","Tây Ban Nha","B"),
                    new Question("cầu thủ ghi nhiều bàn thắng nhất World Cup là người:", "Đức","Brazil","Argentina","Bồ Đào Nha","A"),
                    new Question("Câu Lạc Bộ nào từ Uk dành cúp Châu Âu đâu tiên:", "Celtic","Liverpool","Nottingham fgrest","Chelsea","A"),
                    new Question("Đan Mạch đã thay đội nào dự Euro 92", "Áo","Yugoslavia","Ba Lan","Đảo sip","B")
            ));

    public static ArrayList<Question> vanhoc_de = new ArrayList<>(
            Arrays.asList(
                    new Question("Tác phẩm nào viết theo khuynh hướng sử thi và cảm hứng lãng mạn cách mạng?", "Đất nước (Nguyễn Khoa Điềm)"," Sóng (Xuân Quỳnh)","Đò Lèn (Nguyễn Duy)","Đàn ghi ta của Lor-ca (Thanh Thảo","A"),
                    new Question("Chủ đề bài “Tây Tiến” của Quang Dũng là gì?", "Cảm hứng lãng mạn về người lính Tây Tiến hào hùng và hào hoa.","Cảnh thiên nhiên Tây Bắc hùng vĩ, dữ dội mà mĩ lệ."," Cuộc chiến đấu đầy cam go, gian khổ và vô cùng anh dũng của các chiến sĩ Tây Tiến.","Tình yêu thiên nhiên, quan hệ gắn bó giữa người lính Tây Tiên với nhân dân.","A"),
                    new Question("Chủ đề bài “Việt Bắc” của Tố Hữu là gì?", "Thiên nhiên hùng vĩ, tươi đẹp của núi rừng Việt Bắc.","Khúc tình ca về cách mạng và con người kháng chiến.","Khúc hùng ca và tình ca về cách mạng, về cuộc kháng chiến và con người kháng chiến","Tình cảm gắn bó keo sơn giữa các chiến sĩ cách mạng với đồng bào Việt Bắc, giữa quần chúng với lãnh tụ.","C"),
                    new Question("Đặc điểm nào sau đây không đặc trưng cho phong cách ngôn ngữ khoa học?", "Tính khái quát, trừu tượng","Tính truyền cảm, thuyết phục","Tính lí trí, lô-gic","Tính khách quan, phi cá thể","B"),
                    new Question("Bài thơ nào nguyên văn bằng chữ Hán? ", "Tự tình","Câu cá mùa thun","Bài ca ngắn đi trên bãi cát","Bài ca phong cảnh Hương Sơn","C"),
                    new Question("Tác phẩm “Thượng kinh kí sự” của Lê Hữu Trác phản ảnh xã hội phong kiến Việt Nam giai đoạn nào sau đây ?", "Đầu thế kỉ XVII","Cuối thế kỉ XVII","Nửa đầu thế kỉ XVIII","Nửa cuối thế kỉ XIII","C"),
                    new Question("“Truyện Lục Vân Tiên” của Nguyễn Đình Chiểu được xếp theo thể loại văn học nào sau đây?", " Tiểu thuyết","Thơ trữ tình","Truyện thơ","Thơ văn xuôi","C"),
                    new Question("“Truyện Lục Vân Tiên” của Nguyễn Đình Chiểu được viết bằng thế thơ nào sau đây", "Thất ngôn bát cú","Cổ phong","Song thất lục bát"," Lục bát","D"),
                    new Question("Bài thơ \"Thương vợ” của Trần Tế Xương thuộc thể loại nào sau đây ?", "Trữ tình","Trào phúng","Phê phán"," Tả thực","A"),
                    new Question("Chùm thơ thu nổi tiếng là của tác giả nào?", "Nguyễn Đình Chiểu","Nguyễn Khuyến","Trần Tế Xương","Đỗ Phủ","D"),
                    new Question("Bài thơ nào nguyên văn bằng chữ Hán?", " Tự tình","Câu cá mùa thu"," Bài ca ngắn đi trên bãi cát","Bài ca phong cảnh Hương Sơn","C")
            ));
    public static ArrayList<Question> vanhoc_trungbinh = new ArrayList<>(
            Arrays.asList(
                    new Question("Trong đoạn trích \"Hạnh phúc của một tang gia\", tiếng cười trào phúng và lòng căm phẫn của tác giả Vũ Trọng Phụng nhằm vào đối tượng nào?", "Những kẻ còn giữ thói phong kiến hủ lậu.","Những kẻ vì ham của, hợm của mà mất hết tình người","Những kẻ đua đòi “tân thời” - Âu hóa","Cả ba ý trên.","D"),
                    new Question("Tác phẩm nào đã nói đến sự hi sinh thầm lặng của người phụ nữ?", "Tự tình","Khóc Dương Khuê","Thương vợ"," Văn tế nghĩa sĩ cần Giuộc","C"),
                    new Question("Trong số những văn bản dưới đây, văn bản nào được viết theo thể hát nói?", "Bài ca ngắn đi trên bãi cát","Lẽ ghét thương","Vịnh khoa thi Hương","Bài ca phong cảnh Hương Sơn","D"),
                    new Question("Văn học Việt Nam từ đầu thế kỉ XX đến Cách mạng tháng Tám 1945 phát triển dưới chế độ xã hội nào", "Phong kiến"," Thực dân - phong kiến","Thực dân - nửa phong kiến","Nửa thực dân - nửa phong kiến","D"),
                    new Question("Vì sao viên quản ngục trong Chữ người tử tù nhận mình là “kẻ mê muội”?", "Đã không thấy hết tài viết chữ của ông Huân Cao","Đã không nhận rõ lẽ sông cao đẹp của con người","Muốn tỏ lòng tôn kính ông Huân Cao","Nhún nhường, khiêm tôn","C"),
                    new Question("Những lời nói cuổì cùng của Chí Phèo thể hiện tâm trạng nào?", "Khao khát sống","Liều chết","Căm hờn khi thấy mình đã bị lưu manh hóa","Uất ức, tuyệt vọng vì bị cự tuyệt quyền làm người","D"),
                    new Question("Người viết Chiếu cầu hiền là ai?", "Lê Thánh Tông","Thân Nhân Trung","Quang Trung","Ngô Thì Nhậm","D"),
                    new Question("Phẩm chất chủ yếu nào của người nông dân được Nguyễn Đình Chiểu ngợi ca trong Văn tế nghĩa sĩ Cần Giuộc?", "Cần cù, giản dị"," Chịu thương chịu khó","Dũng cảm chiến đấu hi sinh vì Tổ quốc"," Lập chiến tích vẻ vang","C"),
                    new Question("Câu nào dưới đây là nội hàm của khái niệm “Tràng giang”?", "Sóng biển dâng cao và hùng vĩ.","Bèo dạt trên dòng sông."," Con thuyền nhỏ trên dòng sông lớn.","Sông dài và rộng lớn.","D"),
                    new Question("Nỗi niềm thấm đẫm toàn bộ bài thơ Tràng giang là:", "Nỗi tuyệt vọng","Nỗi hoài nghi ","Nỗi băn khoăn","Nỗi buồn","D"),
                    new Question("Nhan đề “Từ ấy” được hiểu như thế nào?", "Giây phút giác ngộ ánh sáng của lí tưởng cộng sản","Giây phút bước chân vào cuộc đời hoạt động cách mạng.","Thời điểm bị Thực dân Pháp bắt giam vào ngục tù","Giây phút gặp được các chiến sĩ cộng sản hoạt động bí mật","A")
            ));
    public static ArrayList<Question> vanhoc_kho = new ArrayList<>(
            Arrays.asList(
                    new Question("Bài thơ “Từ ấy” ra đời trong hoàn cảnh nào?", "Vào năm 1938, khi tác giả được tham gia cách mạng.","Vào năm 1945, khi Cách mạng tháng Tám thắng lợi.","Vào năm 1975, khi đất nước thông nhất.g"," Vào năm 1930, khi Đảng Cộng sản Việt Nam ra đời.","A"),
                    new Question("Tác phẩm nào sau đây không phải là văn nghị luận?", "ha Noi","Thương tiếc nhà văn Nguyên Hồng","Ai đã đặt tên cho dòng sông?","Mấy ý nghĩ về thơ","C"),
                    new Question("Tác giả Kim Lân tên khai sinh", "Nguyễn Văn Tài","Nguyễn Văn Tuấn","Nguyễn Văn Trấn","Nguyễn Văn Đức","A"),
                    new Question("Kim Lân tham gia hội văn hóa cứu quốc năm bao nhiêu?", "1944","1945","1946","1947","A"),
                    new Question("Tác giả Pôn Ê – luy – a là nhà thơ nước nào?", "Anh","Pháp"," Ba Lan"," Bỉ","B"),
                    new Question("Xuân Quỳnh quê ở:", "La Khê, thành phố Hà Đông","Thanh Xuân, Hà Nội","Đông Vệ, Thanh Hóa","Quỳnh Lưu, Nghệ An","A"),
                    new Question("Tác phẩm nào dưới đây không phải thơ của Xuân Quỳnh:", "Hoa dọc chiến hào","Gió Lào cát trắng","Bầu trời vuông","Tự hát","C"),
                    new Question("Chủ tịch Hồ Chí Minh ra đi tìm đường cứu nước năm nào?", "1930","1923","1911","1912","C"),
                    new Question("Tác phẩm “Không có gì quý hơn độc lập tự do” của Chủ tịch Hồ Chí Minh thuộc thể loại nào?", "Truyện","Văn chính luận","Kí","Thơ","B"),
                    new Question("Tác phẩm “Lời kêu gọi toàn quốc kháng chiến” ra đời năm nào?", "1945","1930","1946","1932","C"),
                    new Question("Tại sao nói phong cách nghệ thuật của Chủ tịch Hồ Chí Minh đa dạng?", " Đa dạng mục đích sáng tác","Đa dạng trong quan điểm sáng tác."," Đa dạng các thể loại.","Đa dạng nguyên tắc sáng tác.","C")
            ));
    public static ArrayList<Question> khoahoc_de = new ArrayList<>(
            Arrays.asList(
                    new Question("Loài nào dưới đây thuộc nhóm \"Động vật máu nóng\"?", "Tắc kè hoa","Ếch","Cá sấu ","Chuột ","D"),
                    new Question("Đâu không phải là một ngôn ngữ lập trình?", "C++","JavaScript","Pascal","Hyperlink","D"),
                    new Question("Cuộc gọi được thực hiện đầu tiên trên thế giới là giữa nhà phát minh Alexander Graham Bell và...?", "Vợ của ông","Thị trưởng thành phố","Cục đăng ký phát minh","Người trợ lý","D"),
                    new Question("Đơn vị nào dưới đây không được dùng để đo thể tích?", "Lít","Gallon (gal)","Ounce(oz)","Yard","D"),
                    new Question("\"Năm ánh sáng\" là đơn vị dùng để đo đại lượng nào trong vũ trụ?", "Khoảng cách","Vận tốc","Thời gian","vị trí","A"),
                    new Question("Phát minh nào dưới đây ra đời sớm nhất?", "Kính thiên văn","Máy điện báo","Điện thoại","Máy tính","A"),
                    new Question("Mạng toàn cầu (World Wide Web) được ra đời ở đâu", "Mỹ","Thụy Sĩ","Anh","Pháp","B"),
                    new Question("Loài nào dưới đây không phải là \"Loài bản địa\" của Việt Nam?", "Ốc bươu vàng","Cây cao su","Cá rô phi","Tất cả các đáp án trên đều đúng","D"),
                    new Question("Loài cây nào dưới đây là thực vật Hạt trần?", "Cây điều","Cây hạnh nhân","Cây óc chó","Cây vạn tuế","D"),
                    new Question("Loại củ nào thường được dùng làm thức ăn dưới đây thực chất là phần rễ của cây?", "Củ khoai tây","Củ hành tây","Củ năng (củ mã thầy)","Củ cà rốt","D"),
                    new Question("Nhà khoa học nào dưới đây là người tìm ra vắc-xin chữa bệnh Dại?", "Hippocrates","Louis Pasteur","Albert Einstein","Edward Jenner","B")
            ));
    public static ArrayList<Question> khoahoc_trungbinh = new ArrayList<>(
            Arrays.asList(
                    new Question("Theo các nhà thiên văn học, thành phần chủ yếu cấu tạo nên sao chổi là gì?", "Kim loại","Đất đá","Băng","Dung nham nóng chảy","C"),
                    new Question("Nguyên tố sodium (tên Latin là natrium) có kí hiệu hóa học là", "N","S","Na","Si","C"),
                    new Question("Nguyên tử nào sau đây có kí hiệu hóa học có một chữ cái?", "Neon","Silicon","Chlorine","Boron","D"),
                    new Question("Bảng tuần hoàn các nguyên tố hóa học gồm các nguyên tố", " kim loại và khí hiếm","kim loại, phi kim và khí hiếm.","kim loại và phi kim.","khí hiếm và phi kim.","B"),
                    new Question("Sự biến đổi năng lượng từ quang năng thành năng lượng hóa năng là quá trình", "trao đổi chất.","sinh trưởng.","chuyển hóa năng lượng.","hô hấp.","B"),
                    new Question("Hô hấp tế bào và quá trình đốt cháy nhiên liệu giống nhau ở điểm nào?", "Đều sử dụng khí carbon dioxide, thải ra khí oxygen và tạo ra năng lượng.","Đều thu được hiệu suất năng lượng như nhau","Đều sử dụng khí oxygen, thải ra khí carbon dioxide và tạo ra năng lượng"," Đều không tạo ra năng lượng","C"),
                    new Question("Phương pháp tìm hiểu tự nhiên là", "hoạt động con người chủ động tìm tòi, khám phá ra thế giới tự nhiên.","tìm hiểu về thế giới tự nhiên, mối quan hệ của con người với tự nhiên.","cách thức tìm hiểu các sự vật, hiện tượng trong tự nhiên và đời sống, chứng minh được các vấn đề trong thực tiễn bằng các dẫn chứng khoa học.","cách thức tìm hiểu về thế giới tự thông qua các phương tiện truyền thông như sách, báo, internet,","C"),
                    new Question("Khẳng định nào sau đây đúng?", "Khí carbon dioxide, nước, nhôm đều là hợp chất","Ở điều kiện thường, các đơn chất kim loại như đồng, sắt, thủy ngân tồn tại ở thể rắn.","Oxygen, hydrogen đều là hợp chất.","Các hợp chất như glucose, saccharose và protein là hợp chất hữu cơ","A"),
                    new Question("Ta nghe được âm càng to khi", "tần số âm càng lớn","tần số âm càng nhỏ.","biên độ âm càng lớn.","biên độ âm càng nhỏ","C"),
                    new Question("Khi ta thổi còi, bộ phận nào dao động phát ra âm thanh?", "Không khí trong còi","Thành còi","Quả bóng trong còi","Khe hở trên còi","A"),
                    new Question(" Sóng âm được truyền trong không khí nhờ", "sự dao động (dãn, nén) của các lớp không khí","sự dao động của nguồn âm"," sự dịch chuyển của các phần tử vật chất","sự chuyển động của các luồng không khí","A")
            ));
    public static ArrayList<Question> khoahoc_kho = new ArrayList<>(
            Arrays.asList(
                    new Question("Ngân Hà của chúng ta thuộc kiểu Thiên Hà nào", "Thiên Hà xoắn ốc"," Thiên Hà hỗn hợp","Thiên Hà không định hình"," Thiên Hà elip","A"),
                    new Question("Một tập hợp của rất nhiều thiên thể cùng với bụi, khí và bức xạ điện từ được gọi là", "Thiên thạch."," Thiên hà"," Dải Ngân hà","Vũ Trụ.","B"),
                    new Question("Mặt Trời là một", "Hành tinh","Vệ tinh","Ngôi sao","Sao băng","C"),
                    new Question("Sao chổi là", " Ngôi sao","Vệ tinh","Hành tinh","Tiểu hành tinh","D"),
                    new Question("Ta nhìn thấy các hình dạng khác nhau của Mặt Trăng vì", "Mặt Trăng thay đổi độ sáng liên tục","Mặt Trăng thay đổi hình dạng liên tục.","DA Nangở mặt đất, ta thấy các phần khác nhau của Mặt Trăng được chiếu sáng bởi Mặt Trờ","Trái Đất tự quay quanh trục của nó liên tục","C"),
                    new Question("Chúng ta nhìn thấy Trăng tròn khi:", " Một nửa phần được chiếu sáng của Mặt Trăng hướng về Trái Đất.","Toàn bộ phần được chiếu sáng của Mặt Trăng hướng về Trái Đất","Toàn bộ Mặt Trăng được Mặt Trời chiếu sáng","Mặt Trăng ở khoảng giữa Trái Đất và Mặt Trời.","B"),
                    new Question("Ở cùng một thời điểm người đứng ở các kinh tuyến khác nhau sẽ nhìn thấy Mặt Trời ở các độ cao khác nhau nên có giờ khác nhau. Nguyên nhân là", " Trái Đất chuyển động quanh Mặt Trời","Trái Đất tự quay quanh trục","trục Trái Đất nghiêng.","Trái Đất có dạng hình khối cầu","D"),
                    new Question("Vì sao nói Hạt kín là ngành có ưu thế lớn nhất trong các ngành thực vật?Vì sao nói Hạt kín là ngành có ưu thế lớn nhất trong các ngành thực vật?", "Vì chúng có hệ mạch"," Vì chúng có hạt nằm trong quả","Vì chúng có rễ thật","Vì chúng sống trên cạn","B"),
                    new Question("Thuốc kháng sinh penicillin được sản xuất từ?", "Nấm men "," Nấm mốc","Nấm độc đỏ","Nấm mộc nhĩ","B"),
                    new Question("Trong quá trình đóng đinh, đinh lún sâu vào gỗ là nhờ năng lượng nào", "Năng lượng của búa","Năng lượng của đinh.","Năng lượng của gỗ","Năng lượng của tay người","D"),
                    new Question("Mũi tên được bắn bay đi là nhờ năng lượng từ ", "Cánh cung","Mũi tên","Gió","Cả 3 yếu tố trên","C")
            ));
    public static ArrayList<Question> nghethuat_de = new ArrayList<>(
            Arrays.asList(
                    new Question("Mĩ thuật thế giới thời kì cổ đại được xác định cùng với sự xuất hiện một số nền văn minh đầu tiên trên thế giới ở", "Đông Nam Á","Bắc Phi","Lưỡng Hà","La Mã","C"),
                    new Question("Đâu không phải một tác phẩm nghệ thuật của Ai Cập cổ đại?", "Quần thể kim tự tháp Giza","Đền Abu Simbel"," Khu di tích Rarnak"," Đền Parthenon","D"),
                    new Question("Sumer, Akkad, Assyria và Babylon là những nơi xuất hiện nền mĩ thuật thế giới ở", "Ai Cập","Lưỡng Hà","Ấn Độ","Địa Trung Hải","B"),
                    new Question("Ngôi đền thờ Althena có niên đại khoảng 500 năm trước Công nguyên nằm tại", "Hy Lạp"," Ai Cập","Ấn Độ"," Lưỡng Hà","A"),
                    new Question("Các công trình kiến trúc thời kì cổ đại có đặc điểm:", "Có kích thước lớn","Tỉ lệ hài hòa","Nhiều công trình còn tồn tại đến ngày nay","Cả A, B, C đều đúng","D"),
                    new Question("Công trình kiến trúc của thế giới cổ đại duy nhất chưa rõ vị trí chính xác là", "Vườn treo Ba-bi-lon","Kim Tự Tháp.","Tượng thần Zesu","Đền thờ Atemis","A"),
                    new Question("Đâu không phải là một di sản mĩ thuật thế giới thời kì cổ đại", "Khu lăng mộ Giza","Đấu trường La Mã","Hải đăng Alexandria","Vườn treo Babylon","B"),
                    new Question("Mĩ thuật thế giới thời cổ đại phương Tây xuất hiện ở", "Ấn Độ","Trung Quốc","Ai Cập","Đông Nam Á","C"),
                    new Question("Một trong những di vật đã được công nhận là báu vật quốc gia l", "Tượng đồng Đông Sơn","Trống đồng Đông Sơn","Bình gồm Óc Eo","Đèn gốm Sa Huỳnh","B"),
                    new Question("Những di vật nào tiêu biểu cho mĩ thuật Việt Nam thời kì cổ đại là:", "Tượng đồng","Bình gốm","Trống đồng","Cả A, B, C đều đúng","D"),
                    new Question("Trống đồng Đông Sơn là biểu tưởng của văn minh:", "Sông Hồng","Sông Mã","Sông Cả","Sông Thu Bồn","A")
            ));
    public static ArrayList<Question> nghethuat_trungbinh = new ArrayList<>(
            Arrays.asList(
                    new Question("Đâu không phải là một phép đối xứng?", "Phép đối xứng gương","Phép quay","Phép chiếu vuông góc","Phép tịnh tiến","C"),
                    new Question("Mĩ thuật Việt Nam thời kì cổ đại tồn tại trong khoảng thời gian nào?", "Từ đầu thiên niên kỉ II TCN đến nửa đầu thế kỉ I TCN","Từ đầu thiên niên kỉ II TCN đến nửa sau thế kỉ I TCN","Từ đầu thiên niên kỉ III TCN đến nửa đầu thế kỉ II TCN","Từ đầu thiên niên kỉ III TCN đến nửa sau thế kỉ II TCN.","A"),
                    new Question("Màu vẽ được người nguyên thủy sử dụng trong các bức vẽ của mình được làm từ:", "Các loài cây trong tự nhiên","Các loại bột","Các loại đá","Các loại phẩm màu","C"),
                    new Question("Các trường phái nghệ thuật trong mĩ thuật thời tiền sử", "Đã được định hình rõ nét","Chưa được hình thành","Bước đầu đã xuất hiện","Có bước phát triển vượt bậc","B"),
                    new Question("Ở Việt Nam, các bức họa khắc trên đá thời tiền sử được tìm thấy ở", "Hang Đồng Nội, Hòa Bình","Hang Sơn Đoòng, Quảng Bình","Hang Pù Chùa, Tuyên Quang","A và C","A"),
                    new Question("Các họa tiết trang trí có thể sử dụng trên các sản phẩm thời trang là:", "Các họa tiết thổ cẩm, cỏ cây, hoa lá","Chữ, tranh tĩnh vật","Các hình vẽ thời tiền sử","Bất cứ hình thù gì mà người thiết kế cho là đẹp và phù hợp","D"),
                    new Question("Vai trò của các họa tiết trang trí đối với sản phẩm thời trang", "Làm cho các sản phẩm thời trang trở nên sinh động, bắt mắt","Mang đến một thông điệp có ý nghĩa","Tăng thêm sự độc đáo cho sản phẩm thời trang","Cả A, B, C","D"),
                    new Question("Các ý tưởng trang trí được tạo ra nhờ", "Các hình mẫu có sẵn","Sự sáng tạo của người thiết kế","Các dấu ấn trong lịch sử","Ý kiến khác","B"),
                    new Question("Các hình thức bố cục của họa tiết trang trí", "Bố cục cân đối và bố cục tự do","Bố cục hình vuông, hình tam giác, hình tròn","Bố cục xa - gần","Bố cục chính - phụ","A"),
                    new Question("Đồng phục là gì?", "Những trang phục có họa tiết hoàn toàn giống nhau nhưng có thể khác nhau về chất liệu","Các bộ trang phục giống nhau và được mặc bởi các thành viên của một tổ chức khi tham gia các hoạt động trong tổ chức đó theo quy định, nội quy của tổ chức","Những bộ trang phục có màu sắc giống nhau","A và C","B"),
                    new Question("Đâu không phải tên một loại họa tiết trang trí", "Thổ cẩm","Hoa lá, chim muông","Chân dung","Lụa","D")
            ));
    public static ArrayList<Question> nghethuat_kho = new ArrayList<>(
            Arrays.asList(
                    new Question("Theo em, nội dung những bức vẽ thời tiền sử thường phản ánh điều gì?", "Cuộc sống hàng ngày","Các vị thần mà họ tôn thờ","Khát vọng hướng tới tương lai","Tư duy trừu tượng","A"),
                    new Question("Xu hướng trang trí nào đang được ưa chuộng trên thị trường hiện nay?", "In hình trang trí theo yêu cầu","In hình động vật","Trang trí phong cảnh thiên nhiên","In hình 3D","A"),
                    new Question("Bức tranh thời tiền sử có niên đại lâu nhất được tìm thấy ở quốc gia nào?", "Pháp","Tây Ban Nha","Trung Quốc","Hy Lạp","A"),
                    new Question("Hang động nào trên thế giới được mệnh danh là “Hang nghệ thuật” – nơi tìm thấy rất nhiều những tác phẩm thời tiền sử?", "hang Altamira, Tây Ban Nha","hang Lascaux, Pháp","hang ở công viên quốc gia Kakadu, Australia","hang Remigia, Tây Ban Nha","B"),
                    new Question("Quan sát những bức vẽ thời tiền sử, có thể thấy 3 màu chủ đạo được sử dụng là:", "Trắng, xanh, đỏ"," Nâu, Trắng, Xám","Vàng, đỏ, đen","Đen, xanh, tím","C"),
                    new Question("Các khuôn hình người từ dây thép có thể ứng dụng để:", "Tạo thành nhiều nhân vật khác nhau, có tác dụng trang trí","Làm quà lưu niệm","Chỉ là một bài tập thực hành, không có nhiều ứng dụng"," A và B","D"),
                    new Question("Alberto Giacometti là nhà điêu khắc người nước nào?", "Anh","Thuỵ Điển","Thụy Sĩ","Hà Lan","C"),
                    new Question("Hiện nay, kỹ thuật dựng hình 3D được áp dụng phổ biến trong lĩnh vực nào sau đây?", "Giáo dục","Kiến trúc, xây dựng","Dệt may","Cả A, B, C","B"),
                    new Question("Loại cờ nào thường được sử dụng trong các lễ hội truyền thống ở Việt Nam?", "Cờ vua","Quốc kỳ","Cờ ngũ sắc","Không sử dụng cờ","C"),
                    new Question("Lễ hội truyền thống nào sau đây của Việt Nam được UNESCO công nhận là Di sản văn hóa phi vật thể của nhân loại?", "Lễ hội Khai ấn đền Trần","Hội Gióng","Lễ hội chùa Hương","Lễ hội Gầu tào","B"),
                    new Question("Hoạt cảnh được dựng cần phải:", "Có tính sáng tạo cao","Phù hợp với hoạt động của nhân vật","Có màu sắc đa dạng","Cả A, B, C","B")
            ));


    public String getQuestionText() {
        return questionText;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public String getCorrectAns() {
        return correctAns;
    }


}
