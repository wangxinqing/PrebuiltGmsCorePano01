package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* renamed from: bafa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bafa implements bajo {
    public final Object a = new Object();
    public final babq b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public bajn f;
    public Collection g = new LinkedHashSet();
    public babj h;
    private final azyx i = azyx.a(bafa.class, (String) null);
    private final Executor j;
    private azzm k;
    private long l;

    public bafa(Executor executor, babq babq) {
        this.j = executor;
        this.b = babq;
    }

    private final baez a(azzi azzi) {
        int size;
        baez baez = new baez(this, azzi);
        this.g.add(baez);
        synchronized (this.a) {
            size = this.g.size();
        }
        if (size == 1) {
            this.b.a(this.c);
        }
        return baez;
    }

    public final Runnable a(bajn bajn) {
        throw null;
    }

    public final azyx b() {
        return this.i;
    }

    public final void b(babj babj) {
        Collection<baez> collection;
        Runnable runnable;
        a(babj);
        synchronized (this.a) {
            collection = this.g;
            runnable = this.e;
            this.e = null;
            if (!collection.isEmpty()) {
                this.g = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (baez b2 : collection) {
                b2.b(babj);
            }
            this.b.execute(runnable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r7 = new defpackage.bage(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        r8 = r6.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.baef a(defpackage.baaj r7, defpackage.baaf r8, defpackage.azxh r9) {
        /*
            r6 = this;
            bakh r0 = new bakh     // Catch:{ all -> 0x005b }
            r0.<init>(r7, r8, r9)     // Catch:{ all -> 0x005b }
            r7 = 0
            r1 = -1
        L_0x0008:
            java.lang.Object r8 = r6.a     // Catch:{ all -> 0x005b }
            monitor-enter(r8)     // Catch:{ all -> 0x005b }
            babj r3 = r6.h     // Catch:{ all -> 0x0058 }
            if (r3 != 0) goto L_0x004f
            azzm r3 = r6.k     // Catch:{ all -> 0x0058 }
            if (r3 != 0) goto L_0x001e
            baez r7 = r6.a((defpackage.azzi) r0)     // Catch:{ all -> 0x0058 }
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            babq r8 = r6.b
        L_0x001a:
            r8.a()
            return r7
        L_0x001e:
            if (r7 != 0) goto L_0x0021
        L_0x0020:
            goto L_0x002f
        L_0x0021:
            long r4 = r6.l     // Catch:{ all -> 0x0058 }
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0020
            baez r7 = r6.a((defpackage.azzi) r0)     // Catch:{ all -> 0x0058 }
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            babq r8 = r6.b
            goto L_0x001a
        L_0x002f:
            long r1 = r6.l     // Catch:{ all -> 0x0058 }
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            azzh r7 = r3.a()     // Catch:{ all -> 0x005b }
            boolean r8 = r9.a()     // Catch:{ all -> 0x005b }
            baei r7 = defpackage.bagt.a((defpackage.azzh) r7, (boolean) r8)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x004d
            baaj r8 = r0.c     // Catch:{ all -> 0x005b }
            baaf r9 = r0.b     // Catch:{ all -> 0x005b }
            azxh r0 = r0.a     // Catch:{ all -> 0x005b }
            baef r7 = r7.a(r8, r9, r0)     // Catch:{ all -> 0x005b }
            babq r8 = r6.b
            goto L_0x001a
        L_0x004d:
            r7 = r3
            goto L_0x0008
        L_0x004f:
            bage r7 = new bage     // Catch:{ all -> 0x0058 }
            r7.<init>(r3)     // Catch:{ all -> 0x0058 }
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            babq r8 = r6.b
            goto L_0x001a
        L_0x0058:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            throw r7     // Catch:{ all -> 0x005b }
        L_0x005b:
            r7 = move-exception
            babq r8 = r6.b
            r8.a()
            goto L_0x0063
        L_0x0062:
            throw r7
        L_0x0063:
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bafa.a(baaj, baaf, azxh):baef");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r3 >= r2) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r4 = (defpackage.baez) r1.get(r3);
        r5 = r4.a;
        r5 = r9.a();
        r6 = ((defpackage.bakh) r4.a).a;
        r5 = defpackage.bagt.a(r5, r6.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r5 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        r7 = r8.j;
        r6 = r6.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r6 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r7.execute(new defpackage.baey(r4, r5));
        r0.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        r9 = r8.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (a() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        r8.g.removeAll(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (r8.g.isEmpty() == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        r8.g = new java.util.LinkedHashSet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (a() != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        r8.b.a(r8.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        if (r8.h == null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        r0 = r8.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r0 == null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        r8.b.a(r0);
        r8.e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        r8.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r0 = new java.util.ArrayList();
        r2 = r1.size();
        r3 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.azzm r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.a
            monitor-enter(r0)
            r8.k = r9     // Catch:{ all -> 0x00a2 }
            long r1 = r8.l     // Catch:{ all -> 0x00a2 }
            r3 = 1
            long r1 = r1 + r3
            r8.l = r1     // Catch:{ all -> 0x00a2 }
            if (r9 == 0) goto L_0x00a0
            boolean r1 = r8.a()     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x00a0
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00a2 }
            java.util.Collection r2 = r8.g     // Catch:{ all -> 0x00a2 }
            r1.<init>(r2)     // Catch:{ all -> 0x00a2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r1.size()
            r3 = 0
        L_0x0026:
            if (r3 >= r2) goto L_0x005a
            java.lang.Object r4 = r1.get(r3)
            baez r4 = (defpackage.baez) r4
            azzi r5 = r4.a
            azzh r5 = r9.a()
            azzi r6 = r4.a
            bakh r6 = (defpackage.bakh) r6
            azxh r6 = r6.a
            boolean r7 = r6.a()
            baei r5 = defpackage.bagt.a((defpackage.azzh) r5, (boolean) r7)
            if (r5 == 0) goto L_0x0057
            java.util.concurrent.Executor r7 = r8.j
            java.util.concurrent.Executor r6 = r6.c
            if (r6 != 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r7 = r6
        L_0x004c:
            baey r6 = new baey
            r6.<init>(r4, r5)
            r7.execute(r6)
            r0.add(r4)
        L_0x0057:
            int r3 = r3 + 1
            goto L_0x0026
        L_0x005a:
            java.lang.Object r9 = r8.a
            monitor-enter(r9)
            boolean r1 = r8.a()     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x009b
            java.util.Collection r1 = r8.g     // Catch:{ all -> 0x009d }
            r1.removeAll(r0)     // Catch:{ all -> 0x009d }
            java.util.Collection r0 = r8.g     // Catch:{ all -> 0x009d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0077
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch:{ all -> 0x009d }
            r0.<init>()     // Catch:{ all -> 0x009d }
            r8.g = r0     // Catch:{ all -> 0x009d }
        L_0x0077:
            boolean r0 = r8.a()     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x0094
            babq r0 = r8.b     // Catch:{ all -> 0x009d }
            java.lang.Runnable r1 = r8.d     // Catch:{ all -> 0x009d }
            r0.a(r1)     // Catch:{ all -> 0x009d }
            babj r0 = r8.h     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0094
            java.lang.Runnable r0 = r8.e     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0094
            babq r1 = r8.b     // Catch:{ all -> 0x009d }
            r1.a(r0)     // Catch:{ all -> 0x009d }
            r0 = 0
            r8.e = r0     // Catch:{ all -> 0x009d }
        L_0x0094:
            monitor-exit(r9)     // Catch:{ all -> 0x009d }
            babq r9 = r8.b
            r9.a()
            return
        L_0x009b:
            monitor-exit(r9)     // Catch:{ all -> 0x009d }
            return
        L_0x009d:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x009d }
            throw r0
        L_0x00a0:
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            return
        L_0x00a2:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            goto L_0x00a6
        L_0x00a5:
            throw r9
        L_0x00a6:
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bafa.a(azzm):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r2.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.babj r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            babj r1 = r2.h     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x002c
            r2.h = r3     // Catch:{ all -> 0x002e }
            babq r3 = r2.b     // Catch:{ all -> 0x002e }
            baex r1 = new baex     // Catch:{ all -> 0x002e }
            r1.<init>(r2)     // Catch:{ all -> 0x002e }
            r3.a(r1)     // Catch:{ all -> 0x002e }
            boolean r3 = r2.a()     // Catch:{ all -> 0x002e }
            if (r3 != 0) goto L_0x0025
            java.lang.Runnable r3 = r2.e     // Catch:{ all -> 0x002e }
            if (r3 == 0) goto L_0x0025
            babq r1 = r2.b     // Catch:{ all -> 0x002e }
            r1.a(r3)     // Catch:{ all -> 0x002e }
            r3 = 0
            r2.e = r3     // Catch:{ all -> 0x002e }
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            babq r3 = r2.b
            r3.a()
            return
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x002e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bafa.a(babj):void");
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = !this.g.isEmpty();
        }
        return z;
    }
}
