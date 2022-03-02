package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: gwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gwn {
    public static final iwd a = new iwd("NetworkRequester", new String[0]);
    protected final Context b;
    public final Object c = new Object();
    public amri d = ampu.a;
    private final ConnectivityManager e;
    private amri f = ampu.a;

    public gwn(Context context) {
        this.b = context;
        this.e = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final amri a() {
        amri amri;
        synchronized (this.c) {
            amri = this.d;
        }
        return amri;
    }

    public final void b() {
        synchronized (this.c) {
            if (this.f.a()) {
                this.e.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.f.b());
                this.f = ampu.a;
            }
            if (this.d.a()) {
                this.d = ampu.a;
            }
        }
    }

    public final amri a(NetworkRequest networkRequest, long j) {
        gwm gwm;
        synchronized (this.c) {
            if (this.f.a()) {
                this.e.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.f.b());
            }
            gwm = new gwm(this);
        }
        try {
            this.e.requestNetwork(networkRequest, gwm);
            synchronized (this.c) {
                this.f = amri.b(gwm);
            }
            if (gwm.a.await(j, TimeUnit.MILLISECONDS)) {
                return a();
            }
            b();
            a.d(String.format(Locale.US, "Timeout [%d] when acquiring the network.", new Object[]{Long.valueOf(j)}), new Object[0]);
            return ampu.a;
        } catch (InterruptedException | RuntimeException e2) {
            a.d("Failed to acquireNetwork the network.", e2, new Object[0]);
            return ampu.a;
        }
    }
}
