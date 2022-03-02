package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: adog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class adog {
    public static final iwd a = adnt.g("NetworkRequester");
    protected final Context b;
    public final Object c = new Object();
    public adof d;
    public amri e = ampu.a;
    private final ConnectivityManager f;
    private amri g = ampu.a;

    protected adog(Context context) {
        this.b = context;
        this.f = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final amri a() {
        amri amri;
        synchronized (this.c) {
            amri = this.e;
        }
        return amri;
    }

    public final void b() {
        adof adof;
        synchronized (this.c) {
            if (this.g.a()) {
                this.f.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.g.b());
                this.g = ampu.a;
            }
            if (this.e.a()) {
                this.e = ampu.a;
                adof = this.d;
            } else {
                adof = null;
            }
        }
        if (adof != null) {
            admr admr = (admr) adof;
            if (!admr.f.get()) {
                admr.e();
            }
        }
    }

    public abstract void c();

    /* access modifiers changed from: protected */
    public final void a(long j) {
        if (!adod.b(this.b)) {
            adod a2 = adod.a(this.b);
            synchronized (this.c) {
                this.e = amri.b(a2);
            }
            return;
        }
        a(amzy.a((Object) 12), j);
    }

    /* access modifiers changed from: protected */
    public final void b(long j) {
        if (!adod.b(this.b)) {
            adod a2 = adod.a(this.b);
            if (!a2.c(this.b)) {
                synchronized (this.c) {
                    this.e = amri.b(a2);
                }
                return;
            }
            throw new IOException("Unable to acquire non-metered network.");
        }
        a(amzy.a((Object) 11, (Object) 12), j);
    }

    /* access modifiers changed from: protected */
    public final void a(List list, long j) {
        adoe adoe;
        a.c("Requesting network with capabilities %s...", list);
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.removeCapability(15);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            builder.addCapability(((Integer) it.next()).intValue());
        }
        synchronized (this.c) {
            if (this.g.a()) {
                this.f.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.g.b());
            }
            adoe = new adoe(this);
        }
        try {
            this.f.requestNetwork(builder.build(), adoe);
            synchronized (this.c) {
                this.g = amri.b(adoe);
            }
            if (adoe.a.await(j, TimeUnit.MILLISECONDS)) {
                amri a2 = a();
                if (a2.a()) {
                    adod adod = (adod) a2.b();
                    return;
                }
                throw new IOException("Failed to acquire the network.");
            }
            b();
            throw new IOException(String.format(Locale.US, "Timeout [%d] when acquiring the network.", new Object[]{Long.valueOf(j)}));
        } catch (InterruptedException | RuntimeException e2) {
            throw new IOException("Failed to acquireNetwork the network.", e2);
        }
    }
}
