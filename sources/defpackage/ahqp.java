package defpackage;

import android.os.SystemClock;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* renamed from: ahqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahqp {
    final ajaa a;
    private ahqn b;
    private long c = -1;
    private final ajqu d;

    public ahqp(ajaa ajaa, ajqu ajqu) {
        this.a = ajaa;
        this.d = ajqu;
        b(m());
    }

    private static final File a(ajaa ajaa) {
        if (ajaa.c() != null) {
            return new File(ajaa.c(), "nlp_params");
        }
        return null;
    }

    public static aqek m() {
        aqek aqek = new aqek(ajck.bb);
        aqek.b(3, -2);
        return aqek;
    }

    public static final synchronized ahqo n() {
        ahqo ahqo;
        synchronized (ahqp.class) {
            ahqo = new ahqo(120000, 120000, 86400000);
        }
        return ahqo;
    }

    public static final synchronized ahqo o() {
        ahqo ahqo;
        synchronized (ahqp.class) {
            ahqo = new ahqo(76800, 12800, 14400000);
        }
        return ahqo;
    }

    public static final synchronized ahqo p() {
        ahqo ahqo;
        synchronized (ahqp.class) {
            ahqo = new ahqo(600000, 120000, 86400000);
        }
        return ahqo;
    }

    public static final synchronized ahqo q() {
        ahqo ahqo;
        synchronized (ahqp.class) {
            ahqo = new ahqo(1260000, 1260000, 86400000);
        }
        return ahqo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b3, code lost:
        if (r1 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        a((java.io.Closeable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c2, code lost:
        if (r1 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bd A[SYNTHETIC, Splitter:B:31:0x00bd] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void s() {
        /*
            r7 = this;
            monitor-enter(r7)
            ajaa r0 = r7.a     // Catch:{ all -> 0x00c7 }
            java.io.File r0 = a((defpackage.ajaa) r0)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00c5
            r1 = 0
            ahqn r2 = r7.b     // Catch:{ IOException -> 0x00c1, all -> 0x00ba }
            boolean r2 = a((defpackage.ahqn) r2)     // Catch:{ IOException -> 0x00c1, all -> 0x00ba }
            if (r2 != 0) goto L_0x00a9
            boolean r2 = r0.exists()     // Catch:{ IOException -> 0x00c1, all -> 0x00ba }
            if (r2 != 0) goto L_0x001b
            r0.createNewFile()     // Catch:{ IOException -> 0x00c1, all -> 0x00ba }
        L_0x001b:
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x00c1, all -> 0x00ba }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00c1, all -> 0x00ba }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00c1, all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00c1, all -> 0x00ba }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00c1, all -> 0x00ba }
            r2.<init>(r3)     // Catch:{ IOException -> 0x00c1, all -> 0x00ba }
            r0 = 2
            r2.writeShort(r0)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            long r0 = r7.c     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            long r3 = defpackage.ajbt.e()     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            long r0 = r0 + r3
            r2.writeLong(r0)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            ahqn r0 = r7.b     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            aqek r1 = new aqek     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            aqem r3 = defpackage.ajck.bb     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            int r3 = r0.a     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r4 = 1
            r1.g(r4, r3)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r3 = 11
            int r5 = r0.b     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r1.g(r3, r5)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r3 = 5
            boolean r5 = r0.c     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r1.b((int) r3, (boolean) r5)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r3 = 6
            boolean r5 = r0.d     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r1.b((int) r3, (boolean) r5)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r3 = 7
            boolean r5 = r0.e     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r1.b((int) r3, (boolean) r5)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r3 = 8
            boolean r5 = r0.f     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r1.b((int) r3, (boolean) r5)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r3 = 17
            int r5 = r0.g     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r1.g(r3, r5)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r3 = 18
            int r5 = r0.h     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r1.g(r3, r5)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r3 = 201(0xc9, float:2.82E-43)
            int r5 = r0.i     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r1.g(r3, r5)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r3 = 16
            int r5 = r0.k     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r1.g(r3, r5)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r3 = 3
            long r5 = r0.l     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r1.b((int) r3, (long) r5)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            aqek r3 = new aqek     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            aqem r5 = defpackage.ajck.bc     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            int r0 = r0.j     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r3.g(r4, r0)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r0 = 50
            r1.b((int) r0, (java.lang.Object) r3)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            byte[] r0 = r1.b()     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r2.write(r0)     // Catch:{ IOException -> 0x00a6, all -> 0x00a3 }
            r1 = r2
            goto L_0x00b3
        L_0x00a3:
            r0 = move-exception
            r1 = r2
            goto L_0x00bb
        L_0x00a6:
            r0 = move-exception
            r1 = r2
            goto L_0x00c2
        L_0x00a9:
            boolean r2 = r0.exists()     // Catch:{ IOException -> 0x00c1, all -> 0x00ba }
            if (r2 == 0) goto L_0x00b2
            r0.delete()     // Catch:{ IOException -> 0x00c1, all -> 0x00ba }
        L_0x00b2:
        L_0x00b3:
            if (r1 == 0) goto L_0x00b8
        L_0x00b5:
            a((java.io.Closeable) r1)     // Catch:{ all -> 0x00c7 }
        L_0x00b8:
            monitor-exit(r7)
            return
        L_0x00ba:
            r0 = move-exception
        L_0x00bb:
            if (r1 == 0) goto L_0x00c0
            a((java.io.Closeable) r1)     // Catch:{ all -> 0x00c7 }
        L_0x00c0:
            throw r0     // Catch:{ all -> 0x00c7 }
        L_0x00c1:
            r0 = move-exception
        L_0x00c2:
            if (r1 == 0) goto L_0x00b8
            goto L_0x00b5
        L_0x00c5:
            monitor-exit(r7)
            return
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r7)
            goto L_0x00cb
        L_0x00ca:
            throw r0
        L_0x00cb:
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahqp.s():void");
    }

    private final synchronized void t() {
        if (!a(this.b) && a(this.b, this.c)) {
            u();
        }
    }

    private final synchronized void u() {
        int i = this.b.a;
        b(m());
        int i2 = this.b.a;
        this.c = -1;
        if (i != i2) {
            this.d.a(this);
        }
    }

    public final synchronized void b(aqek aqek) {
        this.b = new ahqn(aqek);
    }

    public final synchronized int c() {
        t();
        return this.b.a;
    }

    public final synchronized int d() {
        t();
        return this.b.b;
    }

    public final synchronized boolean e() {
        t();
        return this.b.c;
    }

    public final synchronized boolean f() {
        t();
        return this.b.e;
    }

    public final synchronized boolean g() {
        t();
        return this.b.f;
    }

    public final synchronized int h() {
        t();
        return this.b.g;
    }

    public final synchronized int i() {
        t();
        return (int) (((long) this.b.h) * 1000);
    }

    public final synchronized int j() {
        t();
        return this.b.i;
    }

    public final synchronized int k() {
        t();
        return this.b.j;
    }

    public final synchronized long l() {
        t();
        return ((long) this.b.k) * 1000;
    }

    public final synchronized void r() {
        t();
        boolean z = this.b.d;
    }

    public final synchronized boolean b() {
        t();
        return a(this.b);
    }

    private static final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    private static final boolean a(ahqn ahqn) {
        return ahqn.l == -2;
    }

    private static final boolean a(ahqn ahqn, long j) {
        if (a(ahqn) || j + (ahqn.l * 1000) >= SystemClock.elapsedRealtime()) {
            return false;
        }
        return true;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void a() {
        /*
            r8 = this;
            monitor-enter(r8)
            ajaa r0 = r8.a     // Catch:{ all -> 0x0093 }
            java.io.File r0 = a((defpackage.ajaa) r0)     // Catch:{ all -> 0x0093 }
            if (r0 != 0) goto L_0x000e
            r8.u()     // Catch:{ all -> 0x0093 }
            goto L_0x0081
        L_0x000e:
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0093 }
            if (r1 == 0) goto L_0x0081
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x007d }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x007d }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x007d }
            r3.<init>(r0)     // Catch:{ FileNotFoundException -> 0x007d }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x007d }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x007d }
            int r0 = r1.readUnsignedShort()     // Catch:{ IOException -> 0x0074 }
            r2 = 2
            if (r0 != r2) goto L_0x006b
            long r2 = r1.readLong()     // Catch:{ IOException -> 0x0074 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0074 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0074 }
            long r6 = r4 - r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003e
            r2 = r4
            goto L_0x003f
        L_0x003e:
        L_0x003f:
            long r2 = r2 - r6
            aqem r0 = defpackage.ajck.bb     // Catch:{ IOException -> 0x0074 }
            aqek r0 = defpackage.ajqx.a((java.io.InputStream) r1, (defpackage.aqem) r0)     // Catch:{ IOException -> 0x0074 }
            ahqn r4 = new ahqn     // Catch:{ IOException -> 0x0074 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0074 }
            boolean r4 = a(r4, r2)     // Catch:{ IOException -> 0x0074 }
            if (r4 == 0) goto L_0x0055
            r8.u()     // Catch:{ IOException -> 0x0074 }
            goto L_0x006e
        L_0x0055:
            monitor-enter(r8)     // Catch:{ IOException -> 0x0074 }
            r8.b(r0)     // Catch:{ all -> 0x0068 }
            r8.c = r2     // Catch:{ all -> 0x0068 }
            ahqn r0 = r8.b     // Catch:{ all -> 0x0068 }
            int r0 = r0.a     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0066
            ajqu r0 = r8.d     // Catch:{ all -> 0x0068 }
            r0.a(r8)     // Catch:{ all -> 0x0068 }
        L_0x0066:
            monitor-exit(r8)     // Catch:{ all -> 0x0068 }
            goto L_0x006e
        L_0x0068:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ IOException -> 0x0074 }
        L_0x006b:
            r8.u()     // Catch:{ IOException -> 0x0074 }
        L_0x006e:
            a((java.io.Closeable) r1)     // Catch:{ FileNotFoundException -> 0x007d }
            goto L_0x0081
        L_0x0072:
            r0 = move-exception
            goto L_0x0079
        L_0x0074:
            r0 = move-exception
            r8.u()     // Catch:{ all -> 0x0072 }
            goto L_0x006e
        L_0x0079:
            a((java.io.Closeable) r1)     // Catch:{ FileNotFoundException -> 0x007d }
            throw r0     // Catch:{ FileNotFoundException -> 0x007d }
        L_0x007d:
            r0 = move-exception
            r8.u()     // Catch:{ all -> 0x0093 }
        L_0x0081:
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0093 }
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0093 }
            r1 = 0
            ahqn r2 = r8.b     // Catch:{ all -> 0x0093 }
            int r2 = r2.a     // Catch:{ all -> 0x0093 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0093 }
            r0[r1] = r2     // Catch:{ all -> 0x0093 }
            monitor-exit(r8)
            return
        L_0x0093:
            r0 = move-exception
            monitor-exit(r8)
            goto L_0x0097
        L_0x0096:
            throw r0
        L_0x0097:
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahqp.a():void");
    }

    public final synchronized void a(aqek aqek) {
        if (aqek != null) {
            if (aqek.c(3) == -2) {
                aqek.b(3, -3);
            }
            int i = this.b.a;
            b(aqek);
            long j = (long) this.b.a;
            this.c = SystemClock.elapsedRealtime();
            if (j != ((long) i)) {
                StringBuilder sb = new StringBuilder(57);
                sb.append("Updating NlpParameters. New version: ");
                sb.append(j);
                sb.toString();
                s();
                this.d.a(this);
            }
        }
    }
}
