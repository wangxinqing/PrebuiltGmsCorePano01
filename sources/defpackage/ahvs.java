package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;

/* renamed from: ahvs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ahvs extends ahuo {
    protected static volatile boolean a = false;
    protected static volatile AudioRecord b;
    protected static volatile Thread c = null;
    private static volatile Object d = new Object();

    public ahvs(Context context, ahsr ahsr, ahss ahss, ajrh ajrh) {
        super(ahsr, ahss, ajrh);
        amrl.a((Object) context);
        a = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            java.lang.Object r0 = d
            monitor-enter(r0)
            boolean r1 = a     // Catch:{ all -> 0x0057 }
            if (r1 != 0) goto L_0x0055
            android.media.AudioRecord r1 = b     // Catch:{ all -> 0x0057 }
            if (r1 != 0) goto L_0x0053
            int r1 = r6.d()     // Catch:{ all -> 0x0057 }
            int r1 = r1 * 2000
            int r1 = r1 / 1000
            int r2 = r6.e()     // Catch:{ all -> 0x0057 }
            int r1 = r1 * r2
            r2 = 4
            int r1 = r1 * 4
            int r3 = r6.d()     // Catch:{ all -> 0x0057 }
            r4 = 16
            int r5 = r6.f()     // Catch:{ all -> 0x0057 }
            int r3 = android.media.AudioRecord.getMinBufferSize(r3, r4, r5)     // Catch:{ all -> 0x0057 }
            r4 = -1
            if (r3 == r4) goto L_0x0051
            r4 = -2
            if (r3 == r4) goto L_0x0051
            int r1 = java.lang.Math.max(r1, r3)     // Catch:{ all -> 0x0057 }
            r3 = 1
            a = r3     // Catch:{ all -> 0x0057 }
            java.lang.Thread r3 = new java.lang.Thread     // Catch:{ all -> 0x0057 }
            ahvq r4 = new ahvq     // Catch:{ all -> 0x0057 }
            r4.<init>(r6, r1)     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = "Audio Thread"
            r3.<init>(r4, r1)     // Catch:{ all -> 0x0057 }
            c = r3     // Catch:{ all -> 0x0057 }
            java.lang.Thread r1 = c     // Catch:{ all -> 0x0057 }
            r1.setPriority(r2)     // Catch:{ all -> 0x0057 }
            java.lang.Thread r1 = c     // Catch:{ all -> 0x0057 }
            r1.start()     // Catch:{ all -> 0x0057 }
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            return
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            return
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            return
        L_0x0055:
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            return
        L_0x0057:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahvs.a():void");
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(int i, int i2, long j);

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    protected final void b() {
        /*
            r3 = this;
            java.lang.Object r0 = d
            monitor-enter(r0)
            r1 = 0
            a = r1     // Catch:{ all -> 0x001b }
            java.lang.Thread r1 = c     // Catch:{ InterruptedException -> 0x0018 }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x0018 }
            java.lang.Thread r2 = c     // Catch:{ all -> 0x0015 }
            r2.notifyAll()     // Catch:{ all -> 0x0015 }
            monitor-exit(r1)     // Catch:{ all -> 0x0015 }
            java.lang.Thread r1 = c     // Catch:{ InterruptedException -> 0x0018 }
            r1.join()     // Catch:{ InterruptedException -> 0x0018 }
            goto L_0x0019
        L_0x0015:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0015 }
            throw r2     // Catch:{ InterruptedException -> 0x0018 }
        L_0x0018:
            r1 = move-exception
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahvs.b():void");
    }

    /* access modifiers changed from: protected */
    public abstract AudioFormat c();

    /* access modifiers changed from: protected */
    public abstract int d();

    /* access modifiers changed from: protected */
    public abstract int e();

    /* access modifiers changed from: protected */
    public abstract int f();

    /* access modifiers changed from: protected */
    public abstract int g();
}
