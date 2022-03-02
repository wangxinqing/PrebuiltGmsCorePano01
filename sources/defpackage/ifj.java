package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: ifj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ifj implements ica, icb, idv {
    public final Queue a = new LinkedList();
    public final ibo b;
    public final Set c = new HashSet();
    public final Map d = new HashMap();
    public final int e;
    public boolean f;
    public final List g = new ArrayList();
    final /* synthetic */ ifn h;
    private final ibf i;
    private final ida j;
    private final ied k;
    private final igs l;
    private ConnectionResult m = null;

    public ifj(ifn ifn, iby iby) {
        this.h = ifn;
        ibo a2 = iby.e.b().a(iby.c, ifn.o.getLooper(), iby.c().a(), (Object) iby.f, (ica) this, (icb) this);
        this.b = a2;
        if (a2 instanceof ivq) {
            ibp ibp = ((ivq) a2).a;
            this.i = null;
        } else {
            this.i = a2;
        }
        this.j = iby.g;
        this.k = new ied();
        this.e = iby.i;
        if (this.b.g()) {
            this.l = new igs(ifn.h, ifn.o, iby.c().a());
        } else {
            this.l = null;
        }
    }

    private final Feature a(Feature[] featureArr) {
        if (!(featureArr == null || featureArr.length == 0)) {
            Feature[] p = this.b.p();
            if (p == null) {
                p = new Feature[0];
            }
            nz nzVar = new nz(r3);
            for (Feature feature : p) {
                nzVar.put(feature.a, Long.valueOf(feature.a()));
            }
            for (Feature feature2 : featureArr) {
                if (!nzVar.containsKey(feature2.a) || ((Long) nzVar.get(feature2.a)).longValue() < feature2.a()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final void b(ConnectionResult connectionResult) {
        String str;
        for (idd idd : this.c) {
            if (ius.a(connectionResult, ConnectionResult.a)) {
                str = this.b.o();
            } else {
                str = null;
            }
            idd.a(this.j, connectionResult, str);
        }
        this.c.clear();
    }

    private final Status c(ConnectionResult connectionResult) {
        String a2 = this.j.a();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 63 + String.valueOf(valueOf).length());
        sb.append("API: ");
        sb.append(a2);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(17, sb.toString());
    }

    private final void j() {
        ifn ifn = this.h;
        Status status = ifn.a;
        ifn.o.removeMessages(12, this.j);
        Handler handler = this.h.o;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.j), this.h.e);
    }

    public final void d() {
        ifn ifn = this.h;
        Status status = ifn.a;
        iva.a(ifn.o);
        a(ifn.a);
        this.k.a(false, ifn.a);
        for (igc icx : (igc[]) this.d.keySet().toArray(new igc[this.d.size()])) {
            a((icy) new icx(icx, new acwd()));
        }
        b(new ConnectionResult(4));
        if (this.b.l()) {
            this.b.a(new ifi(this));
        }
    }

    public final void e() {
        ifn ifn = this.h;
        Status status = ifn.a;
        iva.a(ifn.o);
        this.m = null;
    }

    public final ConnectionResult f() {
        ifn ifn = this.h;
        Status status = ifn.a;
        iva.a(ifn.o);
        return this.m;
    }

    public final void g() {
        if (this.f) {
            ifn ifn = this.h;
            Status status = ifn.a;
            ifn.o.removeMessages(11, this.j);
            this.h.o.removeMessages(9, this.j);
            this.f = false;
        }
    }

    public final void h() {
        ifn ifn = this.h;
        Status status = ifn.a;
        iva.a(ifn.o);
        if (!this.b.l() && !this.b.m()) {
            try {
                ifn ifn2 = this.h;
                int a2 = ifn2.j.a(ifn2.h, this.b);
                if (a2 != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(a2, (PendingIntent) null);
                    String name = this.i.getClass().getName();
                    String valueOf = String.valueOf(connectionResult);
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 35 + String.valueOf(valueOf).length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(valueOf);
                    Log.w("GoogleApiManager", sb.toString());
                    a(connectionResult);
                    return;
                }
                ifm ifm = new ifm(this.h, this.b, this.j);
                if (this.b.g()) {
                    igs igs = this.l;
                    abag abag = igs.e;
                    if (abag != null) {
                        abag.j();
                    }
                    igs.d.h = Integer.valueOf(System.identityHashCode(igs));
                    ibn ibn = igs.g;
                    Context context = igs.a;
                    Looper looper = igs.b.getLooper();
                    ise ise = igs.d;
                    igs.e = (abag) ibn.a(context, looper, ise, (Object) ise.g, (ica) igs, (icb) igs);
                    igs.f = ifm;
                    Set set = igs.c;
                    if (set != null && !set.isEmpty()) {
                        igs.e.e();
                    } else {
                        igs.b.post(new igq(igs));
                    }
                }
                try {
                    this.b.a((irr) ifm);
                } catch (SecurityException e2) {
                    a(new ConnectionResult(10), e2);
                }
            } catch (IllegalStateException e3) {
                a(new ConnectionResult(10), e3);
            }
        }
    }

    public final boolean i() {
        return this.b.g();
    }

    private final void c(icy icy) {
        if (!(icy instanceof ics)) {
            b(icy);
            return;
        }
        ics ics = (ics) icy;
        Feature a2 = a(ics.a(this));
        if (a2 == null) {
            b(icy);
            return;
        }
        String name = this.i.getClass().getName();
        String str = a2.a;
        long a3 = a2.a();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(str).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(str);
        sb.append(", ");
        sb.append(a3);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        ics.a((Exception) new icr(a2));
    }

    private final void a(Status status, Exception exc, boolean z) {
        boolean z2;
        ifn ifn = this.h;
        Status status2 = ifn.a;
        iva.a(ifn.o);
        boolean z3 = false;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc == null) {
            z3 = true;
        }
        if (z2 != z3) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                icy icy = (icy) it.next();
                if (!z || icy.c == 2) {
                    if (status == null) {
                        icy.a(exc);
                    } else {
                        icy.a(status);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void b(icy icy) {
        icy.a(this.k, i());
        try {
            icy.b(this);
        } catch (DeadObjectException e2) {
            a(1);
            this.b.j();
        } catch (Throwable th) {
            throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", new Object[]{this.i.getClass().getName()}), th);
        }
    }

    public final void g(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        ifn ifn = this.h;
        Status status = ifn.a;
        if (myLooper == ifn.o.getLooper()) {
            a();
        } else {
            this.h.o.post(new iff(this));
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            icy icy = (icy) arrayList.get(i2);
            if (this.b.l()) {
                c(icy);
                this.a.remove(icy);
                i2++;
            } else {
                return;
            }
        }
    }

    public final void a() {
        e();
        b(ConnectionResult.a);
        g();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            igj igj = (igj) it.next();
            if (a(igj.a.b) != null) {
                it.remove();
            } else {
                try {
                    igj.a.a(this.i, new acwd());
                } catch (DeadObjectException e2) {
                    a(1);
                    this.b.j();
                } catch (RemoteException e3) {
                    it.remove();
                }
            }
        }
        c();
        j();
    }

    public final void b() {
        e();
        this.f = true;
        this.k.a(true, ihf.a);
        ifn ifn = this.h;
        Status status = ifn.a;
        Handler handler = ifn.o;
        handler.sendMessageDelayed(Message.obtain(handler, 9, this.j), this.h.c);
        Handler handler2 = this.h.o;
        handler2.sendMessageDelayed(Message.obtain(handler2, 11, this.j), this.h.d);
        this.h.j.a();
        for (igj igj : this.d.values()) {
            igj.c.run();
        }
    }

    public final void a(int i2) {
        Looper myLooper = Looper.myLooper();
        ifn ifn = this.h;
        Status status = ifn.a;
        if (myLooper == ifn.o.getLooper()) {
            b();
        } else {
            this.h.o.post(new ifg(this));
        }
    }

    public final void a(ConnectionResult connectionResult) {
        a(connectionResult, (Exception) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (r3.h.a(r4, r3.e) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        if (r4.c == 18) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        r3.f = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        if (r3.f == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008f, code lost:
        r4 = r3.h.o;
        r4.sendMessageDelayed(android.os.Message.obtain(r4, 9, r3.j), r3.h.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a3, code lost:
        a(c(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.common.ConnectionResult r4, java.lang.Exception r5) {
        /*
            r3 = this;
            ifn r0 = r3.h
            com.google.android.gms.common.api.Status r1 = defpackage.ifn.a
            android.os.Handler r0 = r0.o
            defpackage.iva.a((android.os.Handler) r0)
            igs r0 = r3.l
            if (r0 != 0) goto L_0x000e
            goto L_0x0015
        L_0x000e:
            abag r0 = r0.e
            if (r0 == 0) goto L_0x0015
            r0.j()
        L_0x0015:
            r3.e()
            ifn r0 = r3.h
            itj r0 = r0.j
            r0.a()
            r3.b((com.google.android.gms.common.ConnectionResult) r4)
            int r0 = r4.c
            r1 = 4
            if (r0 != r1) goto L_0x002d
            com.google.android.gms.common.api.Status r4 = defpackage.ifn.b
            r3.a((com.google.android.gms.common.api.Status) r4)
            return
        L_0x002d:
            java.util.Queue r0 = r3.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0038
            r3.m = r4
            return
        L_0x0038:
            r0 = 0
            if (r5 != 0) goto L_0x00af
            ifn r5 = r3.h
            boolean r5 = r5.p
            if (r5 != 0) goto L_0x0049
            com.google.android.gms.common.api.Status r4 = r3.c((com.google.android.gms.common.ConnectionResult) r4)
            r3.a((com.google.android.gms.common.api.Status) r4)
            return
        L_0x0049:
            com.google.android.gms.common.api.Status r5 = r3.c((com.google.android.gms.common.ConnectionResult) r4)
            r1 = 1
            r3.a(r5, r0, r1)
            java.util.Queue r5 = r3.a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x00ae
            java.lang.Object r5 = defpackage.ifn.f
            monitor-enter(r5)
            ifn r0 = r3.h     // Catch:{ all -> 0x00ab }
            iee r2 = r0.m     // Catch:{ all -> 0x00ab }
            if (r2 == 0) goto L_0x0077
            java.util.Set r0 = r0.n     // Catch:{ all -> 0x00ab }
            ida r2 = r3.j     // Catch:{ all -> 0x00ab }
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0077
            ifn r0 = r3.h     // Catch:{ all -> 0x00ab }
            iee r0 = r0.m     // Catch:{ all -> 0x00ab }
            int r1 = r3.e     // Catch:{ all -> 0x00ab }
            r0.b(r4, r1)     // Catch:{ all -> 0x00ab }
            monitor-exit(r5)     // Catch:{ all -> 0x00ab }
            return
        L_0x0077:
            monitor-exit(r5)     // Catch:{ all -> 0x00ab }
            ifn r5 = r3.h
            int r0 = r3.e
            boolean r5 = r5.a(r4, r0)
            if (r5 != 0) goto L_0x00aa
            int r5 = r4.c
            r0 = 18
            if (r5 == r0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r3.f = r1
        L_0x008b:
            boolean r5 = r3.f
            if (r5 == 0) goto L_0x00a3
            ifn r4 = r3.h
            android.os.Handler r4 = r4.o
            r5 = 9
            ida r0 = r3.j
            android.os.Message r5 = android.os.Message.obtain(r4, r5, r0)
            ifn r0 = r3.h
            long r0 = r0.c
            r4.sendMessageDelayed(r5, r0)
            return
        L_0x00a3:
            com.google.android.gms.common.api.Status r4 = r3.c((com.google.android.gms.common.ConnectionResult) r4)
            r3.a((com.google.android.gms.common.api.Status) r4)
        L_0x00aa:
            return
        L_0x00ab:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ab }
            throw r4
        L_0x00ae:
            return
        L_0x00af:
            ifn r4 = r3.h
            android.os.Handler r4 = r4.o
            defpackage.iva.a((android.os.Handler) r4)
            r4 = 0
            r3.a(r0, r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ifj.a(com.google.android.gms.common.ConnectionResult, java.lang.Exception):void");
    }

    public final void a(Status status) {
        ifn ifn = this.h;
        Status status2 = ifn.a;
        iva.a(ifn.o);
        a(status, (Exception) null, false);
    }

    public final void a(icy icy) {
        ifn ifn = this.h;
        Status status = ifn.a;
        iva.a(ifn.o);
        if (this.b.l()) {
            c(icy);
            j();
            return;
        }
        this.a.add(icy);
        ConnectionResult connectionResult = this.m;
        if (connectionResult == null || !connectionResult.a()) {
            h();
        } else {
            a(this.m);
        }
    }

    public final boolean a(boolean z) {
        ifn ifn = this.h;
        Status status = ifn.a;
        iva.a(ifn.o);
        if (!this.b.l() || this.d.size() != 0) {
            return false;
        }
        ied ied = this.k;
        if (!ied.a.isEmpty() || !ied.b.isEmpty()) {
            if (z) {
                j();
            }
            return false;
        }
        this.b.j();
        return true;
    }
}
