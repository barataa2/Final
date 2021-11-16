

import Utils.ChromeRunner;
import Utils.Retry;
import Utils.TestLister;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

@Listeners(TestLister.class)
public class practice extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    public void test() {
        $(byText("პროფილი")).click();
        $(by("class", "registration_link")).click();
        /*$(byName("firstName")).shouldNotBe(Condition.empty);
        $(byName("lastName")).setValue("baratashvili");
        $(byName("lastName")).shouldNotBe(Condition.empty);
        $(byName("email")).setValue("magaliti@mail.com");
        $(by("id", "password")).setValue("Par0li123");
        $(by("id", "confirmPassword")).setValue("Par0li123");*/
    }

/*    @Test
    public void testexcel() throws IOException, BiffException {
        String FilePath = "files/Test.xls";
        FileInputStream fs = new FileInputStream(FilePath);
        Workbook wb = Workbook.getWorkbook(fs);
        Sheet sheet = wb.getSheet("Login");
        int totalNoOfRows = sheet.getRows();
        System.out.println(totalNoOfRows);
        for (int row = 1; row < totalNoOfRows; row++) {
            String test = sheet.getCell(0, row).getContents();
            System.out.println(test);
        }
    }*/


}

