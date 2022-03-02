package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: agjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agjq {
    public static final anhq a = anhq.a("agjq");

    public static int a(Context context) {
        NetworkInfo activeNetworkInfo;
        int i = -1;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null)) {
                i = activeNetworkInfo.getType();
            }
        } catch (SecurityException e) {
            anhn anhn = (anhn) a.c();
            anhn.a((Throwable) e);
            ((anhn) anhn.a("agjq", "a", 38, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml");
        }
        int a2 = barj.a(i);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
