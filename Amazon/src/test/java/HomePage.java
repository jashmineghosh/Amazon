import amazon.Base;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;


public class HomePage extends Base {

        @Test
        public void homePageNavigation () throws IOException, InterruptedException {

            WebDriver driver;
            driver = initializeDriver();
            driver.get("https://www.amazon.com");
            driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Headphones");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
            driver.manage().window().maximize();
            int childElements = driver.findElements(By.xpath("//span[@data-component-type='s-search-results']/div/div")).size();
            System.out.println(childElements);

                int count = driver.findElements(By.xpath("//div[@class='sg-row']/div/a")).size();
                System.out.println(count);
                if (count > 0) {
                        for (int i = 1; i <= childElements-2; i++) {
                                try {
                                    Actions actions = new Actions(driver);

                                    WebElement element = driver.findElement(By.xpath("//div[@class='s-result-list s-search-results sg-row']/div[" + i + "]/div/span/div/div/div/div/div[1]/div/a/../../following-sibling::div/div[1]"));
                                    actions.moveToElement(element).build().perform();
                                    driver.findElement(By.xpath("//div[@class='s-result-list s-search-results sg-row']/div[" + i + "]/div/span/div/div/div/div/div[1]/div/a/../../following-sibling::div/div[1]")).click();
                                }catch (NoSuchElementException e) {
//                                    Thread.sleep(3000);
                                    continue;
                                }
                            Thread.sleep(3000);
                            driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//                            Thread.sleep(3000);
                            try{
                                driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']")).click();
//                                Thread.sleep(3000);
                            }
                            catch(NoSuchElementException e){

                            }
                            finally {
                                driver.navigate().back();
                                driver.navigate().back();
                                System.out.println(driver.getTitle());
                            }
                        }

                    for (int i = 1; i <= childElements-2; i++) {
                        try {
                            Actions actions = new Actions(driver);
                            WebElement element = driver.findElement(By.xpath("//div[@class='s-result-list s-search-results sg-row']/div[" + i + "]/div/span/div/div/div/div/div[1]/a/../../following-sibling::div/div[1]"));
                            actions.moveToElement(element).build().perform();
                            driver.findElement(By.xpath("//div[@class='s-result-list s-search-results sg-row']/div[" + i + "]/div/span/div/div/div/div/div[1]/a/../../following-sibling::div/div[1]")).click();
                        }
                        catch (NoSuchElementException e) {
//                            Thread.sleep(3000);
                            continue;
                        }
                        Thread.sleep(3000);
                        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//                        Thread.sleep(3000);
                        try{
                            driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']")).click();
//                            Thread.sleep(3000);
                        }
                        catch(NoSuchElementException e){

                        }
                        finally {
                            driver.navigate().back();
                            driver.navigate().back();
                            System.out.println(driver.getTitle());
                        }
                    }
                    for (int i = 1; i <= childElements-2; i++) {
                        try {
                            Actions actions = new Actions(driver);
                            WebElement element = driver.findElement(By.xpath("//div[@class='s-result-list s-search-results sg-row']/div["+i+"]/div/span/div/div/div[1]/div/a/../../following-sibling::div/div[1]/div/div/span/a/../.."));
                            actions.moveToElement(element).build().perform();
                            driver.findElement(By.xpath("//div[@class='s-result-list s-search-results sg-row']/div["+i+"]/div/span/div/div/div[1]/div/a/../../following-sibling::div/div[1]/div/div/span/a/../..")).click();
                        }
                        catch (NoSuchElementException e) {
//                            Thread.sleep(3000);
                            continue;
                        }
                        Thread.sleep(3000);
                        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//                        Thread.sleep(3000);
                        try{
                            driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']")).click();
//                            Thread.sleep(3000);
                        }
                        catch(NoSuchElementException e){

                        }
                        finally {
                            driver.navigate().back();
                            driver.navigate().back();
                            System.out.println(driver.getTitle());
                        }
                    }
                }
        }
                    }


