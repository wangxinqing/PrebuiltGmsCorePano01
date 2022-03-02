package defpackage;

import com.google.android.chimera.config.ModuleManager;
import java.util.Iterator;
import java.util.Random;

/* renamed from: qoh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qoh {
    private static qoh d;
    private final hol a = new hol(ihs.b(), "IPA_GCORE", (String) null);
    private final Random b = new Random();
    private int c = -1;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized defpackage.qoh a() {
        /*
            java.lang.Class<qoh> r0 = defpackage.qoh.class
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x0017 }
            qoh r1 = d     // Catch:{ all -> 0x0014 }
            if (r1 != 0) goto L_0x000f
            qoh r1 = new qoh     // Catch:{ all -> 0x0014 }
            r1.<init>()     // Catch:{ all -> 0x0014 }
            d = r1     // Catch:{ all -> 0x0014 }
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            qoh r1 = d     // Catch:{ all -> 0x0017 }
            monitor-exit(r0)
            return r1
        L_0x0014:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qoh.a():qoh");
    }

    public final void a(int i) {
        aucd o = antb.b.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((antb) o.b).a = i;
        antb antb = (antb) o.i();
        aucd o2 = anta.g.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        antb.getClass();
        ((anta) o2.b).c = antb;
        a(o2);
    }

    public final void a(ansz ansz) {
        aucd o = anta.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ansz.getClass();
        ((anta) o.b).f = ansz;
        a(o);
    }

    public final void a(antc antc) {
        aucd o = anta.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        antc.getClass();
        ((anta) o.b).d = antc;
        a(o);
    }

    public final void a(antf antf) {
        aucd o = anta.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        antf.getClass();
        ((anta) o.b).e = antf;
        a(o);
    }

    /* access modifiers changed from: package-private */
    public final void a(aucd aucd) {
        long w = axvz.a.a().w();
        if (w > 0 && this.b.nextInt((int) w) == 0) {
            if (this.c < 0) {
                try {
                    Iterator it = ModuleManager.get(ihs.b()).getAllModules().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ModuleManager.ModuleInfo moduleInfo = (ModuleManager.ModuleInfo) it.next();
                        if (moduleInfo.moduleId.equals("com.google.android.gms.ipa")) {
                            this.c = moduleInfo.moduleVersion;
                            break;
                        }
                    }
                } catch (Exception e) {
                    this.c = 0;
                    new Object[1][0] = e;
                }
            }
            int i = this.c;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anta anta = anta.g;
            ((anta) aucd.b).a = i;
            long g = jlo.g();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ((anta) aucd.b).b = g;
            this.a.a((audx) aucd.i()).b();
        }
    }
}
