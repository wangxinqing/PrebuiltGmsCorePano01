package defpackage;

import com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity;

/* renamed from: adpy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adpy implements Runnable {
    final /* synthetic */ ChimeraSystemUpdatePanoActivity a;

    public adpy(ChimeraSystemUpdatePanoActivity chimeraSystemUpdatePanoActivity) {
        this.a = chimeraSystemUpdatePanoActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = defpackage.adjk.e();
        r1 = com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity.a;
        r3 = new java.lang.StringBuilder(57);
        r3.append("ChimeraSystemUpdatePanoActivity: downloading ");
        r3.append(r0);
        r3.append("%");
        r1.b(r3.toString(), new java.lang.Object[0]);
        r1 = r5.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (r1.h == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        r3 = r1.l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r3 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        r1.h = r3.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r1 = r5.a.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r1 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        r1.setVisibility(0);
        r5.a.h.setMax(100);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r0 != -1) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        if (r0 == 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        r5.a.h.setIndeterminate(false);
        r5.a.h.setProgress(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        r5.a.h.setIndeterminate(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity.a.d("Not connected to service; not updating download progress.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        r1 = r0.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r5.a.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r0 = r5.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0.g != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r0.f != 2) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r0 = r5.a
            java.lang.Object r0 = r0.b
            monitor-enter(r0)
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r1 = r5.a     // Catch:{ all -> 0x00a0 }
            boolean r1 = r1.c     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x009e
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r0 = r5.a
            boolean r1 = r0.g
            r2 = 0
            if (r1 != 0) goto L_0x0015
            goto L_0x0092
        L_0x0015:
            int r1 = r0.f
            r3 = 2
            if (r1 != r3) goto L_0x0092
            int r0 = defpackage.adjk.e()     // Catch:{ RemoteException -> 0x007e }
            iwd r1 = com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity.a     // Catch:{ RemoteException -> 0x007e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x007e }
            r4 = 57
            r3.<init>(r4)     // Catch:{ RemoteException -> 0x007e }
            java.lang.String r4 = "ChimeraSystemUpdatePanoActivity: downloading "
            r3.append(r4)     // Catch:{ RemoteException -> 0x007e }
            r3.append(r0)     // Catch:{ RemoteException -> 0x007e }
            java.lang.String r4 = "%"
            r3.append(r4)     // Catch:{ RemoteException -> 0x007e }
            java.lang.String r3 = r3.toString()     // Catch:{ RemoteException -> 0x007e }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x007e }
            r1.b(r3, r4)     // Catch:{ RemoteException -> 0x007e }
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r1 = r5.a     // Catch:{ RemoteException -> 0x007e }
            android.widget.ProgressBar r3 = r1.h     // Catch:{ RemoteException -> 0x007e }
            if (r3 == 0) goto L_0x0044
            goto L_0x004e
        L_0x0044:
            adqg r3 = r1.l     // Catch:{ RemoteException -> 0x007e }
            if (r3 == 0) goto L_0x004e
            android.widget.ProgressBar r3 = r3.a()     // Catch:{ RemoteException -> 0x007e }
            r1.h = r3     // Catch:{ RemoteException -> 0x007e }
        L_0x004e:
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r1 = r5.a     // Catch:{ RemoteException -> 0x007e }
            android.widget.ProgressBar r1 = r1.h     // Catch:{ RemoteException -> 0x007e }
            if (r1 == 0) goto L_0x0088
            r1.setVisibility(r2)     // Catch:{ RemoteException -> 0x007e }
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r1 = r5.a     // Catch:{ RemoteException -> 0x007e }
            android.widget.ProgressBar r1 = r1.h     // Catch:{ RemoteException -> 0x007e }
            r3 = 100
            r1.setMax(r3)     // Catch:{ RemoteException -> 0x007e }
            r1 = -1
            if (r0 != r1) goto L_0x0064
            goto L_0x0075
        L_0x0064:
            if (r0 == 0) goto L_0x0075
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r1 = r5.a     // Catch:{ RemoteException -> 0x007e }
            android.widget.ProgressBar r1 = r1.h     // Catch:{ RemoteException -> 0x007e }
            r1.setIndeterminate(r2)     // Catch:{ RemoteException -> 0x007e }
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r1 = r5.a     // Catch:{ RemoteException -> 0x007e }
            android.widget.ProgressBar r1 = r1.h     // Catch:{ RemoteException -> 0x007e }
            r1.setProgress(r0)     // Catch:{ RemoteException -> 0x007e }
            goto L_0x0088
        L_0x0075:
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r0 = r5.a     // Catch:{ RemoteException -> 0x007e }
            android.widget.ProgressBar r0 = r0.h     // Catch:{ RemoteException -> 0x007e }
            r1 = 1
            r0.setIndeterminate(r1)     // Catch:{ RemoteException -> 0x007e }
            goto L_0x0088
        L_0x007e:
            r0 = move-exception
            iwd r0 = com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity.a
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "Not connected to service; not updating download progress."
            r0.d(r2, r1)
        L_0x0088:
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r0 = r5.a
            android.os.Handler r0 = r0.i
            r1 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r5, r1)
            return
        L_0x0092:
            java.lang.Object r1 = r0.b
            monitor-enter(r1)
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r0 = r5.a     // Catch:{ all -> 0x009b }
            r0.c = r2     // Catch:{ all -> 0x009b }
            monitor-exit(r1)     // Catch:{ all -> 0x009b }
            return
        L_0x009b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009b }
            throw r0
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            return
        L_0x00a0:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpy.run():void");
    }
}
