package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;

/* renamed from: hhi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hhi {
    private static volatile hhi e = null;
    public final Context a;
    public final Object b = new Object();
    public hhh c = null;
    private final File d;

    public hhi(Context context) {
        Context d2 = aekv.d(context.getApplicationContext());
        this.a = d2;
        this.d = bkq.a(d2);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized defpackage.hhi a(android.content.Context r2) {
        /*
            java.lang.Class<hhi> r0 = defpackage.hhi.class
            monitor-enter(r0)
            hhi r1 = e     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x001a
            monitor-enter(r0)     // Catch:{ all -> 0x001c }
            hhi r1 = e     // Catch:{ all -> 0x0017 }
            if (r1 != 0) goto L_0x0014
            hhi r1 = new hhi     // Catch:{ all -> 0x0017 }
            r1.<init>(r2)     // Catch:{ all -> 0x0017 }
            e = r1     // Catch:{ all -> 0x0017 }
            goto L_0x0015
        L_0x0014:
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            goto L_0x001a
        L_0x0017:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r2     // Catch:{ all -> 0x001c }
        L_0x001a:
            monitor-exit(r0)
            return r1
        L_0x001c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhi.a(android.content.Context):hhi");
    }

    public final hhg a() {
        byte[] a2 = bkq.a(new File(this.d, "next_container.pb"));
        if (a2 == null) {
            return null;
        }
        try {
            aucd o = hhg.e.o();
            o.b(a2, aubs.b());
            return (hhg) o.i();
        } catch (auda e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Failed to read config file: ");
            sb.append(valueOf);
            Log.e("SyncUpdateMgr", sb.toString());
            return null;
        }
    }

    public final boolean a(hhg hhg) {
        return bkq.a(hhg.k(), new File(this.d, "pending_next_container.pb"), new File(this.d, "next_container.pb"), false) > 0;
    }
}
