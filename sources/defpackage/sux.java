package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: sux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class sux extends syx {
    public final SSLSocketFactory a = null;

    public sux(sze sze) {
        super(sze);
        int i = Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    public final boolean c() {
        NetworkInfo networkInfo;
        q();
        try {
            networkInfo = ((ConnectivityManager) z().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
