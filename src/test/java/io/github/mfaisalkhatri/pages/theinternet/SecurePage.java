/*      Copyright 2022 Mohammad Faisal Khatri

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
*/

package io.github.mfaisalkhatri.pages.theinternet;

import io.github.mfaisalkhatri.drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created By Faisal Khatri on 24-12-2021
 */
public class SecurePage {

    private final DriverManager driverManager;

    public SecurePage (DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    public WebElement logoutBtn () {
        return driverManager.getDriver().findElement(By.linkText("Logout"));
    }

    public String getFlashMessage () {
        return driverManager.getDriver().findElement(By.id("flash")).getText();
    }

    public String getHeaderText () {
        return driverManager.getDriver().findElement(By.tagName("h2")).getText();
    }

    public String getSubHeaderText () {
        return driverManager.getDriver().findElement(By.tagName("h4")).getText();
    }

}