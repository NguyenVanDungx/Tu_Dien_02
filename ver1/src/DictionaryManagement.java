import java.util.Scanner;

public class DictionaryManagement {
    Dictionary dic = new Dictionary();

    /**
     * setter, getter dic.
     */
    public Dictionary getDic() {
        return dic;
    }

    public void setDic(Dictionary dic) {
        this.dic = dic;
    }

    /**
     * Ham nhap lieu.
     */
    public void insertFromCommandline() {
        Scanner sc = new Scanner(System.in);

        //Nhap gia tri cho so phan tu cua mang
        int n = sc.nextInt();
        dic.setCount_word(n);

        //Nhap gia trị cho các phần tử của mảng
        String endl = sc.nextLine();   //Đọc hàng đầu tiên ( hàng sau n)
        for (int i = 0; i < n; i++) {
            Word word = new Word();
            word.setWord_target(sc.nextLine());
            word.setWord_explain(sc.nextLine());
            dic.setWords(word, i);
        }

    }
}
