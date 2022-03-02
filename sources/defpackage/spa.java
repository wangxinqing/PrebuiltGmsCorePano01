package defpackage;

/* renamed from: spa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class spa extends soz {
    final /* synthetic */ spb a;
    private final szq h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public spa(spb spb, String str, int i, szq szq) {
        super(str, i);
        this.a = spb;
        this.h = szq;
    }

    public final int a() {
        return this.h.b;
    }

    public final boolean b() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Long r12, defpackage.tah r13, boolean r14) {
        /*
            r11 = this;
            spb r0 = r11.a
            spg r0 = r0.v()
            java.lang.String r1 = r11.b
            suc r2 = defpackage.sud.ad
            boolean r0 = r0.b(r1, r2)
            spb r1 = r11.a
            spg r1 = r1.v()
            java.lang.String r2 = r11.b
            suc r3 = defpackage.sud.aj
            boolean r1 = r1.b(r2, r3)
            defpackage.ayiv.c()
            szq r2 = r11.h
            boolean r3 = r2.e
            boolean r4 = r2.f
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x002f
            boolean r7 = r2.g
            if (r7 == 0) goto L_0x002f
            r7 = 1
            goto L_0x0030
        L_0x002f:
            r7 = 0
        L_0x0030:
            if (r3 == 0) goto L_0x0034
            r3 = 1
            goto L_0x003b
        L_0x0034:
            if (r4 == 0) goto L_0x0038
        L_0x0036:
            r3 = 1
            goto L_0x003b
        L_0x0038:
            if (r7 != 0) goto L_0x0036
            r3 = 0
        L_0x003b:
            r4 = 0
            if (r14 != 0) goto L_0x003f
            goto L_0x0065
        L_0x003f:
            if (r3 != 0) goto L_0x0065
            spb r12 = r11.a
            sut r12 = r12.E()
            sur r12 = r12.k
            int r13 = r11.c
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            szq r14 = r11.h
            int r0 = r14.a
            r0 = r0 & r6
            if (r0 == 0) goto L_0x005d
            int r14 = r14.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            goto L_0x005e
        L_0x005d:
        L_0x005e:
            java.lang.String r14 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r12.a(r14, r13, r4)
            return r6
        L_0x0065:
            szm r2 = r2.d
            if (r2 == 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            szm r2 = defpackage.szm.f
        L_0x006c:
            boolean r8 = r2.d
            int r9 = r13.a
            r10 = r9 & 8
            if (r10 != 0) goto L_0x013c
            r10 = r9 & 32
            if (r10 != 0) goto L_0x010b
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0097
            spb r2 = r11.a
            sut r2 = r2.E()
            sur r2 = r2.f
            spb r8 = r11.a
            suk r8 = r8.y()
            java.lang.String r9 = r13.c
            java.lang.String r8 = r8.c(r9)
            java.lang.String r9 = "User property has no value, property"
            r2.a(r9, r8)
            goto L_0x016c
        L_0x0097:
            int r9 = r2.a
            r10 = r9 & 1
            if (r10 == 0) goto L_0x00b5
            java.lang.String r4 = r13.d
            szt r2 = r2.b
            if (r2 != 0) goto L_0x00a5
            szt r2 = defpackage.szt.f
        L_0x00a5:
            spb r9 = r11.a
            sut r9 = r9.E()
            java.lang.Boolean r2 = a((java.lang.String) r4, (defpackage.szt) r2, (defpackage.sut) r9)
            java.lang.Boolean r4 = a((java.lang.Boolean) r2, (boolean) r8)
            goto L_0x016c
        L_0x00b5:
            r9 = r9 & 2
            if (r9 != 0) goto L_0x00d4
            spb r2 = r11.a
            sut r2 = r2.E()
            sur r2 = r2.f
            spb r8 = r11.a
            suk r8 = r8.y()
            java.lang.String r9 = r13.c
            java.lang.String r8 = r8.c(r9)
            java.lang.String r9 = "No string or number filter defined. property"
            r2.a(r9, r8)
            goto L_0x016c
        L_0x00d4:
            java.lang.String r9 = r13.d
            boolean r9 = defpackage.szg.a((java.lang.String) r9)
            if (r9 != 0) goto L_0x00f9
            spb r2 = r11.a
            sut r2 = r2.E()
            sur r2 = r2.f
            spb r8 = r11.a
            suk r8 = r8.y()
            java.lang.String r9 = r13.c
            java.lang.String r8 = r8.c(r9)
            java.lang.String r9 = r13.d
            java.lang.String r10 = "Invalid user property value for Numeric number filter. property, value"
            r2.a(r10, r8, r9)
            goto L_0x016c
        L_0x00f9:
            java.lang.String r4 = r13.d
            szp r2 = r2.c
            if (r2 == 0) goto L_0x0100
            goto L_0x0102
        L_0x0100:
            szp r2 = defpackage.szp.g
        L_0x0102:
            java.lang.Boolean r2 = a((java.lang.String) r4, (defpackage.szp) r2)
            java.lang.Boolean r4 = a((java.lang.Boolean) r2, (boolean) r8)
            goto L_0x016c
        L_0x010b:
            int r9 = r2.a
            r9 = r9 & 2
            if (r9 == 0) goto L_0x0122
            double r9 = r13.f
            szp r2 = r2.c
            if (r2 != 0) goto L_0x0119
            szp r2 = defpackage.szp.g
        L_0x0119:
            java.lang.Boolean r2 = a((double) r9, (defpackage.szp) r2)
            java.lang.Boolean r4 = a((java.lang.Boolean) r2, (boolean) r8)
            goto L_0x016c
        L_0x0122:
            spb r2 = r11.a
            sut r2 = r2.E()
            sur r2 = r2.f
            spb r8 = r11.a
            suk r8 = r8.y()
            java.lang.String r9 = r13.c
            java.lang.String r8 = r8.c(r9)
            java.lang.String r9 = "No number filter for double property. property"
            r2.a(r9, r8)
            goto L_0x016c
        L_0x013c:
            int r9 = r2.a
            r9 = r9 & 2
            if (r9 == 0) goto L_0x0153
            long r9 = r13.e
            szp r2 = r2.c
            if (r2 != 0) goto L_0x014a
            szp r2 = defpackage.szp.g
        L_0x014a:
            java.lang.Boolean r2 = a((long) r9, (defpackage.szp) r2)
            java.lang.Boolean r4 = a((java.lang.Boolean) r2, (boolean) r8)
            goto L_0x016c
        L_0x0153:
            spb r2 = r11.a
            sut r2 = r2.E()
            sur r2 = r2.f
            spb r8 = r11.a
            suk r8 = r8.y()
            java.lang.String r9 = r13.c
            java.lang.String r8 = r8.c(r9)
            java.lang.String r9 = "No number filter for long property. property"
            r2.a(r9, r8)
        L_0x016c:
            spb r2 = r11.a
            sut r2 = r2.E()
            sur r2 = r2.k
            if (r4 != 0) goto L_0x0179
            java.lang.String r8 = "null"
            goto L_0x017a
        L_0x0179:
            r8 = r4
        L_0x017a:
            java.lang.String r9 = "Property filter result"
            r2.a(r9, r8)
            if (r4 == 0) goto L_0x01cd
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            r11.d = r2
            if (r0 == 0) goto L_0x0194
            if (r7 == 0) goto L_0x0194
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L_0x0193
            goto L_0x0194
        L_0x0193:
            return r6
        L_0x0194:
            if (r14 == 0) goto L_0x019d
            szq r14 = r11.h
            boolean r14 = r14.e
            if (r14 != 0) goto L_0x019d
            goto L_0x019f
        L_0x019d:
            r11.e = r4
        L_0x019f:
            boolean r14 = r4.booleanValue()
            if (r14 == 0) goto L_0x01cc
            if (r3 == 0) goto L_0x01cc
            int r14 = r13.a
            r14 = r14 & r6
            if (r14 == 0) goto L_0x01cc
            long r13 = r13.b
            if (r1 != 0) goto L_0x01b1
            goto L_0x01b9
        L_0x01b1:
            if (r12 == 0) goto L_0x01b8
            long r13 = r12.longValue()
            goto L_0x01b9
        L_0x01b8:
        L_0x01b9:
            szq r12 = r11.h
            boolean r12 = r12.f
            if (r12 == 0) goto L_0x01c6
            java.lang.Long r12 = java.lang.Long.valueOf(r13)
            r11.g = r12
            goto L_0x01cc
        L_0x01c6:
            java.lang.Long r12 = java.lang.Long.valueOf(r13)
            r11.f = r12
        L_0x01cc:
            return r6
        L_0x01cd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spa.a(java.lang.Long, tah, boolean):boolean");
    }
}
