package defpackage;

/* renamed from: fyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fyi {
    public static final fzi a = new fyh();
    private static final iwd b = new iwd("GLSActivity", "ClientIdentityHelper");

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.auth.firstparty.shared.AppDescription a(int r7, int r8, java.lang.String r9, int r10, defpackage.fyk r11) {
        /*
            r6 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            jnh r1 = r11.c
            java.lang.String[] r1 = r1.a((int) r10)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0013
            goto L_0x0024
        L_0x0013:
            r4 = 0
        L_0x0014:
            int r5 = r1.length
            if (r4 >= r5) goto L_0x0024
            r5 = r1[r4]
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x0022
            int r4 = r4 + 1
            goto L_0x0014
        L_0x0022:
            r1 = 1
            goto L_0x004d
        L_0x0024:
            java.lang.String r1 = java.lang.String.valueOf(r9)
            int r1 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = r1 + 37
            r4.<init>(r1)
            java.lang.String r1 = "Package not matching uid "
            r4.append(r1)
            r4.append(r10)
            java.lang.String r1 = " "
            r4.append(r1)
            r4.append(r9)
            java.lang.String r1 = r4.toString()
            java.lang.String r4 = "GLSActivity"
            android.util.Log.w(r4, r1)
            r1 = 0
        L_0x004d:
            boolean r4 = r11.a((int) r8)
            boolean r11 = r11.a((int) r10)
            if (r1 != 0) goto L_0x0058
            goto L_0x0063
        L_0x0058:
            if (r10 != r8) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            if (r4 == 0) goto L_0x0063
        L_0x005d:
            com.google.android.gms.auth.firstparty.shared.AppDescription r7 = new com.google.android.gms.auth.firstparty.shared.AppDescription
            r7.<init>(r9, r10, r0, r0)
            return r7
        L_0x0063:
            r5 = 2
            if (r1 != 0) goto L_0x008d
            if (r4 == 0) goto L_0x0070
            if (r11 == 0) goto L_0x0070
            com.google.android.gms.auth.firstparty.shared.AppDescription r7 = new com.google.android.gms.auth.firstparty.shared.AppDescription
            r7.<init>(r9, r10, r0, r0)
            return r7
        L_0x0070:
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r3] = r9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r7[r2] = r8
            java.lang.String r8 = "Fraud! Package %s isn't associated with uid %s!"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            eib r8 = new eib
            r8.<init>(r7)
            iwd r9 = b
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r9.d(r7, r8, r10)
            throw r8
        L_0x008d:
            r11 = 5
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11[r3] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r11[r2] = r7
            r11[r5] = r9
            r7 = 3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r11[r7] = r8
            r7 = 4
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            r11[r7] = r8
            java.lang.String r7 = "[%s] Apps with uid %s cannot masquerade as package %s in uid %s. [isClientAllowedToMasquerade? %s]"
            java.lang.String r7 = java.lang.String.format(r7, r11)
            eip r8 = new eip
            r8.<init>(r7)
            iwd r9 = b
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r9.d(r7, r8, r10)
            goto L_0x00c0
        L_0x00bf:
            throw r8
        L_0x00c0:
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyi.a(int, int, java.lang.String, int, fyk):com.google.android.gms.auth.firstparty.shared.AppDescription");
    }
}
