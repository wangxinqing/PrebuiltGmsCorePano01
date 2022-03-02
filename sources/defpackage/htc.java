package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: htc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class htc implements hoj {
    static Boolean a = null;
    static Long b = null;
    private static final Charset c = Charset.forName("UTF-8");
    private static final agvw d = new agvw(yef.a("com.google.android.gms.clearcut.public")).a("gms:playlog:service:samplingrules_").b("LogSamplingRules__");
    private static final ConcurrentHashMap f = new ConcurrentHashMap();
    private final Context e;

    public htc(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        if (applicationContext != null) {
            agvx.b(applicationContext);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0118 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x004e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            if (r18 == 0) goto L_0x000d
            boolean r1 = r18.isEmpty()
            if (r1 != 0) goto L_0x000d
            r1 = r18
            goto L_0x0015
        L_0x000d:
            if (r19 < 0) goto L_0x0014
            java.lang.String r1 = java.lang.String.valueOf(r19)
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r2 = 1
            if (r1 == 0) goto L_0x011a
            android.content.Context r3 = r0.e
            if (r3 == 0) goto L_0x0046
            java.util.concurrent.ConcurrentHashMap r3 = f
            java.lang.Object r3 = r3.get(r1)
            agvx r3 = (defpackage.agvx) r3
            if (r3 != 0) goto L_0x003c
            agvw r3 = d
            avsr r4 = defpackage.avsr.b
            agvv r5 = defpackage.htb.a
            agvx r3 = defpackage.agvx.a(r3, r1, r4, r5)
            java.util.concurrent.ConcurrentHashMap r4 = f
            java.lang.Object r1 = r4.putIfAbsent(r1, r3)
            agvx r1 = (defpackage.agvx) r1
            if (r1 == 0) goto L_0x003c
            r3 = r1
            goto L_0x003d
        L_0x003c:
        L_0x003d:
            java.lang.Object r1 = r3.c()
            avsr r1 = (defpackage.avsr) r1
            aucx r1 = r1.a
            goto L_0x004a
        L_0x0046:
            java.util.List r1 = java.util.Collections.emptyList()
        L_0x004a:
            java.util.Iterator r1 = r1.iterator()
        L_0x004e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0119
            java.lang.Object r3 = r1.next()
            avsq r3 = (defpackage.avsq) r3
            int r4 = r3.a
            r4 = r4 & r2
            if (r4 != 0) goto L_0x0062
            r5 = r20
            goto L_0x006d
        L_0x0062:
            int r4 = r3.b
            if (r4 == 0) goto L_0x006b
            r5 = r20
            if (r4 != r5) goto L_0x004e
            goto L_0x006d
        L_0x006b:
            r5 = r20
        L_0x006d:
            java.lang.String r4 = r3.c
            android.content.Context r6 = r0.e
            java.lang.Long r7 = b
            r8 = 0
            r9 = 0
            if (r7 == 0) goto L_0x0079
            goto L_0x00b4
        L_0x0079:
            if (r6 == 0) goto L_0x00bb
            java.lang.Boolean r7 = a
            if (r7 != 0) goto L_0x0094
            jnh r7 = defpackage.jni.b(r6)
            java.lang.String r11 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            int r7 = r7.a((java.lang.String) r11)
            if (r7 != 0) goto L_0x008d
            r7 = 1
            goto L_0x008e
        L_0x008d:
            r7 = 0
        L_0x008e:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            a = r7
        L_0x0094:
            java.lang.Boolean r7 = a
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x00ad
            android.content.ContentResolver r6 = r6.getContentResolver()
            java.lang.String r7 = "android_id"
            long r6 = defpackage.aeeg.a((android.content.ContentResolver) r6, (java.lang.String) r7, (long) r9)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            b = r6
            goto L_0x00b4
        L_0x00ad:
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            b = r6
        L_0x00b4:
            java.lang.Long r6 = b
            long r6 = r6.longValue()
            goto L_0x00bc
        L_0x00bb:
            r6 = r9
        L_0x00bc:
            r11 = 8
            if (r4 != 0) goto L_0x00c1
            goto L_0x00e2
        L_0x00c1:
            boolean r12 = r4.isEmpty()
            if (r12 != 0) goto L_0x00e2
            java.nio.charset.Charset r12 = c
            byte[] r4 = r4.getBytes(r12)
            int r12 = r4.length
            int r12 = r12 + r11
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r12)
            r11.put(r4)
            r11.putLong(r6)
            byte[] r4 = r11.array()
            long r6 = defpackage.hso.a((byte[]) r4)
            goto L_0x00f3
        L_0x00e2:
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r11)
            java.nio.ByteBuffer r4 = r4.putLong(r6)
            byte[] r4 = r4.array()
            long r6 = defpackage.hso.a((byte[]) r4)
        L_0x00f3:
            long r11 = r3.d
            long r3 = r3.e
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 < 0) goto L_0x004e
            int r13 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r13 <= 0) goto L_0x004e
            int r13 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x0112
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r13 = r9 % r3
            r15 = 1
            long r13 = r13 + r15
            long r6 = r6 & r9
            long r6 = r6 % r3
            long r13 = r13 + r6
            long r13 = r13 % r3
            goto L_0x0114
        L_0x0112:
            long r13 = r6 % r3
        L_0x0114:
            int r3 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r3 < 0) goto L_0x004e
            return r8
        L_0x0119:
            return r2
        L_0x011a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.htc.a(java.lang.String, int, int):boolean");
    }
}
