package defpackage;

import android.content.Context;
import android.location.Location;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ajkv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajkv {
    public final ajmn a;
    public final ajmo b;
    public final ajmm c;
    private final Context d;
    private final ajin e;
    private final ajnn f;
    private ScheduledExecutorService g;

    public ajkv(Context context, ajmn ajmn, ajmo ajmo, ajin ajin, ajmm ajmm) {
        ajnn ajnn = new ajnn(context);
        this.d = context;
        this.a = ajmn;
        this.b = ajmo;
        this.e = ajin;
        this.c = ajmm;
        this.f = ajnn;
        ajnw.a(context);
    }

    private final ajnc a(boolean z, boolean z2, boolean z3) {
        if (z) {
            return ajku.First;
        }
        ajnc ajnc = !z2 ? ajku.Stationary : ajku.Moving;
        ajmn ajmn = this.a;
        if (!ajmn.h && (ajmn.i || ajmn.j)) {
            return ajku.Stationary;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b.c());
        if (this.a.f() != null && this.a.f().a().a() == 0 && ajnn.a(ajnn.a(this.f.b))) {
            arrayList.add(ajku.ChargingInVehicle);
        }
        if (z3) {
            arrayList.add(ajku.WifiTriggered);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ajnc ajnc2 = (ajnc) arrayList.get(i);
            if (ajnc2.b(z2) < ajnc.b(z2)) {
                ajnc = ajnc2;
            }
        }
        return ajnc;
    }

    public final ajnc b() {
        return a(false, true, false);
    }

    public final ajns a(Location location) {
        Location h = this.a.h();
        boolean z = this.a.f;
        float a2 = ajnt.a(location, h);
        boolean z2 = true;
        if (a2 <= 0.0f) {
            return new ajns(!z, 1);
        }
        float distanceTo = h.distanceTo(location);
        float I = (float) aztb.I();
        if (distanceTo > a2 && distanceTo > I) {
            return new ajns(true, 2);
        }
        if (a2 > I) {
            return new ajns(!z, 3);
        }
        if (distanceTo <= I) {
            z2 = false;
        }
        return new ajns(z2, 4);
    }

    public final void a() {
        if (aztb.R()) {
            qwq.a(this.d).a("ULR", "com.google.android.location.reporting.service.UploadGcmTaskService");
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this.g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.g = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01af, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.google.android.location.reporting.state.update.ReportingConfig r25, defpackage.ajns r26, android.location.Location r27, boolean r28) {
        /*
            r24 = this;
            r1 = r24
            r0 = r26
            r2 = r27
            monitor-enter(r24)
            r24.a()     // Catch:{ all -> 0x01b0 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01b0 }
            boolean r5 = r0.a     // Catch:{ all -> 0x01b0 }
            ajmn r6 = r1.a     // Catch:{ all -> 0x01b0 }
            long r6 = r6.i()     // Catch:{ all -> 0x01b0 }
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 > 0) goto L_0x001e
            r12 = 1
            goto L_0x001f
        L_0x001e:
            r12 = 0
        L_0x001f:
            r13 = r28
            ajnc r12 = r1.a(r12, r5, r13)     // Catch:{ all -> 0x01b0 }
            long r6 = r3 - r6
            long r13 = r12.b(r5)     // Catch:{ all -> 0x01b0 }
            long r8 = r13 - r6
            ajmn r15 = r1.a     // Catch:{ all -> 0x01b0 }
            long r17 = r15.b()     // Catch:{ all -> 0x01b0 }
            r19 = 1
            int r15 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r15 > 0) goto L_0x0042
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r2 = "Not uploading first location since start (in case we're in restart loop)"
            defpackage.ajix.a((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ all -> 0x01b0 }
            goto L_0x00d2
        L_0x0042:
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 > 0) goto L_0x00d2
            java.lang.String r8 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x01b0 }
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x01b0 }
            int r9 = r9.length()     // Catch:{ all -> 0x01b0 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b0 }
            int r9 = r9 + 125
            r10.<init>(r9)     // Catch:{ all -> 0x01b0 }
            java.lang.String r9 = "Sending an intent to LocationReporter, hasMoved: "
            r10.append(r9)     // Catch:{ all -> 0x01b0 }
            r10.append(r5)     // Catch:{ all -> 0x01b0 }
            java.lang.String r5 = ", elapsed millis: "
            r10.append(r5)     // Catch:{ all -> 0x01b0 }
            r10.append(r6)     // Catch:{ all -> 0x01b0 }
            java.lang.String r5 = ", request: "
            r10.append(r5)     // Catch:{ all -> 0x01b0 }
            r10.append(r8)     // Catch:{ all -> 0x01b0 }
            java.lang.String r5 = "("
            r10.append(r5)     // Catch:{ all -> 0x01b0 }
            r10.append(r13)     // Catch:{ all -> 0x01b0 }
            java.lang.String r5 = ")"
            r10.append(r5)     // Catch:{ all -> 0x01b0 }
            r10.toString()     // Catch:{ all -> 0x01b0 }
            boolean r0 = r0.a     // Catch:{ all -> 0x01b0 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01b0 }
            long r7 = r12.b(r0)     // Catch:{ all -> 0x01b0 }
            java.lang.String r22 = r12.a(r0)     // Catch:{ all -> 0x01b0 }
            java.lang.String r23 = r12.b()     // Catch:{ all -> 0x01b0 }
            java.lang.String r15 = r12.a()     // Catch:{ all -> 0x01b0 }
            com.google.android.ulr.ApiRate r0 = new com.google.android.ulr.ApiRate     // Catch:{ all -> 0x01b0 }
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            java.lang.Long r20 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x01b0 }
            java.lang.Long r21 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x01b0 }
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x01b0 }
            com.google.android.ulr.ApiMetadata r5 = defpackage.ajnz.a((com.google.android.ulr.ApiRate) r0)     // Catch:{ all -> 0x01b0 }
            ajin r6 = r1.e     // Catch:{ all -> 0x01b0 }
            java.util.List r7 = r25.b()     // Catch:{ all -> 0x01b0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01b0 }
            r6.a((java.util.List) r7, (com.google.android.ulr.ApiMetadata) r5, (java.lang.String) r0)     // Catch:{ all -> 0x01b0 }
            if (r2 == 0) goto L_0x00c6
            ajmn r0 = r1.a     // Catch:{ all -> 0x01b0 }
            r0.a((android.location.Location) r2)     // Catch:{ all -> 0x01b0 }
        L_0x00c6:
            ajmn r0 = r1.a     // Catch:{ all -> 0x01b0 }
            r0.b(r3)     // Catch:{ all -> 0x01b0 }
            android.content.Context r0 = r1.d     // Catch:{ all -> 0x01b0 }
            defpackage.ajme.b(r0)     // Catch:{ all -> 0x01b0 }
            monitor-exit(r24)
            return
        L_0x00d2:
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x01b0 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01b0 }
            int r2 = r2.length()     // Catch:{ all -> 0x01b0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b0 }
            int r2 = r2 + 116
            r3.<init>(r2)     // Catch:{ all -> 0x01b0 }
            java.lang.String r2 = "Not calling LocationReporter, hasMoved: "
            r3.append(r2)     // Catch:{ all -> 0x01b0 }
            r3.append(r5)     // Catch:{ all -> 0x01b0 }
            java.lang.String r2 = ", elapsed millis: "
            r3.append(r2)     // Catch:{ all -> 0x01b0 }
            r3.append(r6)     // Catch:{ all -> 0x01b0 }
            java.lang.String r2 = ", request: "
            r3.append(r2)     // Catch:{ all -> 0x01b0 }
            r3.append(r0)     // Catch:{ all -> 0x01b0 }
            java.lang.String r0 = "("
            r3.append(r0)     // Catch:{ all -> 0x01b0 }
            r3.append(r13)     // Catch:{ all -> 0x01b0 }
            java.lang.String r0 = ")"
            r3.append(r0)     // Catch:{ all -> 0x01b0 }
            r3.toString()     // Catch:{ all -> 0x01b0 }
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ae
            boolean r0 = defpackage.aztb.R()     // Catch:{ all -> 0x01b0 }
            if (r0 != 0) goto L_0x0128
            java.util.concurrent.ScheduledExecutorService r0 = r1.g     // Catch:{ all -> 0x01b0 }
            if (r0 == 0) goto L_0x0128
            jfv r0 = (defpackage.jfv) r0     // Catch:{ all -> 0x01b0 }
            boolean r0 = r0.d     // Catch:{ all -> 0x01b0 }
            if (r0 != 0) goto L_0x0128
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r2 = "Potential dangling upload identified"
            defpackage.ajix.a((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ all -> 0x01b0 }
        L_0x0128:
            r24.a()     // Catch:{ all -> 0x01b0 }
            boolean r0 = defpackage.aztb.R()     // Catch:{ all -> 0x01b0 }
            if (r0 == 0) goto L_0x017f
            r2 = 1000(0x3e8, double:4.94E-321)
            long r2 = r8 / r2
            android.content.Context r0 = r1.d     // Catch:{ all -> 0x01b0 }
            qwq r0 = defpackage.qwq.a((android.content.Context) r0)     // Catch:{ all -> 0x01b0 }
            qxf r4 = new qxf     // Catch:{ all -> 0x01b0 }
            r4.<init>()     // Catch:{ all -> 0x01b0 }
            r5 = 10
            long r5 = r5 + r2
            r4.a(r2, r5)     // Catch:{ all -> 0x01b0 }
            java.lang.String r2 = "com.google.android.location.reporting.service.UploadGcmTaskService"
            r4.i = r2     // Catch:{ all -> 0x01b0 }
            r2 = 0
            r4.n = r2     // Catch:{ all -> 0x01b0 }
            r4.a((int) r2)     // Catch:{ all -> 0x01b0 }
            r4.e()     // Catch:{ all -> 0x01b0 }
            qxl r2 = defpackage.qxl.a     // Catch:{ all -> 0x01b0 }
            r4.r = r2     // Catch:{ all -> 0x01b0 }
            java.lang.String r2 = "ULR"
            r4.k = r2     // Catch:{ all -> 0x01b0 }
            r2 = 1
            r4.b((int) r2)     // Catch:{ all -> 0x01b0 }
            qxg r2 = r4.b()     // Catch:{ all -> 0x01b0 }
            r0.a((defpackage.qxx) r2)     // Catch:{ all -> 0x01b0 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b0 }
            r2 = 76
            r0.<init>(r2)     // Catch:{ all -> 0x01b0 }
            java.lang.String r2 = "Scheduling next upload via GcmTaskManager in "
            r0.append(r2)     // Catch:{ all -> 0x01b0 }
            r0.append(r8)     // Catch:{ all -> 0x01b0 }
            java.lang.String r2 = "ms from now"
            r0.append(r2)     // Catch:{ all -> 0x01b0 }
            r0.toString()     // Catch:{ all -> 0x01b0 }
            monitor-exit(r24)
            return
        L_0x017f:
            jfv r0 = new jfv     // Catch:{ all -> 0x01b0 }
            r2 = 10
            r3 = 1
            r0.<init>(r3, r2)     // Catch:{ all -> 0x01b0 }
            r1.g = r0     // Catch:{ all -> 0x01b0 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b0 }
            r2 = 58
            r0.<init>(r2)     // Catch:{ all -> 0x01b0 }
            java.lang.String r2 = "Scheduling next upload for "
            r0.append(r2)     // Catch:{ all -> 0x01b0 }
            r0.append(r8)     // Catch:{ all -> 0x01b0 }
            java.lang.String r2 = "ms from now"
            r0.append(r2)     // Catch:{ all -> 0x01b0 }
            r0.toString()     // Catch:{ all -> 0x01b0 }
            ajkt r0 = new ajkt     // Catch:{ all -> 0x01b0 }
            r0.<init>(r1)     // Catch:{ all -> 0x01b0 }
            java.util.concurrent.ScheduledExecutorService r2 = r1.g     // Catch:{ all -> 0x01b0 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x01b0 }
            jfv r2 = (defpackage.jfv) r2     // Catch:{ all -> 0x01b0 }
            r2.schedule((java.lang.Runnable) r0, (long) r8, (java.util.concurrent.TimeUnit) r3)     // Catch:{ all -> 0x01b0 }
        L_0x01ae:
            monitor-exit(r24)
            return
        L_0x01b0:
            r0 = move-exception
            monitor-exit(r24)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajkv.a(com.google.android.location.reporting.state.update.ReportingConfig, ajns, android.location.Location, boolean):void");
    }

    public final void a(ReportingConfig reportingConfig, Location location) {
        a(reportingConfig, a(location), location, false);
    }
}
