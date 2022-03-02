package defpackage;

import android.content.Context;

/* renamed from: nrq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nrq {
    private static Boolean a;

    public static synchronized void a(Context context, boolean z) {
        synchronized (nrq.class) {
            if (axkn.e()) {
                context.createDeviceProtectedStorageContext().getSharedPreferences("gcm_direct_boot_data", 0).edit().putBoolean("deviceProtected", z).apply();
                a = Boolean.valueOf(z);
            }
        }
    }

    public static boolean b(Context context) {
        return aekv.a() && aekv.b(context) && axkn.e();
    }

    public static synchronized Context c(Context context) {
        synchronized (nrq.class) {
            if (axkn.e() && axkn.d() && d(context)) {
                context = context.createDeviceProtectedStorageContext();
            }
        }
        return context;
    }

    public static synchronized boolean d(Context context) {
        synchronized (nrq.class) {
            boolean z = false;
            if (!axkn.e()) {
                return false;
            }
            if (a == null) {
                if (aekv.a() && context.createDeviceProtectedStorageContext().getSharedPreferences("gcm_direct_boot_data", 0).getBoolean("deviceProtected", false)) {
                    z = true;
                }
                a = Boolean.valueOf(z);
            }
            boolean booleanValue = a.booleanValue();
            return booleanValue;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0165, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void e(android.content.Context r9) {
        /*
            java.lang.Class<nrq> r0 = defpackage.nrq.class
            monitor-enter(r0)
            boolean r1 = defpackage.axkn.e()     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x0164
            boolean r1 = defpackage.aekv.a()     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x0164
            boolean r1 = defpackage.aekv.b(r9)     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x0164
            boolean r1 = defpackage.axkn.d()     // Catch:{ all -> 0x0166 }
            boolean r2 = d(r9)     // Catch:{ all -> 0x0166 }
            r3 = 0
            if (r1 == 0) goto L_0x00cb
            if (r2 != 0) goto L_0x00cb
            qwq r1 = defpackage.qwq.a((android.content.Context) r9)     // Catch:{ all -> 0x0166 }
            boolean r2 = defpackage.aekv.a()     // Catch:{ all -> 0x0166 }
            r4 = 1
            if (r2 == 0) goto L_0x005f
            boolean r2 = defpackage.axkn.e()     // Catch:{ all -> 0x0166 }
            if (r2 == 0) goto L_0x005f
            boolean r2 = defpackage.nvu.b(r9)     // Catch:{ all -> 0x0166 }
            if (r2 != 0) goto L_0x005f
            qxf r2 = new qxf     // Catch:{ all -> 0x0166 }
            r2.<init>()     // Catch:{ all -> 0x0166 }
            java.lang.String r5 = "direct_boot_registration"
            r2.k = r5     // Catch:{ all -> 0x0166 }
            java.lang.String r5 = "com.google.android.gms.gcm.gmsproc.GcmInGmsTaskService"
            r2.i = r5     // Catch:{ all -> 0x0166 }
            r5 = 0
            r7 = 30
            r2.a(r5, r7)     // Catch:{ all -> 0x0166 }
            r2.a(r3, r3)     // Catch:{ all -> 0x0166 }
            r2.a((int) r3)     // Catch:{ all -> 0x0166 }
            r2.b((boolean) r4)     // Catch:{ all -> 0x0166 }
            r2.n = r4     // Catch:{ all -> 0x0166 }
            qxg r2 = r2.b()     // Catch:{ all -> 0x0166 }
            r1.a((defpackage.qxx) r2)     // Catch:{ all -> 0x0166 }
        L_0x005f:
            boolean r1 = b(r9)     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x0092
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0166 }
            java.io.File r2 = r9.getFilesDir()     // Catch:{ all -> 0x0166 }
            java.lang.String r3 = "gcm_connection_infos"
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0166 }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0166 }
            if (r2 == 0) goto L_0x0092
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0166 }
            android.content.Context r3 = r9.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x0166 }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ all -> 0x0166 }
            java.lang.String r5 = "gcm_connection_infos"
            r2.<init>(r3, r5)     // Catch:{ all -> 0x0166 }
            boolean r1 = r1.renameTo(r2)     // Catch:{ all -> 0x0166 }
            if (r1 != 0) goto L_0x0092
            java.lang.String r1 = "GCM"
            java.lang.String r2 = "HeartbeatChimeraAlarm data migration failed, data will be lost."
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x0166 }
        L_0x0092:
            boolean r1 = b(r9)     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x00c5
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0166 }
            java.io.File r2 = r9.getFilesDir()     // Catch:{ all -> 0x0166 }
            java.lang.String r3 = "fcm_package_info.ldb"
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0166 }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0166 }
            if (r2 == 0) goto L_0x00c5
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0166 }
            android.content.Context r3 = r9.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x0166 }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ all -> 0x0166 }
            java.lang.String r5 = "fcm_package_info.ldb"
            r2.<init>(r3, r5)     // Catch:{ all -> 0x0166 }
            boolean r1 = r1.renameTo(r2)     // Catch:{ all -> 0x0166 }
            if (r1 != 0) goto L_0x00c5
            java.lang.String r1 = "GCM"
            java.lang.String r2 = "PackageInfoStore data migration failed, data will be lost."
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x0166 }
        L_0x00c5:
            a(r9, r4)     // Catch:{ all -> 0x0166 }
            monitor-exit(r0)
            return
        L_0x00cb:
            if (r1 != 0) goto L_0x0164
            if (r2 == 0) goto L_0x0164
            boolean r1 = defpackage.aekv.a()     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x00eb
            boolean r1 = defpackage.axkn.e()     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x00eb
            android.content.SharedPreferences r1 = defpackage.nvu.c(r9)     // Catch:{ all -> 0x0166 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0166 }
            java.lang.String r2 = "gcm_local_directboot_token"
            r1.remove(r2)     // Catch:{ all -> 0x0166 }
            r1.apply()     // Catch:{ all -> 0x0166 }
        L_0x00eb:
            boolean r1 = b(r9)     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x011e
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0166 }
            android.content.Context r2 = r9.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x0166 }
            java.io.File r2 = r2.getFilesDir()     // Catch:{ all -> 0x0166 }
            java.lang.String r4 = "gcm_connection_infos"
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0166 }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0166 }
            if (r2 == 0) goto L_0x011e
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0166 }
            java.io.File r4 = r9.getFilesDir()     // Catch:{ all -> 0x0166 }
            java.lang.String r5 = "gcm_connection_infos"
            r2.<init>(r4, r5)     // Catch:{ all -> 0x0166 }
            boolean r1 = r1.renameTo(r2)     // Catch:{ all -> 0x0166 }
            if (r1 != 0) goto L_0x011e
            java.lang.String r1 = "GCM"
            java.lang.String r2 = "HeartbeatChimeraAlarm data migration failed, data will be lost."
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x0166 }
        L_0x011e:
            boolean r1 = b(r9)     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x0151
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0166 }
            android.content.Context r2 = r9.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x0166 }
            java.io.File r2 = r2.getFilesDir()     // Catch:{ all -> 0x0166 }
            java.lang.String r4 = "fcm_package_info.ldb"
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0166 }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0166 }
            if (r2 == 0) goto L_0x0151
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0166 }
            java.io.File r4 = r9.getFilesDir()     // Catch:{ all -> 0x0166 }
            java.lang.String r5 = "fcm_package_info.ldb"
            r2.<init>(r4, r5)     // Catch:{ all -> 0x0166 }
            boolean r1 = r1.renameTo(r2)     // Catch:{ all -> 0x0166 }
            if (r1 != 0) goto L_0x0151
            java.lang.String r1 = "GCM"
            java.lang.String r2 = "PackageInfoStore data migration failed, data will be lost."
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x0166 }
        L_0x0151:
            boolean r1 = b(r9)     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x0160
            android.content.Context r1 = r9.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x0166 }
            java.lang.String r2 = "rmq.db"
            r1.deleteDatabase(r2)     // Catch:{ all -> 0x0166 }
        L_0x0160:
            a(r9, r3)     // Catch:{ all -> 0x0166 }
        L_0x0164:
            monitor-exit(r0)
            return
        L_0x0166:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nrq.e(android.content.Context):void");
    }

    public static boolean a(Context context) {
        if (!axkn.e() || !axkn.d() || !nvu.b(context) || !d(context)) {
            return false;
        }
        return true;
    }
}
