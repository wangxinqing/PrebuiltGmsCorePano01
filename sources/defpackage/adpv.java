package defpackage;

import com.google.android.gms.update.pano.legacy.ChimeraOtaPanoSetupActivity;

/* renamed from: adpv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adpv implements Runnable {
    final /* synthetic */ ChimeraOtaPanoSetupActivity a;

    public adpv(ChimeraOtaPanoSetupActivity chimeraOtaPanoSetupActivity) {
        this.a = chimeraOtaPanoSetupActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r5.a.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = defpackage.adjk.e();
        r1 = com.google.android.gms.update.pano.legacy.ChimeraOtaPanoSetupActivity.a;
        r2 = new java.lang.StringBuilder(59);
        r2.append("ChimeraOtaPanoSetupActivity#mDownloadUpdate#run ");
        r2.append(r0);
        r1.b(r2.toString(), new java.lang.Object[0]);
        r1 = r5.a.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (r1 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        r1.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        com.google.android.gms.update.pano.legacy.ChimeraOtaPanoSetupActivity.a.d("Not connected to service; not updating download percent", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        r1 = r5.a.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r5.a.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r0 = r5.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r0.k == 2) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r0.isFinishing() != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.google.android.gms.update.pano.legacy.ChimeraOtaPanoSetupActivity r0 = r5.a
            java.lang.Object r0 = r0.b
            monitor-enter(r0)
            com.google.android.gms.update.pano.legacy.ChimeraOtaPanoSetupActivity r1 = r5.a     // Catch:{ all -> 0x006d }
            boolean r1 = r1.c     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x006b
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            com.google.android.gms.update.pano.legacy.ChimeraOtaPanoSetupActivity r0 = r5.a
            int r1 = r0.k
            r2 = 2
            r3 = 0
            if (r1 == r2) goto L_0x0015
            goto L_0x005d
        L_0x0015:
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x005d
            com.google.android.gms.update.pano.legacy.ChimeraOtaPanoSetupActivity r0 = r5.a
            r0.a()
            int r0 = defpackage.adjk.e()     // Catch:{ RemoteException -> 0x0049 }
            iwd r1 = com.google.android.gms.update.pano.legacy.ChimeraOtaPanoSetupActivity.a     // Catch:{ RemoteException -> 0x0049 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0049 }
            r4 = 59
            r2.<init>(r4)     // Catch:{ RemoteException -> 0x0049 }
            java.lang.String r4 = "ChimeraOtaPanoSetupActivity#mDownloadUpdate#run "
            r2.append(r4)     // Catch:{ RemoteException -> 0x0049 }
            r2.append(r0)     // Catch:{ RemoteException -> 0x0049 }
            java.lang.String r2 = r2.toString()     // Catch:{ RemoteException -> 0x0049 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ RemoteException -> 0x0049 }
            r1.b(r2, r4)     // Catch:{ RemoteException -> 0x0049 }
            com.google.android.gms.update.pano.legacy.ChimeraOtaPanoSetupActivity r1 = r5.a     // Catch:{ RemoteException -> 0x0049 }
            adqh r1 = r1.f     // Catch:{ RemoteException -> 0x0049 }
            if (r1 != 0) goto L_0x0045
            goto L_0x0053
        L_0x0045:
            r1.a(r0)     // Catch:{ RemoteException -> 0x0049 }
            goto L_0x0053
        L_0x0049:
            r0 = move-exception
            iwd r0 = com.google.android.gms.update.pano.legacy.ChimeraOtaPanoSetupActivity.a
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "Not connected to service; not updating download percent"
            r0.d(r2, r1)
        L_0x0053:
            com.google.android.gms.update.pano.legacy.ChimeraOtaPanoSetupActivity r0 = r5.a
            android.os.Handler r0 = r0.l
            r1 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r5, r1)
            return
        L_0x005d:
            com.google.android.gms.update.pano.legacy.ChimeraOtaPanoSetupActivity r0 = r5.a
            java.lang.Object r1 = r0.b
            monitor-enter(r1)
            com.google.android.gms.update.pano.legacy.ChimeraOtaPanoSetupActivity r0 = r5.a     // Catch:{ all -> 0x0068 }
            r0.c = r3     // Catch:{ all -> 0x0068 }
            monitor-exit(r1)     // Catch:{ all -> 0x0068 }
            return
        L_0x0068:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0068 }
            throw r0
        L_0x006b:
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            return
        L_0x006d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpv.run():void");
    }
}
