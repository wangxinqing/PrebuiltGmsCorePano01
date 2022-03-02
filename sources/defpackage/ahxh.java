package defpackage;

import java.util.Calendar;

/* renamed from: ahxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahxh implements Runnable {
    final /* synthetic */ Calendar a;
    final /* synthetic */ aqek b;
    final /* synthetic */ ahxi c;

    public ahxh(ahxi ahxi, Calendar calendar, aqek aqek) {
        this.c = ahxi;
        this.a = calendar;
        this.b = aqek;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: ahxj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: ahxj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: ahxj} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x088f  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x08f5  */
    /* JADX WARNING: Removed duplicated region for block: B:455:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r29 = this;
            r1 = r29
            ahxi r10 = r1.c
            java.util.Calendar r11 = r1.a
            aqek r0 = r1.b
            r12 = 4
            int r2 = r0.j(r12)
            if (r2 == 0) goto L_0x0993
            r13 = 0
            aqek r0 = r0.f(r12, r13)
            r2 = 9
            boolean r3 = r0.i(r2)
            if (r3 == 0) goto L_0x0993
            aqek r0 = r0.e(r2)
            r2 = 10
            java.util.List r2 = defpackage.ajqx.a((defpackage.aqek) r0, (int) r2)
            java.util.List r3 = defpackage.ajqx.a((defpackage.aqek) r0, (int) r12)
            r14 = 0
            r16 = -1
            r9 = 5
            r8 = 3
            r7 = 2
            r6 = 1
            if (r2 != 0) goto L_0x0043
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)
            java.lang.Double r5 = java.lang.Double.valueOf(r14)
            aiba r2 = defpackage.aiba.a(r2, r5)
            r12 = r2
            goto L_0x022b
        L_0x0043:
            ahxd r5 = new ahxd
            int r14 = r2.size()
            if (r14 <= r8) goto L_0x0069
            r12 = 0
            r15 = 0
        L_0x004d:
            if (r15 < r14) goto L_0x0057
            float r12 = (float) r12
            int r14 = r14 + -3
            float r14 = (float) r14
            float r12 = r12 / r14
            r18 = r12
            goto L_0x006b
        L_0x0057:
            if (r15 < r8) goto L_0x0066
            java.lang.Object r17 = r2.get(r15)
            r4 = r17
            aqek r4 = (defpackage.aqek) r4
            int r4 = r4.j(r7)
            int r12 = r12 + r4
        L_0x0066:
            int r15 = r15 + 1
            goto L_0x004d
        L_0x0069:
            r18 = 0
        L_0x006b:
            float r19 = defpackage.ahxe.a(r2, r6)
            int r4 = r2.size()
            r14 = 2
            if (r4 < r9) goto L_0x00b4
            int r12 = r4 + -1
            java.lang.Object r12 = r2.get(r12)
            aqek r12 = (defpackage.aqek) r12
            int r12 = r12.b((int) r6)
            long r7 = (long) r12
            long r7 = r7 / r14
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x008b:
            if (r13 >= r4) goto L_0x00ac
            java.lang.Object r20 = r2.get(r13)
            r14 = r20
            aqek r14 = (defpackage.aqek) r14
            int r14 = r14.b((int) r6)
            long r14 = (long) r14
            int r20 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r20 > 0) goto L_0x00ac
            java.lang.Object r14 = r2.get(r13)
            aqek r14 = (defpackage.aqek) r14
            r12.add(r14)
            int r13 = r13 + 1
            r14 = 2
            goto L_0x008b
        L_0x00ac:
            float r4 = defpackage.ahxe.a(r12, r6)
            r20 = r4
            goto L_0x00b6
        L_0x00b4:
            r20 = 1135869952(0x43b40000, float:360.0)
        L_0x00b6:
            int r4 = r2.size()
            if (r4 < r9) goto L_0x00f9
            int r4 = r4 + -1
            java.lang.Object r7 = r2.get(r4)
            aqek r7 = (defpackage.aqek) r7
            int r7 = r7.b((int) r6)
            long r7 = (long) r7
            r12 = 2
            long r7 = r7 / r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x00d1:
            if (r4 < 0) goto L_0x00ee
            java.lang.Object r13 = r2.get(r4)
            aqek r13 = (defpackage.aqek) r13
            int r13 = r13.b((int) r6)
            long r13 = (long) r13
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 <= 0) goto L_0x00ee
            java.lang.Object r13 = r2.get(r4)
            aqek r13 = (defpackage.aqek) r13
            r12.add(r13)
            int r4 = r4 + -1
            goto L_0x00d1
        L_0x00ee:
            java.util.Collections.reverse(r12)
            r4 = 0
            float r7 = defpackage.ahxe.a(r12, r4)
            r21 = r7
            goto L_0x00fb
        L_0x00f9:
            r21 = 1135869952(0x43b40000, float:360.0)
        L_0x00fb:
            int r4 = r2.size()
            r8 = 3
            if (r4 <= r8) goto L_0x014e
            r8 = 0
            r12 = 0
            r13 = 0
        L_0x0105:
            if (r8 < r4) goto L_0x0115
            r4 = 0
            int r8 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0111
            float r13 = r13 / r12
            r22 = r13
            r6 = 0
            goto L_0x0151
        L_0x0111:
            r6 = 0
            r22 = 0
            goto L_0x0151
        L_0x0115:
            r14 = 3
            if (r8 < r14) goto L_0x0148
            java.lang.Object r14 = r2.get(r8)
            aqek r14 = (defpackage.aqek) r14
            r9 = 0
            r15 = 0
        L_0x0120:
            r6 = 2
            int r7 = r14.j(r6)
            if (r9 >= r7) goto L_0x013e
            aqek r7 = r14.f(r6, r9)
            float r7 = r7.d(r6)
            r6 = 1099956224(0x41900000, float:18.0)
            int r22 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r22 <= 0) goto L_0x013a
            r6 = -1047527424(0xffffffffc1900000, float:-18.0)
            float r7 = r7 + r6
            float r15 = r15 + r7
        L_0x013a:
            int r9 = r9 + 1
            r6 = 1
            goto L_0x0120
        L_0x013e:
            r6 = 0
            int r7 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x0149
            float r13 = r13 + r15
            r7 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 + r7
            goto L_0x0149
        L_0x0148:
            r6 = 0
        L_0x0149:
            int r8 = r8 + 1
            r6 = 1
            r9 = 5
            goto L_0x0105
        L_0x014e:
            r6 = 0
            r22 = 0
        L_0x0151:
            int r4 = r2.size()
            r7 = 3
            if (r4 <= r7) goto L_0x01a0
            r8 = 0
            r9 = 0
            r12 = 0
        L_0x015b:
            if (r9 < r4) goto L_0x0162
            float r2 = (float) r12
            float r8 = r8 / r2
            r23 = r8
            goto L_0x01a2
        L_0x0162:
            if (r9 < r7) goto L_0x0199
            java.lang.Object r7 = r2.get(r9)
            aqek r7 = (defpackage.aqek) r7
            r13 = 0
            r14 = 0
        L_0x016c:
            r15 = 2
            int r6 = r7.j(r15)
            if (r14 >= r6) goto L_0x0193
            aqek r6 = r7.f(r15, r14)
            r15 = 3
            float r23 = r6.d(r15)
            r15 = 2
            float r6 = r6.d(r15)
            r15 = 1099956224(0x41900000, float:18.0)
            int r6 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r6 > 0) goto L_0x0189
        L_0x0188:
            goto L_0x018f
        L_0x0189:
            int r6 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x0188
            r13 = r23
        L_0x018f:
            int r14 = r14 + 1
            r6 = 0
            goto L_0x016c
        L_0x0193:
            r15 = 1099956224(0x41900000, float:18.0)
            float r8 = r8 + r13
            int r12 = r12 + 1
            goto L_0x019b
        L_0x0199:
            r15 = 1099956224(0x41900000, float:18.0)
        L_0x019b:
            int r9 = r9 + 1
            r6 = 0
            r7 = 3
            goto L_0x015b
        L_0x01a0:
            r23 = 0
        L_0x01a2:
            r17 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r6 = 4613303445314885481(0x4005bf0a8b145769, double:2.718281828459045)
            float r2 = r5.a
            double r8 = (double) r2
            r12 = -4629437406718631451(0xbfc0ef34d6a161e5, double:-0.1323)
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r12
            r12 = 4604544210138303771(0x3fe6a0902de00d1b, double:0.7071)
            double r8 = r8 + r12
            float r2 = r5.b
            double r12 = (double) r2
            r14 = -4640336117816868051(0xbf9a36e2eb1c432d, double:-0.0256)
            java.lang.Double.isNaN(r12)
            double r12 = r12 * r14
            double r8 = r8 + r12
            float r2 = r5.c
            double r12 = (double) r2
            r14 = -4659734022131878252(0xbf554c985f06f694, double:-0.0013)
            java.lang.Double.isNaN(r12)
            double r12 = r12 * r14
            double r8 = r8 + r12
            float r2 = r5.d
            double r12 = (double) r2
            r14 = 4585190441099641802(0x3fa1de69ad42c3ca, double:0.0349)
            java.lang.Double.isNaN(r12)
            double r12 = r12 * r14
            double r8 = r8 + r12
            float r2 = r5.e
            double r12 = (double) r2
            r14 = -4632171992412370816(0xbfb7381d7dbf4880, double:-0.0907)
            java.lang.Double.isNaN(r12)
            double r12 = r12 * r14
            double r8 = r8 + r12
            float r2 = r5.f
            double r4 = (double) r2
            r12 = -4647030268302991557(0xbf826e978d4fdf3b, double:-0.009)
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r12
            double r8 = r8 + r4
            double r4 = -r8
            double r4 = java.lang.Math.pow(r6, r4)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 + r6
            double r4 = r6 / r4
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x0217
            r2 = 1
            goto L_0x0218
        L_0x0217:
            r2 = 0
        L_0x0218:
            if (r2 != 0) goto L_0x021d
            double r4 = r6 - r4
            goto L_0x021e
        L_0x021d:
        L_0x021e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            aiba r2 = defpackage.aiba.a(r2, r4)
            r12 = r2
        L_0x022b:
            double[][] r2 = defpackage.ahww.a((java.util.List) r3)
            if (r2 != 0) goto L_0x0247
            java.util.Locale r2 = java.util.Locale.ENGLISH
            r4 = 1
            java.lang.Object[] r2 = new java.lang.Object[r4]
            if (r3 == 0) goto L_0x023d
            int r3 = r3.size()
            goto L_0x023e
        L_0x023d:
            r3 = 0
        L_0x023e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            r14 = 0
            goto L_0x028f
        L_0x0247:
            r4 = 0
            java.util.Locale r3 = java.util.Locale.ENGLISH
            r5 = 3
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r5 = 1
            r6 = r2[r5]
            r7 = r6[r4]
            java.lang.Double r6 = java.lang.Double.valueOf(r7)
            r3[r4] = r6
            r6 = r2[r5]
            r7 = r6[r5]
            java.lang.Double r6 = java.lang.Double.valueOf(r7)
            r3[r5] = r6
            r6 = r2[r5]
            r7 = 2
            r8 = r6[r7]
            java.lang.Double r6 = java.lang.Double.valueOf(r8)
            r3[r7] = r6
            r2 = r2[r5]
            r6 = r2[r4]
            r3 = 4545531382493047025(0x3f14f8b588e368f1, double:8.0E-5)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x0289
            r6 = r2[r5]
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0289
            r5 = 2
            r6 = r2[r5]
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0289
            r2 = 1
            goto L_0x028a
        L_0x0289:
            r2 = 0
        L_0x028a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r14 = r2
        L_0x028f:
            if (r0 == 0) goto L_0x02e4
            r2 = 8
            boolean r3 = r0.i(r2)
            if (r3 == 0) goto L_0x02e4
            r3 = 0
            r4 = 0
            r5 = 0
            r27 = 0
        L_0x029e:
            int r6 = r0.j(r2)
            if (r3 >= r6) goto L_0x02d1
            aqek r6 = r0.f(r2, r3)
            boolean r7 = r6.i(r2)
            if (r7 != 0) goto L_0x02b0
            goto L_0x02ce
        L_0x02b0:
            int r7 = r6.b((int) r2)
            if (r7 == 0) goto L_0x02b7
            goto L_0x02ce
        L_0x02b7:
            r7 = 16
            boolean r8 = r6.i(r7)
            if (r8 == 0) goto L_0x02cd
            int r5 = r5 + 1
            float r6 = r6.d(r7)
            int r7 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x02cd
            r27 = r4
            r4 = r6
            goto L_0x02ce
        L_0x02cd:
        L_0x02ce:
            int r3 = r3 + 1
            goto L_0x029e
        L_0x02d1:
            r2 = 2
            if (r5 < r2) goto L_0x02e4
            float r4 = r4 + r27
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r4 = r4 * r0
            int r0 = (int) r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r15 = r0
            goto L_0x02e5
        L_0x02e4:
            r15 = 0
        L_0x02e5:
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r2 = 4
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Object r2 = r12.a
            r3 = 0
            r0[r3] = r2
            java.lang.Object r2 = r12.b
            r6 = 1
            r0[r6] = r2
            r7 = 2
            r0[r7] = r14
            r8 = 3
            r0[r8] = r15
            aibh r9 = new aibh
            r3 = 1
            aizz r0 = r10.b
            javax.crypto.SecretKey r4 = r0.a()
            r5 = 2
            aizz r0 = r10.b
            byte[] r0 = r0.b()
            aqem r17 = defpackage.ajck.bX
            ajaa r2 = r10.c
            java.io.File r18 = r2.e()
            r2 = r9
            r13 = 1
            r6 = r0
            r7 = r17
            r8 = r18
            r17 = r9
            r9 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            aqek r0 = r17.a()     // Catch:{ IOException -> 0x033d }
            r2 = r17
            int r3 = r2.b     // Catch:{ IOException -> 0x033b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x033b }
            r5 = 32
            r4.<init>(r5)     // Catch:{ IOException -> 0x033b }
            java.lang.String r5 = "Actual file version: "
            r4.append(r5)     // Catch:{ IOException -> 0x033b }
            r4.append(r3)     // Catch:{ IOException -> 0x033b }
            r4.toString()     // Catch:{ IOException -> 0x033b }
            r3 = r0
            goto L_0x0348
        L_0x033b:
            r0 = move-exception
            goto L_0x0340
        L_0x033d:
            r0 = move-exception
            r2 = r17
        L_0x0340:
            aqek r0 = new aqek
            aqem r3 = defpackage.ajck.bX
            r0.<init>(r3)
            r3 = r0
        L_0x0348:
            java.util.TimeZone r0 = r11.getTimeZone()
            java.lang.String r0 = r0.getID()
            if (r0 == 0) goto L_0x03b0
            boolean r4 = r3.i(r13)
            if (r4 == 0) goto L_0x038e
            r4 = 0
            r5 = 0
        L_0x035a:
            int r6 = r3.j(r13)
            if (r4 >= r6) goto L_0x038c
            aqek r6 = r3.f(r13, r4)
            boolean r7 = r6.i(r13)
            if (r7 != 0) goto L_0x036d
            r7 = 2
            goto L_0x0389
        L_0x036d:
            r7 = 2
            boolean r8 = r6.i(r7)
            if (r8 == 0) goto L_0x0389
            int r8 = r6.b((int) r7)
            java.lang.String r6 = r6.f(r13)
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 != 0) goto L_0x0387
            int r5 = java.lang.Math.max(r5, r8)
            goto L_0x0389
        L_0x0387:
            r4 = r8
            goto L_0x03b2
        L_0x0389:
            int r4 = r4 + 1
            goto L_0x035a
        L_0x038c:
            r7 = 2
            goto L_0x0390
        L_0x038e:
            r7 = 2
            r5 = 0
        L_0x0390:
            int r4 = r5 + 1
            aqek r5 = new aqek
            aqem r6 = defpackage.ajck.bV
            r5.<init>(r6)
            r5.b((int) r13, (java.lang.Object) r0)
            r5.g(r7, r4)
            r3.a((int) r13, (java.lang.Object) r5)
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r6 = 0
            r5[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r5[r13] = r0
            goto L_0x03b2
        L_0x03b0:
            r7 = 2
            r4 = -1
        L_0x03b2:
            if (r4 < 0) goto L_0x0993
            long r5 = r11.getTimeInMillis()
            aqek r0 = new aqek
            aqem r8 = defpackage.ajck.bW
            r0.<init>(r8)
            r0.b((int) r13, (long) r5)
            r0.g(r7, r4)
            java.lang.Object r4 = r12.a
            if (r4 == 0) goto L_0x03e0
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x03de
            java.lang.Object r4 = r12.a
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 3
            r0.b((int) r5, (boolean) r4)
            goto L_0x03e1
        L_0x03de:
            r5 = 3
            goto L_0x03e1
        L_0x03e0:
            r5 = 3
        L_0x03e1:
            java.lang.Object r4 = r12.b
            if (r4 == 0) goto L_0x03f4
            java.lang.Double r4 = (java.lang.Double) r4
            double r8 = r4.doubleValue()
            r11 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r8 = r8 * r11
            int r4 = (int) r8
            r6 = 4
            r0.g(r6, r4)
        L_0x03f4:
            if (r14 == 0) goto L_0x0403
            boolean r4 = r14.booleanValue()
            if (r4 == 0) goto L_0x0401
            r4 = 5
            r0.b((int) r4, (boolean) r13)
            goto L_0x0404
        L_0x0401:
            r4 = 5
            goto L_0x0404
        L_0x0403:
            r4 = 5
        L_0x0404:
            if (r15 != 0) goto L_0x0407
            goto L_0x040f
        L_0x0407:
            r6 = 6
            int r8 = r15.intValue()
            r0.g(r6, r8)
        L_0x040f:
            r6 = 7
            r0.g(r6, r13)
            int r8 = r3.j(r7)
            r9 = 1000(0x3e8, float:1.401E-42)
            if (r8 <= r9) goto L_0x042b
            r9 = 12
            int r8 = java.lang.Math.min(r8, r9)
            r9 = 0
        L_0x0423:
            if (r9 >= r8) goto L_0x042b
            r3.k(r7)
            int r9 = r9 + 1
            goto L_0x0423
        L_0x042b:
            r3.a((int) r7, (java.lang.Object) r0)
            r2.a(r3)     // Catch:{ IOException -> 0x0433 }
            goto L_0x0434
        L_0x0433:
            r0 = move-exception
        L_0x0434:
            ahxm r0 = new ahxm
            java.util.List r2 = defpackage.ahxu.j
            r8 = 0
            java.lang.Object r2 = r2.get(r8)
            ahyw r2 = (defpackage.ahyw) r2
            r0.<init>(r2)
            int r2 = r3.j(r13)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>(r2)
            r11 = 0
        L_0x044c:
            if (r11 < r2) goto L_0x0957
            java.util.Set r2 = r9.entrySet()
            java.util.HashMap r11 = new java.util.HashMap
            int r12 = r2.size()
            r11.<init>(r12)
            java.util.Iterator r2 = r2.iterator()
        L_0x045f:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x090a
            java.lang.Object r12 = r2.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r14 = r12.getKey()
            java.lang.Integer r14 = (java.lang.Integer) r14
            java.util.TreeMap r15 = new java.util.TreeMap
            r15.<init>()
            int r8 = r3.j(r7)
            r4 = 0
        L_0x047b:
            r16 = 600000(0x927c0, double:2.964394E-318)
            if (r4 < r8) goto L_0x0836
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>()
            java.util.Set r8 = r15.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x048d:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x04ba
            java.lang.Object r14 = r8.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r15 = r14.getKey()
            java.lang.Long r15 = (java.lang.Long) r15
            java.lang.Object r14 = r14.getValue()
            ahxl r14 = (defpackage.ahxl) r14
            int r5 = r14.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r14 = r14.b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            aiba r5 = defpackage.aiba.a(r5, r14)
            r4.put(r15, r5)
            r5 = 3
            goto L_0x048d
        L_0x04ba:
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x04c7:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x055b
            java.lang.Object r8 = r4.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r14 = r8.getKey()
            java.lang.Long r14 = (java.lang.Long) r14
            long r14 = r14.longValue()
            java.lang.Object r18 = r8.getValue()
            r6 = r18
            aiba r6 = (defpackage.aiba) r6
            java.lang.Object r6 = r6.a
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r8 = r8.getValue()
            aiba r8 = (defpackage.aiba) r8
            java.lang.Object r8 = r8.b
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r6 == 0) goto L_0x0554
            if (r8 == 0) goto L_0x0554
            int r6 = r6.intValue()
            r21 = r14
            double r13 = (double) r6
            int r6 = r8.intValue()
            long r7 = (long) r6
            ahxj r6 = defpackage.ahxj.UNKNOWN
            r26 = 3
            int r15 = (r7 > r26 ? 1 : (r7 == r26 ? 0 : -1))
            if (r15 < 0) goto L_0x052d
            double r6 = (double) r7
            java.lang.Double.isNaN(r13)
            java.lang.Double.isNaN(r6)
            double r13 = r13 / r6
            float r6 = (float) r13
            r7 = 1061997773(0x3f4ccccd, float:0.8)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x0520
            ahxj r6 = defpackage.ahxj.INDOOR
            r23 = 0
            goto L_0x0548
        L_0x0520:
            r7 = 1045220556(0x3e4ccccc, float:0.19999999)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x052a
            ahxj r6 = defpackage.ahxj.MIX
            goto L_0x053a
        L_0x052a:
            ahxj r6 = defpackage.ahxj.OUTDOOR
            goto L_0x053a
        L_0x052d:
            r26 = 0
            int r15 = (r7 > r26 ? 1 : (r7 == r26 ? 0 : -1))
            if (r15 <= 0) goto L_0x0546
            double r7 = (double) r7
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 != 0) goto L_0x053d
            ahxj r6 = defpackage.ahxj.INDOOR_LOW_CONFIDENCE
        L_0x053a:
            r23 = 0
            goto L_0x0548
        L_0x053d:
            r23 = 0
            int r7 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r7 != 0) goto L_0x0548
            ahxj r6 = defpackage.ahxj.OUTDOOR_LOW_CONFIDENCE
            goto L_0x0548
        L_0x0546:
            r23 = 0
        L_0x0548:
            java.lang.Long r7 = java.lang.Long.valueOf(r21)
            r5.put(r7, r6)
            r6 = 7
            r7 = 2
            r13 = 1
            goto L_0x04c7
        L_0x0554:
            r23 = 0
            r6 = 7
            r7 = 2
            r13 = 1
            goto L_0x04c7
        L_0x055b:
            r23 = 0
            ahyw r4 = r0.a
            long r6 = r4.a
        L_0x0561:
            ahyw r4 = r0.a
            long r13 = r4.b
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x057b
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            boolean r8 = r5.containsKey(r4)
            if (r8 != 0) goto L_0x0578
            ahxj r8 = defpackage.ahxj.UNKNOWN
            r5.put(r4, r8)
        L_0x0578:
            long r6 = r6 + r16
            goto L_0x0561
        L_0x057b:
            java.util.Set r4 = r5.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0583:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x05fd
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            ahxj r8 = defpackage.ahxj.INDOOR_LOW_CONFIDENCE
            if (r7 != r8) goto L_0x05c6
            java.lang.Object r7 = r6.getKey()
            java.lang.Long r7 = (java.lang.Long) r7
            java.util.Map$Entry r7 = r5.lowerEntry(r7)
            java.lang.Object r8 = r6.getKey()
            java.lang.Long r8 = (java.lang.Long) r8
            java.util.Map$Entry r8 = r5.higherEntry(r8)
            if (r7 == 0) goto L_0x05b5
            java.lang.Object r7 = r7.getValue()
            ahxj r13 = defpackage.ahxj.INDOOR
            if (r7 != r13) goto L_0x0583
        L_0x05b5:
            if (r8 != 0) goto L_0x05b8
            goto L_0x05c0
        L_0x05b8:
            java.lang.Object r7 = r8.getValue()
            ahxj r8 = defpackage.ahxj.INDOOR
            if (r7 != r8) goto L_0x0583
        L_0x05c0:
            ahxj r7 = defpackage.ahxj.INDOOR
            r6.setValue(r7)
            goto L_0x0583
        L_0x05c6:
            java.lang.Object r7 = r6.getValue()
            ahxj r8 = defpackage.ahxj.OUTDOOR_LOW_CONFIDENCE
            if (r7 != r8) goto L_0x0583
            java.lang.Object r7 = r6.getKey()
            java.lang.Long r7 = (java.lang.Long) r7
            java.util.Map$Entry r7 = r5.lowerEntry(r7)
            java.lang.Object r8 = r6.getKey()
            java.lang.Long r8 = (java.lang.Long) r8
            java.util.Map$Entry r8 = r5.higherEntry(r8)
            if (r7 == 0) goto L_0x05ec
            java.lang.Object r7 = r7.getValue()
            ahxj r13 = defpackage.ahxj.OUTDOOR
            if (r7 != r13) goto L_0x0583
        L_0x05ec:
            if (r8 != 0) goto L_0x05ef
            goto L_0x05f7
        L_0x05ef:
            java.lang.Object r7 = r8.getValue()
            ahxj r8 = defpackage.ahxj.OUTDOOR
            if (r7 != r8) goto L_0x0583
        L_0x05f7:
            ahxj r7 = defpackage.ahxj.OUTDOOR
            r6.setValue(r7)
            goto L_0x0583
        L_0x05fd:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r6 = r5.size()
            if (r6 <= 0) goto L_0x06fd
            java.util.Set r6 = r5.entrySet()
            java.util.Iterator r6 = r6.iterator()
            r7 = -1
            r13 = r7
            r15 = 0
            r18 = 0
        L_0x0616:
            boolean r21 = r6.hasNext()
            r25 = 900000(0xdbba0, double:4.44659E-318)
            if (r21 == 0) goto L_0x06c6
            java.lang.Object r21 = r6.next()
            java.util.Map$Entry r21 = (java.util.Map.Entry) r21
            java.lang.Object r22 = r21.getValue()
            r1 = r22
            ahxj r1 = (defpackage.ahxj) r1
            int r22 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r22 != 0) goto L_0x065a
            ahxj r7 = defpackage.ahxj.INDOOR
            if (r1 != r7) goto L_0x0636
            goto L_0x0642
        L_0x0636:
            ahxj r7 = defpackage.ahxj.OUTDOOR
            if (r1 == r7) goto L_0x0642
            r28 = r2
            r18 = r3
            r22 = r9
            goto L_0x06b2
        L_0x0642:
            java.lang.Object r1 = r21.getKey()
            java.lang.Long r1 = (java.lang.Long) r1
            long r13 = r1.longValue()
            java.lang.Object r1 = r21.getValue()
            r15 = r1
            ahxj r15 = (defpackage.ahxj) r15
            r28 = r2
            r18 = r3
            r22 = r9
            goto L_0x06b2
        L_0x065a:
            if (r1 == r15) goto L_0x06ac
            defpackage.amrl.a((java.lang.Object) r18)
            long r7 = r18.longValue()
            long r7 = r7 - r13
            long r7 = r7 + r16
            int r15 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r15 < 0) goto L_0x0687
            ahxk r7 = new ahxk
            ahyw r8 = r0.a
            r22 = r9
            long r8 = r8.b
            long r25 = r18.longValue()
            r28 = r2
            r18 = r3
            long r2 = r25 + r16
            long r2 = java.lang.Math.min(r8, r2)
            r7.<init>(r13, r2)
            r4.add(r7)
            goto L_0x068d
        L_0x0687:
            r28 = r2
            r18 = r3
            r22 = r9
        L_0x068d:
            ahxj r2 = defpackage.ahxj.INDOOR
            if (r1 != r2) goto L_0x0692
            goto L_0x069a
        L_0x0692:
            ahxj r2 = defpackage.ahxj.OUTDOOR
            if (r1 == r2) goto L_0x069a
            r13 = -1
            r15 = 0
            goto L_0x06b2
        L_0x069a:
            java.lang.Object r1 = r21.getKey()
            java.lang.Long r1 = (java.lang.Long) r1
            long r13 = r1.longValue()
            java.lang.Object r1 = r21.getValue()
            r15 = r1
            ahxj r15 = (defpackage.ahxj) r15
            goto L_0x06b2
        L_0x06ac:
            r28 = r2
            r18 = r3
            r22 = r9
        L_0x06b2:
            java.lang.Object r1 = r21.getKey()
            java.lang.Long r1 = (java.lang.Long) r1
            r3 = r18
            r9 = r22
            r2 = r28
            r7 = -1
            r18 = r1
            r1 = r29
            goto L_0x0616
        L_0x06c6:
            r28 = r2
            r18 = r3
            r22 = r9
            r1 = -1
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x06d3
            goto L_0x0703
        L_0x06d3:
            java.lang.Object r1 = r5.lastKey()
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0703
            long r2 = r1.longValue()
            long r2 = r2 - r13
            long r2 = r2 + r16
            int r5 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r5 < 0) goto L_0x0703
            ahxk r2 = new ahxk
            ahyw r3 = r0.a
            long r5 = r3.b
            long r7 = r1.longValue()
            long r7 = r7 + r16
            long r5 = java.lang.Math.min(r5, r7)
            r2.<init>(r13, r5)
            r4.add(r2)
            goto L_0x0703
        L_0x06fd:
            r28 = r2
            r18 = r3
            r22 = r9
        L_0x0703:
            java.lang.Object r1 = r12.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Final result for time zone: "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x071b
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x071e
        L_0x071b:
            r2.concat(r1)
        L_0x071e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ahyw r2 = r0.a
            r1.add(r2)
            int r2 = r4.size()
            r3 = 0
        L_0x072d:
            if (r3 >= r2) goto L_0x07fa
            java.lang.Object r5 = r4.get(r3)
            ahxk r5 = (defpackage.ahxk) r5
            ahyw r5 = r5.a
            long r6 = r5.a
            ahyw r8 = r0.a
            long r13 = r8.a
            int r9 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x0746
            r13 = 150000(0x249f0, double:7.411E-319)
            long r6 = r6 + r13
            goto L_0x0747
        L_0x0746:
        L_0x0747:
            long r13 = r5.b
            long r8 = r8.b
            int r5 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x0754
            r8 = -150000(0xfffffffffffdb610, double:NaN)
            long r13 = r13 + r8
            goto L_0x0755
        L_0x0754:
        L_0x0755:
            int r5 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x07e3
            ahyw r5 = new ahyw
            r5.<init>(r6, r13)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r1.size()
            r8 = 0
        L_0x0768:
            if (r8 >= r7) goto L_0x07d7
            java.lang.Object r9 = r1.get(r8)
            ahyw r9 = (defpackage.ahyw) r9
            long r13 = r5.b
            r21 = r10
            r25 = r11
            long r10 = r9.a
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 <= 0) goto L_0x07bf
            r26 = r0
            r15 = r1
            long r0 = r5.a
            r16 = r2
            r17 = r3
            long r2 = r9.b
            int r27 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r27 < 0) goto L_0x078c
            goto L_0x07c6
        L_0x078c:
            int r27 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r27 > 0) goto L_0x079d
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x07c9
            ahyw r0 = new ahyw
            r0.<init>(r13, r2)
            r6.add(r0)
            goto L_0x07c9
        L_0x079d:
            int r27 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r27 <= 0) goto L_0x07b6
            ahyw r2 = new ahyw
            r2.<init>(r10, r0)
            r6.add(r2)
            ahyw r0 = new ahyw
            long r1 = r5.b
            long r9 = r9.b
            r0.<init>(r1, r9)
            r6.add(r0)
            goto L_0x07c9
        L_0x07b6:
            ahyw r2 = new ahyw
            r2.<init>(r10, r0)
            r6.add(r2)
            goto L_0x07c9
        L_0x07bf:
            r26 = r0
            r15 = r1
            r16 = r2
            r17 = r3
        L_0x07c6:
            r6.add(r9)
        L_0x07c9:
            int r8 = r8 + 1
            r1 = r15
            r2 = r16
            r3 = r17
            r10 = r21
            r11 = r25
            r0 = r26
            goto L_0x0768
        L_0x07d7:
            r26 = r0
            r16 = r2
            r17 = r3
            r21 = r10
            r25 = r11
            r1 = r6
            goto L_0x07ee
        L_0x07e3:
            r26 = r0
            r15 = r1
            r16 = r2
            r17 = r3
            r21 = r10
            r25 = r11
        L_0x07ee:
            int r3 = r17 + 1
            r2 = r16
            r10 = r21
            r11 = r25
            r0 = r26
            goto L_0x072d
        L_0x07fa:
            r26 = r0
            r15 = r1
            r21 = r10
            r25 = r11
            int r0 = r15.size()
            r4 = 0
        L_0x0806:
            if (r4 >= r0) goto L_0x0815
            r1 = r15
            java.lang.Object r2 = r1.get(r4)
            ahyw r2 = (defpackage.ahyw) r2
            r2.toString()
            int r4 = r4 + 1
            goto L_0x0806
        L_0x0815:
            r1 = r15
            java.lang.Object r0 = r12.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r2 = r25
            r2.put(r0, r1)
            r1 = r29
            r11 = r2
            r3 = r18
            r10 = r21
            r9 = r22
            r0 = r26
            r2 = r28
            r4 = 5
            r5 = 3
            r6 = 7
            r7 = 2
            r8 = 0
            r13 = 1
            goto L_0x045f
        L_0x0836:
            r26 = r0
            r28 = r2
            r18 = r3
            r22 = r9
            r21 = r10
            r2 = r11
            r23 = 0
            r1 = r18
            r3 = 2
            aqek r0 = r1.f(r3, r4)
            int r5 = r0.b((int) r3)
            int r6 = r14.intValue()
            if (r5 == r6) goto L_0x085a
            r5 = r22
            r7 = 3
            r9 = 5
            goto L_0x08f7
        L_0x085a:
            boolean r5 = r0.i(r3)
            if (r5 == 0) goto L_0x088a
            r5 = 1
            boolean r6 = r0.i(r5)
            if (r6 == 0) goto L_0x088a
            int r5 = r0.b((int) r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r5 = r22
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x088c
            java.util.TimeZone r3 = java.util.TimeZone.getTimeZone(r3)
            java.util.Calendar r3 = java.util.Calendar.getInstance(r3)
            r6 = 1
            long r9 = r0.c(r6)
            r3.setTimeInMillis(r9)
            goto L_0x088d
        L_0x088a:
            r5 = r22
        L_0x088c:
            r3 = 0
        L_0x088d:
            if (r3 == 0) goto L_0x08f5
            r6 = 7
            int r7 = r3.get(r6)
            if (r7 == r6) goto L_0x08f2
            int r7 = r3.get(r6)
            r9 = 1
            if (r7 == r9) goto L_0x08ef
            r7 = r26
            ahyw r9 = r7.a
            boolean r9 = r9.b((java.util.Calendar) r3)
            if (r9 == 0) goto L_0x08ea
            long r9 = defpackage.ahyw.c((java.util.Calendar) r3)
            ahyw r3 = r7.a
            r26 = r7
            long r6 = r3.a
            long r6 = r9 - r6
            long r6 = r6 % r16
            long r9 = r9 - r6
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            java.lang.Object r6 = r15.get(r3)
            ahxl r6 = (defpackage.ahxl) r6
            r7 = 3
            boolean r9 = r0.a((int) r7)
            if (r9 != 0) goto L_0x08cd
            r9 = 5
            boolean r0 = r0.a((int) r9)
            goto L_0x08cf
        L_0x08cd:
            r9 = 5
            r0 = 1
        L_0x08cf:
            if (r6 != 0) goto L_0x08da
            ahxl r6 = new ahxl
            r6.<init>(r0)
            r15.put(r3, r6)
            goto L_0x08f7
        L_0x08da:
            if (r0 == 0) goto L_0x08e3
            int r0 = r6.a
            r3 = 1
            int r0 = r0 + r3
            r6.a = r0
            goto L_0x08e4
        L_0x08e3:
            r3 = 1
        L_0x08e4:
            int r0 = r6.b
            int r0 = r0 + r3
            r6.b = r0
            goto L_0x08f7
        L_0x08ea:
            r26 = r7
            r7 = 3
            r9 = 5
            goto L_0x08f7
        L_0x08ef:
            r7 = 3
            r9 = 5
            goto L_0x08f7
        L_0x08f2:
            r7 = 3
            r9 = 5
            goto L_0x08f7
        L_0x08f5:
            r7 = 3
            r9 = 5
        L_0x08f7:
            int r4 = r4 + 1
            r3 = r1
            r11 = r2
            r9 = r5
            r10 = r21
            r0 = r26
            r2 = r28
            r5 = 3
            r6 = 7
            r7 = 2
            r13 = 1
            r1 = r29
            goto L_0x047b
        L_0x090a:
            r21 = r10
            r2 = r11
            r3 = r21
            ahxb r4 = r3.d
            aizy r0 = r3.a
            long r0 = r0.b()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r2.size()
            r3.<init>(r5)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0928:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0949
            java.lang.Object r5 = r2.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            ahxa r6 = new ahxa
            java.lang.Object r7 = r5.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            r6.<init>(r7, r5)
            r3.add(r6)
            goto L_0x0928
        L_0x0949:
            monitor-enter(r4)
            amzy r2 = defpackage.amzy.a((java.util.Collection) r3)     // Catch:{ all -> 0x0954 }
            r4.c = r2     // Catch:{ all -> 0x0954 }
            r4.b = r0     // Catch:{ all -> 0x0954 }
            monitor-exit(r4)     // Catch:{ all -> 0x0954 }
            return
        L_0x0954:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0954 }
            throw r0
        L_0x0957:
            r26 = r0
            r1 = r3
            r5 = r9
            r3 = r10
            r7 = 3
            r9 = 5
            r23 = 0
            r4 = 1
            aqek r0 = r1.f(r4, r11)
            r6 = 2
            boolean r8 = r0.i(r6)
            if (r8 != 0) goto L_0x096d
        L_0x096c:
            goto L_0x0982
        L_0x096d:
            boolean r8 = r0.i(r4)
            if (r8 == 0) goto L_0x096c
            int r8 = r0.b((int) r6)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = r0.f(r4)
            r5.put(r8, r0)
        L_0x0982:
            int r11 = r11 + 1
            r10 = r3
            r9 = r5
            r0 = r26
            r4 = 5
            r5 = 3
            r6 = 7
            r7 = 2
            r8 = 0
            r13 = 1
            r3 = r1
            r1 = r29
            goto L_0x044c
        L_0x0993:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxh.run():void");
    }
}
