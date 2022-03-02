package defpackage;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: adjw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adjw {
    private static final iwd a = adnt.c("Device");

    public static boolean a() {
        return jli.a("ro.build.ab_update", "").equalsIgnoreCase("true");
    }

    public static boolean b() {
        return jli.a("ro.boot.vr", "").equals("1");
    }

    public static int c(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, intentFilter);
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra >= 0 && intExtra2 > 0) {
                return (intExtra * 100) / intExtra2;
            }
        }
        return 100;
    }

    public static boolean d(Context context) {
        if (!jkr.g()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        amrl.a(true);
        return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
    }

    public static boolean e(Context context) {
        jiw.b(context);
        return false;
    }

    public static boolean f(Context context) {
        if (jkr.i() && !aypm.a.a().b()) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            for (int createForSubscriptionId : ((SubscriptionManager) context.getSystemService("telephony_subscription_service")).getActiveSubscriptionIdList()) {
                if (telephonyManager.createForSubscriptionId(createForSubscriptionId).isIccLockEnabled()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean g(Context context) {
        if (jkr.b()) {
            return ((KeyguardManager) context.getSystemService("keyguard")).isDeviceSecure();
        }
        return true;
    }

    public static void h(Context context) {
        jix.g(context);
    }

    public static void i(Context context) {
        jix.h(context);
    }

    public static void j(Context context) {
        jix.i(context);
    }

    public static boolean a(Context context) {
        if (jkr.b()) {
            return ((PowerManager) context.getSystemService("power")).isDeviceIdleMode();
        }
        return true;
    }

    public static boolean b(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, intentFilter);
        return (registerReceiver == null || registerReceiver.getIntExtra("plugged", 0) == 0) ? false : true;
    }

    public static long c() {
        String a2 = jli.a("ro.build.version.security_patch", "");
        if (amrk.a(a2)) {
            a.c("Failed to get security patch level.", new Object[0]);
            return 0;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(a2).getTime();
        } catch (ParseException e) {
            a.c("Unable to parse the patch level: %s.", a2);
            return 0;
        }
    }
}
