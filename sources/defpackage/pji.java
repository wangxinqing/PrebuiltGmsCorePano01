package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Random;

/* renamed from: pji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pji implements afbt {
    private final Context a;
    private final qwq b;
    private final String c;
    private final String d;
    private final aelh e;
    private final Random f;
    private final aeri g;
    private boolean h = false;

    public pji(Context context, qwq qwq, String str, Random random, aeri aeri, aelh aelh, String str2) {
        this.a = context;
        this.b = qwq;
        this.c = str;
        this.d = str2;
        this.e = aelh;
        this.f = random;
        this.g = aeri;
    }

    private static int a(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? 2 : 1;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final SharedPreferences a() {
        String str = this.c;
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        String sb2 = sb.toString();
        SharedPreferences sharedPreferences = this.a.getSharedPreferences(sb2, 0);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        String valueOf = String.valueOf(sb2);
        throw new NullPointerException(valueOf.length() == 0 ? new String("Failed to get shared prefs for ") : "Failed to get shared prefs for ".concat(valueOf));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r20, long r22, int r24, boolean r25, boolean r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            r5 = r25
            r6 = r26
            aelh r7 = r0.e
            java.lang.Object r7 = r7.a()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = 1
            r9 = 0
            if (r7 != 0) goto L_0x0028
            pia r1 = defpackage.phw.e
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r3 = r0.d
            r2[r9] = r3
            java.lang.String r3 = "%s periodic task disabled"
            r1.d(r3, r2)
            return
        L_0x0028:
            int r7 = a(r24)
            android.content.SharedPreferences r10 = r19.a()
            java.lang.String r11 = "periodic_scheduled"
            boolean r12 = r10.getBoolean(r11, r9)
            java.lang.String r13 = "periodic_idle"
            java.lang.String r14 = "periodic_charging"
            java.lang.String r15 = "periodic_network"
            java.lang.String r8 = "periodic_flex"
            java.lang.String r9 = "periodic_period"
            if (r12 == 0) goto L_0x006d
            r24 = r11
            r11 = 0
            long r16 = r10.getLong(r9, r11)
            int r18 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r18 != 0) goto L_0x006f
            long r11 = r10.getLong(r8, r11)
            int r16 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r16 != 0) goto L_0x006f
            r11 = 0
            int r12 = r10.getInt(r15, r11)
            if (r12 != r7) goto L_0x006f
            boolean r12 = r10.getBoolean(r14, r11)
            if (r12 != r5) goto L_0x006f
            boolean r10 = r10.getBoolean(r13, r11)
            if (r10 == r6) goto L_0x006b
            r10 = 0
            goto L_0x0070
        L_0x006b:
            r10 = 1
            goto L_0x0070
        L_0x006d:
            r24 = r11
        L_0x006f:
            r10 = 0
        L_0x0070:
            r11 = 1
            r10 = r10 ^ r11
            if (r10 != 0) goto L_0x00d5
            boolean r11 = r0.h
            if (r11 == 0) goto L_0x007a
            r4 = 0
            goto L_0x00b6
        L_0x007a:
            aelh r11 = defpackage.pba.X
            java.lang.Object r11 = r11.a()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00d5
            agvx r11 = defpackage.ozz.B
            java.lang.Object r11 = r11.c()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 <= 0) goto L_0x00a1
            java.util.Random r12 = r0.f
            int r11 = r12.nextInt(r11)
            if (r11 != 0) goto L_0x009f
            goto L_0x00d5
        L_0x009f:
            r4 = 0
            goto L_0x00b6
        L_0x00a1:
            if (r11 >= 0) goto L_0x00b5
            pia r1 = defpackage.phw.e
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "Invalid sampling interval: %d"
            r1.e(r2, r3)
            goto L_0x00b6
        L_0x00b5:
            r4 = 0
        L_0x00b6:
            pia r1 = defpackage.phw.e
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r0.d
            r2[r4] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            r4 = 1
            r2[r4] = r3
            boolean r3 = r0.h
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4 = 2
            r2[r4] = r3
            java.lang.String r3 = "%s schedule skipped: updateCurrent=%b, hasScheduledPeriodic=%b"
            r1.a(r3, r2)
            return
        L_0x00d5:
            if (r10 == 0) goto L_0x010f
            aelh r11 = defpackage.pba.ab
            java.lang.Object r11 = r11.a()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L_0x00fa
            android.content.SharedPreferences r11 = r19.a()
            android.content.SharedPreferences$Editor r11 = r11.edit()
            r12 = r24
            r24 = r13
            r13 = 0
            android.content.SharedPreferences$Editor r11 = r11.putBoolean(r12, r13)
            r11.apply()
            goto L_0x0113
        L_0x00fa:
            r12 = r24
            r24 = r13
            r13 = 0
            android.content.SharedPreferences r11 = r19.a()
            android.content.SharedPreferences$Editor r11 = r11.edit()
            android.content.SharedPreferences$Editor r11 = r11.putBoolean(r12, r13)
            r11.commit()
            goto L_0x0113
        L_0x010f:
            r12 = r24
            r24 = r13
        L_0x0113:
            aelh r11 = defpackage.pba.e
            java.lang.Object r11 = r11.a()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L_0x0158
            qxi r11 = new qxi
            r11.<init>()
            java.lang.String r13 = r0.d
            r11.k = r13
            r13 = 1
            r11.n = r13
            java.lang.String r13 = r0.c
            r11.i = r13
            r11.a((int) r7)
            r11.a(r5, r5)
            r11.a((boolean) r6)
            r11.b((boolean) r10)
            boolean r13 = defpackage.axcc.e()
            if (r13 != 0) goto L_0x0148
            r11.a = r1
            r11.b = r3
            goto L_0x014f
        L_0x0148:
            qxe r13 = defpackage.qxe.a(r20)
            r11.a(r13)
        L_0x014f:
            qwq r13 = r0.b
            qxj r11 = r11.b()
            r13.a((defpackage.qxx) r11)
        L_0x0158:
            r11 = 1
            r0.h = r11
            if (r10 == 0) goto L_0x0194
            android.content.SharedPreferences r13 = r19.a()
            android.content.SharedPreferences$Editor r13 = r13.edit()
            android.content.SharedPreferences$Editor r12 = r13.putBoolean(r12, r11)
            android.content.SharedPreferences$Editor r9 = r12.putLong(r9, r1)
            android.content.SharedPreferences$Editor r8 = r9.putLong(r8, r3)
            android.content.SharedPreferences$Editor r7 = r8.putInt(r15, r7)
            android.content.SharedPreferences$Editor r5 = r7.putBoolean(r14, r5)
            r7 = r24
            android.content.SharedPreferences$Editor r5 = r5.putBoolean(r7, r6)
            aelh r6 = defpackage.pba.ae
            java.lang.Object r6 = r6.a()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0191
            r5.apply()
            goto L_0x0194
        L_0x0191:
            r5.commit()
        L_0x0194:
            pia r5 = defpackage.phw.e
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = r0.d
            r8 = 0
            r6[r8] = r7
            java.lang.Long r1 = java.lang.Long.valueOf(r20)
            r2 = 1
            r6[r2] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r22)
            r2 = 2
            r6[r2] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            r2 = 3
            r6[r2] = r1
            java.lang.String r1 = "%s periodic scheduled, period=%d, flex=%d, update=%b"
            r5.a(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pji.a(long, long, int, boolean, boolean):void");
    }

    public final void a(boolean z, int i, boolean z2, Bundle bundle) {
        if (!((Boolean) this.e.a()).booleanValue()) {
            phw.e.d("task %s scheduling disabled", this.d);
            return;
        }
        qwq qwq = this.b;
        qxf qxf = new qxf();
        qxf.a(0, Math.max(1, ((Long) ozz.E.c()).longValue()));
        qxf.k = this.d;
        qxf.n = true;
        qxf.i = this.c;
        qxf.a(a(i));
        qxf.a(z2 ? 1 : 0, z2);
        qxf.a(false);
        qxf.b(z);
        qxf.s = bundle;
        qwq.a((qxx) qxf.b());
    }

    public final void a(boolean z, long j, long j2, int i, boolean z2, boolean z3, Bundle bundle) {
        if (!((Boolean) this.e.a()).booleanValue()) {
            phw.e.d("task %s scheduling disabled", this.d);
            return;
        }
        qwq qwq = this.b;
        qxf qxf = new qxf();
        qxf.a(j, j2);
        qxf.k = this.d;
        qxf.n = true;
        qxf.i = this.c;
        qxf.a(a(i));
        qxf.a(z2 ? 1 : 0, z2);
        qxf.a(z3);
        qxf.b(z);
        qxf.s = bundle;
        qwq.a((qxx) qxf.b());
    }
}
