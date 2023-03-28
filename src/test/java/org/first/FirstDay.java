package org.first;

import java.awt.AWTException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.xml.xpath.XPath;

import org.base.BaseClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;

public class FirstDay extends BaseClasses {
	public static void main(String[] args) throws AWTException {

		browserlaunch("chrome");

		// driver.get("https://www.flipkart.com/");
		urlLaunch("https://www.flipkart.com/");
		maximize();
		implicityWait(10);
		WebElement a = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		click(a);
		WebElement search = driver.findElement(By.name("q"));

		search.sendKeys("ipone 14");

		robotEnter();

		List<WebElement> phone = driver.findElements(By.xpath("(//div[@class='_4rR01T'])[1]"));

		// List<WebElement> price =
		// driver.findElements(By.xpath("(//div[@class='_25b18c'])[1]"));
		Map<String, String> x = new TreeMap<String, String>();

		List<WebElement> c = driver.findElements(By.xpath("(//div[@class='_2kHMtA'])"));

		for (int i = 1; i < c.size(); i++) {// 1

			for (int j = i; j == i; j++) {// 1
				// List<WebElement> fi =
				// driver.findElements(By.xpath("(//div[@class='_4rR01T'])["+i+"]"));

				WebElement fi = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[" + i + "]"));
				String z = getText(fi);

//				System.out.println(z);
				WebElement pr = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[" + j + "]"));

				String b = getText(pr);

				x.put(z + i, b + j);

				System.out.println(z + b);
//				System.out.println(b);

			}
////			Collection<String> q = x.values();
////			for(v:q);
//			Set<String> o = x.keySet();
////			o.addAll(c);
//			
//			List<String>k=new LinkedList<String>();
//			boolean addAll = k.addAll(o);
//			
//			System.out.println(k.get(0));
//			System.out.println(k.get(k.size()-1));
//			

			
			
			
		}

	}
}
