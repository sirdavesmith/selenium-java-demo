package testScripts;

import data.TeacherTest;
import model.TestAbstract;
import org.testng.annotations.Test;

public class LoginTest extends TestAbstract {
    private final TeacherTest teacher = new TeacherTest();

    @Test
    public void testLogin() throws Exception {
        teacher.setup(this.getDriver(), this.getDriverWait());
    }
}
