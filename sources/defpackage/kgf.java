package defpackage;

import android.os.AsyncTask;

/* renamed from: kgf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kgf extends AsyncTask {
    private final icc a;
    private final String b;
    private final kwg c;

    public kgf(icc icc, String str, kwg kwg) {
        this.a = icc;
        this.b = str;
        this.c = kwg;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r2 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r5) {
        /*
            r4 = this;
            java.lang.Void[] r5 = (java.lang.Void[]) r5
            icc r5 = r4.a
            com.google.android.gms.common.ConnectionResult r5 = r5.f()
            r0 = 0
            boolean r1 = r5.b()     // Catch:{ RemoteException -> 0x0074 }
            if (r1 == 0) goto L_0x0060
            ibq r5 = defpackage.yjh.a     // Catch:{ RemoteException -> 0x0074 }
            icc r5 = r4.a     // Catch:{ RemoteException -> 0x0074 }
            yjk r1 = new yjk     // Catch:{ RemoteException -> 0x0074 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0074 }
            idf r5 = r5.a((defpackage.idf) r1)     // Catch:{ RemoteException -> 0x0074 }
            icl r5 = r5.a()     // Catch:{ RemoteException -> 0x0074 }
            yji r5 = (defpackage.yji) r5     // Catch:{ RemoteException -> 0x0074 }
            com.google.android.gms.common.api.Status r1 = r5.aO()     // Catch:{ RemoteException -> 0x0074 }
            boolean r2 = r1.c()     // Catch:{ RemoteException -> 0x0074 }
            if (r2 == 0) goto L_0x0058
            java.util.List r5 = r5.b()     // Catch:{ RemoteException -> 0x0074 }
            java.lang.String r1 = r4.b     // Catch:{ RemoteException -> 0x0074 }
            ith r2 = defpackage.kgg.f     // Catch:{ RemoteException -> 0x0074 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ RemoteException -> 0x0074 }
        L_0x0038:
            boolean r2 = r5.hasNext()     // Catch:{ RemoteException -> 0x0074 }
            if (r2 == 0) goto L_0x0051
            java.lang.Object r2 = r5.next()     // Catch:{ RemoteException -> 0x0074 }
            com.google.android.gms.photos.autobackup.model.AutoBackupSettings r2 = (com.google.android.gms.photos.autobackup.model.AutoBackupSettings) r2     // Catch:{ RemoteException -> 0x0074 }
            java.lang.String r3 = r2.b     // Catch:{ RemoteException -> 0x0074 }
            boolean r2 = r2.c     // Catch:{ RemoteException -> 0x0074 }
            if (r3 == 0) goto L_0x0051
            boolean r3 = r1.equals(r3)     // Catch:{ RemoteException -> 0x0074 }
            if (r3 == 0) goto L_0x0038
            goto L_0x0052
        L_0x0051:
            r2 = 0
        L_0x0052:
            kwg r5 = r4.c     // Catch:{ RemoteException -> 0x0074 }
            r5.a((boolean) r2)     // Catch:{ RemoteException -> 0x0074 }
            goto L_0x005d
        L_0x0058:
            kwg r5 = r4.c     // Catch:{ RemoteException -> 0x0074 }
            r5.a((com.google.android.gms.common.api.Status) r1)     // Catch:{ RemoteException -> 0x0074 }
        L_0x005d:
            icc r5 = r4.a
            goto L_0x006e
        L_0x0060:
            kwg r1 = r4.c     // Catch:{ RemoteException -> 0x0074 }
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status     // Catch:{ RemoteException -> 0x0074 }
            int r5 = r5.c     // Catch:{ RemoteException -> 0x0074 }
            r2.<init>(r5)     // Catch:{ RemoteException -> 0x0074 }
            r1.a((com.google.android.gms.common.api.Status) r2)     // Catch:{ RemoteException -> 0x0074 }
            icc r5 = r4.a
        L_0x006e:
            r5.g()
            goto L_0x008c
        L_0x0072:
            r5 = move-exception
            goto L_0x008e
        L_0x0074:
            r5 = move-exception
            ith r1 = defpackage.kgg.f     // Catch:{ all -> 0x0072 }
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0072 }
            java.lang.String r3 = r4.b     // Catch:{ all -> 0x0072 }
            r2[r0] = r3     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "IsAutobackupEnabledOper"
            java.lang.String r3 = "Autobackup connection failed for %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ all -> 0x0072 }
            r1.c(r0, r2, r5)     // Catch:{ all -> 0x0072 }
            icc r5 = r4.a
            goto L_0x006e
        L_0x008c:
            r5 = 0
            return r5
        L_0x008e:
            icc r0 = r4.a
            r0.g()
            goto L_0x0095
        L_0x0094:
            throw r5
        L_0x0095:
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgf.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
