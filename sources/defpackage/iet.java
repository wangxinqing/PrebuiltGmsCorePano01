package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: iet  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iet implements iez {
    public final ifc a;
    public final Lock b;
    public final Context c;
    public final hxk d;
    public abag e;
    public boolean f;
    public boolean g;
    public itm h;
    public boolean i;
    public boolean j;
    public final ise k;
    private ConnectionResult l;
    private int m;
    private int n = 0;
    private int o;
    private final Bundle p = new Bundle();
    private final Set q = new HashSet();
    private boolean r;
    private final Map s;
    private final ArrayList t = new ArrayList();
    private final ibn u;

    public iet(ifc ifc, ise ise, Map map, hxk hxk, ibn ibn, Lock lock, Context context) {
        this.a = ifc;
        this.k = ise;
        this.s = map;
        this.d = hxk;
        this.u = ibn;
        this.b = lock;
        this.c = context;
    }

    private final void a(boolean z) {
        abag abag = this.e;
        if (abag != null) {
            if (abag.l() && z) {
                this.e.a();
            }
            this.e.j();
            this.h = null;
        }
    }

    private static final String c(int i2) {
        return i2 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* JADX INFO: finally extract failed */
    private final void g() {
        ifc ifc = this.a;
        ifc.a.lock();
        try {
            ifc.l.m();
            ifc.j = new iei(ifc);
            ifc.j.a();
            ifc.b.signalAll();
            ifc.a.unlock();
            ifd.a.execute(new iej(this));
            abag abag = this.e;
            if (abag != null) {
                if (this.i) {
                    abag.a(this.h, this.j);
                }
                a(false);
            }
            for (ibg ibg : this.a.g.keySet()) {
                ((ibo) this.a.f.get(ibg)).j();
            }
            this.a.m.a(!this.p.isEmpty() ? this.p : null);
        } catch (Throwable th) {
            ifc.a.unlock();
            throw th;
        }
    }

    private final void h() {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Future) arrayList.get(i2)).cancel(true);
        }
        this.t.clear();
    }

    public final void b(ConnectionResult connectionResult) {
        h();
        a(!connectionResult.a());
        this.a.a(connectionResult);
        this.a.m.a(connectionResult);
    }

    public final void c() {
    }

    public final boolean d() {
        int i2 = this.o - 1;
        this.o = i2;
        if (i2 > 0) {
            return false;
        }
        if (i2 < 0) {
            Log.w("GACConnecting", this.a.l.n());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            b(new ConnectionResult(8, (PendingIntent) null));
            return false;
        }
        ConnectionResult connectionResult = this.l;
        if (connectionResult == null) {
            return true;
        }
        this.a.k = this.m;
        b(connectionResult);
        return false;
    }

    public final void e() {
        if (this.o != 0) {
            return;
        }
        if (!this.f || this.g) {
            ArrayList arrayList = new ArrayList();
            this.n = 1;
            Map map = this.a.f;
            this.o = ((ou) map).h;
            for (ibg ibg : map.keySet()) {
                if (!this.a.g.containsKey(ibg)) {
                    arrayList.add((ibo) this.a.f.get(ibg));
                } else if (d()) {
                    g();
                }
            }
            if (!arrayList.isEmpty()) {
                this.t.add(ifd.a.submit(new ieo(this, arrayList)));
            }
        }
    }

    public final void f() {
        this.f = false;
        this.a.l.i = Collections.emptySet();
        for (ibg ibg : this.q) {
            if (!this.a.g.containsKey(ibg)) {
                this.a.g.put(ibg, new ConnectionResult(17, (PendingIntent) null));
            }
        }
    }

    public final idf a(idf idf) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void a() {
        boolean z;
        this.a.g.clear();
        this.f = false;
        this.l = null;
        this.n = 0;
        this.r = true;
        this.g = false;
        this.i = false;
        HashMap hashMap = new HashMap();
        boolean z2 = false;
        for (ibq ibq : this.s.keySet()) {
            ibo ibo = (ibo) this.a.f.get(ibq.a());
            if (ibq.b.a() == 1) {
                z = true;
            } else {
                z = false;
            }
            z2 |= z;
            boolean booleanValue = ((Boolean) this.s.get(ibq)).booleanValue();
            if (ibo.g()) {
                this.f = true;
                if (booleanValue) {
                    this.q.add(ibq.a());
                } else {
                    this.r = false;
                }
            }
            hashMap.put(ibo, new iek(this, ibq, booleanValue));
        }
        if (z2) {
            this.f = false;
        }
        if (this.f) {
            this.k.h = Integer.valueOf(System.identityHashCode(this.a.l));
            ier ier = new ier(this);
            ibn ibn = this.u;
            Context context = this.c;
            Looper looper = this.a.l.e;
            ise ise = this.k;
            this.e = (abag) ibn.a(context, looper, ise, (Object) ise.g, (ica) ier, (icb) ier);
        }
        this.o = ((ou) this.a.f).h;
        this.t.add(ifd.a.submit(new ien(this, hashMap)));
    }

    public final void b(ConnectionResult connectionResult, ibq ibq, boolean z) {
        int a2 = ibq.b.a();
        if ((!z || connectionResult.a() || this.d.b((Context) null, connectionResult.c, (String) null) != null) && (this.l == null || a2 < this.m)) {
            this.l = connectionResult;
            this.m = a2;
        }
        this.a.g.put(ibq.a(), connectionResult);
    }

    public final void b(idf idf) {
        this.a.l.f.add(idf);
    }

    public final boolean b() {
        h();
        a(true);
        this.a.a((ConnectionResult) null);
        return true;
    }

    public final boolean b(int i2) {
        if (this.n == i2) {
            return true;
        }
        Log.w("GACConnecting", this.a.l.n());
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        Log.w("GACConnecting", sb.toString());
        int i3 = this.o;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i3);
        Log.w("GACConnecting", sb2.toString());
        String c2 = c(this.n);
        String c3 = c(i2);
        StringBuilder sb3 = new StringBuilder(c2.length() + 70 + c3.length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(c2);
        sb3.append(" but received callback for step ");
        sb3.append(c3);
        Log.e("GACConnecting", sb3.toString(), new Exception());
        b(new ConnectionResult(8, (PendingIntent) null));
        return false;
    }

    public final void a(int i2) {
        b(new ConnectionResult(8, (PendingIntent) null));
    }

    public final void a(Bundle bundle) {
        if (b(1)) {
            if (bundle != null) {
                this.p.putAll(bundle);
            }
            if (d()) {
                g();
            }
        }
    }

    public final void a(ConnectionResult connectionResult, ibq ibq, boolean z) {
        if (b(1)) {
            b(connectionResult, ibq, z);
            if (d()) {
                g();
            }
        }
    }

    public final boolean a(ConnectionResult connectionResult) {
        return this.r && !connectionResult.a();
    }
}
