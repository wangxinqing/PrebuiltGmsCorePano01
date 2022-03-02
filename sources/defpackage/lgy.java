package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: lgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lgy {
    private final ConnectivityManager a;

    public lgy(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    private static final boolean a(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnected();
    }

    public final lgw b() {
        NetworkInfo c = c();
        if (!a(c)) {
            return lgw.DISCONNECTED;
        }
        int type = c.getType();
        if (type != 0) {
            if (type == 1) {
                return lgw.WIFI;
            }
            if (!(type == 2 || type == 3 || type == 4 || type == 5)) {
                return lgw.OTHER;
            }
        }
        return lgw.MOBILE;
    }

    public final NetworkInfo c() {
        return this.a.getActiveNetworkInfo();
    }

    public final boolean a() {
        return a(c());
    }
}
