package com.google.android.gms.common.analytics;

import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CoreAnalyticsIntentOperation extends IntentOperation {
    /* access modifiers changed from: protected */
    public final SharedPreferences a() {
        return getSharedPreferences("coreanalyticsprefs", 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r19) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "event_code"
            r2 = 0
            int r1 = r0.getIntExtra(r1, r2)
            r3 = 12
            r4 = 10
            r5 = 9
            r8 = 1
            r9 = 8
            switch(r1) {
                case 0: goto L_0x0058;
                case 1: goto L_0x0056;
                case 2: goto L_0x0054;
                case 3: goto L_0x0052;
                case 4: goto L_0x0050;
                case 5: goto L_0x004e;
                case 6: goto L_0x004c;
                case 7: goto L_0x0049;
                case 8: goto L_0x0046;
                case 9: goto L_0x0043;
                case 10: goto L_0x0040;
                case 11: goto L_0x003d;
                case 12: goto L_0x003a;
                case 13: goto L_0x0037;
                case 14: goto L_0x0034;
                case 15: goto L_0x0031;
                case 16: goto L_0x002e;
                case 17: goto L_0x002b;
                case 18: goto L_0x0028;
                case 19: goto L_0x0025;
                case 20: goto L_0x0022;
                case 21: goto L_0x001f;
                case 22: goto L_0x001c;
                case 23: goto L_0x0019;
                case 24: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0059
        L_0x0016:
            r2 = 25
            goto L_0x0059
        L_0x0019:
            r2 = 24
            goto L_0x0059
        L_0x001c:
            r2 = 23
            goto L_0x0059
        L_0x001f:
            r2 = 22
            goto L_0x0059
        L_0x0022:
            r2 = 21
            goto L_0x0059
        L_0x0025:
            r2 = 20
            goto L_0x0059
        L_0x0028:
            r2 = 19
            goto L_0x0059
        L_0x002b:
            r2 = 18
            goto L_0x0059
        L_0x002e:
            r2 = 17
            goto L_0x0059
        L_0x0031:
            r2 = 16
            goto L_0x0059
        L_0x0034:
            r2 = 15
            goto L_0x0059
        L_0x0037:
            r2 = 14
            goto L_0x0059
        L_0x003a:
            r2 = 13
            goto L_0x0059
        L_0x003d:
            r2 = 12
            goto L_0x0059
        L_0x0040:
            r2 = 11
            goto L_0x0059
        L_0x0043:
            r2 = 10
            goto L_0x0059
        L_0x0046:
            r2 = 9
            goto L_0x0059
        L_0x0049:
            r2 = 8
            goto L_0x0059
        L_0x004c:
            r2 = 7
            goto L_0x0059
        L_0x004e:
            r2 = 6
            goto L_0x0059
        L_0x0050:
            r2 = 5
            goto L_0x0059
        L_0x0052:
            r2 = 4
            goto L_0x0059
        L_0x0054:
            r2 = 3
            goto L_0x0059
        L_0x0056:
            r2 = 2
            goto L_0x0059
        L_0x0058:
            r2 = 1
        L_0x0059:
            if (r2 == 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r2 = 1
        L_0x005d:
            int r1 = r2 + -1
            defpackage.iao.a()
            ihs r10 = defpackage.ihs.b()
            java.lang.String r11 = "last_periodic_run"
            r12 = -1
            r13 = 0
            switch(r1) {
                case 7: goto L_0x011a;
                case 8: goto L_0x011a;
                case 9: goto L_0x008a;
                case 10: goto L_0x008a;
                case 11: goto L_0x008a;
                case 12: goto L_0x008a;
                default: goto L_0x006e;
            }
        L_0x006e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 30
            r0.<init>(r3)
            java.lang.String r3 = "Unknown eventCode: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CoreAnalyticsIntentSrv"
            android.util.Log.w(r1, r0)
            r7 = r2
            r1 = r13
            goto L_0x0143
        L_0x008a:
            java.lang.String r15 = "post_install_checkin_stage"
            int r0 = r0.getIntExtra(r15, r12)
            aoip r12 = defpackage.acvc.a(r10)
            defpackage.iao.a(r10, r2, r0, r12)
            if (r2 != r4) goto L_0x00c8
            android.content.SharedPreferences r4 = r18.a()
            long r6 = java.lang.System.currentTimeMillis()
            long r11 = r4.getLong(r11, r6)
            ikz r4 = defpackage.ikq.e
            java.lang.Object r4 = r4.c()
            java.lang.Long r4 = (java.lang.Long) r4
            long r16 = r4.longValue()
            long r6 = r6 - r11
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c0
            int r4 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c0
            long r16 = r16 - r6
            r6 = r16
            goto L_0x00c2
        L_0x00c0:
            r6 = r16
        L_0x00c2:
            defpackage.iap.a()
            defpackage.iap.a(r10, r9, r6)
        L_0x00c8:
            int r12 = r0 + 1
            if (r1 == r5) goto L_0x00e9
            r0 = 11
            if (r1 == r0) goto L_0x00de
            if (r1 == r3) goto L_0x00d3
            goto L_0x00fa
        L_0x00d3:
            awyh r1 = defpackage.awyh.a
            awyi r1 = r1.a()
            boolean r1 = r1.a()
            goto L_0x00f5
        L_0x00de:
            awyh r1 = defpackage.awyh.a
            awyi r1 = r1.a()
            boolean r1 = r1.c()
            goto L_0x00f5
        L_0x00e9:
            r0 = 11
            awyh r1 = defpackage.awyh.a
            awyi r1 = r1.a()
            boolean r1 = r1.b()
        L_0x00f5:
            if (r1 != 0) goto L_0x00fa
            r7 = r2
            r1 = r13
            goto L_0x0143
        L_0x00fa:
            if (r12 >= 0) goto L_0x00ff
            r7 = r2
            r1 = r13
            goto L_0x0143
        L_0x00ff:
            r1 = 4
            if (r12 > r1) goto L_0x0117
            ikz r1 = defpackage.ikq.c
            java.lang.Object r1 = r1.c()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            float r1 = (float) r1
            float r1 = java.lang.Math.scalb(r1, r12)
            long r1 = (long) r1
            r7 = 11
            goto L_0x0143
        L_0x0117:
            r7 = r2
            r1 = r13
            goto L_0x0143
        L_0x011a:
            aoip r0 = defpackage.acvc.a(r10)
            defpackage.iao.a((android.content.Context) r10, (int) r2, (defpackage.aoip) r0)
            if (r2 != r9) goto L_0x0135
            android.content.SharedPreferences r0 = r18.a()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            long r1 = java.lang.System.currentTimeMillis()
            r0.putLong(r11, r1)
            r0.apply()
        L_0x0135:
            ikz r0 = defpackage.ikq.e
            java.lang.Object r0 = r0.c()
            java.lang.Long r0 = (java.lang.Long) r0
            long r1 = r0.longValue()
            r7 = 8
        L_0x0143:
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x014d
            defpackage.iap.a()
            defpackage.iap.a(r10, r7, r12, r1)
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.analytics.CoreAnalyticsIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
