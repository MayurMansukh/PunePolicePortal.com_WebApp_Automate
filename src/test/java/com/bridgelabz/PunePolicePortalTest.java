/**
 * Description : add punePolicPortal.com epass form test
 * Author      : Mayur Mansukh
 * Date        : 11/6/21
 */
package com.bridgelabz;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.PunePolicePortalPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class PunePolicePortalTest extends Base {

    @Test
    public void portalTest() throws InterruptedException, IOException {
        PunePolicePortalPage portalPage = new PunePolicePortalPage(driver);
        Assert.assertEquals(driver.getCurrentUrl(),"https://blog.savaari.com/road-travel-guidelines-during-covid/");
        portalPage.PunePortalSwitchTo();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.punepolice.in/");
        portalPage.select_department();
        portalPage.enterName();
        portalPage.enterOfficeId();
        Thread.sleep(1000);
        portalPage.uploadDocument1();
        Thread.sleep(4000);
        portalPage.uploadDocument2();
        Thread.sleep(4000);
        portalPage.uploadDocument3();
        Thread.sleep(2000);
        portalPage.selectGender();
        portalPage.selectBithDate();
        portalPage.enterPhone();
        portalPage.enterAdhar();
        portalPage.selectFromDate();
        portalPage.selectToDate();
        portalPage.selectFromLocation();
        portalPage.selectToLocation();
        portalPage.enterRemark();
        Thread.sleep(1000);
        portalPage.covidReport();
        Thread.sleep(4000);
        portalPage.selectTerms_And_Condition();
    }
}
