package com.google.android.gms.common.stats.net;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NetworkReportChimeraService extends qwf {
    private SharedPreferences a;
    private SharedPreferences.Editor b;

    private final int a(Future future) {
        try {
            Boolean bool = (Boolean) future.get();
            this.b.putInt("rescheduleCount", 0);
            this.b.apply();
            if (bool == null || !bool.booleanValue()) {
                return 2;
            }
            return 0;
        } catch (InterruptedException | ExecutionException e) {
            Log.i("NetworkReportService", "Task failed", e);
            return 2;
        }
    }

    private static final boolean a(long j, long j2) {
        return j == 0 || j < j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014a, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.qxz r16) {
        /*
            r15 = this;
            r10 = r15
            monitor-enter(r15)
            android.content.Context r0 = defpackage.aekv.d(r15)     // Catch:{ all -> 0x014b }
            java.lang.String r1 = "NetworkReportServicePrefs"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)     // Catch:{ all -> 0x014b }
            r10.a = r0     // Catch:{ all -> 0x014b }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x014b }
            r10.b = r0     // Catch:{ all -> 0x014b }
            agvx r0 = defpackage.jcd.g     // Catch:{ all -> 0x014b }
            java.lang.Object r0 = r0.c()     // Catch:{ all -> 0x014b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x014b }
            boolean r1 = defpackage.jkr.g()     // Catch:{ all -> 0x014b }
            r3 = 2
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0.booleanValue()     // Catch:{ all -> 0x014b }
            if (r1 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            monitor-exit(r15)     // Catch:{ all -> 0x014b }
            return r3
        L_0x002d:
            boolean r1 = defpackage.jkr.g()     // Catch:{ all -> 0x014b }
            r4 = 1
            if (r1 != 0) goto L_0x0036
        L_0x0034:
            goto L_0x010c
        L_0x0036:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x0034
            r0 = r16
            java.lang.String r0 = r0.a     // Catch:{ all -> 0x014b }
            android.content.SharedPreferences r1 = r10.a     // Catch:{ all -> 0x014b }
            java.lang.String r5 = "lastDailyReportTaskEndTimestamp"
            r6 = 0
            long r8 = r1.getLong(r5, r6)     // Catch:{ all -> 0x014b }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x014b }
            java.lang.Long r1 = defpackage.jed.b(r11)     // Catch:{ all -> 0x014b }
            long r13 = r1.longValue()     // Catch:{ all -> 0x014b }
            java.lang.Long r1 = defpackage.jed.c(r11)     // Catch:{ all -> 0x014b }
            long r6 = r1.longValue()     // Catch:{ all -> 0x014b }
            java.lang.String r1 = "NetworkReportServiceOneoff"
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x014b }
            if (r1 != 0) goto L_0x00e9
            java.lang.String r1 = "NetworkReportServicePartialReportsForToday"
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x014b }
            if (r1 == 0) goto L_0x00b6
            android.content.SharedPreferences r0 = r10.a     // Catch:{ all -> 0x014b }
            java.lang.String r1 = "lastPartialReportTaskEndTimestamp"
            r2 = 0
            long r0 = r0.getLong(r1, r2)     // Catch:{ all -> 0x014b }
            long r8 = r11 - r0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0092
            agvx r2 = defpackage.jcd.f     // Catch:{ all -> 0x014b }
            java.lang.Object r2 = r2.c()     // Catch:{ all -> 0x014b }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x014b }
            long r2 = r2.longValue()     // Catch:{ all -> 0x014b }
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            r2 = 1
            goto L_0x010a
        L_0x0092:
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0098
            r4 = r6
            goto L_0x0099
        L_0x0098:
            r4 = r0
        L_0x0099:
            jdx r1 = defpackage.jdx.a()     // Catch:{ all -> 0x014b }
            int r3 = android.os.Process.myUid()     // Catch:{ all -> 0x014b }
            r8 = 0
            r9 = 0
            r2 = r15
            r6 = r11
            java.util.concurrent.Future r0 = r1.a(r2, r3, r4, r6, r8, r9)     // Catch:{ all -> 0x014b }
            android.content.SharedPreferences$Editor r1 = r10.b     // Catch:{ all -> 0x014b }
            java.lang.String r2 = "lastPartialReportTaskEndTimestamp"
            r1.putLong(r2, r11)     // Catch:{ all -> 0x014b }
            android.content.SharedPreferences$Editor r1 = r10.b     // Catch:{ all -> 0x014b }
            r1.apply()     // Catch:{ all -> 0x014b }
            goto L_0x0106
        L_0x00b6:
            java.lang.String r1 = "NetworkReportServiceYesterdaysReport"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x00e7
            boolean r0 = a(r8, r6)     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x00e6
            jdx r1 = defpackage.jdx.a()     // Catch:{ all -> 0x014b }
            int r3 = android.os.Process.myUid()     // Catch:{ all -> 0x014b }
            r8 = 1
            r9 = 1
            r2 = r15
            r4 = r13
            java.util.concurrent.Future r0 = r1.a(r2, r3, r4, r6, r8, r9)     // Catch:{ all -> 0x014b }
            int r2 = r15.a((java.util.concurrent.Future) r0)     // Catch:{ all -> 0x014b }
            if (r2 != 0) goto L_0x010a
            android.content.SharedPreferences$Editor r0 = r10.b     // Catch:{ all -> 0x014b }
            java.lang.String r1 = "lastDailyReportTaskEndTimestamp"
            r0.putLong(r1, r11)     // Catch:{ all -> 0x014b }
            android.content.SharedPreferences$Editor r0 = r10.b     // Catch:{ all -> 0x014b }
            r0.apply()     // Catch:{ all -> 0x014b }
        L_0x00e6:
            goto L_0x010a
        L_0x00e7:
            r2 = 2
            goto L_0x010a
        L_0x00e9:
            boolean r0 = a(r8, r6)     // Catch:{ all -> 0x014b }
            if (r0 != 0) goto L_0x00f1
            r4 = r6
            goto L_0x00f2
        L_0x00f1:
            r4 = r13
        L_0x00f2:
            jdx r1 = defpackage.jdx.a()     // Catch:{ all -> 0x014b }
            int r3 = android.os.Process.myUid()     // Catch:{ all -> 0x014b }
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = 0
            r9 = 1
            r2 = r15
            java.util.concurrent.Future r0 = r1.a(r2, r3, r4, r6, r8, r9)     // Catch:{ all -> 0x014b }
        L_0x0106:
            int r2 = r15.a((java.util.concurrent.Future) r0)     // Catch:{ all -> 0x014b }
        L_0x010a:
            monitor-exit(r15)     // Catch:{ all -> 0x014b }
            return r2
        L_0x010c:
            android.content.SharedPreferences r0 = r10.a     // Catch:{ all -> 0x014b }
            java.lang.String r1 = "rescheduleCount"
            int r0 = r0.getInt(r1, r2)     // Catch:{ all -> 0x014b }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x014b }
            java.lang.String r2 = "/proc/net/xt_qtaguid/stats"
            r1.<init>(r2)     // Catch:{ all -> 0x014b }
            boolean r1 = r1.canRead()     // Catch:{ all -> 0x014b }
            if (r1 == 0) goto L_0x0136
            jdx r0 = defpackage.jdx.a()     // Catch:{ all -> 0x014b }
            android.content.ContentResolver r1 = r15.getContentResolver()     // Catch:{ all -> 0x014b }
            int r2 = android.os.Process.myUid()     // Catch:{ all -> 0x014b }
            java.util.concurrent.Future r0 = r0.a(r1, r2)     // Catch:{ all -> 0x014b }
            int r3 = r15.a((java.util.concurrent.Future) r0)     // Catch:{ all -> 0x014b }
            goto L_0x0149
        L_0x0136:
            int r0 = r0 + r4
            android.content.SharedPreferences$Editor r1 = r10.b     // Catch:{ all -> 0x014b }
            java.lang.String r2 = "rescheduleCount"
            r1.putInt(r2, r0)     // Catch:{ all -> 0x014b }
            android.content.SharedPreferences$Editor r1 = r10.b     // Catch:{ all -> 0x014b }
            r1.apply()     // Catch:{ all -> 0x014b }
            r1 = 10
            if (r0 < r1) goto L_0x0148
            goto L_0x0149
        L_0x0148:
            r3 = 1
        L_0x0149:
            monitor-exit(r15)     // Catch:{ all -> 0x014b }
            return r3
        L_0x014b:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x014b }
            goto L_0x014f
        L_0x014e:
            throw r0
        L_0x014f:
            goto L_0x014e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.stats.net.NetworkReportChimeraService.a(qxz):int");
    }
}
