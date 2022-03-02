package defpackage;

import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.leveldb.WriteBatch;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

/* renamed from: afcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afcu extends afcq implements afcs {
    public final Object g = new Object();
    public final WriteBatch h = WriteBatch.create();
    public final Comparator i = aooo.b;
    public final NavigableSet j = new TreeSet(this.i);
    public volatile boolean k;
    final /* synthetic */ afcv l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afcu(afcv afcv) {
        super(afcv);
        this.l = afcv;
        afcv.a.writeLock().lock();
    }

    public final void b() {
        amrl.b(!this.a, (Object) "Transaction is closed");
        amrl.b(!this.k, (Object) "Transaction is successful already");
        this.k = true;
    }

    public final void close() {
        boolean z;
        amrl.b(!this.a, (Object) "Transaction is closed");
        try {
            if (this.k) {
                this.l.c.e().write(this.h);
            }
            try {
                this.h.close();
                try {
                    if (!this.k) {
                        b(this.c);
                    } else {
                        a(this.b);
                    }
                    if (!z) {
                        b(this.e);
                    }
                } finally {
                    this.a = true;
                    this.l.a.writeLock().unlock();
                    if (this.k) {
                        a(this.d);
                    } else {
                        b(this.e);
                    }
                }
            } catch (Throwable th) {
                this.a = true;
                this.l.a.writeLock().unlock();
                if (this.k) {
                    a(this.d);
                } else {
                    b(this.e);
                }
                throw th;
            }
        } catch (LevelDbException e) {
            if (!this.l.d.f()) {
                this.l.c.a((Exception) e);
            } else if (afcj.a((Throwable) e)) {
                this.l.f.a();
            }
            throw e;
        } catch (Throwable th2) {
            this.h.close();
            throw th2;
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    final void b(java.util.Set r6) {
        /*
            r5 = this;
            monitor-enter(r6)
            java.util.Iterator r0 = r6.iterator()     // Catch:{ all -> 0x0041 }
        L_0x0005:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x003f
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0041 }
            afbw r1 = (defpackage.afbw) r1     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = r1.a     // Catch:{ RuntimeException -> 0x001c }
            monitor-enter(r2)     // Catch:{ RuntimeException -> 0x001c }
            r1.a()     // Catch:{ all -> 0x0019 }
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            goto L_0x0005
        L_0x0019:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            throw r1     // Catch:{ RuntimeException -> 0x001c }
        L_0x001c:
            r1 = move-exception
            afcv r2 = r5.l     // Catch:{ all -> 0x0041 }
            awdn r2 = r2.b     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = r2.a()     // Catch:{ all -> 0x0041 }
            pia r2 = (defpackage.pia) r2     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = "Close listeners failed"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0041 }
            r2.e(r3, r4)     // Catch:{ all -> 0x0041 }
            afcv r2 = r5.l     // Catch:{ all -> 0x0041 }
            awdn r2 = r2.e     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = r2.a()     // Catch:{ all -> 0x0041 }
            pdg r2 = (defpackage.pdg) r2     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = "MDH LevelDb close listeners failed"
            r2.a(r3, r1)     // Catch:{ all -> 0x0041 }
            goto L_0x0005
        L_0x003f:
            monitor-exit(r6)     // Catch:{ all -> 0x0041 }
            return
        L_0x0041:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0041 }
            goto L_0x0045
        L_0x0044:
            throw r0
        L_0x0045:
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afcu.b(java.util.Set):void");
    }
}
