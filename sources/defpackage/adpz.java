package defpackage;

import com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity;

/* renamed from: adpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adpz implements Runnable {
    final /* synthetic */ ChimeraSystemUpdatePanoActivity a;

    public adpz(ChimeraSystemUpdatePanoActivity chimeraSystemUpdatePanoActivity) {
        this.a = chimeraSystemUpdatePanoActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r1 == 529) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = defpackage.adjk.e();
        r1 = com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity.a;
        r3 = new java.lang.StringBuilder(56);
        r3.append("ChimeraSystemUpdatePanoActivity: installing ");
        r3.append(r0);
        r3.append("%");
        r1.b(r3.toString(), new java.lang.Object[0]);
        r1 = r5.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r1.h == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        r3 = r1.l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r3 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r1.h = r3.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        r1 = r5.a.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r1 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        r1.setVisibility(0);
        r5.a.h.setMax(100);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r0 != -1) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r0 == 0) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r5.a.h.setIndeterminate(false);
        r5.a.h.setProgress(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        r5.a.h.setIndeterminate(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity.a.d("Not connected to service; not updating download percent", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
        r1 = r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r5.a.e = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r0 = r5.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0.g == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r1 = r0.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r1 != 273) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r0 = r5.a
            java.lang.Object r0 = r0.d
            monitor-enter(r0)
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r1 = r5.a     // Catch:{ all -> 0x00a6 }
            boolean r1 = r1.e     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x00a4
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r0 = r5.a
            boolean r1 = r0.g
            r2 = 0
            if (r1 == 0) goto L_0x0098
            int r1 = r0.f
            r3 = 273(0x111, float:3.83E-43)
            if (r1 != r3) goto L_0x001a
            goto L_0x0020
        L_0x001a:
            r3 = 529(0x211, float:7.41E-43)
            if (r1 == r3) goto L_0x0020
            goto L_0x0098
        L_0x0020:
            int r0 = defpackage.adjk.e()     // Catch:{ RemoteException -> 0x0084 }
            iwd r1 = com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity.a     // Catch:{ RemoteException -> 0x0084 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0084 }
            r4 = 56
            r3.<init>(r4)     // Catch:{ RemoteException -> 0x0084 }
            java.lang.String r4 = "ChimeraSystemUpdatePanoActivity: installing "
            r3.append(r4)     // Catch:{ RemoteException -> 0x0084 }
            r3.append(r0)     // Catch:{ RemoteException -> 0x0084 }
            java.lang.String r4 = "%"
            r3.append(r4)     // Catch:{ RemoteException -> 0x0084 }
            java.lang.String r3 = r3.toString()     // Catch:{ RemoteException -> 0x0084 }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x0084 }
            r1.b(r3, r4)     // Catch:{ RemoteException -> 0x0084 }
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r1 = r5.a     // Catch:{ RemoteException -> 0x0084 }
            android.widget.ProgressBar r3 = r1.h     // Catch:{ RemoteException -> 0x0084 }
            if (r3 == 0) goto L_0x004a
            goto L_0x0054
        L_0x004a:
            adqg r3 = r1.l     // Catch:{ RemoteException -> 0x0084 }
            if (r3 == 0) goto L_0x0054
            android.widget.ProgressBar r3 = r3.a()     // Catch:{ RemoteException -> 0x0084 }
            r1.h = r3     // Catch:{ RemoteException -> 0x0084 }
        L_0x0054:
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r1 = r5.a     // Catch:{ RemoteException -> 0x0084 }
            android.widget.ProgressBar r1 = r1.h     // Catch:{ RemoteException -> 0x0084 }
            if (r1 == 0) goto L_0x008e
            r1.setVisibility(r2)     // Catch:{ RemoteException -> 0x0084 }
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r1 = r5.a     // Catch:{ RemoteException -> 0x0084 }
            android.widget.ProgressBar r1 = r1.h     // Catch:{ RemoteException -> 0x0084 }
            r3 = 100
            r1.setMax(r3)     // Catch:{ RemoteException -> 0x0084 }
            r1 = -1
            if (r0 != r1) goto L_0x006a
            goto L_0x007b
        L_0x006a:
            if (r0 == 0) goto L_0x007b
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r1 = r5.a     // Catch:{ RemoteException -> 0x0084 }
            android.widget.ProgressBar r1 = r1.h     // Catch:{ RemoteException -> 0x0084 }
            r1.setIndeterminate(r2)     // Catch:{ RemoteException -> 0x0084 }
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r1 = r5.a     // Catch:{ RemoteException -> 0x0084 }
            android.widget.ProgressBar r1 = r1.h     // Catch:{ RemoteException -> 0x0084 }
            r1.setProgress(r0)     // Catch:{ RemoteException -> 0x0084 }
            goto L_0x008e
        L_0x007b:
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r0 = r5.a     // Catch:{ RemoteException -> 0x0084 }
            android.widget.ProgressBar r0 = r0.h     // Catch:{ RemoteException -> 0x0084 }
            r1 = 1
            r0.setIndeterminate(r1)     // Catch:{ RemoteException -> 0x0084 }
            goto L_0x008e
        L_0x0084:
            r0 = move-exception
            iwd r0 = com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity.a
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "Not connected to service; not updating download percent"
            r0.d(r2, r1)
        L_0x008e:
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r0 = r5.a
            android.os.Handler r0 = r0.i
            r1 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r5, r1)
            return
        L_0x0098:
            java.lang.Object r1 = r0.d
            monitor-enter(r1)
            com.google.android.gms.update.pano.legacy.ChimeraSystemUpdatePanoActivity r0 = r5.a     // Catch:{ all -> 0x00a1 }
            r0.e = r2     // Catch:{ all -> 0x00a1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a1 }
            return
        L_0x00a1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a1 }
            throw r0
        L_0x00a4:
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            return
        L_0x00a6:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpz.run():void");
    }
}
