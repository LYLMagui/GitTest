/**
 * @Author: lyl
 * @CreateTime: 2022/11/11 13:36
 * @Description:
 **/
public class TestMain {
    public static void main(String[] args) {
        System.out.println("这是一句话" + "，现在这句话被修改了");
        TestMain testMain = new TestMain();
        System.out.println(testMain.addOneWord());
    }

    public String changeResult(){
        String word = "现在又添加了一句话";
        return word;
    }

    public String addOneWord(){
        String word = "git提交给我搞麻了";
        return word;
    }
}
