package com.google.android.gms.contactinteractions.service;

import android.content.Context;
import android.os.SystemClock;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ContactInteractionsChimeraTaskService extends qwf {
    public static void a(Context context) {
        boolean z;
        int i;
        jpm jpm = new jpm(context);
        long uptimeMillis = SystemClock.uptimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        long j = jpm.a.getLong("clear_interaction_service_last_scheduled_timestamp", currentTimeMillis);
        jpm.a.edit().putLong("clear_interaction_service_last_scheduled_timestamp", currentTimeMillis).apply();
        int i2 = 1;
        if (awuj.a.a().a()) {
            z = d(context);
        } else {
            z = true;
        }
        qxi qxi = new qxi();
        qxi.i = "com.google.android.gms.contactinteractions.service.ContactInteractionsTaskService";
        qxi.k = "com.google.android.gms.contactinteractions.service.ClearContactInteractionsPeriodicTask";
        qxi.a(2);
        boolean h = awuj.h();
        if (!axcc.b() && !awuj.h()) {
            i2 = 0;
        }
        qxi.a(h ? 1 : 0, i2);
        qxi.a(awuj.i());
        qxi.b(z);
        qxi.n = awuj.g();
        long f = awuj.f();
        if (!axcc.a.a().f()) {
            qxi.a = f;
            if (awuj.j()) {
                qxi.b = awuj.e();
            }
        } else {
            double h2 = axbn.h();
            double d = (double) f;
            Double.isNaN(d);
            qxi.a(f, (long) (h2 * d), qxr.a);
        }
        long f2 = awuj.f();
        boolean j2 = awuj.j();
        long e = awuj.e();
        boolean h3 = awuj.h();
        boolean z2 = h3;
        boolean i3 = awuj.i();
        boolean z3 = z;
        jpm.a(true, f2, j2, e, z2, i3, awuj.g());
        qxj a = qxi.b();
        if (!z3) {
            i = 6;
        } else {
            i = 3;
        }
        a(context, a, i, currentTimeMillis, uptimeMillis, j);
    }

    public static void b(Context context) {
        new jpm(context).a(false, awuj.f(), awuj.j(), awuj.e(), awuj.h(), awuj.i(), awuj.g());
        try {
            qwq.a(context).a("com.google.android.gms.contactinteractions.service.ContactInteractionsTaskService");
        } catch (IllegalArgumentException e) {
        }
    }

    public static void c(Context context) {
        if (!awuj.d()) {
            b(context);
        } else if (d(context)) {
            a(context);
        }
    }

    private static boolean d(Context context) {
        jpm jpm = new jpm(context);
        return (jpm.a.getBoolean("clear_interactions_service_enabled", false) == awuj.d() && jpm.a.getLong("clear_interactions_service_period_seconds", -1) == awuj.f() && jpm.a.getBoolean("clear_interactions_service_use_flex", false) == awuj.j() && jpm.a.getLong("clear_interactions_service_flex_seconds", -1) == awuj.e() && jpm.a.getBoolean("clear_interactions_service_requires_charging", false) == awuj.h() && jpm.a.getBoolean("clear_interactions_service_requires_device_idle", false) == awuj.i() && jpm.a.getBoolean("clear_interactions_service_persist_task", false) == awuj.g()) ? false : true;
    }

    public static void a(Context context, qxx qxx, int i, long j, long j2, long j3) {
        int i2;
        try {
            qxx qxx2 = qxx;
            qwq.a(context).a(qxx);
            i2 = 3;
        } catch (IllegalArgumentException e) {
            i2 = 4;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        Context context2 = context;
        new jpn(context).a(i, i2, (Integer) null, Long.valueOf(j), Long.valueOf(currentTimeMillis), Long.valueOf(uptimeMillis - j2), Long.valueOf(j - j3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.qxz r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = r0.a
            java.lang.String r3 = "com.google.android.gms.contactinteractions.service.ClearContactInteractionsPeriodicTask"
            boolean r0 = r2.equals(r3)
            r4 = 2
            if (r0 == 0) goto L_0x0015
            boolean r0 = defpackage.awuj.d()
            if (r0 != 0) goto L_0x0024
        L_0x0015:
            java.lang.String r0 = "com.google.android.gms.contactinteractions.service.ClearContactInteractionsOneOffTask"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00e6
            boolean r0 = defpackage.awuj.b()
            if (r0 == 0) goto L_0x00e6
        L_0x0024:
            jpm r0 = new jpm
            r0.<init>(r1)
            long r5 = android.os.SystemClock.uptimeMillis()
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r0.a(r7)
            android.content.SharedPreferences r0 = r0.a
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r11 = "clear_interactions_service_last_run_timestamp"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r11, r7)
            r0.apply()
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            int r0 = defpackage.kf.a((android.content.Context) r1, (java.lang.String) r0)
            r12 = 0
            r13 = 0
            if (r0 != 0) goto L_0x00ad
            int r0 = android.os.Build.VERSION.SDK_INT
            r0 = 1
            java.lang.String[] r15 = new java.lang.String[r0]
            java.lang.String r14 = "_count"
            r15[r13] = r14
            android.content.ContentResolver r14 = r22.getContentResolver()
            android.net.Uri r16 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            java.lang.String[] r11 = new java.lang.String[r4]
            java.lang.String r17 = "0"
            r11[r13] = r17
            r11[r0] = r17
            r19 = 0
            java.lang.String r17 = "times_contacted>? OR last_time_contacted>?"
            r0 = r15
            r15 = r16
            r16 = r0
            r18 = r11
            android.database.Cursor r0 = r14.query(r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0087
            int r11 = r0.getCount()
            if (r11 <= 0) goto L_0x0087
            r0.moveToFirst()
            int r11 = r0.getInt(r13)
            r0.close()
            goto L_0x0088
        L_0x0087:
            r11 = 0
        L_0x0088:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            android.content.ContentResolver r0 = r22.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x00a7, IllegalStateException -> 0x00a4, UnsupportedOperationException -> 0x00a2, SQLiteException -> 0x00a0 }
            android.net.Uri r14 = android.provider.ContactsContract.DataUsageFeedback.DELETE_USAGE_URI     // Catch:{ IllegalArgumentException -> 0x00a7, IllegalStateException -> 0x00a4, UnsupportedOperationException -> 0x00a2, SQLiteException -> 0x00a0 }
            int r0 = r0.delete(r14, r12, r12)     // Catch:{ IllegalArgumentException -> 0x00a7, IllegalStateException -> 0x00a4, UnsupportedOperationException -> 0x00a2, SQLiteException -> 0x00a0 }
            if (r0 <= 0) goto L_0x009c
            r17 = r11
            r0 = 3
            goto L_0x00b0
        L_0x009c:
            r17 = r11
            r0 = 2
            goto L_0x00b0
        L_0x00a0:
            r0 = move-exception
            goto L_0x00a5
        L_0x00a2:
            r0 = move-exception
            goto L_0x00a5
        L_0x00a4:
            r0 = move-exception
        L_0x00a5:
            r0 = 4
            goto L_0x00aa
        L_0x00a7:
            r0 = move-exception
            r0 = 8
        L_0x00aa:
            r17 = r11
            goto L_0x00b0
        L_0x00ad:
            r0 = 7
            r17 = r12
        L_0x00b0:
            long r11 = java.lang.System.currentTimeMillis()
            long r14 = android.os.SystemClock.uptimeMillis()
            jpn r4 = new jpn
            r4.<init>(r1)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00c5
            r2 = 5
            goto L_0x00c6
        L_0x00c5:
            r2 = 2
        L_0x00c6:
            java.lang.Long r18 = java.lang.Long.valueOf(r7)
            java.lang.Long r19 = java.lang.Long.valueOf(r11)
            long r14 = r14 - r5
            java.lang.Long r20 = java.lang.Long.valueOf(r14)
            long r7 = r7 - r9
            java.lang.Long r21 = java.lang.Long.valueOf(r7)
            r14 = r4
            r15 = r2
            r16 = r0
            r14.a(r15, r16, r17, r18, r19, r20, r21)
            c(r22)
            r2 = 3
            if (r0 != r2) goto L_0x00e6
            return r13
        L_0x00e6:
            r2 = 2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService.a(qxz):int");
    }
}
