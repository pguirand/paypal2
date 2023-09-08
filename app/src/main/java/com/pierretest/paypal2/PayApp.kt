package com.pierretest.paypal2

import android.app.Application
import com.paypal.checkout.PayPalCheckout
import com.paypal.checkout.config.CheckoutConfig
import com.paypal.checkout.config.Environment
import com.paypal.checkout.config.SettingsConfig
import com.paypal.checkout.createorder.CurrencyCode
import com.paypal.checkout.createorder.UserAction

class PayApp : Application(){

    var clientId = "AXIDIQMNzJB-ePCyUgbV6edOFrBg-mVRIqDHPhqk-6GEgxesw_YMRmxBy3lK1JWfR_2HfJ9ctt-ARwRC"
    var returnUrl = "com.pierretest.paypal2://paypalpay"

    override fun onCreate() {
        super.onCreate()
        val config = CheckoutConfig(
            application = this,
            clientId = clientId,
            environment = Environment.SANDBOX,
            returnUrl = returnUrl,
            currencyCode = CurrencyCode.USD,
            userAction = UserAction.PAY_NOW,
            settingsConfig = SettingsConfig(
                loggingEnabled = true
            )
        )
        PayPalCheckout.setConfig(config)
    }

}