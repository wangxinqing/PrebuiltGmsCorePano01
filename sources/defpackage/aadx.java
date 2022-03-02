package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* renamed from: aadx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aadx {
    static final int a = ((int) TimeUnit.SECONDS.toMillis(10));
    static final int b = ((int) TimeUnit.HOURS.toSeconds(1));
    public final Uri c;
    public final aadq d;
    private final aoru e;
    private final TreeSet f = new TreeSet();
    private Long g;
    private int h;
    private amzy i;
    private final aadr j;

    public aadx(Uri uri, aadq aadq, aadr aadr, aoru aoru) {
        this.c = uri;
        this.d = aadq;
        this.j = aadr;
        this.e = aoru;
        this.g = Long.valueOf(SystemClock.elapsedRealtime());
    }

    private final synchronized long a(long j2) {
        int d2 = d();
        if (d2 == 0) {
            return j2 + TimeUnit.SECONDS.toMillis((long) ((int) axlx.a.a().g()));
        }
        amzy c2 = c();
        return j2 + TimeUnit.SECONDS.toMillis((long) ((Integer) c2.get(Math.min(d2 - 1, c2.size() - 1))).intValue());
    }

    private final synchronized int d() {
        int i2;
        Iterator it = this.f.iterator();
        i2 = 0;
        while (it.hasNext() && !((aado) it.next()).b) {
            i2++;
        }
        return i2;
    }

    public final synchronized void b() {
        Long valueOf = Long.valueOf(a(SystemClock.elapsedRealtime()));
        this.g = valueOf;
        this.j.a(valueOf.longValue());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r1 != r6.h) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.amzy c() {
        /*
            r6 = this;
            monitor-enter(r6)
            axlx r0 = defpackage.axlx.a     // Catch:{ all -> 0x0088 }
            axly r0 = r0.a()     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = r0.c()     // Catch:{ all -> 0x0088 }
            int r1 = r0.hashCode()     // Catch:{ all -> 0x0088 }
            amzy r2 = r6.i     // Catch:{ all -> 0x0088 }
            if (r2 != 0) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            int r2 = r6.h     // Catch:{ all -> 0x0088 }
            if (r1 == r2) goto L_0x0081
        L_0x0018:
            amzt r2 = defpackage.amzy.j()     // Catch:{ all -> 0x0088 }
            r3 = 44
            amsk r3 = defpackage.amsk.a((char) r3)     // Catch:{ all -> 0x0088 }
            amsk r3 = r3.b()     // Catch:{ all -> 0x0088 }
            java.lang.Iterable r0 = r3.a((java.lang.CharSequence) r0)     // Catch:{ all -> 0x0088 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0088 }
        L_0x002e:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0088 }
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0088 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x0042 }
            r2.c(r4)     // Catch:{ NumberFormatException -> 0x0042 }
            goto L_0x002e
        L_0x0042:
            r4 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0088 }
            java.lang.String r4 = "Invalid integer value in flag reachabilityFailedRetryIntervalsSeconds: "
            int r5 = r3.length()     // Catch:{ all -> 0x0088 }
            if (r5 != 0) goto L_0x0055
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0088 }
            r3.<init>(r4)     // Catch:{ all -> 0x0088 }
            goto L_0x0059
        L_0x0055:
            java.lang.String r3 = r4.concat(r3)     // Catch:{ all -> 0x0088 }
        L_0x0059:
            java.lang.String r4 = "UriObserver"
            android.util.Log.e(r4, r3)     // Catch:{ all -> 0x0088 }
            goto L_0x002e
        L_0x005f:
            amzy r0 = r2.a()     // Catch:{ all -> 0x0088 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0079
            java.lang.String r0 = "UriObserver"
            java.lang.String r3 = "Invalid flag reachabilityFailedRetryIntervalsSeconds"
            android.util.Log.e(r0, r3)     // Catch:{ all -> 0x0088 }
            int r0 = b     // Catch:{ all -> 0x0088 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0088 }
            r2.c(r0)     // Catch:{ all -> 0x0088 }
        L_0x0079:
            amzy r0 = r2.a()     // Catch:{ all -> 0x0088 }
            r6.i = r0     // Catch:{ all -> 0x0088 }
            r6.h = r1     // Catch:{ all -> 0x0088 }
        L_0x0081:
            amzy r0 = r6.i     // Catch:{ all -> 0x0088 }
            defpackage.iva.a((java.lang.Object) r0)     // Catch:{ all -> 0x0088 }
            monitor-exit(r6)
            return r0
        L_0x0088:
            r0 = move-exception
            monitor-exit(r6)
            goto L_0x008c
        L_0x008b:
            throw r0
        L_0x008c:
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aadx.c():amzy");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = defpackage.axlx.b()     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003e
            java.lang.Long r0 = r5.g     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003e
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0040 }
            long r3 = r0.longValue()     // Catch:{ all -> 0x0040 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0031
            r0 = 0
            r5.g = r0     // Catch:{ all -> 0x0040 }
            aoru r0 = r5.e     // Catch:{ all -> 0x0040 }
            aadv r1 = new aadv     // Catch:{ all -> 0x0040 }
            r1.<init>(r5)     // Catch:{ all -> 0x0040 }
            aorr r0 = r0.b(r1)     // Catch:{ all -> 0x0040 }
            aadw r1 = new aadw     // Catch:{ all -> 0x0040 }
            r1.<init>(r5)     // Catch:{ all -> 0x0040 }
            aoru r2 = r5.e     // Catch:{ all -> 0x0040 }
            defpackage.aorl.a(r0, r1, r2)     // Catch:{ all -> 0x0040 }
            monitor-exit(r5)
            return
        L_0x0031:
            java.lang.Long r0 = r5.g     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003e
            aadr r1 = r5.j     // Catch:{ all -> 0x0040 }
            long r2 = r0.longValue()     // Catch:{ all -> 0x0040 }
            r1.a(r2)     // Catch:{ all -> 0x0040 }
        L_0x003e:
            monitor-exit(r5)
            return
        L_0x0040:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aadx.a():void");
    }

    public final synchronized void a(aado aado) {
        boolean z;
        this.f.add(aado);
        while (this.f.size() > 128) {
            this.f.pollLast();
        }
        aadr aadr = this.j;
        if (d() >= ((int) axlx.a.a().d())) {
            z = true;
        } else {
            z = false;
        }
        aadr.b.a(aadr.a, !z);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void a(java.io.PrintWriter r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = defpackage.axlx.b()     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0075
            android.net.Uri r0 = r8.c     // Catch:{ all -> 0x007a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x007a }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x007a }
            int r1 = r1.length()     // Catch:{ all -> 0x007a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
            int r1 = r1 + 18
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            java.lang.String r1 = "Check history for "
            r2.append(r1)     // Catch:{ all -> 0x007a }
            r2.append(r0)     // Catch:{ all -> 0x007a }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x007a }
            r9.println(r0)     // Catch:{ all -> 0x007a }
            monitor-enter(r8)     // Catch:{ all -> 0x007a }
            java.util.TreeSet r0 = r8.f     // Catch:{ all -> 0x0077 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0077 }
        L_0x0032:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0077 }
            if (r1 == 0) goto L_0x0074
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0077 }
            aado r1 = (defpackage.aado) r1     // Catch:{ all -> 0x0077 }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x0077 }
            java.lang.String r3 = "%s (%d): %sreachable (took %d ms)"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0077 }
            long r5 = r1.a     // Catch:{ all -> 0x0077 }
            r7 = 0
            java.lang.String r5 = defpackage.aadt.b(r5)     // Catch:{ all -> 0x0077 }
            r4[r7] = r5     // Catch:{ all -> 0x0077 }
            r5 = 1
            long r6 = r1.a     // Catch:{ all -> 0x0077 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0077 }
            r4[r5] = r6     // Catch:{ all -> 0x0077 }
            boolean r5 = r1.b     // Catch:{ all -> 0x0077 }
            if (r5 != 0) goto L_0x005e
            java.lang.String r5 = "un"
            goto L_0x0060
        L_0x005e:
            java.lang.String r5 = ""
        L_0x0060:
            r6 = 2
            r4[r6] = r5     // Catch:{ all -> 0x0077 }
            r5 = 3
            long r6 = r1.c     // Catch:{ all -> 0x0077 }
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0077 }
            r4[r5] = r1     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = java.lang.String.format(r2, r3, r4)     // Catch:{ all -> 0x0077 }
            r9.println(r1)     // Catch:{ all -> 0x0077 }
            goto L_0x0032
        L_0x0074:
            monitor-exit(r8)     // Catch:{ all -> 0x0077 }
        L_0x0075:
            monitor-exit(r8)
            return
        L_0x0077:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0077 }
            throw r9     // Catch:{ all -> 0x007a }
        L_0x007a:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x007e
        L_0x007d:
            throw r9
        L_0x007e:
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aadx.a(java.io.PrintWriter):void");
    }
}
