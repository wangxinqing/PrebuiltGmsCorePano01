package defpackage;

import java.io.Closeable;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: awbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awbb implements Closeable {
    public static final ExecutorService a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), awaj.b("OkHttp FramedConnection"));
    public final avzh b;
    final boolean c;
    public final Map d = new HashMap();
    public final String e;
    public int f;
    public int g;
    public boolean h;
    public final ExecutorService i;
    long j;
    long k;
    public final awbw l;
    final awbw m;
    public boolean n;
    final awca o;
    final Socket p;
    public final awan q;
    final awba r;
    public final Set s;

    public awbb(awav awav) {
        System.nanoTime();
        this.j = 0;
        this.l = new awbw();
        this.m = new awbw();
        this.n = false;
        this.s = new LinkedHashSet();
        avzh avzh = awav.f;
        this.b = avzh;
        this.c = true;
        this.g = 1;
        if (avzh == avzh.HTTP_2) {
            this.g += 2;
        }
        this.l.a(7, 0, 16777216);
        this.e = awav.b;
        if (this.b == avzh.HTTP_2) {
            this.o = new awbo();
            this.i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), awaj.b(String.format("OkHttp %s Push Observer", new Object[]{this.e})));
            this.m.a(7, 0, 65535);
            this.m.a(5, 0, 16384);
        } else if (this.b == avzh.SPDY_3) {
            this.o = new awbz();
            this.i = null;
        } else {
            throw new AssertionError(this.b);
        }
        this.k = (long) this.m.c();
        this.p = awav.a;
        this.q = this.o.a(awav.d, this.c);
        this.r = new awba(this, this.o.a(awav.c, this.c));
        new Thread(this.r).start();
    }

    public static final synchronized void a(boolean z) {
        synchronized (awbb.class) {
            if (z) {
                System.nanoTime();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized awbf b(int i2) {
        awbf awbf;
        awbf = (awbf) this.d.remove(Integer.valueOf(i2));
        if (awbf != null && this.d.isEmpty()) {
            a(true);
        }
        notifyAll();
        return awbf;
    }

    public final boolean c(int i2) {
        return this.b == avzh.HTTP_2 && i2 != 0 && (i2 & 1) == 0;
    }

    public final void close() {
        a(awak.NO_ERROR, awak.CANCEL);
    }

    public final synchronized int a() {
        awbw awbw;
        awbw = this.m;
        return (awbw.a & 16) != 0 ? awbw.d[4] : Integer.MAX_VALUE;
    }

    public final void b() {
        this.q.b();
    }

    /* access modifiers changed from: package-private */
    public final synchronized awbf a(int i2) {
        return (awbf) this.d.get(Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2, awak awak) {
        this.q.a(i2, awak);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, long j2) {
        a.execute(new awap(this, "OkHttp Window Update %s stream %d", new Object[]{this.e, Integer.valueOf(i2)}, i2, j2));
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, awak awak) {
        a.submit(new awao(this, "OkHttp %s stream %d", new Object[]{this.e, Integer.valueOf(i2)}, i2, awak));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.q.c());
        r6 = (long) r3;
        r8.k -= r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r9, boolean r10, defpackage.batd r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x005c
        L_0x0007:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x005b
            monitor-enter(r8)
        L_0x000c:
            long r3 = r8.k     // Catch:{ InterruptedException -> 0x0052 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x002a
            java.util.Map r3 = r8.d     // Catch:{ InterruptedException -> 0x0052 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0052 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0052 }
            if (r3 == 0) goto L_0x0022
            r8.wait()     // Catch:{ InterruptedException -> 0x0052 }
            goto L_0x000c
        L_0x0022:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0052 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0052 }
            throw r9     // Catch:{ InterruptedException -> 0x0052 }
        L_0x002a:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0050 }
            int r4 = (int) r3     // Catch:{ all -> 0x0050 }
            awan r3 = r8.q     // Catch:{ all -> 0x0050 }
            int r3 = r3.c()     // Catch:{ all -> 0x0050 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0050 }
            long r4 = r8.k     // Catch:{ all -> 0x0050 }
            long r6 = (long) r3     // Catch:{ all -> 0x0050 }
            long r4 = r4 - r6
            r8.k = r4     // Catch:{ all -> 0x0050 }
            monitor-exit(r8)     // Catch:{ all -> 0x0050 }
            long r12 = r12 - r6
            awan r4 = r8.q
            if (r10 == 0) goto L_0x004b
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x004b
            r5 = 1
            goto L_0x004c
        L_0x004b:
            r5 = 0
        L_0x004c:
            r4.a(r5, r9, r11, r3)
            goto L_0x0007
        L_0x0050:
            r9 = move-exception
            goto L_0x0059
        L_0x0052:
            r9 = move-exception
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0050 }
            r9.<init>()     // Catch:{ all -> 0x0050 }
            throw r9     // Catch:{ all -> 0x0050 }
        L_0x0059:
            monitor-exit(r8)     // Catch:{ all -> 0x0050 }
            throw r9
        L_0x005b:
            return
        L_0x005c:
            awan r12 = r8.q
            r12.a(r10, r9, r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awbb.a(int, boolean, batd, long):void");
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void a(defpackage.awak r6, defpackage.awak r7) {
        /*
            r5 = this;
            r0 = 0
            awan r1 = r5.q     // Catch:{ IOException -> 0x0023 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0023 }
            monitor-enter(r5)     // Catch:{ all -> 0x0020 }
            boolean r2 = r5.h     // Catch:{ all -> 0x001d }
            if (r2 != 0) goto L_0x0019
            r2 = 1
            r5.h = r2     // Catch:{ all -> 0x001d }
            int r2 = r5.f     // Catch:{ all -> 0x001d }
            monitor-exit(r5)     // Catch:{ all -> 0x001d }
            awan r3 = r5.q     // Catch:{ all -> 0x0020 }
            byte[] r4 = defpackage.awaj.a     // Catch:{ all -> 0x0020 }
            r3.a((int) r2, (defpackage.awak) r6, (byte[]) r4)     // Catch:{ all -> 0x0020 }
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            r6 = r0
            goto L_0x0024
        L_0x0019:
            monitor-exit(r5)     // Catch:{ all -> 0x001d }
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            r6 = r0
            goto L_0x0024
        L_0x001d:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x001d }
            throw r6     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            throw r6     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            r6 = move-exception
        L_0x0024:
            monitor-enter(r5)
            java.util.Map r1 = r5.d     // Catch:{ all -> 0x0075 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0075 }
            r2 = 0
            if (r1 != 0) goto L_0x004b
            java.util.Map r0 = r5.d     // Catch:{ all -> 0x0075 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0075 }
            java.util.Map r1 = r5.d     // Catch:{ all -> 0x0075 }
            int r1 = r1.size()     // Catch:{ all -> 0x0075 }
            awbf[] r1 = new defpackage.awbf[r1]     // Catch:{ all -> 0x0075 }
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch:{ all -> 0x0075 }
            awbf[] r0 = (defpackage.awbf[]) r0     // Catch:{ all -> 0x0075 }
            java.util.Map r1 = r5.d     // Catch:{ all -> 0x0075 }
            r1.clear()     // Catch:{ all -> 0x0075 }
            a((boolean) r2)     // Catch:{ all -> 0x0075 }
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            monitor-exit(r5)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0060
            int r1 = r0.length
        L_0x0050:
            if (r2 < r1) goto L_0x0053
            goto L_0x0060
        L_0x0053:
            r3 = r0[r2]
            r3.a((defpackage.awak) r7)     // Catch:{ IOException -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r3 = move-exception
            if (r6 == 0) goto L_0x005d
            r6 = r3
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x0050
        L_0x0060:
            awan r7 = r5.q     // Catch:{ IOException -> 0x0066 }
            r7.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r7 = move-exception
            if (r6 != 0) goto L_0x006a
            r6 = r7
        L_0x006a:
            java.net.Socket r7 = r5.p     // Catch:{ IOException -> 0x0070 }
            r7.close()     // Catch:{ IOException -> 0x0070 }
            goto L_0x0071
        L_0x0070:
            r6 = move-exception
        L_0x0071:
            if (r6 != 0) goto L_0x0074
            return
        L_0x0074:
            throw r6
        L_0x0075:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0075 }
            goto L_0x0079
        L_0x0078:
            throw r6
        L_0x0079:
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awbb.a(awak, awak):void");
    }
}
