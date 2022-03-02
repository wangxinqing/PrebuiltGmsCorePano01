package defpackage;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: bacu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bacu implements baep {
    public final String a;
    public bajn b;
    public final Object c = new Object();
    public final Set d = new HashSet();
    public final Executor e;
    public final int f;
    public final boolean g;
    public final balu h;
    public final boolean i;
    public final boolean j;
    public boolean k;
    public babj l;
    public boolean m;
    public final back n;
    private final azyx o;
    private final InetSocketAddress p;
    private final String q;
    private final azxa r;
    private boolean s;
    private boolean t;

    public bacu(back back, InetSocketAddress inetSocketAddress, String str, String str2, azxa azxa, Executor executor, balu balu) {
        amrl.a((Object) inetSocketAddress, (Object) "address");
        this.p = inetSocketAddress;
        this.o = azyx.a((Class) getClass(), inetSocketAddress.toString());
        this.q = str;
        this.a = bagt.a("cronet", str2);
        this.f = 4194304;
        this.g = false;
        amrl.a((Object) executor, (Object) "executor");
        this.e = executor;
        amrl.a((Object) back, (Object) "streamFactory");
        this.n = back;
        amrl.a((Object) balu, (Object) "transportTracer");
        this.h = balu;
        azwy a2 = azxa.a();
        a2.a(bagm.a, babc.PRIVACY_AND_INTEGRITY);
        a2.a(bagm.b, azxa);
        this.r = a2.a();
        this.i = false;
        this.j = false;
    }

    public final azxa a() {
        return this.r;
    }

    public final azyx b() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        synchronized (this.c) {
            if (this.k && !this.t && this.d.size() == 0) {
                this.t = true;
                this.b.b();
            }
        }
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.p);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public final void b(babj babj) {
        ArrayList arrayList;
        a(babj);
        synchronized (this.c) {
            arrayList = new ArrayList(this.d);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((bacr) arrayList.get(i2)).b(babj);
        }
        c();
    }

    public final /* bridge */ /* synthetic */ baef a(baaj baaj, baaf baaf, azxh azxh) {
        amrl.a((Object) baaj, (Object) "method");
        amrl.a((Object) baaf, (Object) "headers");
        String valueOf = String.valueOf(baaj.b);
        String str = valueOf.length() == 0 ? new String("/") : "/".concat(valueOf);
        String str2 = this.q;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 8 + String.valueOf(str).length());
        sb.append("https://");
        sb.append(str2);
        sb.append(str);
        return new bact(this, sb.toString(), baaf, baaj, balm.a(azxh, this.r), azxh).a;
    }

    public final Runnable a(bajn bajn) {
        amrl.a((Object) bajn, (Object) "listener");
        this.b = bajn;
        synchronized (this.c) {
            this.m = true;
        }
        return new bacs(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000d, code lost:
        if (r3.s != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
        r3.s = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0012, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0013, code lost:
        r3.b.a(r4);
        r2 = r3.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.k = true;
        r3.l = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0008, code lost:
        r1 = r3.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000a, code lost:
        monitor-enter(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.babj r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            boolean r1 = r3.k     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x002c
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r3.c
            monitor-enter(r1)
            boolean r0 = r3.s     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0027
            r0 = 1
            r3.s = r0     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            bajn r1 = r3.b
            r1.a((defpackage.babj) r4)
            java.lang.Object r2 = r3.c
            monitor-enter(r2)
            r3.k = r0     // Catch:{ all -> 0x0024 }
            r3.l = r4     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            r3.c()
            return
        L_0x0024:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            throw r4
        L_0x0027:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r4
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x002e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bacu.a(babj):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(bacr bacr, babj babj) {
        synchronized (this.c) {
            if (this.d.remove(bacr)) {
                boolean z = true;
                if (!(babj.r == babg.CANCELLED || babj.r == babg.DEADLINE_EXCEEDED)) {
                    z = false;
                }
                bacr.o.b(babj, z, new baaf());
                c();
            }
        }
    }
}
