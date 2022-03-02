package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;

/* renamed from: hxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hxy extends hxz {
    @Deprecated
    public static final int a = hxz.b;

    public static Context c(Context context) {
        return hxz.i(context);
    }

    public static boolean e(Context context) {
        return hxz.k(context);
    }

    @Deprecated
    public static Dialog a(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (hxz.b(activity, i)) {
            i = 18;
        }
        return hxj.a.a(activity, i, i2, onCancelListener);
    }

    public static Resources b(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public static boolean d(Context context) {
        return jix.a(context);
    }

    @Deprecated
    public static void a(int i, Context context) {
        hxj hxj = hxj.a;
        if (hxz.b(context, i) || (i == 9 && hxz.a(context, "com.android.vending"))) {
            hxj.a(context);
        } else {
            hxj.a(context, i);
        }
    }

    @Deprecated
    public static boolean a(int i, Activity activity) {
        gj gjVar = null;
        if (hxz.b(activity, i)) {
            i = 18;
        }
        hxj hxj = hxj.a;
        if (gjVar == null) {
            return hxj.b(activity, i, 1, (DialogInterface.OnCancelListener) null);
        }
        Dialog a2 = hxj.a((Context) activity, i, (isl) new isj(hxj.a.b(activity, i, "d"), gjVar), (DialogInterface.OnCancelListener) null);
        if (a2 == null) {
            return false;
        }
        hxj.a(activity, a2, "GooglePlayServicesErrorDialog", (DialogInterface.OnCancelListener) null);
        return true;
    }

    public static boolean a(Context context) {
        return hxz.g(context);
    }
}
