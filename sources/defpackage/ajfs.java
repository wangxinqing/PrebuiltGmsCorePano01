package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* renamed from: ajfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajfs extends ajgq {
    static {
        jjg.a("EAlert");
    }

    public ajfs(Context context, ajgd ajgd) {
        super(context, ajgd);
    }

    static int a(Context context) {
        if (!ayab.a.a().enableConnectivityReporting()) {
            return -1;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return -2;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.getType();
        }
        return -3;
    }

    static String b(Context context) {
        TelephonyManager telephonyManager;
        if (!ayab.a.a().enableOperatorReporting() || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            return null;
        }
        return telephonyManager.getNetworkOperator();
    }

    static boolean d() {
        if (!ayab.a.a().enable() || (!ayab.g() && !ayab.e())) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        if (!d() || kr.a(this.a, "android.permission.ACCESS_COARSE_LOCATION") == -1) {
            return true;
        }
        if (ayab.m() && !ajgq.c(this.a)) {
            return true;
        }
        if (!ayab.a.a().disableForSupervised() || !ajgq.d(this.a)) {
            return super.e();
        }
        return true;
    }
}
