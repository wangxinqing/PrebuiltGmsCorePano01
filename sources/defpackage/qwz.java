package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Messenger;
import android.util.Log;
import com.google.android.chimera.Service;
import java.util.HashMap;
import java.util.Map;

/* renamed from: qwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qwz extends ContextWrapper {
    public final Object a = new Object();
    public int b;
    public final Object c = new Object();
    public aoru d;
    public Messenger e;
    public ComponentName f;
    public qwq g;
    public qvs h;
    public final amsv i = amta.a(qwr.a);
    public final Map j = new HashMap();
    public final Map k = new HashMap();
    public final amsv l = amta.a(qws.a);
    public final qxa m;

    public qwz(qxa qxa) {
        super((Context) qxa);
        this.m = qxa;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            aoru r1 = r4.d     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0055
            boolean r2 = r1.isShutdown()     // Catch:{ all -> 0x0057 }
            if (r2 != 0) goto L_0x0055
            axbn r2 = defpackage.axbn.a     // Catch:{ all -> 0x0057 }
            axbx r2 = r2.a()     // Catch:{ all -> 0x0057 }
            boolean r2 = r2.i()     // Catch:{ all -> 0x0057 }
            if (r2 != 0) goto L_0x0040
            java.util.List r1 = r1.shutdownNow()     // Catch:{ all -> 0x0057 }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x0057 }
            if (r2 != 0) goto L_0x0050
            int r1 = r1.size()     // Catch:{ all -> 0x0057 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0057 }
            r3 = 79
            r2.<init>(r3)     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = "Shutting down, but not all tasks are finished executing. Remaining: "
            r2.append(r3)     // Catch:{ all -> 0x0057 }
            r2.append(r1)     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = "GmsTaskChimeraService"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0057 }
            android.util.Log.e(r1, r2)     // Catch:{ all -> 0x0057 }
            goto L_0x0050
        L_0x0040:
            r1.shutdown()     // Catch:{ all -> 0x0057 }
            boolean r1 = r1.isTerminated()     // Catch:{ all -> 0x0057 }
            if (r1 != 0) goto L_0x0050
            java.lang.String r1 = "GmsTaskChimeraService"
            java.lang.String r2 = "Shutting down, but not all tasks are finished executing."
            android.util.Log.e(r1, r2)     // Catch:{ all -> 0x0057 }
        L_0x0050:
            r1 = 0
            r4.d = r1     // Catch:{ all -> 0x0057 }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwz.a():void");
    }

    public final void b() {
        this.m.aH();
    }

    /* access modifiers changed from: package-private */
    public final Object c() {
        qxa qxa = this.m;
        return qxa instanceof qwf ? ((Service) qxa).getContainerService() : qxa;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        qxa qxa = this.m;
        if (qxa instanceof qwf) {
            ((Service) qxa).stopSelf(i2);
        }
    }

    public final void a(int i2) {
        synchronized (this.a) {
            this.b = i2;
            if (!this.g.c(this.f.getClassName())) {
                b(this.b);
            }
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
    public final void a(defpackage.qwy r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            monitor-enter(r0)
            aoru r1 = r8.d     // Catch:{ all -> 0x00cf }
            if (r1 != 0) goto L_0x0010
            r1 = 2
            r2 = 10
            aoru r1 = defpackage.jfb.a(r1, r2)     // Catch:{ all -> 0x00cf }
            r8.d = r1     // Catch:{ all -> 0x00cf }
        L_0x0010:
            aoru r1 = r8.d     // Catch:{ all -> 0x00cf }
            java.util.Map r2 = r8.k     // Catch:{ RejectedExecutionException -> 0x00c1 }
            monitor-enter(r2)     // Catch:{ RejectedExecutionException -> 0x00c1 }
            java.util.Map r3 = r8.k     // Catch:{ all -> 0x00be }
            java.lang.String r4 = r9.a     // Catch:{ all -> 0x00be }
            boolean r3 = r3.containsKey(r4)     // Catch:{ all -> 0x00be }
            if (r3 != 0) goto L_0x00b6
            qxz r3 = new qxz     // Catch:{ all -> 0x00be }
            java.lang.String r4 = r9.a     // Catch:{ all -> 0x00be }
            android.os.Bundle r5 = r9.b     // Catch:{ all -> 0x00be }
            java.util.List r6 = r9.c     // Catch:{ all -> 0x00be }
            r3.<init>(r4, r5, r6)     // Catch:{ all -> 0x00be }
            qye r4 = new qye     // Catch:{ all -> 0x00be }
            java.lang.String r5 = "nts:client:onRunTask:"
            java.lang.String r6 = r9.a     // Catch:{ all -> 0x00be }
            int r7 = r6.length()     // Catch:{ all -> 0x00be }
            if (r7 != 0) goto L_0x003c
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x00be }
            r6.<init>(r5)     // Catch:{ all -> 0x00be }
            goto L_0x0040
        L_0x003c:
            java.lang.String r6 = r5.concat(r6)     // Catch:{ all -> 0x00be }
        L_0x0040:
            r4.<init>(r6)     // Catch:{ all -> 0x00be }
            qwz r5 = r9.d     // Catch:{ all -> 0x00ac }
            qvs r5 = r5.h     // Catch:{ all -> 0x00ac }
            java.lang.String r6 = "onRunTaskAsync"
            qvx r7 = defpackage.qvx.a     // Catch:{ all -> 0x00ac }
            amky r5 = r5.a((java.lang.String) r6, (defpackage.qvx) r7)     // Catch:{ all -> 0x00ac }
            axbn r6 = defpackage.axbn.a     // Catch:{ all -> 0x00a0 }
            axbx r6 = r6.a()     // Catch:{ all -> 0x00a0 }
            boolean r6 = r6.u()     // Catch:{ all -> 0x00a0 }
            if (r6 == 0) goto L_0x0062
            java.lang.String r6 = "ScheduledTaskImpl"
            amkr r6 = defpackage.amlv.a((java.lang.String) r6)     // Catch:{ all -> 0x00a0 }
            goto L_0x0063
        L_0x0062:
            r6 = 0
        L_0x0063:
            qww r7 = new qww     // Catch:{ all -> 0x0094 }
            r7.<init>(r9, r3)     // Catch:{ all -> 0x0094 }
            aorr r1 = defpackage.aorl.a((defpackage.aoqa) r7, (java.util.concurrent.Executor) r1)     // Catch:{ all -> 0x0094 }
            if (r6 == 0) goto L_0x0071
            r6.a(r1)     // Catch:{ all -> 0x0094 }
        L_0x0071:
            if (r6 == 0) goto L_0x0076
            r6.close()     // Catch:{ all -> 0x00a0 }
        L_0x0076:
            if (r5 == 0) goto L_0x007b
            r5.close()     // Catch:{ all -> 0x00ac }
        L_0x007b:
            r4.close()     // Catch:{ all -> 0x00be }
            qwx r3 = new qwx     // Catch:{ all -> 0x00be }
            r3.<init>(r9, r1)     // Catch:{ all -> 0x00be }
            aoqm r4 = defpackage.aoqm.a     // Catch:{ all -> 0x00be }
            r1.a(r3, r4)     // Catch:{ all -> 0x00be }
            defpackage.jfi.a(r1)     // Catch:{ all -> 0x00be }
            java.util.Map r3 = r8.k     // Catch:{ all -> 0x00be }
            java.lang.String r4 = r9.a     // Catch:{ all -> 0x00be }
            r3.put(r4, r1)     // Catch:{ all -> 0x00be }
            monitor-exit(r2)     // Catch:{ all -> 0x00be }
            goto L_0x00cd
        L_0x0094:
            r1 = move-exception
            if (r6 == 0) goto L_0x009f
            r6.close()     // Catch:{ all -> 0x009b }
            goto L_0x009f
        L_0x009b:
            r3 = move-exception
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r3)     // Catch:{ all -> 0x00a0 }
        L_0x009f:
            throw r1     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r1 = move-exception
            if (r5 == 0) goto L_0x00ab
            r5.close()     // Catch:{ all -> 0x00a7 }
            goto L_0x00ab
        L_0x00a7:
            r3 = move-exception
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r3)     // Catch:{ all -> 0x00ac }
        L_0x00ab:
            throw r1     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00b1 }
            goto L_0x00b5
        L_0x00b1:
            r3 = move-exception
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r3)     // Catch:{ all -> 0x00be }
        L_0x00b5:
            throw r1     // Catch:{ all -> 0x00be }
        L_0x00b6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00be }
            java.lang.String r3 = "More than one task with the same tag are running"
            r1.<init>(r3)     // Catch:{ all -> 0x00be }
            throw r1     // Catch:{ all -> 0x00be }
        L_0x00be:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00be }
            throw r1     // Catch:{ RejectedExecutionException -> 0x00c1 }
        L_0x00c1:
            r1 = move-exception
            java.lang.String r2 = "GmsTaskChimeraService"
            java.lang.String r3 = "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay."
            android.util.Log.w(r2, r3, r1)     // Catch:{ all -> 0x00cf }
            r1 = 1
            r9.a((int) r1)     // Catch:{ all -> 0x00cf }
        L_0x00cd:
            monitor-exit(r0)     // Catch:{ all -> 0x00cf }
            return
        L_0x00cf:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00cf }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwz.a(qwy):void");
    }

    public final boolean a(String str) {
        boolean z;
        synchronized (this.a) {
            z = !this.g.b(str, this.f.getClassName());
            if (z) {
                String packageName = getPackageName();
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 44 + str.length());
                sb.append(packageName);
                sb.append(" ");
                sb.append(str);
                sb.append(": Task already running, won't start another");
                Log.w("GmsTaskChimeraService", sb.toString());
            }
        }
        return z;
    }
}
