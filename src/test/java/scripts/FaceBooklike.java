package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pages.FaceBook;
import pages.SkillRaryLogin;

public class FaceBooklike extends BaseClass {
@Test
public void facebooklikebtn() throws InterruptedException {
	SkillRaryLogin s=new SkillRaryLogin(driver);
	u.scrollBar(driver,0,5000);
	Thread.sleep(3000);
	s.faceBookicon();
	
	FaceBook f=new FaceBook(driver);
	f.likebtn();
}
}
