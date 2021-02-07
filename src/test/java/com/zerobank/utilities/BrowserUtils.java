package com.zerobank.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {

    /**
     * Switches to new window by the exact title. Returns to original window if target title not found
     * @param targetTitle
     */

    public static void switchToWindow(String targetTitle){
        String orgin=Driver.get().getWindowHandle();
        Set<String> totalWindows = Driver.get().getWindowHandles();
        for(String handel: totalWindows){
            if(Driver.get().getTitle().equals(targetTitle)){
                return;
            }
        }
        Driver.get().switchTo().window(orgin);

    }

    /**
     * Moves the mouse to given element
     *
     * @param element on which to hover
     */

    public static void hover(WebElement element){
        Actions actions=new Actions(Driver.get());
        actions.moveToElement(element).perform();
    }


    public static List<String> getElementsText(List<WebElement> webElements){
        List<String> elementsText=new ArrayList<>();
        for(WebElement elm: webElements){
            elementsText.add(elm.getText());
        }
        return elementsText;
    }

    /**
     * Extracts text from list of elements matching the provided locator into new List<String>
     *
     * @param locator
     * @return list of strings
     */
    public static List<String> getElementsText(By locator){
        List<WebElement> elements = Driver.get().findElements(locator);
        List<String> elementsText=new ArrayList<>();
        for(WebElement elm:elements){
            elementsText.add(elm.getText());
        }
        return elementsText;
    }
    /**
     * Performs a pause
     *
     * @param seconds
     */

    public static void waitFor(long seconds) {
        try{
           Thread.sleep(seconds*1000);
        }catch( Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Waits for the provided element to be visible on the page
     *
     * @param element
     * @param timeToWaitInSec
     * @return
     */

    public static WebElement waitForVisibility(WebElement element, long timeToWaitInSec){
        WebDriverWait wait=new WebDriverWait(Driver.get(),timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    /**
     * Waits for element matching the locator to be visible on the page
     *
     * @param locator
     * @param timeout
     * @return
     */

    public static WebElement waiForVisibility(By locator, long timeout){
        WebDriverWait wait=new WebDriverWait(Driver.get(), timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickability(WebElement element, long timeout){
        return new WebDriverWait(Driver.get(), timeout).until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Waits for element matching the locator to be clickable
     *
     * @param locator
     * @param timeout
     * @return
     */
    public static WebElement waitForClickability(By locator, long timeout){
        return new WebDriverWait(Driver.get(), timeout).until(ExpectedConditions.elementToBeClickable(locator));
    }

}
