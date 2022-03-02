package defpackage;

import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* renamed from: jjy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jjy {
    public static void a(PendingIntent pendingIntent, Context context, int i, Intent intent, PendingIntent.OnFinished onFinished) {
        a(pendingIntent, context, i, intent, onFinished, (String) null);
    }

    public static boolean b() {
        BluetoothAdapter defaultAdapter;
        if (Build.VERSION.SDK_INT < 23 || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
            return false;
        }
        return defaultAdapter.isBleScanAlwaysAvailable();
    }

    public static void a(PendingIntent pendingIntent, Context context, int i, Intent intent, PendingIntent.OnFinished onFinished, String str) {
        Bundle bundle;
        if (!jkr.g() || !awyg.a.a().m()) {
            bundle = null;
        } else {
            BroadcastOptions makeBasic = BroadcastOptions.makeBasic();
            try {
                BroadcastOptions.class.getMethod("setDontSendToRestrictedApps", new Class[]{Boolean.TYPE}).invoke(makeBasic, new Object[]{true});
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                if (Log.isLoggable("LocationUtils", 6)) {
                    Log.e("LocationUtils", "Reflection error", e);
                }
            }
            bundle = makeBasic.toBundle();
        }
        if (jkr.b()) {
            pendingIntent.send(context, i, intent, onFinished, (Handler) null, str, bundle);
        } else {
            pendingIntent.send(context, i, intent, onFinished, (Handler) null, str);
        }
    }

    public static boolean b(Context context) {
        int i = Build.VERSION.SDK_INT;
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            return wifiManager.isScanAlwaysAvailable();
        }
        return false;
    }

    public static void a(PendingIntent pendingIntent, Context context, Intent intent, PendingIntent.OnFinished onFinished, String str) {
        a(pendingIntent, context, 0, intent, onFinished, str);
    }

    public static boolean a() {
        String displayName = Locale.getDefault().getDisplayName();
        if (TextUtils.isEmpty(displayName)) {
            return false;
        }
        byte directionality = Character.getDirectionality(displayName.charAt(0));
        if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
            return true;
        }
        return false;
    }

    public static boolean a(Context context) {
        int h = jlo.h();
        if (h == 8 || h == 13 || h == 10 || h == 11 || jli.a("ro.boot.vr", "").equals("1") || ((axac.a.a().a() && jix.e(context)) || jix.a(context) || jix.b(context))) {
            return false;
        }
        return true;
    }
}
