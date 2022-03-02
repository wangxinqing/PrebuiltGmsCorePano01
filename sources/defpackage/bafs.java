package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bafs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class bafs implements baef {
    private volatile boolean a;
    private baeh b;
    private babj c;
    public baef d;
    private List e = new ArrayList();
    private bafr f;
    private long g;
    private long h;

    private final void a(Runnable runnable) {
        synchronized (this) {
            if (!this.a) {
                this.e.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r8.e = null;
        r8.a = true;
        r3 = r8.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r3 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r4 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r3.c.isEmpty() != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r5 = r3.c;
        r3.c = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        r4 = r5.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (r6 >= r4) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        ((java.lang.Runnable) r5.get(r6)).run();
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        r5.clear();
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r3.c = null;
        r3.b = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r0 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r2 >= r0) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        ((java.lang.Runnable) r1.get(r2)).run();
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b() {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            monitor-enter(r8)
            java.util.List r1 = r8.e     // Catch:{ all -> 0x006b }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x006b }
            r2 = 0
            if (r1 != 0) goto L_0x002b
            java.util.List r1 = r8.e     // Catch:{ all -> 0x006b }
            r8.e = r0     // Catch:{ all -> 0x006b }
            monitor-exit(r8)     // Catch:{ all -> 0x006b }
            int r0 = r1.size()
        L_0x0018:
            if (r2 >= r0) goto L_0x0026
            java.lang.Object r3 = r1.get(r2)
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r3.run()
            int r2 = r2 + 1
            goto L_0x0018
        L_0x0026:
            r1.clear()
            r0 = r1
            goto L_0x0005
        L_0x002b:
            r0 = 0
            r8.e = r0     // Catch:{ all -> 0x006b }
            r1 = 1
            r8.a = r1     // Catch:{ all -> 0x006b }
            bafr r3 = r8.f     // Catch:{ all -> 0x006b }
            monitor-exit(r8)     // Catch:{ all -> 0x006b }
            if (r3 == 0) goto L_0x006a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x003b:
            monitor-enter(r3)
            java.util.List r5 = r3.c     // Catch:{ all -> 0x0067 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0067 }
            if (r5 != 0) goto L_0x0061
            java.util.List r5 = r3.c     // Catch:{ all -> 0x0067 }
            r3.c = r4     // Catch:{ all -> 0x0067 }
            monitor-exit(r3)     // Catch:{ all -> 0x0067 }
            int r4 = r5.size()
            r6 = 0
        L_0x004e:
            if (r6 >= r4) goto L_0x005c
            java.lang.Object r7 = r5.get(r6)
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            r7.run()
            int r6 = r6 + 1
            goto L_0x004e
        L_0x005c:
            r5.clear()
            r4 = r5
            goto L_0x003b
        L_0x0061:
            r3.c = r0     // Catch:{ all -> 0x0067 }
            r3.b = r1     // Catch:{ all -> 0x0067 }
            monitor-exit(r3)     // Catch:{ all -> 0x0067 }
            return
        L_0x0067:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0067 }
            throw r0
        L_0x006a:
            return
        L_0x006b:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x006b }
            goto L_0x006f
        L_0x006e:
            throw r0
        L_0x006f:
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bafs.b():void");
    }

    public final azxa a() {
        throw null;
    }

    public final void c(int i) {
        if (!this.a) {
            a((Runnable) new bafb(this, i));
        } else {
            this.d.c(i);
        }
    }

    public final void f() {
        a((Runnable) new bafl(this));
    }

    public final void g() {
        if (!this.a) {
            a((Runnable) new bafj(this));
        } else {
            this.d.g();
        }
    }

    public final void a(int i) {
        if (!this.a) {
            a((Runnable) new baff(this, i));
        } else {
            this.d.a(i);
        }
    }

    public final void a(azxx azxx) {
        amrl.a((Object) azxx, (Object) "compressor");
        a((Runnable) new bafc(this, azxx));
    }

    public final void a(azyf azyf) {
        a((Runnable) new bafg(this, azyf));
    }

    public final void a(azyi azyi) {
        amrl.a((Object) azyi, (Object) "decompressorRegistry");
        a((Runnable) new bafd(this, azyi));
    }

    /* access modifiers changed from: package-private */
    public final void a(baef baef) {
        synchronized (this) {
            if (this.d == null) {
                amrl.a((Object) baef, (Object) "stream");
                b(baef);
                b();
            }
        }
    }

    public final void a(baeh baeh) {
        boolean z;
        babj babj;
        boolean z2;
        if (this.b == null) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "already started");
        synchronized (this) {
            amrl.a((Object) baeh, (Object) "listener");
            this.b = baeh;
            babj = this.c;
            z2 = this.a;
            if (!z2) {
                bafr bafr = new bafr(baeh);
                this.f = bafr;
                baeh = bafr;
            }
            this.g = System.nanoTime();
        }
        if (babj != null) {
            baeh.b(babj, new baaf());
        } else if (!z2) {
            a((Runnable) new bafh(this, baeh));
        } else {
            this.d.a(baeh);
        }
    }

    private final void b(baef baef) {
        boolean z;
        baef baef2 = this.d;
        if (baef2 == null) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, "realStream already set to %s", (Object) baef2);
        this.d = baef;
        this.h = System.nanoTime();
    }

    public final void b(int i) {
        if (!this.a) {
            a((Runnable) new bafe(this, i));
        } else {
            this.d.b(i);
        }
    }

    public void b(babj babj) {
        boolean z;
        baeh baeh;
        amrl.a((Object) babj, (Object) "reason");
        synchronized (this) {
            if (this.d == null) {
                b((baef) bajy.a);
                baeh = this.b;
                this.c = babj;
                z = false;
            } else {
                z = true;
                baeh = null;
            }
        }
        if (z) {
            a((Runnable) new bafk(this, babj));
            return;
        }
        if (baeh != null) {
            baeh.b(babj, new baaf());
        }
        b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bahb r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            baeh r0 = r5.b     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            baef r0 = r5.d     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "buffered_nanos"
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0036 }
            long r3 = r5.g     // Catch:{ all -> 0x0036 }
            long r1 = r1 - r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0036 }
            r6.a(r0, r1)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "waiting_for_connection"
            r6.a(r0)     // Catch:{ all -> 0x0036 }
            goto L_0x0032
        L_0x001f:
            java.lang.String r0 = "buffered_nanos"
            long r1 = r5.h     // Catch:{ all -> 0x0036 }
            long r3 = r5.g     // Catch:{ all -> 0x0036 }
            long r1 = r1 - r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0036 }
            r6.a(r0, r1)     // Catch:{ all -> 0x0036 }
            baef r0 = r5.d     // Catch:{ all -> 0x0036 }
            r0.a((defpackage.bahb) r6)     // Catch:{ all -> 0x0036 }
        L_0x0032:
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            return
        L_0x0034:
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            return
        L_0x0036:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bafs.a(bahb):void");
    }

    public final void a(InputStream inputStream) {
        amrl.a((Object) inputStream, (Object) "message");
        if (this.a) {
            this.d.a(inputStream);
        } else {
            a((Runnable) new bafi(this, inputStream));
        }
    }
}
