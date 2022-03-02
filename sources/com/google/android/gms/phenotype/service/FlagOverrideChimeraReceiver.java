package com.google.android.gms.phenotype.service;

import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class FlagOverrideChimeraReceiver extends BroadcastReceiver {
    public static final jjg b = jjg.a(iyc.PHENOTYPE);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r20, android.content.Intent r21) {
        /*
            r19 = this;
            r0 = r21
            yey r1 = defpackage.yef.a((android.content.Context) r20)
            java.lang.String r2 = r21.getAction()
            java.lang.String r3 = "com.google.android.gms.phenotype.FLAG_OVERRIDE"
            boolean r2 = r3.equals(r2)
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r4 = "a"
            java.lang.String r5 = "com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver"
            if (r2 == 0) goto L_0x018f
            java.lang.String r2 = "action"
            java.lang.String r2 = r0.getStringExtra(r2)
            java.lang.String r6 = "delete"
            boolean r2 = r6.equals(r2)
            java.lang.String r6 = "user"
            java.lang.String r7 = "package"
            if (r2 != 0) goto L_0x0176
            java.lang.String r2 = r0.getStringExtra(r7)
            java.lang.String r6 = r0.getStringExtra(r6)
            java.lang.String r7 = "commit"
            r8 = 0
            boolean r7 = r0.getBooleanExtra(r7, r8)
            java.lang.String r9 = "flags"
            java.lang.String[] r10 = r0.getStringArrayExtra(r9)
            java.lang.String r11 = "values"
            java.lang.String[] r12 = r0.getStringArrayExtra(r11)
            java.lang.String r13 = "types"
            java.lang.String[] r14 = r0.getStringArrayExtra(r13)
            if (r10 != 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            if (r12 == 0) goto L_0x0053
            if (r14 == 0) goto L_0x0053
        L_0x0052:
            goto L_0x0077
        L_0x0053:
            java.lang.String r9 = r0.getStringExtra(r9)
            java.lang.String r11 = r0.getStringExtra(r11)
            java.lang.String r0 = r0.getStringExtra(r13)
            if (r9 != 0) goto L_0x0063
            goto L_0x0077
        L_0x0063:
            if (r11 != 0) goto L_0x0066
            goto L_0x0077
        L_0x0066:
            if (r0 == 0) goto L_0x0052
            java.lang.String r10 = ","
            java.lang.String[] r9 = r9.split(r10)
            java.lang.String[] r12 = r11.split(r10)
            java.lang.String[] r14 = r0.split(r10)
            r10 = r9
        L_0x0077:
            if (r10 != 0) goto L_0x007b
            goto L_0x0160
        L_0x007b:
            if (r12 == 0) goto L_0x0160
            if (r14 == 0) goto L_0x0160
            int r9 = r10.length
            int r0 = r12.length
            if (r9 != r0) goto L_0x014a
            int r11 = r14.length
            if (r0 == r11) goto L_0x0088
            goto L_0x014a
        L_0x0088:
            com.google.android.gms.phenotype.Flag[] r11 = new com.google.android.gms.phenotype.Flag[r9]
            r13 = 0
        L_0x008b:
            if (r13 >= r9) goto L_0x0140
            r0 = r14[r13]
            int r15 = r0.hashCode()
            r8 = 1
            switch(r15) {
                case -1325958191: goto L_0x00c0;
                case -891985903: goto L_0x00b6;
                case 3327612: goto L_0x00ac;
                case 64711720: goto L_0x00a2;
                case 94224491: goto L_0x0098;
                default: goto L_0x0097;
            }
        L_0x0097:
            goto L_0x00ca
        L_0x0098:
            java.lang.String r15 = "bytes"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00ca
            r0 = 4
            goto L_0x00cb
        L_0x00a2:
            java.lang.String r15 = "boolean"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00ca
            r0 = 1
            goto L_0x00cb
        L_0x00ac:
            java.lang.String r15 = "long"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00ca
            r0 = 0
            goto L_0x00cb
        L_0x00b6:
            java.lang.String r15 = "string"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00ca
            r0 = 3
            goto L_0x00cb
        L_0x00c0:
            java.lang.String r15 = "double"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00ca
            r0 = 2
            goto L_0x00cb
        L_0x00ca:
            r0 = -1
        L_0x00cb:
            if (r0 == 0) goto L_0x00f8
            if (r0 == r8) goto L_0x00f6
            r8 = 2
            if (r0 == r8) goto L_0x00f4
            r8 = 3
            if (r0 == r8) goto L_0x00f2
            r8 = 4
            if (r0 == r8) goto L_0x00f0
            jjg r0 = b
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r1 = 137(0x89, float:1.92E-43)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r4, (int) r1, (java.lang.String) r3)
            anih r0 = (defpackage.anih) r0
            r1 = r14[r13]
            java.lang.String r2 = "Invalid flag type %s"
            r0.a((java.lang.String) r2, (java.lang.Object) r1)
            return
        L_0x00f0:
            r8 = 5
            goto L_0x00f9
        L_0x00f2:
            r8 = 4
            goto L_0x00f8
        L_0x00f4:
            r8 = 3
            goto L_0x00f8
        L_0x00f6:
            r8 = 2
            goto L_0x00f9
        L_0x00f8:
        L_0x00f9:
            r0 = r12[r13]
            r15 = 39
            r16 = r9
            r9 = 44
            java.lang.String r9 = r0.replace(r15, r9)
            com.google.android.gms.phenotype.Flag r0 = new com.google.android.gms.phenotype.Flag     // Catch:{ IllegalArgumentException -> 0x011d }
            r15 = r10[r13]     // Catch:{ IllegalArgumentException -> 0x011d }
            if (r7 != 0) goto L_0x010f
            r18 = r7
            r7 = 0
            goto L_0x0115
        L_0x010f:
            r17 = -1000(0xfffffffffffffc18, float:NaN)
            r18 = r7
            r7 = -1000(0xfffffffffffffc18, float:NaN)
        L_0x0115:
            r0.<init>(r15, r9, r8, r7)     // Catch:{ IllegalArgumentException -> 0x011b }
            r11[r13] = r0     // Catch:{ IllegalArgumentException -> 0x011b }
            goto L_0x0137
        L_0x011b:
            r0 = move-exception
            goto L_0x0120
        L_0x011d:
            r0 = move-exception
            r18 = r7
        L_0x0120:
            jjg r0 = b
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r7 = 146(0x92, float:2.05E-43)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r4, (int) r7, (java.lang.String) r3)
            anih r0 = (defpackage.anih) r0
            r7 = r14[r13]
            java.lang.String r8 = "Invalid flag value for flag type %s: %s"
            r0.a((java.lang.String) r8, (java.lang.Object) r7, (java.lang.Object) r9)
        L_0x0137:
            int r13 = r13 + 1
            r9 = r16
            r7 = r18
            r8 = 0
            goto L_0x008b
        L_0x0140:
            acwa r0 = r1.a((java.lang.String) r2, (java.lang.String) r6, (com.google.android.gms.phenotype.Flag[]) r11)
            acvp r1 = defpackage.ygq.a
            r0.a((defpackage.acvp) r1)
            return
        L_0x014a:
            jjg r0 = b
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r1 = 114(0x72, float:1.6E-43)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r4, (int) r1, (java.lang.String) r3)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "Mismatched lengths in flags, values, and types"
            r0.a((java.lang.String) r1)
            return
        L_0x0160:
            jjg r0 = b
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r1 = 110(0x6e, float:1.54E-43)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r4, (int) r1, (java.lang.String) r3)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "Missing flags, values, or types parameter"
            r0.a((java.lang.String) r1)
            return
        L_0x0176:
            java.lang.String r2 = r0.getStringExtra(r7)
            java.lang.String r3 = r0.getStringExtra(r6)
            java.lang.String r4 = "flag"
            java.lang.String r0 = r0.getStringExtra(r4)
            acwa r0 = r1.b(r2, r3, r0)
            acvp r1 = defpackage.ygr.a
            r0.a((defpackage.acvp) r1)
            return
        L_0x018f:
            java.lang.String r0 = r21.getAction()
            java.lang.String r1 = "com.google.android.gms.phenotype.CODEGEN_MIGRATION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01b1
            jjg r0 = b
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r2 = 85
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r4, (int) r2, (java.lang.String) r3)
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "Action %s not supported on non-debug builds"
            r0.a((java.lang.String) r2, (java.lang.Object) r1)
        L_0x01b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(android.content.Context r19, android.content.Intent r20, defpackage.yey r21) {
        /*
            r0 = r20
            r1 = r21
            java.lang.String r2 = r20.getAction()
            java.lang.String r3 = "com.google.android.gms.phenotype.FLAG_OVERRIDE"
            boolean r2 = r3.equals(r2)
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r4 = "a"
            java.lang.String r5 = "com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver"
            if (r2 == 0) goto L_0x018d
            java.lang.String r2 = "action"
            java.lang.String r2 = r0.getStringExtra(r2)
            java.lang.String r6 = "delete"
            boolean r2 = r6.equals(r2)
            java.lang.String r6 = "user"
            java.lang.String r7 = "package"
            if (r2 != 0) goto L_0x0174
            java.lang.String r2 = r0.getStringExtra(r7)
            java.lang.String r6 = r0.getStringExtra(r6)
            java.lang.String r7 = "commit"
            r8 = 0
            boolean r7 = r0.getBooleanExtra(r7, r8)
            java.lang.String r9 = "flags"
            java.lang.String[] r10 = r0.getStringArrayExtra(r9)
            java.lang.String r11 = "values"
            java.lang.String[] r12 = r0.getStringArrayExtra(r11)
            java.lang.String r13 = "types"
            java.lang.String[] r14 = r0.getStringArrayExtra(r13)
            if (r10 != 0) goto L_0x004c
            goto L_0x0051
        L_0x004c:
            if (r12 == 0) goto L_0x0051
            if (r14 == 0) goto L_0x0051
        L_0x0050:
            goto L_0x0075
        L_0x0051:
            java.lang.String r9 = r0.getStringExtra(r9)
            java.lang.String r11 = r0.getStringExtra(r11)
            java.lang.String r0 = r0.getStringExtra(r13)
            if (r9 != 0) goto L_0x0061
            goto L_0x0075
        L_0x0061:
            if (r11 != 0) goto L_0x0064
            goto L_0x0075
        L_0x0064:
            if (r0 == 0) goto L_0x0050
            java.lang.String r10 = ","
            java.lang.String[] r9 = r9.split(r10)
            java.lang.String[] r12 = r11.split(r10)
            java.lang.String[] r14 = r0.split(r10)
            r10 = r9
        L_0x0075:
            if (r10 != 0) goto L_0x0079
            goto L_0x015e
        L_0x0079:
            if (r12 == 0) goto L_0x015e
            if (r14 == 0) goto L_0x015e
            int r9 = r10.length
            int r0 = r12.length
            if (r9 != r0) goto L_0x0148
            int r11 = r14.length
            if (r0 == r11) goto L_0x0086
            goto L_0x0148
        L_0x0086:
            com.google.android.gms.phenotype.Flag[] r11 = new com.google.android.gms.phenotype.Flag[r9]
            r13 = 0
        L_0x0089:
            if (r13 >= r9) goto L_0x013e
            r0 = r14[r13]
            int r15 = r0.hashCode()
            r8 = 1
            switch(r15) {
                case -1325958191: goto L_0x00be;
                case -891985903: goto L_0x00b4;
                case 3327612: goto L_0x00aa;
                case 64711720: goto L_0x00a0;
                case 94224491: goto L_0x0096;
                default: goto L_0x0095;
            }
        L_0x0095:
            goto L_0x00c8
        L_0x0096:
            java.lang.String r15 = "bytes"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00c8
            r0 = 4
            goto L_0x00c9
        L_0x00a0:
            java.lang.String r15 = "boolean"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00c8
            r0 = 1
            goto L_0x00c9
        L_0x00aa:
            java.lang.String r15 = "long"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00c8
            r0 = 0
            goto L_0x00c9
        L_0x00b4:
            java.lang.String r15 = "string"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00c8
            r0 = 3
            goto L_0x00c9
        L_0x00be:
            java.lang.String r15 = "double"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00c8
            r0 = 2
            goto L_0x00c9
        L_0x00c8:
            r0 = -1
        L_0x00c9:
            if (r0 == 0) goto L_0x00f6
            if (r0 == r8) goto L_0x00f4
            r8 = 2
            if (r0 == r8) goto L_0x00f2
            r8 = 3
            if (r0 == r8) goto L_0x00f0
            r8 = 4
            if (r0 == r8) goto L_0x00ee
            jjg r0 = b
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r1 = 137(0x89, float:1.92E-43)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r4, (int) r1, (java.lang.String) r3)
            anih r0 = (defpackage.anih) r0
            r1 = r14[r13]
            java.lang.String r2 = "Invalid flag type %s"
            r0.a((java.lang.String) r2, (java.lang.Object) r1)
            return
        L_0x00ee:
            r8 = 5
            goto L_0x00f7
        L_0x00f0:
            r8 = 4
            goto L_0x00f6
        L_0x00f2:
            r8 = 3
            goto L_0x00f6
        L_0x00f4:
            r8 = 2
            goto L_0x00f7
        L_0x00f6:
        L_0x00f7:
            r0 = r12[r13]
            r15 = 39
            r16 = r9
            r9 = 44
            java.lang.String r9 = r0.replace(r15, r9)
            com.google.android.gms.phenotype.Flag r0 = new com.google.android.gms.phenotype.Flag     // Catch:{ IllegalArgumentException -> 0x011b }
            r15 = r10[r13]     // Catch:{ IllegalArgumentException -> 0x011b }
            if (r7 != 0) goto L_0x010d
            r18 = r7
            r7 = 0
            goto L_0x0113
        L_0x010d:
            r17 = -1000(0xfffffffffffffc18, float:NaN)
            r18 = r7
            r7 = -1000(0xfffffffffffffc18, float:NaN)
        L_0x0113:
            r0.<init>(r15, r9, r8, r7)     // Catch:{ IllegalArgumentException -> 0x0119 }
            r11[r13] = r0     // Catch:{ IllegalArgumentException -> 0x0119 }
            goto L_0x0135
        L_0x0119:
            r0 = move-exception
            goto L_0x011e
        L_0x011b:
            r0 = move-exception
            r18 = r7
        L_0x011e:
            jjg r0 = b
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r7 = 146(0x92, float:2.05E-43)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r4, (int) r7, (java.lang.String) r3)
            anih r0 = (defpackage.anih) r0
            r7 = r14[r13]
            java.lang.String r8 = "Invalid flag value for flag type %s: %s"
            r0.a((java.lang.String) r8, (java.lang.Object) r7, (java.lang.Object) r9)
        L_0x0135:
            int r13 = r13 + 1
            r9 = r16
            r7 = r18
            r8 = 0
            goto L_0x0089
        L_0x013e:
            acwa r0 = r1.a((java.lang.String) r2, (java.lang.String) r6, (com.google.android.gms.phenotype.Flag[]) r11)
            acvp r1 = defpackage.ygq.a
            r0.a((defpackage.acvp) r1)
            return
        L_0x0148:
            jjg r0 = b
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r1 = 114(0x72, float:1.6E-43)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r4, (int) r1, (java.lang.String) r3)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "Mismatched lengths in flags, values, and types"
            r0.a((java.lang.String) r1)
            return
        L_0x015e:
            jjg r0 = b
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r1 = 110(0x6e, float:1.54E-43)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r4, (int) r1, (java.lang.String) r3)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "Missing flags, values, or types parameter"
            r0.a((java.lang.String) r1)
            return
        L_0x0174:
            java.lang.String r2 = r0.getStringExtra(r7)
            java.lang.String r3 = r0.getStringExtra(r6)
            java.lang.String r4 = "flag"
            java.lang.String r0 = r0.getStringExtra(r4)
            acwa r0 = r1.b(r2, r3, r0)
            acvp r1 = defpackage.ygr.a
            r0.a((defpackage.acvp) r1)
            return
        L_0x018d:
            java.lang.String r0 = r20.getAction()
            java.lang.String r1 = "com.google.android.gms.phenotype.CODEGEN_MIGRATION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01af
            jjg r0 = b
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r2 = 85
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r4, (int) r2, (java.lang.String) r3)
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "Action %s not supported on non-debug builds"
            r0.a((java.lang.String) r2, (java.lang.Object) r1)
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver.a(android.content.Context, android.content.Intent, yey):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.Intent r18, defpackage.yey r19) {
        /*
            r0 = r18
            java.lang.String r1 = "package"
            java.lang.String r1 = r0.getStringExtra(r1)
            java.lang.String r2 = "user"
            java.lang.String r2 = r0.getStringExtra(r2)
            java.lang.String r3 = "commit"
            r4 = 0
            boolean r3 = r0.getBooleanExtra(r3, r4)
            java.lang.String r5 = "flags"
            java.lang.String[] r6 = r0.getStringArrayExtra(r5)
            java.lang.String r7 = "values"
            java.lang.String[] r8 = r0.getStringArrayExtra(r7)
            java.lang.String r9 = "types"
            java.lang.String[] r10 = r0.getStringArrayExtra(r9)
            if (r6 != 0) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            if (r8 == 0) goto L_0x002f
            if (r10 == 0) goto L_0x002f
        L_0x002e:
            goto L_0x0053
        L_0x002f:
            java.lang.String r5 = r0.getStringExtra(r5)
            java.lang.String r7 = r0.getStringExtra(r7)
            java.lang.String r0 = r0.getStringExtra(r9)
            if (r5 != 0) goto L_0x003f
            goto L_0x0053
        L_0x003f:
            if (r7 != 0) goto L_0x0042
            goto L_0x0053
        L_0x0042:
            if (r0 == 0) goto L_0x002e
            java.lang.String r6 = ","
            java.lang.String[] r5 = r5.split(r6)
            java.lang.String[] r8 = r7.split(r6)
            java.lang.String[] r10 = r0.split(r6)
            r6 = r5
        L_0x0053:
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r7 = "a"
            java.lang.String r9 = "com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver"
            if (r6 != 0) goto L_0x005d
            goto L_0x0140
        L_0x005d:
            if (r8 == 0) goto L_0x0140
            if (r10 == 0) goto L_0x0140
            int r11 = r6.length
            int r0 = r8.length
            if (r11 != r0) goto L_0x012a
            int r12 = r10.length
            if (r0 == r12) goto L_0x006a
            goto L_0x012a
        L_0x006a:
            com.google.android.gms.phenotype.Flag[] r12 = new com.google.android.gms.phenotype.Flag[r11]
            r13 = 0
        L_0x006d:
            if (r13 >= r11) goto L_0x011e
            r0 = r10[r13]
            int r14 = r0.hashCode()
            r15 = 2
            r4 = 1
            switch(r14) {
                case -1325958191: goto L_0x00a3;
                case -891985903: goto L_0x0099;
                case 3327612: goto L_0x008f;
                case 64711720: goto L_0x0085;
                case 94224491: goto L_0x007b;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x00ad
        L_0x007b:
            java.lang.String r14 = "bytes"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00ad
            r0 = 4
            goto L_0x00ae
        L_0x0085:
            java.lang.String r14 = "boolean"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00ad
            r0 = 1
            goto L_0x00ae
        L_0x008f:
            java.lang.String r14 = "long"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00ad
            r0 = 0
            goto L_0x00ae
        L_0x0099:
            java.lang.String r14 = "string"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00ad
            r0 = 3
            goto L_0x00ae
        L_0x00a3:
            java.lang.String r14 = "double"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00ad
            r0 = 2
            goto L_0x00ae
        L_0x00ad:
            r0 = -1
        L_0x00ae:
            if (r0 == 0) goto L_0x00da
            if (r0 == r4) goto L_0x00db
            if (r0 == r15) goto L_0x00d7
            r4 = 3
            if (r0 == r4) goto L_0x00d4
            r4 = 4
            if (r0 == r4) goto L_0x00d2
            jjg r0 = b
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r1 = 137(0x89, float:1.92E-43)
            anie r0 = r0.a((java.lang.String) r9, (java.lang.String) r7, (int) r1, (java.lang.String) r5)
            anih r0 = (defpackage.anih) r0
            r1 = r10[r13]
            java.lang.String r2 = "Invalid flag type %s"
            r0.a((java.lang.String) r2, (java.lang.Object) r1)
            return
        L_0x00d2:
            r15 = 5
            goto L_0x00db
        L_0x00d4:
            r4 = 4
            r15 = 4
            goto L_0x00db
        L_0x00d7:
            r4 = 3
            r15 = 3
            goto L_0x00db
        L_0x00da:
            r15 = 1
        L_0x00db:
            r0 = r8[r13]
            r4 = 39
            r14 = 44
            java.lang.String r4 = r0.replace(r4, r14)
            com.google.android.gms.phenotype.Flag r0 = new com.google.android.gms.phenotype.Flag     // Catch:{ IllegalArgumentException -> 0x00fd }
            r14 = r6[r13]     // Catch:{ IllegalArgumentException -> 0x00fd }
            if (r3 != 0) goto L_0x00ef
            r17 = r3
            r3 = 0
            goto L_0x00f5
        L_0x00ef:
            r16 = -1000(0xfffffffffffffc18, float:NaN)
            r17 = r3
            r3 = -1000(0xfffffffffffffc18, float:NaN)
        L_0x00f5:
            r0.<init>(r14, r4, r15, r3)     // Catch:{ IllegalArgumentException -> 0x00fb }
            r12[r13] = r0     // Catch:{ IllegalArgumentException -> 0x00fb }
            goto L_0x0117
        L_0x00fb:
            r0 = move-exception
            goto L_0x0100
        L_0x00fd:
            r0 = move-exception
            r17 = r3
        L_0x0100:
            jjg r0 = b
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r3 = 146(0x92, float:2.05E-43)
            anie r0 = r0.a((java.lang.String) r9, (java.lang.String) r7, (int) r3, (java.lang.String) r5)
            anih r0 = (defpackage.anih) r0
            r3 = r10[r13]
            java.lang.String r14 = "Invalid flag value for flag type %s: %s"
            r0.a((java.lang.String) r14, (java.lang.Object) r3, (java.lang.Object) r4)
        L_0x0117:
            int r13 = r13 + 1
            r3 = r17
            r4 = 0
            goto L_0x006d
        L_0x011e:
            r3 = r19
            acwa r0 = r3.a((java.lang.String) r1, (java.lang.String) r2, (com.google.android.gms.phenotype.Flag[]) r12)
            acvp r1 = defpackage.ygq.a
            r0.a((defpackage.acvp) r1)
            return
        L_0x012a:
            jjg r0 = b
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r1 = 114(0x72, float:1.6E-43)
            anie r0 = r0.a((java.lang.String) r9, (java.lang.String) r7, (int) r1, (java.lang.String) r5)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "Mismatched lengths in flags, values, and types"
            r0.a((java.lang.String) r1)
            return
        L_0x0140:
            jjg r0 = b
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r1 = 110(0x6e, float:1.54E-43)
            anie r0 = r0.a((java.lang.String) r9, (java.lang.String) r7, (int) r1, (java.lang.String) r5)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "Missing flags, values, or types parameter"
            r0.a((java.lang.String) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver.a(android.content.Intent, yey):void");
    }
}
