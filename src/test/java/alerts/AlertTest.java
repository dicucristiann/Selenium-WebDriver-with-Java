package alerts;

import dropdown.base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public final class AlertTest extends BaseTests {
    @Test
    public void testAcceptAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResults(), "You successfully clicked an alert", "Result message incorrect");
    }
//    @Test
//    public void testGetTextFromAlert(){
//       AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
//        alertsPage.triggerConfirm();
//       String text = alertsPage.alert_getText();
//       alertsPage.alert_clickToDismiss();
//       Assert.assertEquals(text, "I am JS Confirm", "Alert text incorrect");
//    }
}
