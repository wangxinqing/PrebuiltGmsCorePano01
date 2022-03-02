package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.google.android.chimera.Service;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* renamed from: heu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class heu {
    private static heu c;
    public final Object a = new Object();
    public final ancq b = amxc.a(3, 3);
    private final Context d;
    private Service e;
    private final aoru f = jfm.b(9);
    private final ancq g = amxc.a(3, 3);
    private bpq h = null;
    private ExecutorService i = null;
    private final ArrayDeque j = new ArrayDeque();
    private int k = -1;

    public heu(Context context) {
        this.d = context.getApplicationContext();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static int a(android.content.Context r11, android.content.Intent r12, int r13) {
        /*
            java.lang.Class<heu> r0 = defpackage.heu.class
            monitor-enter(r0)
            heu r1 = c     // Catch:{ all -> 0x0162 }
            if (r1 != 0) goto L_0x000e
            heu r1 = new heu     // Catch:{ all -> 0x0162 }
            r1.<init>(r11)     // Catch:{ all -> 0x0162 }
            c = r1     // Catch:{ all -> 0x0162 }
        L_0x000e:
            boolean r1 = r11 instanceof com.google.android.gms.chimera.container.FileApkChimeraService     // Catch:{ all -> 0x0162 }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0051
            heu r1 = c     // Catch:{ all -> 0x0162 }
            com.google.android.gms.chimera.container.FileApkChimeraService r11 = (com.google.android.gms.chimera.container.FileApkChimeraService) r11     // Catch:{ all -> 0x0162 }
            java.lang.Object r4 = r1.a     // Catch:{ all -> 0x0162 }
            monitor-enter(r4)     // Catch:{ all -> 0x0162 }
            com.google.android.chimera.Service r5 = r1.e     // Catch:{ all -> 0x004e }
            if (r5 != 0) goto L_0x0021
            r6 = 1
            goto L_0x0026
        L_0x0021:
            if (r5 == r11) goto L_0x0025
            r6 = 0
            goto L_0x0026
        L_0x0025:
            r6 = 1
        L_0x0026:
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x004e }
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x004e }
            int r7 = r7.length()     // Catch:{ all -> 0x004e }
            int r7 = r7 + 55
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r8.<init>(r7)     // Catch:{ all -> 0x004e }
            java.lang.String r7 = "Expected existing service to be null or the same. Was: "
            r8.append(r7)     // Catch:{ all -> 0x004e }
            r8.append(r5)     // Catch:{ all -> 0x004e }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x004e }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x004e }
            defpackage.amtf.a((boolean) r6, (java.lang.String) r5, (java.lang.Object[]) r7)     // Catch:{ all -> 0x004e }
            r1.e = r11     // Catch:{ all -> 0x004e }
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            goto L_0x0051
        L_0x004e:
            r11 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            throw r11     // Catch:{ all -> 0x0162 }
        L_0x0051:
            heu r11 = c     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "com.google.android.gms.chimera.container.STAGE_MODULE_APKS"
            java.lang.String r4 = r12.getAction()     // Catch:{ all -> 0x0162 }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0162 }
            java.lang.String r4 = "Expected STAGE_MODULES_ACTION but was: "
            java.lang.String r5 = r12.getAction()     // Catch:{ all -> 0x0162 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0162 }
            int r6 = r5.length()     // Catch:{ all -> 0x0162 }
            if (r6 != 0) goto L_0x0073
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0162 }
            r5.<init>(r4)     // Catch:{ all -> 0x0162 }
            goto L_0x0077
        L_0x0073:
            java.lang.String r5 = r4.concat(r5)     // Catch:{ all -> 0x0162 }
        L_0x0077:
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0162 }
            defpackage.amtf.a((boolean) r1, (java.lang.String) r5, (java.lang.Object[]) r4)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "STAGE_FILE_APKS_MODULE_ID"
            java.lang.String r1 = r12.getStringExtra(r1)     // Catch:{ all -> 0x0162 }
            java.lang.String r4 = "STAGE_FILE_APKS_ASSET_NAME"
            java.lang.String r4 = r12.getStringExtra(r4)     // Catch:{ all -> 0x0162 }
            java.lang.String r5 = "STAGE_FILE_APKS_RESULT_RECEIVER"
            android.os.Parcelable r5 = r12.getParcelableExtra(r5)     // Catch:{ all -> 0x0162 }
            android.os.ResultReceiver r5 = (android.os.ResultReceiver) r5     // Catch:{ all -> 0x0162 }
            if (r1 != 0) goto L_0x0094
            r6 = 1
            goto L_0x0099
        L_0x0094:
            if (r4 == 0) goto L_0x0098
            r6 = 0
            goto L_0x0099
        L_0x0098:
            r6 = 1
        L_0x0099:
            defpackage.amtf.a((boolean) r6)     // Catch:{ all -> 0x0162 }
            boolean r6 = com.google.android.gms.chimera.container.FileApkIntentOperation.a((android.content.Intent) r12)     // Catch:{ all -> 0x0162 }
            r3 = r3 ^ r6
            java.lang.Object r6 = r11.a     // Catch:{ all -> 0x0162 }
            monitor-enter(r6)     // Catch:{ all -> 0x0162 }
            r7 = 3
            r8 = 0
            if (r1 != 0) goto L_0x00a9
            goto L_0x00e2
        L_0x00a9:
            if (r5 == 0) goto L_0x00e2
            android.content.Context r9 = r11.d     // Catch:{ InvalidConfigException -> 0x00dc }
            bkv r9 = defpackage.bkv.a((android.content.Context) r9)     // Catch:{ InvalidConfigException -> 0x00dc }
            boz r9 = r9.f()     // Catch:{ InvalidConfigException -> 0x00dc }
            bpa r9 = r9.a((java.lang.String) r1)     // Catch:{ InvalidConfigException -> 0x00dc }
            if (r9 != 0) goto L_0x00bc
            goto L_0x00dd
        L_0x00bc:
            int r9 = r1.length()     // Catch:{ InvalidConfigException -> 0x00dc }
            int r9 = r9 + 46
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ InvalidConfigException -> 0x00dc }
            r10.<init>(r9)     // Catch:{ InvalidConfigException -> 0x00dc }
            java.lang.String r9 = "Staging "
            r10.append(r9)     // Catch:{ InvalidConfigException -> 0x00dc }
            r10.append(r1)     // Catch:{ InvalidConfigException -> 0x00dc }
            java.lang.String r9 = " already complete, notifying receiver."
            r10.append(r9)     // Catch:{ InvalidConfigException -> 0x00dc }
            r10.toString()     // Catch:{ InvalidConfigException -> 0x00dc }
            r5.send(r2, r8)     // Catch:{ InvalidConfigException -> 0x00dc }
            r7 = 2
            goto L_0x0113
        L_0x00dc:
            r2 = move-exception
        L_0x00dd:
            ancq r2 = r11.g     // Catch:{ all -> 0x015f }
            r2.a((java.lang.Object) r1, (java.lang.Object) r5)     // Catch:{ all -> 0x015f }
        L_0x00e2:
            bpq r1 = r11.h     // Catch:{ all -> 0x015f }
            if (r1 != 0) goto L_0x0103
            aoru r1 = defpackage.jfm.b(9)     // Catch:{ all -> 0x015f }
            r11.i = r1     // Catch:{ all -> 0x015f }
            heq r1 = new heq     // Catch:{ all -> 0x015f }
            r1.<init>(r11)     // Catch:{ all -> 0x015f }
            java.util.concurrent.ExecutorService r2 = r11.i     // Catch:{ all -> 0x015f }
            bpq r3 = new bpq     // Catch:{ all -> 0x015f }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x015f }
            r11.h = r3     // Catch:{ all -> 0x015f }
            android.content.Context r1 = r11.d     // Catch:{ all -> 0x015f }
            java.util.concurrent.ExecutorService r2 = r11.i     // Catch:{ all -> 0x015f }
            java.lang.Runnable r8 = a(r1, r3, r2, r12)     // Catch:{ all -> 0x015f }
            goto L_0x0113
        L_0x0103:
            if (r3 == 0) goto L_0x0112
            java.util.ArrayDeque r1 = r11.j     // Catch:{ all -> 0x015f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x015f }
            android.util.Pair r12 = android.util.Pair.create(r12, r2)     // Catch:{ all -> 0x015f }
            r1.add(r12)     // Catch:{ all -> 0x015f }
        L_0x0112:
        L_0x0113:
            r12 = -1
            if (r4 == 0) goto L_0x014f
            if (r5 == 0) goto L_0x014f
            bpq r1 = r11.h     // Catch:{ all -> 0x015f }
            defpackage.amtf.a((java.lang.Object) r1)     // Catch:{ all -> 0x015f }
            ancq r2 = r11.b     // Catch:{ all -> 0x015f }
            r2.a((java.lang.Object) r4, (java.lang.Object) r5)     // Catch:{ all -> 0x015f }
            java.lang.Object r2 = r1.b     // Catch:{ all -> 0x015f }
            monitor-enter(r2)     // Catch:{ all -> 0x015f }
            java.util.ArrayList r3 = r1.d     // Catch:{ all -> 0x014c }
            int r3 = r3.indexOf(r4)     // Catch:{ all -> 0x014c }
            if (r3 != r12) goto L_0x013c
            java.util.ArrayDeque r3 = r1.c     // Catch:{ all -> 0x014c }
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x014c }
            if (r3 != 0) goto L_0x013a
            java.util.ArrayDeque r1 = r1.c     // Catch:{ all -> 0x014c }
            r1.offer(r4)     // Catch:{ all -> 0x014c }
        L_0x013a:
            monitor-exit(r2)     // Catch:{ all -> 0x014c }
            goto L_0x014f
        L_0x013c:
            int r5 = r1.e     // Catch:{ all -> 0x014c }
            if (r3 >= r5) goto L_0x014a
            java.util.concurrent.ExecutorService r3 = r1.a     // Catch:{ all -> 0x014c }
            bpo r5 = new bpo     // Catch:{ all -> 0x014c }
            r5.<init>(r1, r4)     // Catch:{ all -> 0x014c }
            r3.execute(r5)     // Catch:{ all -> 0x014c }
        L_0x014a:
            monitor-exit(r2)     // Catch:{ all -> 0x014c }
            goto L_0x014f
        L_0x014c:
            r11 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x014c }
            throw r11     // Catch:{ all -> 0x015f }
        L_0x014f:
            if (r13 == r12) goto L_0x0153
            r11.k = r13     // Catch:{ all -> 0x015f }
        L_0x0153:
            monitor-exit(r6)     // Catch:{ all -> 0x015f }
            if (r8 != 0) goto L_0x015a
            r11.c()     // Catch:{ all -> 0x0162 }
            goto L_0x015d
        L_0x015a:
            r11.a((java.lang.Runnable) r8)     // Catch:{ all -> 0x0162 }
        L_0x015d:
            monitor-exit(r0)     // Catch:{ all -> 0x0162 }
            return r7
        L_0x015f:
            r11 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x015f }
            throw r11     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0162 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.heu.a(android.content.Context, android.content.Intent, int):int");
    }

    private final void c() {
        synchronized (heu.class) {
            synchronized (this.a) {
                if (this.h == null) {
                    Service service = this.e;
                    if (service != null) {
                        service.stopSelf(this.k);
                    }
                    c = null;
                }
            }
        }
    }

    private static Runnable a(Context context, bpq bpq, ExecutorService executorService, Intent intent) {
        return new her(intent, context, bpq, executorService);
    }

    private final void a(Runnable runnable) {
        aorl.a(this.f.a(runnable), new het(this), this.f);
    }

    public final void a() {
        Runnable runnable;
        synchronized (this.a) {
            a(true);
            Pair pair = (Pair) this.j.poll();
            bpq bpq = this.h;
            ExecutorService executorService = this.i;
            amtf.a((Object) bpq);
            amtf.a((Object) executorService);
            runnable = null;
            if (pair != null) {
                runnable = a(this.d, bpq, executorService, (Intent) pair.first);
                Service service = this.e;
                if (service != null) {
                    service.stopSelf(((Integer) pair.second).intValue() - 1);
                }
            } else {
                executorService.shutdown();
                this.h = null;
                this.i = null;
            }
        }
        if (runnable == null) {
            c();
        } else {
            a(runnable);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void a(boolean r13) {
        /*
            r12 = this;
            java.lang.String r0 = " asset receivers of failure."
            java.lang.String r1 = " module ID and "
            java.lang.String r2 = "Staging complete, notified "
            r3 = 92
            r4 = -1
            r5 = 0
            android.content.Context r6 = r12.d     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            bkv r6 = defpackage.bkv.a((android.content.Context) r6)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            boz r6 = r6.f()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            ancq r8 = r12.g     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            amwq r8 = (defpackage.amwq) r8     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            int r8 = r8.b     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            r7.<init>(r8)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            ancq r8 = r12.g     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.util.Set r8 = r8.m()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
        L_0x0029:
            boolean r9 = r8.hasNext()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            if (r9 == 0) goto L_0x003f
            java.lang.Object r9 = r8.next()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            bpa r10 = r6.a((java.lang.String) r9)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            if (r10 == 0) goto L_0x0029
            r7.add(r9)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            goto L_0x0029
        L_0x003f:
            java.util.Iterator r6 = r7.iterator()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
        L_0x0043:
            boolean r7 = r6.hasNext()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            if (r7 == 0) goto L_0x009b
            java.lang.Object r7 = r6.next()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            ancq r8 = r12.g     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.util.List r8 = r8.b(r7)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            boolean r9 = r8.isEmpty()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            if (r9 != 0) goto L_0x0043
            int r9 = r8.size()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.lang.String r10 = java.lang.String.valueOf(r7)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            int r10 = r10.length()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            int r10 = r10 + 54
            r11.<init>(r10)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.lang.String r10 = "Staging "
            r11.append(r10)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            r11.append(r7)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.lang.String r7 = " completed, notifying "
            r11.append(r7)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            r11.append(r9)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.lang.String r7 = " receiver(s)."
            r11.append(r7)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            r11.toString()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            java.util.Iterator r7 = r8.iterator()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
        L_0x008a:
            boolean r8 = r7.hasNext()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            if (r8 == 0) goto L_0x0043
            java.lang.Object r8 = r7.next()     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            android.os.ResultReceiver r8 = (android.os.ResultReceiver) r8     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            r9 = 0
            r8.send(r9, r5)     // Catch:{ InvalidConfigException -> 0x0184, all -> 0x010f }
            goto L_0x008a
        L_0x009b:
            if (r13 == 0) goto L_0x01de
            ancq r13 = r12.b
            boolean r13 = r13.k()
            if (r13 == 0) goto L_0x00ad
            ancq r13 = r12.g
            boolean r13 = r13.k()
            if (r13 != 0) goto L_0x01de
        L_0x00ad:
            ancq r13 = r12.g
            java.util.Collection r13 = r13.n()
            java.util.Iterator r13 = r13.iterator()
        L_0x00b7:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x00c7
            java.lang.Object r6 = r13.next()
            android.os.ResultReceiver r6 = (android.os.ResultReceiver) r6
            r6.send(r4, r5)
            goto L_0x00b7
        L_0x00c7:
            ancq r13 = r12.b
            java.util.Collection r13 = r13.n()
            java.util.Iterator r13 = r13.iterator()
        L_0x00d1:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x00e1
            java.lang.Object r6 = r13.next()
            android.os.ResultReceiver r6 = (android.os.ResultReceiver) r6
            r6.send(r4, r5)
            goto L_0x00d1
        L_0x00e1:
            ancq r13 = r12.g
            amwq r13 = (defpackage.amwq) r13
            int r13 = r13.b
            ancq r4 = r12.b
            amwq r4 = (defpackage.amwq) r4
            int r4 = r4.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
        L_0x00f2:
            r5.append(r2)
            r5.append(r13)
            r5.append(r1)
            r5.append(r4)
            r5.append(r0)
            r5.toString()
            ancq r13 = r12.g
            r13.d()
            ancq r13 = r12.b
            r13.d()
            return
        L_0x010f:
            r6 = move-exception
            if (r13 == 0) goto L_0x0183
            ancq r13 = r12.b
            boolean r13 = r13.k()
            if (r13 == 0) goto L_0x0122
            ancq r13 = r12.g
            boolean r13 = r13.k()
            if (r13 != 0) goto L_0x0183
        L_0x0122:
            ancq r13 = r12.g
            java.util.Collection r13 = r13.n()
            java.util.Iterator r13 = r13.iterator()
        L_0x012c:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x013c
            java.lang.Object r7 = r13.next()
            android.os.ResultReceiver r7 = (android.os.ResultReceiver) r7
            r7.send(r4, r5)
            goto L_0x012c
        L_0x013c:
            ancq r13 = r12.b
            java.util.Collection r13 = r13.n()
            java.util.Iterator r13 = r13.iterator()
        L_0x0146:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x0156
            java.lang.Object r7 = r13.next()
            android.os.ResultReceiver r7 = (android.os.ResultReceiver) r7
            r7.send(r4, r5)
            goto L_0x0146
        L_0x0156:
            ancq r13 = r12.g
            amwq r13 = (defpackage.amwq) r13
            int r13 = r13.b
            ancq r4 = r12.b
            amwq r4 = (defpackage.amwq) r4
            int r4 = r4.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r2)
            r5.append(r13)
            r5.append(r1)
            r5.append(r4)
            r5.append(r0)
            r5.toString()
            ancq r13 = r12.g
            r13.d()
            ancq r13 = r12.b
            r13.d()
        L_0x0183:
            throw r6
        L_0x0184:
            r6 = move-exception
            if (r13 == 0) goto L_0x01de
            ancq r13 = r12.b
            boolean r13 = r13.k()
            if (r13 == 0) goto L_0x0197
            ancq r13 = r12.g
            boolean r13 = r13.k()
            if (r13 != 0) goto L_0x01de
        L_0x0197:
            ancq r13 = r12.g
            java.util.Collection r13 = r13.n()
            java.util.Iterator r13 = r13.iterator()
        L_0x01a1:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x01b1
            java.lang.Object r6 = r13.next()
            android.os.ResultReceiver r6 = (android.os.ResultReceiver) r6
            r6.send(r4, r5)
            goto L_0x01a1
        L_0x01b1:
            ancq r13 = r12.b
            java.util.Collection r13 = r13.n()
            java.util.Iterator r13 = r13.iterator()
        L_0x01bb:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x01cb
            java.lang.Object r6 = r13.next()
            android.os.ResultReceiver r6 = (android.os.ResultReceiver) r6
            r6.send(r4, r5)
            goto L_0x01bb
        L_0x01cb:
            ancq r13 = r12.g
            amwq r13 = (defpackage.amwq) r13
            int r13 = r13.b
            ancq r4 = r12.b
            amwq r4 = (defpackage.amwq) r4
            int r4 = r4.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            goto L_0x00f2
        L_0x01de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.heu.a(boolean):void");
    }
}
