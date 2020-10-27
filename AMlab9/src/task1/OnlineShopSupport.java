package task1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;

public class OnlineShopSupport {

    /**
     * Хеш-таблица, где ключ - фамилия покупателя, значение - ИНН покупателя
     */
    public static HashMap<String, BigDecimal> map  = new HashMap<>() {{
        put("Иванов", BigDecimal.valueOf(1234567891));
        put("Петров", BigDecimal.valueOf(Long.parseLong("123456789124")));
        put("Соколов", BigDecimal.valueOf(1234566891));
        put("Воробьева", BigDecimal.valueOf(1234567897));
        put("Соловьева", BigDecimal.valueOf(Long.parseLong("123456788234")));
        put("Синицина", BigDecimal.valueOf(1234567860));
    }};

    @Override
    public String toString() {
        return String.valueOf(map);
    }

    /**
     * Проверяет на корректность ИНН, для простоты считаем, что любой ИНН длины 10 или 12 корректен
     * @param taxPayerIdNumber ИНН физического или юридического лица
     * @return true - для корректных ИНН, false - для некорректных ИНН
     */
    public static boolean isTaxpayerIdNumberValid(BigDecimal taxPayerIdNumber) {
        return taxPayerIdNumber.toString().length() == 10 || taxPayerIdNumber.toString().length() == 12;
    }

    /**
     * @param surname Фамилия покупателя
     * @param taxpayerIdNumber ИНН покупателя
     * @return true - если фамилия соответствует ИНН, false - если фамилия не соответсвует ИНН
     */
    public static boolean checkAccordance(String surname, BigDecimal taxpayerIdNumber) {
        if (map.containsKey(surname)) {
            return map.get(surname).equals(taxpayerIdNumber);
        } else {
            return false;
        }
    }
}
