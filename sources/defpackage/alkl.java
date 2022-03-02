package defpackage;

/* renamed from: alkl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alkl {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.atcg a(com.google.android.ulr.ApiExperiment r12) {
        /*
            if (r12 == 0) goto L_0x016e
            atcg r0 = defpackage.atcg.f
            aucd r0 = r0.o()
            java.lang.Integer r1 = r12.c()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002c
            java.lang.Integer r1 = r12.c()
            int r1 = r1.intValue()
            boolean r4 = r0.c
            if (r4 == 0) goto L_0x0021
            r0.c()
            r0.c = r3
        L_0x0021:
            aucj r4 = r0.b
            atcg r4 = (defpackage.atcg) r4
            int r5 = r4.a
            r5 = r5 | r2
            r4.a = r5
            r4.b = r1
        L_0x002c:
            java.lang.String r1 = r12.e()
            java.lang.String r4 = "CONTROL"
            java.lang.String r5 = "control"
            java.lang.String r6 = "EXPERIMENT"
            java.lang.String r7 = "experiment"
            r8 = -1
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x00bc
            java.lang.String r1 = r12.e()
            int r11 = r1.hashCode()
            switch(r11) {
                case -85337091: goto L_0x0061;
                case 399755261: goto L_0x0059;
                case 951543133: goto L_0x0051;
                case 1669525821: goto L_0x0049;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x0069
        L_0x0049:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0069
            r1 = 0
            goto L_0x006a
        L_0x0051:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0069
            r1 = 1
            goto L_0x006a
        L_0x0059:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0069
            r1 = 2
            goto L_0x006a
        L_0x0061:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0069
            r1 = 3
            goto L_0x006a
        L_0x0069:
            r1 = -1
        L_0x006a:
            if (r1 == 0) goto L_0x00a7
            if (r1 == r2) goto L_0x00a7
            if (r1 == r10) goto L_0x0092
            if (r1 == r9) goto L_0x0092
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.e()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r1 = "Json2LiteBadEnum userlocation.ApiExperiment.type "
            int r2 = r12.length()
            if (r2 != 0) goto L_0x008a
            java.lang.String r12 = new java.lang.String
            r12.<init>(r1)
            goto L_0x008e
        L_0x008a:
            java.lang.String r12 = r1.concat(r12)
        L_0x008e:
            r0.<init>(r12)
            throw r0
        L_0x0092:
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x009b
            r0.c()
            r0.c = r3
        L_0x009b:
            aucj r1 = r0.b
            atcg r1 = (defpackage.atcg) r1
            r1.c = r2
            int r11 = r1.a
            r11 = r11 | r10
            r1.a = r11
            goto L_0x00bc
        L_0x00a7:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x00ac
            goto L_0x00b1
        L_0x00ac:
            r0.c()
            r0.c = r3
        L_0x00b1:
            aucj r1 = r0.b
            atcg r1 = (defpackage.atcg) r1
            r1.c = r3
            int r11 = r1.a
            r11 = r11 | r10
            r1.a = r11
        L_0x00bc:
            java.lang.String r1 = r12.b()
            if (r1 == 0) goto L_0x0143
            java.lang.String r1 = r12.b()
            int r11 = r1.hashCode()
            switch(r11) {
                case -85337091: goto L_0x00e6;
                case 399755261: goto L_0x00de;
                case 951543133: goto L_0x00d6;
                case 1669525821: goto L_0x00ce;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            goto L_0x00ee
        L_0x00ce:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00ee
            r8 = 0
            goto L_0x00ef
        L_0x00d6:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00ee
            r8 = 1
            goto L_0x00ef
        L_0x00de:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00ee
            r8 = 2
            goto L_0x00ef
        L_0x00e6:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00ee
            r8 = 3
            goto L_0x00ef
        L_0x00ee:
        L_0x00ef:
            if (r8 == 0) goto L_0x012d
            if (r8 == r2) goto L_0x012d
            if (r8 == r10) goto L_0x0117
            if (r8 == r9) goto L_0x0117
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.b()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r1 = "Json2LiteBadEnum userlocation.ApiExperiment.group "
            int r2 = r12.length()
            if (r2 != 0) goto L_0x010f
            java.lang.String r12 = new java.lang.String
            r12.<init>(r1)
            goto L_0x0113
        L_0x010f:
            java.lang.String r12 = r1.concat(r12)
        L_0x0113:
            r0.<init>(r12)
            throw r0
        L_0x0117:
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x0120
            r0.c()
            r0.c = r3
        L_0x0120:
            aucj r1 = r0.b
            atcg r1 = (defpackage.atcg) r1
            r1.d = r2
            int r2 = r1.a
            r2 = r2 | 4
            r1.a = r2
            goto L_0x0143
        L_0x012d:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0132
            goto L_0x0137
        L_0x0132:
            r0.c()
            r0.c = r3
        L_0x0137:
            aucj r1 = r0.b
            atcg r1 = (defpackage.atcg) r1
            r1.d = r3
            int r2 = r1.a
            r2 = r2 | 4
            r1.a = r2
        L_0x0143:
            java.lang.Integer r1 = r12.d()
            if (r1 == 0) goto L_0x0167
            java.lang.Integer r12 = r12.d()
            int r12 = r12.intValue()
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0156
            goto L_0x015b
        L_0x0156:
            r0.c()
            r0.c = r3
        L_0x015b:
            aucj r1 = r0.b
            atcg r1 = (defpackage.atcg) r1
            int r2 = r1.a
            r2 = r2 | 8
            r1.a = r2
            r1.e = r12
        L_0x0167:
            aucj r12 = r0.i()
            atcg r12 = (defpackage.atcg) r12
            return r12
        L_0x016e:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alkl.a(com.google.android.ulr.ApiExperiment):atcg");
    }
}
