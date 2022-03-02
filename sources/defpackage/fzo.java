package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: fzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fzo {
    private final ConnectivityManager a;

    public fzo(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final boolean a() {
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
