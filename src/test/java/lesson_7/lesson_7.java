package lesson_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class lesson_7 extends Base_Test {

    @Test
    public void test1() {
        int countOfElements = 6;
        String user = "standard_user";
        String userPassword = "secret_sauce";


        //Открыть сайт https://www.saucedemo.com/index.html
        driver.get("https://www.saucedemo.com/index.html");

        //Залогинится
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys(user);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(userPassword);
        WebElement login = driver.findElement(By.className("btn_action"));
        login.click();

        //Выбрать все элементы
        WebElement allElemetns = driver.findElement(By.className("inventory_list"));

        //Вывысти названия и цену

        for (int numberOfElement = 1; numberOfElement <= countOfElements ; numberOfElement++) {
            int priceNumber = 0;
            if (numberOfElement == 1) {
                priceNumber = 4;
            }
            if (numberOfElement == 2) {
                priceNumber = 0;
            }
            if (numberOfElement == 3) {
                priceNumber = 1;
            }
            if (numberOfElement == 4) {
                priceNumber = 5;
            }
            if (numberOfElement == 5) {
                priceNumber = 2;
            }
            if (numberOfElement == 6) {
                priceNumber = 3;
            }
            WebElement elementName = driver.findElement(By.xpath("//*[@id=\"item_"+ priceNumber +"_title_link\"]/div"));
            String name = elementName.getText();
            WebElement elementPrice = driver.findElement(By.cssSelector("#inventory_container > div > div:nth-child("+ numberOfElement +") > div.pricebar > div"));
            String price = elementPrice.getText();
            System.out.println(name + " " + price);

        }
        // Я конечно понимаю что это говнокод, но ничего лучше я пока не придумал
        // Берем все цены с сайта и тусуем их в Map<int(номер цены)(можно сделать инкрементом)asf.put(i++, "qwe00"); , int>. После циклом вытягиваем все значения по ключу   Цены - это значения, а numberofelement - ключ
        }
}
