package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* renamed from: jkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jkf {
    public static final /* synthetic */ int a = 0;

    static {
        try {
            try {
                ConnectivityManager.class.getMethod("isNetworkSupported", new Class[]{Integer.TYPE}).setAccessible(true);
            } catch (Exception e) {
            }
        } catch (Exception e2) {
        }
    }

    public static boolean a(Context context) {
        NetworkInfo c = c(context);
        return c != null && c.isConnectedOrConnecting();
    }

    public static boolean b(Context context) {
        NetworkInfo c = c(context);
        return c == null || !c.isConnectedOrConnecting() || c.isRoaming();
    }

    public static NetworkInfo c(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public static NetworkInfo d(Context context) {
        ConnectivityManager f = f(context);
        if (f != null) {
            return f.getActiveNetworkInfo();
        }
        return null;
    }

    @Deprecated
    public static boolean e(Context context) {
        ConnectivityManager f = f(context);
        int i = Build.VERSION.SDK_INT;
        if (f != null) {
            return f.isDefaultNetworkActive();
        }
        return false;
    }

    public static ConnectivityManager f(Context context) {
        try {
            return (ConnectivityManager) context.getSystemService("connectivity");
        } catch (SecurityException e) {
            Log.e("NetworkUtils", "Couldn't retrieve ConnectivityManager.", e);
            return null;
        }
    }

    public static boolean a(Context context, int i) {
        int i2;
        ConnectivityManager f = f(context);
        int i3 = Build.VERSION.SDK_INT;
        int i4 = i - 1;
        if (i4 != 0) {
            i2 = i4 != 1 ? 3 : 1;
        } else {
            i2 = 0;
        }
        Network[] allNetworks = f.getAllNetworks();
        if (allNetworks != null) {
            for (Network networkCapabilities : allNetworks) {
                if (f.getNetworkCapabilities(networkCapabilities).hasTransport(i2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.DIAL");
        String valueOf = String.valueOf(str);
        intent.setData(Uri.parse(valueOf.length() == 0 ? new String("tel:") : "tel:".concat(valueOf)));
        return context.getPackageManager().queryIntentActivities(intent, 0).size() > 0;
    }
}
