package ru.mirea.krekova25;
import java.util.regex.*;

public class Price {
    public static void main( String[] args ) {
        int count = 0;
        String s = "Цены 6.267 RUR 30.06 USD 50.30 RUB 50f32 RUR 60.12 CHF 11,23 23.78 UDD 23.98 USD 15.23 EU";
        System.out.println(s);
        String regex = "\\d+[.]\\d{2}\\s(USD|EU|RUB)";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            count ++;
            System.out.println("Список цен: " + m1.group());
        }
        if (count==0) {
            System.out.println("СОВПАДЕНИЙ НЕ НАЙДЕНО");
        }
    }
}
