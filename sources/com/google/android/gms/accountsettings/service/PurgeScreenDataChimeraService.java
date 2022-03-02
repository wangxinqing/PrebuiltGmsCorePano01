package com.google.android.gms.accountsettings.service;

import com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PurgeScreenDataChimeraService extends qwf {
    private static final iwd a = dit.a("PurgeScreenDataSvc");
    private RepositoryDatabase b;

    public static qxj a() {
        qxi qxi = new qxi();
        qxi.i = "com.google.android.gms.accountsettings.service.PurgeScreenDataService";
        qxi.k = "PurgeScreenData";
        qxi.b(1);
        qxi.a = awgs.a.a().u();
        qxi.b = awgs.a.a().t();
        qxi.a(0, axcc.c() ? 1 : 0);
        qxi.a(2);
        qxk qxk = new qxk();
        qxk.a = 0;
        qxk.b = (int) TimeUnit.HOURS.toSeconds(4);
        qxk.c = (int) TimeUnit.DAYS.toSeconds(3);
        qxi.r = qxk.a();
        qxi.n = true;
        return qxi.b();
    }

    public final void onCreate() {
        super.onCreate();
        if (this.b == null) {
            this.b = RepositoryDatabase.a(getBaseContext());
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        RepositoryDatabase repositoryDatabase = this.b;
        if (repositoryDatabase != null) {
            repositoryDatabase.d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.qxz r8) {
        /*
            r7 = this;
            iwd r0 = a
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r8.a
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "Running gcm task %s"
            r0.a(r3, r2)
            java.lang.String r8 = r8.a
            java.lang.String r0 = "PurgeScreenData"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x007d
            awgs r8 = defpackage.awgs.a
            awgt r8 = r8.a()
            boolean r8 = r8.g()
            if (r8 == 0) goto L_0x003f
            com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase r8 = r7.b
            long r2 = java.lang.System.currentTimeMillis()
            awgs r0 = defpackage.awgs.a
            awgt r0 = r0.a()
            long r5 = r0.s()
            cub r8 = r8.k()
            long r2 = r2 - r5
            r8.a((long) r2)
            r8 = 1
            goto L_0x0040
        L_0x003f:
            r8 = 0
        L_0x0040:
            awgy r0 = defpackage.awgy.a
            awgz r0 = r0.a()
            boolean r0 = r0.j()
            if (r0 == 0) goto L_0x0079
            iwd r0 = a
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r3 = "Purging deprecated account database"
            r0.a(r3, r2)
            android.content.Context r0 = r7.getBaseContext()
            java.util.HashSet r2 = new java.util.HashSet
            java.lang.String[] r3 = r0.databaseList()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.<init>(r3)
            java.lang.String r3 = "id_as_screens.db"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x0073
            boolean r0 = r0.deleteDatabase(r3)
            goto L_0x0074
        L_0x0073:
            r0 = 1
        L_0x0074:
            if (r8 == 0) goto L_0x007c
            if (r0 == 0) goto L_0x007c
            goto L_0x007b
        L_0x0079:
            if (r8 == 0) goto L_0x007c
        L_0x007b:
            return r4
        L_0x007c:
            return r1
        L_0x007d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.accountsettings.service.PurgeScreenDataChimeraService.a(qxz):int");
    }
}
