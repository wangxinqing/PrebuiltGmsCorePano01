package defpackage;

import android.content.IntentFilter;

/* renamed from: tj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tj extends ti {
    final /* synthetic */ tn a;
    private final ub c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tj(tn tnVar, ub ubVar) {
        super(tnVar);
        this.a = tnVar;
        this.c = ubVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f3 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a() {
        /*
            r22 = this;
            r0 = r22
            ub r1 = r0.c
            ua r2 = r1.c
            long r3 = r2.b
            long r5 = java.lang.System.currentTimeMillis()
            r7 = 1
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x00ec
            android.content.Context r3 = r1.b
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
            int r3 = defpackage.kr.a(r3, r4)
            r4 = 0
            if (r3 != 0) goto L_0x0023
            java.lang.String r3 = "network"
            android.location.Location r3 = r1.a(r3)
            goto L_0x0024
        L_0x0023:
            r3 = r4
        L_0x0024:
            android.content.Context r5 = r1.b
            java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
            int r5 = defpackage.kr.a(r5, r6)
            if (r5 != 0) goto L_0x0035
            java.lang.String r4 = "gps"
            android.location.Location r4 = r1.a(r4)
            goto L_0x0036
        L_0x0035:
        L_0x0036:
            if (r4 == 0) goto L_0x0047
            if (r3 == 0) goto L_0x0047
            long r5 = r4.getTime()
            long r8 = r3.getTime()
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x0049
            goto L_0x004b
        L_0x0047:
            if (r4 == 0) goto L_0x004b
        L_0x0049:
            r3 = r4
        L_0x004b:
            if (r3 != 0) goto L_0x0067
            java.lang.String r1 = "TwilightManager"
            java.lang.String r2 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
            android.util.Log.i(r1, r2)
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r2 = 11
            int r1 = r1.get(r2)
            r2 = 6
            if (r1 < r2) goto L_0x00f1
            r2 = 22
            if (r1 < r2) goto L_0x00f3
            goto L_0x00f1
        L_0x0067:
            ua r1 = r1.c
            long r4 = java.lang.System.currentTimeMillis()
            tz r6 = defpackage.tz.a
            if (r6 != 0) goto L_0x0078
            tz r6 = new tz
            r6.<init>()
            defpackage.tz.a = r6
        L_0x0078:
            tz r6 = defpackage.tz.a
            r8 = -86400000(0xfffffffffad9a400, double:NaN)
            long r10 = r4 + r8
            double r12 = r3.getLatitude()
            double r14 = r3.getLongitude()
            r8 = r6
            r9 = r10
            r11 = r12
            r13 = r14
            r8.a(r9, r11, r13)
            long r8 = r6.b
            double r11 = r3.getLatitude()
            double r13 = r3.getLongitude()
            r8 = r6
            r9 = r4
            r8.a(r9, r11, r13)
            int r15 = r6.d
            long r13 = r6.c
            long r11 = r6.b
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            long r16 = r4 + r8
            double r18 = r3.getLatitude()
            double r20 = r3.getLongitude()
            r8 = r6
            r9 = r16
            r16 = r11
            r11 = r18
            r18 = r13
            r13 = r20
            r8.a(r9, r11, r13)
            long r13 = r6.c
            r8 = -1
            int r3 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x00c7
        L_0x00c6:
            goto L_0x00dd
        L_0x00c7:
            int r3 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x00c6
            int r3 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r3 > 0) goto L_0x00d8
            int r3 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r3 <= 0) goto L_0x00d6
            r13 = r16
            goto L_0x00d8
        L_0x00d6:
            r13 = r18
        L_0x00d8:
            r3 = 60000(0xea60, double:2.9644E-319)
            long r13 = r13 + r3
            goto L_0x00e2
        L_0x00dd:
            r8 = 43200000(0x2932e00, double:2.1343636E-316)
            long r13 = r4 + r8
        L_0x00e2:
            if (r15 != 0) goto L_0x00e6
            r3 = 0
            goto L_0x00e7
        L_0x00e6:
            r3 = 1
        L_0x00e7:
            r1.a = r3
            r1.b = r13
            goto L_0x00ed
        L_0x00ec:
        L_0x00ed:
            boolean r1 = r2.a
            if (r1 == 0) goto L_0x00f3
        L_0x00f1:
            r1 = 2
            return r1
        L_0x00f3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj.a():int");
    }

    public final void b() {
        this.a.j();
    }

    public final IntentFilter c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }
}
