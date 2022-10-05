import javax.swing.*;

public class Vaccine {
    public static void main(String[] args) {
        System.out.println("中文顯示");
        String vaccine = JOptionPane.showInputDialog("Please input vaccine name {BNT, AZ, MVC}:");
        vaccine = vaccine.toLowerCase();

        if (vaccine.equals("bnt")){
            JOptionPane.showInputDialog(null,"BNT mRNA疫苗 保護力:95%");
        }else if (vaccine.equals("az")){
            JOptionPane.showInputDialog(null,"AZ 腺病毒疫苗 保護力:81%");
        }else if (vaccine.equals("mvc")){
            JOptionPane.showInputDialog(null,"MVC 腺病毒蛋白 保護力:未知");
        }else {
            JOptionPane.showInputDialog(null,"無法辨識的輸入，請重新填寫{BNT, AZ, MVC}");
        }
    }
}
