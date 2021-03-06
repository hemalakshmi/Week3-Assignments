package week3.day2;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Launch the URL
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//Click the 'sort on date' checkbox
		System.out.println("Sort on date checkbox is selected: " + driver.findElementById("chkSelectDateOnly").isSelected());
		
		  //Clear and type in the from station text field
		  driver.findElementById("txtStationFrom").clear();
		  driver.findElementById("txtStationFrom").sendKeys("MMCT",Keys.ENTER);
		  		  
		  //Clear and type in the to station text field
		  driver.findElementById("txtStationTo").clear();
		  driver.findElementById("txtStationTo").sendKeys("MS",Keys.ENTER); 
		  Thread.sleep(2000);
		 
		  Set<String> set = new HashSet<String>();
		 //Store all the train names in a list	
		 List<WebElement> elements=driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
		 System.out.println("List of train names: ");
		 System.out.println("-------------------");
		  for(int i=0;i<elements.size();i++) {
			WebElement element=elements.get(i);
			System.out.println(element.getText());
			//Add the list into a new Set
			set.add(element.getText());
		}
		
		//Get the size of list
		System.out.println("List Size: " + elements.size());
		 System.out.println("---------");
		
		 System.out.println("Set of train name: ");
		 System.out.println("-----------------");
         for (String eachSet : set) {
			System.out.println(eachSet.toString());
			 			}
		 
		 //Get the size of set
		 System.out.println("Set Size: " + set.size());
		 System.out.println("---------");
		 
		// Compare the Size of list and Set to verify the names are unique
		 if(elements.size()==(set.size())) {
			 System.out.println("Train names are matched");
			}else {
				System.out.println("Train Names are not matched");
			}
} }
		
		

