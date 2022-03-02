package defpackage;

import android.app.KeyguardManager;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;

/* renamed from: snh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class snh {
    public static String a() {
        if (jkr.e()) {
            return Build.getSerial();
        }
        return Build.SERIAL;
    }

    public static void b(Context context) {
        if (jkr.e()) {
            iwq.a(context).a(new NotificationChannel("find_my_device", "Find My Device", 4));
        }
    }

    public static avty c(Context context) {
        NetworkInfo networkInfo;
        WifiManager wifiManager;
        String str;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        String str2 = null;
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getNetworkInfo(1);
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected() && (wifiManager = (WifiManager) context.getSystemService("wifi")) != null && wifiManager.isWifiEnabled()) {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null) {
                str = connectionInfo.getSSID();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str) && !"<unknown ssid>".equals(str) && !str.toLowerCase(Locale.getDefault()).endsWith("_nomap")) {
                str2 = str;
            }
        }
        aucd o = avty.g.o();
        int calculateSignalLevel = WifiManager.calculateSignalLevel(((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getRssi(), 5);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avty avty = (avty) o.b;
        avty.a |= 16;
        avty.d = calculateSignalLevel;
        int i = Build.VERSION.SDK_INT;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        if (!TextUtils.isEmpty(networkOperatorName)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            avty avty2 = (avty) o.b;
            networkOperatorName.getClass();
            avty2.a |= 64;
            avty2.f = networkOperatorName;
        }
        try {
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo != null) {
                for (CellInfo next : allCellInfo) {
                    if (next instanceof CellInfoGsm) {
                        int level = ((CellInfoGsm) next).getCellSignalStrength().getLevel();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        avty avty3 = (avty) o.b;
                        avty3.a |= 32;
                        avty3.e = level;
                    } else if (next instanceof CellInfoCdma) {
                        int level2 = ((CellInfoCdma) next).getCellSignalStrength().getLevel();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        avty avty4 = (avty) o.b;
                        avty4.a |= 32;
                        avty4.e = level2;
                    } else if (next instanceof CellInfoLte) {
                        int level3 = ((CellInfoLte) next).getCellSignalStrength().getLevel();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        avty avty5 = (avty) o.b;
                        avty5.a |= 32;
                        avty5.e = level3;
                    } else if (next instanceof CellInfoWcdma) {
                        int level4 = ((CellInfoWcdma) next).getCellSignalStrength().getLevel();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        avty avty6 = (avty) o.b;
                        avty6.a |= 32;
                        avty6.e = level4;
                    }
                }
            }
        } catch (SecurityException e) {
            snn.b("GmsCore does not have ACCESS_COARSE_LOCATION permission", new Object[0]);
        }
        if (str2 == null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            avty avty7 = (avty) o.b;
            avty7.a |= 4;
            avty7.b = false;
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            avty avty8 = (avty) o.b;
            int i2 = avty8.a | 4;
            avty8.a = i2;
            avty8.b = true;
            str2.getClass();
            avty8.a = i2 | 8;
            avty8.c = str2;
        }
        return (avty) o.i();
    }

    public static String a(PackageManager packageManager, Intent intent) {
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!queryIntentActivities.isEmpty()) {
            return queryIntentActivities.get(0).activityInfo.packageName;
        }
        return null;
    }

    public static boolean a(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        try {
            return !jkr.b() ? keyguardManager != null && keyguardManager.isKeyguardSecure() : keyguardManager != null && keyguardManager.isDeviceSecure();
        } catch (NullPointerException e) {
            return false;
        }
    }
}
