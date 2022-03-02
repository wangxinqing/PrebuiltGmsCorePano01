package defpackage;

import android.net.ConnectivityManager;
import android.os.Build;

/* renamed from: ml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ml {
    public static boolean a(ConnectivityManager connectivityManager) {
        int i = Build.VERSION.SDK_INT;
        return connectivityManager.isActiveNetworkMetered();
    }
}
