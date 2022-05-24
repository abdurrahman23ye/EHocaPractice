package tasks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import practice.TestBase;

import java.util.Set;

public class Cookies165 extends TestBase {

/*    Yeni bir class olusturun : cookiesAutomation
1- Amazon anasayfaya gidin
2- tum cookie’leri listeleyin
3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie
    olusturun ve sayfaya ekleyin
6- eklediginiz cookie’nin sayfaya eklendigini test edin
7- ismi skin olan cookie’yi silin ve silindigini test edin
8- tum cookie’leri silin ve silindigini test edin

 */

    @Test
    public void test1() {


        driver.get("https://www.amazon.com");
        driver.manage().getCookies();
        Set<Cookie> cookies = driver.manage().getCookies();

        System.out.println(cookies);


        Assert.assertTrue(cookies.size() > 5);

        Assert.assertTrue(driver.manage().getCookieNamed("i18n-prefs").getValue().equals("USD"));

        Cookie cookie = new Cookie("en sevdigin cookie", "cikolatali");
        driver.manage().addCookie(cookie);

        Set<Cookie> cookiess = driver.manage().getCookies();
        boolean flag = false;
        for (Cookie each : cookiess
        ) {

            if (each.getName().equals("en sevdigin cookie") && each.getValue().equals("cikolatali")) {
                flag = true;
            }

        }
        Assert.assertTrue(flag);

        driver.manage().deleteCookieNamed("skin");

        flag = false;
        for (Cookie each : cookiess
        ) {

            if (each.getName().equals("skin")) {
                flag = true;
            }
        }
        Assert.assertTrue(flag);

        driver.manage().deleteAllCookies();

        cookiess=driver.manage().getCookies();

        System.out.println(cookiess);

        Assert.assertTrue(cookiess.isEmpty());
    }
}


/*
// 1- Amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //2- tum cookie’leri listeleyin
        Set<Cookie> cookiesSet= driver.manage().getCookies();
        System.out.println(cookiesSet);
        int sayac=1;
        for (Cookie each:cookiesSet
             ) {
            System.out.println(sayac+ ".ci cookie: " + each);
            System.out.println("name :  "+each.getName());
            System.out.println("value : "+ each.getValue());
            sayac++;
        }
        //3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        int cookieSayisi= cookiesSet.size();
        Assert.assertTrue(cookieSayisi>5);
        //4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        for (Cookie each: cookiesSet
             ) {
            if (each.getName().equals("i18n-prefs")){
                Assert.assertEquals("USD", each.getValue());
            }
        }
        //5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan
        // bir cookie olusturun ve sayfaya ekleyin
        Cookie cookie= new Cookie("en sevdigim cookie","cikolatali");
        driver.manage().addCookie(cookie);
        sayac=1;
        cookiesSet= driver.manage().getCookies();
        for (Cookie each:cookiesSet
        ) {
            System.out.println(sayac+ ".ci cookie: " + each);
            sayac++;
        }
        //6- eklediginiz cookie’nin sayfaya eklendigini test edin
        Assert.assertTrue(cookiesSet.contains(cookie));
        //7- ismi skin olan cookie’yi silin ve silindigini test edin
        driver.manage().deleteCookieNamed("skin");
        Assert.assertFalse(cookiesSet.contains("skin"));
        //8- tum cookie’leri silin ve silindigini test edin
        driver.manage().deleteAllCookies();
        cookiesSet= driver.manage().getCookies();
        Assert.assertTrue(cookiesSet.isEmpty());
    }
 */