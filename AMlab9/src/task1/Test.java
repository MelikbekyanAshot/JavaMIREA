package task1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        String surname = "";
        String next = "y";
        boolean correct = true;
        BigDecimal taxpayerIdNumber = BigDecimal.valueOf(0);
        Scanner keyboard = new Scanner(System.in);

        System.out.println(OnlineShopSupport.map);

        while (!next.equals("n")) {
            try {
                System.out.println("Введите фамилию:");
                surname = keyboard.next();
                System.out.println("Введите ИНН: ");
                taxpayerIdNumber = keyboard.nextBigDecimal();
                if (!OnlineShopSupport.isTaxpayerIdNumberValid(taxpayerIdNumber) ||
                        !OnlineShopSupport.checkAccordance(surname, taxpayerIdNumber)) {
                    throw new Exception();
                }
            } catch (Exception err) {
                if (!OnlineShopSupport.checkAccordance(surname, taxpayerIdNumber)) {
                    System.out.println("ИНН не соответствует фамилии");
                    correct = false;
                    throw new TaxpayerIdNumberException("ИНН не соответствует фамилии", err);
                }

                if (!OnlineShopSupport.isTaxpayerIdNumberValid(taxpayerIdNumber)) {
                    System.out.println("Введен некорректный ИНН");
                    correct = false;
                    throw new TaxpayerIdNumberException("Введен некорректный ИНН", err);
                }

                System.out.println("Ошибка какая-то:(");
                correct = false;
                throw new TaxpayerIdNumberException("Ошибка какая-то:(", err);
            } finally {
                if (correct) {
                    System.out.println("Желаете ли вы продолжить? Введите 'y' для продолжения или 'n' для завершения");
                    next = keyboard.next();
                }
            }
        }

    }
}
