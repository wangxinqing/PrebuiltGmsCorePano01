package defpackage;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;

/* renamed from: acqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acqo {
    private static WifiConfiguration a(String str) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.SSID = acqc.a(str);
        return wifiConfiguration;
    }

    public static WifiConfiguration a(String str, String str2, String str3, boolean z) {
        WifiConfiguration wifiConfiguration;
        if (!"EAP".equals(str)) {
            if ("PSK".equals(str)) {
                amrl.a((Object) str3);
                wifiConfiguration = a(str2);
                wifiConfiguration.preSharedKey = acqc.a(str3);
                wifiConfiguration.allowedKeyManagement.set(1);
                wifiConfiguration.allowedGroupCiphers.set(2);
                wifiConfiguration.allowedGroupCiphers.set(3);
            } else if ("WEP".equals(str)) {
                amrl.a((Object) str3);
                wifiConfiguration = a(str2);
                wifiConfiguration.wepKeys[0] = acqc.a(str3);
                wifiConfiguration.wepTxKeyIndex = 0;
                wifiConfiguration.allowedKeyManagement.set(0);
                wifiConfiguration.allowedGroupCiphers.set(0);
                wifiConfiguration.allowedGroupCiphers.set(1);
            } else {
                wifiConfiguration = a(str2);
                wifiConfiguration.allowedKeyManagement.set(0);
                wifiConfiguration.allowedAuthAlgorithms.set(0);
            }
            wifiConfiguration.hiddenSSID = z;
            return wifiConfiguration;
        }
        throw new UnsupportedOperationException("WPA-EAP security type is not supported");
    }

    public static WifiManager a(Context context) {
        amrl.a((Object) context);
        return (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public static boolean a(WifiConfiguration wifiConfiguration) {
        return "*".equals(wifiConfiguration.preSharedKey);
    }
}
