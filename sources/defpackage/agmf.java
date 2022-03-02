package defpackage;

import android.app.Application;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: agmf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agmf extends agmb implements agkv {
    public static final anhq a = anhq.a("agmf");
    public final Application b;
    public final bapu c;
    public final aghh d;
    public final agks e;
    private agma f;
    private final agnf g;

    public agmf(agkt agkt, Application application, bapu bapu, amri amri) {
        new AtomicReference(aglv.a);
        new ConcurrentHashMap();
        this.g = new agnf(((aghh) amri.b()).b());
        this.e = agkt.a((Executor) aoqm.a, this.g);
        this.b = application;
        this.c = bapu;
        this.d = (aghh) amri.b();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ defpackage.aorr a(defpackage.barb r17, java.lang.String r18, int r19, boolean r20, java.lang.String r21) {
        /*
            r16 = this;
            r1 = r16
            r2 = r18
            r3 = r20
            aghh r0 = r1.d
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0017
            java.lang.System.gc()
            java.lang.System.runFinalization()
            java.lang.System.gc()
        L_0x0017:
            if (r17 != 0) goto L_0x004c
            aghh r0 = r1.d
            amri r0 = r0.d()
            java.lang.Object r0 = r0.c()
            ages r0 = (defpackage.ages) r0
            if (r0 == 0) goto L_0x004c
            barb r0 = r0.a()     // Catch:{ RuntimeException -> 0x002c }
            goto L_0x004e
        L_0x002c:
            r0 = move-exception
            r4 = r0
            anhq r0 = a
            anie r0 = r0.b()
            anhn r0 = (defpackage.anhn) r0
            r0.a((java.lang.Throwable) r4)
            r4 = 315(0x13b, float:4.41E-43)
            java.lang.String r5 = "agmf"
            java.lang.String r6 = "a"
            java.lang.String r7 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r6, (int) r4, (java.lang.String) r7)
            anhn r0 = (defpackage.anhn) r0
            java.lang.String r4 = "Metric extension provider failed."
            r0.a((java.lang.String) r4)
        L_0x004c:
            r0 = r17
        L_0x004e:
            aghh r4 = r1.d
            boolean r4 = r4.c()
            r5 = 0
            if (r4 != 0) goto L_0x008f
            basu r4 = defpackage.basu.s
            aucd r4 = r4.o()
            android.app.Application r6 = r1.b
            aghh r7 = r1.d
            r14 = r19
            r15 = r21
            barg r6 = defpackage.agjp.a(r14, r6, r15, r7)
            boolean r7 = r4.c
            if (r7 != 0) goto L_0x006e
            goto L_0x0073
        L_0x006e:
            r4.c()
            r4.c = r5
        L_0x0073:
            aucj r5 = r4.b
            basu r5 = (defpackage.basu) r5
            r6.getClass()
            r5.b = r6
            int r6 = r5.a
            r6 = r6 | 1
            r5.a = r6
            aucj r4 = r4.i()
            basu r4 = (defpackage.basu) r4
            agks r5 = r1.e
            r5.a(r2, r3, r4, r0)
            goto L_0x0103
        L_0x008f:
            r14 = r19
            r15 = r21
            android.app.Application r4 = r1.b
            android.app.ActivityManager r4 = defpackage.agjs.a(r4)
            java.util.List r4 = r4.getRunningAppProcesses()
            if (r4 == 0) goto L_0x0103
            android.app.Application r6 = r1.b
            java.lang.String r6 = r6.getPackageName()
            java.util.Iterator r4 = r4.iterator()
        L_0x00a9:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0103
            java.lang.Object r7 = r4.next()
            android.app.ActivityManager$RunningAppProcessInfo r7 = (android.app.ActivityManager.RunningAppProcessInfo) r7
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 22
            if (r8 > r9) goto L_0x00c3
            java.lang.String r8 = r7.processName
            boolean r8 = r8.contains(r6)
            if (r8 == 0) goto L_0x00a9
        L_0x00c3:
            basu r8 = defpackage.basu.s
            aucd r13 = r8.o()
            int r9 = r7.pid
            java.lang.String r10 = r7.processName
            android.app.Application r11 = r1.b
            aghh r7 = r1.d
            r8 = r19
            r12 = r21
            r5 = r13
            r13 = r7
            barg r7 = defpackage.agjp.a(r8, r9, r10, r11, r12, r13)
            boolean r8 = r5.c
            if (r8 != 0) goto L_0x00e1
            r8 = 0
            goto L_0x00e7
        L_0x00e1:
            r5.c()
            r8 = 0
            r5.c = r8
        L_0x00e7:
            aucj r9 = r5.b
            basu r9 = (defpackage.basu) r9
            r7.getClass()
            r9.b = r7
            int r7 = r9.a
            r7 = r7 | 1
            r9.a = r7
            aucj r5 = r5.i()
            basu r5 = (defpackage.basu) r5
            agks r7 = r1.e
            r7.a(r2, r3, r5, r0)
            r5 = 0
            goto L_0x00a9
        L_0x0103:
            r0 = 0
            aorr r0 = defpackage.aorl.a((java.lang.Object) r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agmf.a(barb, java.lang.String, int, boolean, java.lang.String):aorr");
    }

    public final void a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r5 = this;
            monitor-enter(r5)
            agma r0 = r5.f     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x004c
            agmc r0 = new agmc     // Catch:{ all -> 0x004e }
            r0.<init>(r5)     // Catch:{ all -> 0x004e }
            agma r1 = new agma     // Catch:{ all -> 0x004e }
            android.app.Application r2 = r5.b     // Catch:{ all -> 0x004e }
            agmd r3 = new agmd     // Catch:{ all -> 0x004e }
            r3.<init>(r5)     // Catch:{ all -> 0x004e }
            r1.<init>(r0, r2, r3)     // Catch:{ all -> 0x004e }
            r5.f = r1     // Catch:{ all -> 0x004e }
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.b     // Catch:{ all -> 0x004e }
            r2 = 1
            boolean r0 = r0.getAndSet(r2)     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x003e
            anhq r0 = defpackage.agma.a     // Catch:{ all -> 0x004e }
            anie r0 = r0.c()     // Catch:{ all -> 0x004e }
            anhn r0 = (defpackage.anhn) r0     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "agma"
            java.lang.String r2 = "a"
            r3 = 112(0x70, float:1.57E-43)
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r0.a((java.lang.String) r1, (java.lang.String) r2, (int) r3, (java.lang.String) r4)     // Catch:{ all -> 0x004e }
            anhn r0 = (defpackage.anhn) r0     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "Memory Monitor has already started. This MemoryMetricMonitor.start() is ignored."
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x004e }
            monitor-exit(r5)
            return
        L_0x003e:
            agcz r0 = r1.f     // Catch:{ all -> 0x004e }
            agcv r2 = r1.g     // Catch:{ all -> 0x004e }
            r0.a((defpackage.agcy) r2)     // Catch:{ all -> 0x004e }
            agcz r0 = r1.f     // Catch:{ all -> 0x004e }
            agcw r1 = r1.h     // Catch:{ all -> 0x004e }
            r0.a((defpackage.agcy) r1)     // Catch:{ all -> 0x004e }
        L_0x004c:
            monitor-exit(r5)
            return
        L_0x004e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agmf.b():void");
    }

    public final synchronized void c() {
        agma agma = this.f;
        if (agma != null) {
            agma.f.b(agma.g);
            agma.f.b(agma.h);
            this.f = null;
        }
    }

    public final aorr a(String str) {
        return a(str, true, 1, (String) null);
    }

    /* access modifiers changed from: package-private */
    public final aorr a(String str, boolean z, int i, String str2) {
        if (this.g.b()) {
            return aorl.a((Object) null);
        }
        return aorl.a((aoqa) new agme(this, str, i, z, str2), (Executor) this.c.a());
    }
}
