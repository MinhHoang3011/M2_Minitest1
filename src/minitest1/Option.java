package minitest1;

public class Option {
    public static void main(String[] args) {
        ProgrammingBook st1 = new ProgrammingBook(101,"500 Câu Chuyện Thiếu Nhi",50,"Minh Hoàng","English","CodeGym");
        ProgrammingBook st2 = new ProgrammingBook(102,"500 Bài Hát Thiếu Nhi",500,"Minh Hoàng","Java","CodeGym");
        ProgrammingBook st3 = new ProgrammingBook(103,"500 Bài Thể Dục Thiếu Nhi",50,"Minh Hoàng","Vietnamese","CodeGym");
        ProgrammingBook st4 = new ProgrammingBook(104,"500 Món Ăn Cho Thiếu Nhi",500,"Minh Hoàng","Japan","CodeGym");
        ProgrammingBook st5 = new ProgrammingBook(105,"500 Bài Code Thiếu Nhi",50,"Minh Hoàng","Tàu","CodeGym");


        FictionBook tt1 = new FictionBook(111,"500 Cái Cây",50,"Minh Hoàng","Viễn tưởng 1");
        FictionBook tt2 = new FictionBook(112,"500 Viên Đá",500,"Minh Hoàng","Viễn tưởng 2");
        FictionBook tt3 = new FictionBook(113,"500 Căn Nhà",50,"Minh Hoàng","Viễn tưởng 3");
        FictionBook tt4 = new FictionBook(114,"500 Ngọn Núi",500,"Minh Hoàng","Viễn tưởng 4");
        FictionBook tt5 = new FictionBook(115,"500 Viên Kẹo",50,"Minh Hoàng","Viễn tưởng 5");

//        Tính tổng 10 cuốn sách
        double[] sumPrice = {st1.getPrice(), st2.getPrice(), st3.getPrice(), st4.getPrice(), st5.getPrice(), tt1.getPrice(), tt2.getPrice(), tt3.getPrice(), tt4.getPrice(), tt5.getPrice()};
        double sumPriceBook = 0;
        for (int i = 0 ; i < sumPrice.length ; i++) {
            sumPriceBook += sumPrice[i];
        }
        System.out.println("Tổng tiền 10 cuốn sách là : " + sumPriceBook + "$");

//        Đếm số sách ProgrammingBook có language là "Java".
        String[] checkBook = {st1.getLanguage(), st2.getLanguage(), st3.getLanguage(), st4.getLanguage(), st5.getLanguage()};
        int count = 0;
        for (int i = 0; i < checkBook.length; i++){
            if (checkBook[i].equals("Java")){
                count++;
            }
        }
        System.out.println("Sách có language là Java : " + count + " Quyển");

//        Đếm số sách Fiction có category là “Viễn tưởng 1”.
        String[] checkCate = {tt1.getCategory(), tt2.getCategory(), tt3.getCategory(), tt4.getCategory(), tt5.getCategory()};
        int count1 =0;
        for (int i = 0; i < checkCate.length; i++){
            if (checkCate[i].equals("Viễn tưởng 1")) {
                count1++;
            }
        }
        System.out.println("Sách có category là Viễn tưởng 1 : " + count1 + " Quyển");

//        Đếm số sách Fiction có giá <100.
        double[] checkPrice = {tt1.getPrice(), tt2.getPrice(), tt3.getPrice(), tt4.getPrice(), tt5.getPrice()};
        int count2=0;
        for (int i=0; i < checkPrice.length; i++){
            if (checkPrice[i] < 100){
                count2++;
            }
        }
        System.out.println("Sách có giá tiền nhỏ hơn 100$ là : " + count2 + " Quyển");
    }
}
