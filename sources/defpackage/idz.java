package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: idz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class idz implements ifw {
    public final ifc a;
    public final ifc b;
    public Bundle c;
    public ConnectionResult d = null;
    public ConnectionResult e = null;
    public boolean f = false;
    public final Lock g;
    private final Context h;
    private final iey i;
    private final Looper j;
    private final Map k;
    private final Set l = Collections.newSetFromMap(new WeakHashMap());
    private final ibo m;
    private int n = 0;

    public idz(Context context, iey iey, Lock lock, Looper looper, hxk hxk, Map map, Map map2, ise ise, ibn ibn, ibo ibo, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.h = context;
        this.i = iey;
        this.g = lock;
        this.j = looper;
        this.m = ibo;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        hxk hxk2 = hxk;
        ifc ifc = r2;
        ifc ifc2 = new ifc(context2, this.i, lock2, looper2, hxk2, map2, (ise) null, map4, (ibn) null, arrayList2, new idx(this));
        this.a = ifc;
        this.b = new ifc(context2, this.i, lock2, looper2, hxk2, map, ise, map3, ibn, arrayList, new idy(this));
        nz nzVar = new nz();
        for (ibg put : map2.keySet()) {
            nzVar.put(put, this.a);
        }
        for (ibg put2 : map.keySet()) {
            nzVar.put(put2, this.b);
        }
        this.k = Collections.unmodifiableMap(nzVar);
    }

    private final void a(ConnectionResult connectionResult) {
        int i2 = this.n;
        if (i2 != 1) {
            if (i2 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.n = 0;
            }
            this.i.a(connectionResult);
        }
        i();
        this.n = 0;
    }

    private static boolean b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.b();
    }

    private final boolean c(idf idf) {
        ibg ibg = idf.d;
        iva.b(this.k.containsKey(ibg), "GoogleApiClient is not configured to use the API required for this call.");
        return ((ifc) this.k.get(ibg)).equals(this.b);
    }

    private final void i() {
        for (fwa fwa : this.l) {
            fwa.c.release();
        }
        this.l.clear();
    }

    private final boolean j() {
        ConnectionResult connectionResult = this.e;
        return connectionResult != null && connectionResult.c == 4;
    }

    private final PendingIntent k() {
        if (this.m != null) {
            return PendingIntent.getActivity(this.h, System.identityHashCode(this.i), this.m.i(), 134217728);
        }
        return null;
    }

    public final boolean d() {
        this.g.lock();
        try {
            boolean z = false;
            if (this.a.d()) {
                if (g() || j()) {
                    z = true;
                } else if (this.n == 1) {
                    z = true;
                }
            }
            return z;
        } finally {
            this.g.unlock();
        }
    }

    public final boolean e() {
        boolean z;
        this.g.lock();
        try {
            if (this.n == 2) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.g.unlock();
        }
    }

    public final void f() {
        this.g.lock();
        try {
            boolean e2 = e();
            this.b.c();
            this.e = new ConnectionResult(4);
            if (e2) {
                new qvr(this.j).post(new idw(this));
            } else {
                i();
            }
        } finally {
            this.g.unlock();
        }
    }

    public final boolean g() {
        return this.b.d();
    }

    public final void h() {
        ConnectionResult connectionResult;
        if (b(this.d)) {
            if (!b(this.e) && !j()) {
                ConnectionResult connectionResult2 = this.e;
                if (connectionResult2 == null) {
                    return;
                }
                if (this.n != 1) {
                    a(connectionResult2);
                    this.a.c();
                    return;
                }
                i();
                return;
            }
            int i2 = this.n;
            if (i2 != 1) {
                if (i2 != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    this.n = 0;
                }
                this.i.a(this.c);
            }
            i();
            this.n = 0;
        } else if (this.d == null || !b(this.e)) {
            ConnectionResult connectionResult3 = this.d;
            if (connectionResult3 != null && (connectionResult = this.e) != null) {
                if (this.b.k < this.a.k) {
                    connectionResult3 = connectionResult;
                }
                a(connectionResult3);
            }
        } else {
            this.b.c();
            a(this.d);
        }
    }

    public final ConnectionResult b() {
        throw new UnsupportedOperationException();
    }

    public final idf b(idf idf) {
        if (!c(idf)) {
            return this.a.b(idf);
        }
        if (!j()) {
            return this.b.b(idf);
        }
        idf.a(new Status(4, (String) null, k()));
        return idf;
    }

    public final ConnectionResult a(long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        this.e = null;
        this.d = null;
        this.n = 0;
        this.a.c();
        this.b.c();
        i();
    }

    public final idf a(idf idf) {
        if (!c(idf)) {
            this.a.a(idf);
            return idf;
        } else if (j()) {
            idf.a(new Status(4, (String) null, k()));
            return idf;
        } else {
            this.b.a(idf);
            return idf;
        }
    }

    public final void a() {
        this.n = 2;
        this.f = false;
        this.e = null;
        this.d = null;
        this.a.a();
        this.b.a();
    }

    public final void a(int i2) {
        this.i.a(i2);
        this.e = null;
        this.d = null;
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.b.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.a.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean a(fwa fwa) {
        this.g.lock();
        try {
            if ((e() || d()) && !g()) {
                this.l.add(fwa);
                if (this.n == 0) {
                    this.n = 1;
                }
                this.e = null;
                this.b.a();
                return true;
            }
            this.g.unlock();
            return false;
        } finally {
            this.g.unlock();
        }
    }
}
