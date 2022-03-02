package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;

/* renamed from: nuw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nuw {
    private ConnectivityManager.NetworkCallback a;
    private final ConnectivityManager b;

    public nuw(Context context) {
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final synchronized void a() {
        if (b()) {
            this.b.unregisterNetworkCallback(this.a);
            this.a = null;
        }
    }

    public final synchronized boolean b() {
        return this.a != null;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback) {
        if (!b()) {
            this.b.registerNetworkCallback(networkRequest, networkCallback);
            this.a = networkCallback;
        }
    }
}
