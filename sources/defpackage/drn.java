package defpackage;

/* renamed from: drn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class drn implements Runnable {
    final /* synthetic */ drp a;

    public drn(drp drp) {
        this.a = drp;
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0255 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            drp r1 = r0.a
            com.google.android.chimera.FragmentManager r2 = r1.getFragmentManager()
            boolean r2 = r2.isDestroyed()
            r3 = 0
            if (r2 != 0) goto L_0x0283
            jma r2 = r1.f
            r4 = 2131952218(0x7f13025a, float:1.9540873E38)
            jmw r5 = r2.f(r4)
            if (r5 != 0) goto L_0x001e
            jmw r5 = r2.e(r4)
        L_0x001e:
            r4 = 2131952226(0x7f130262, float:1.9540889E38)
            jmw r6 = r2.f(r4)
            if (r6 != 0) goto L_0x002c
            jmw r6 = r2.e(r4)
        L_0x002c:
            r4 = 2131952223(0x7f13025f, float:1.9540883E38)
            jmw r7 = r2.f(r4)
            if (r7 != 0) goto L_0x003a
            jmw r7 = r2.e(r4)
        L_0x003a:
            r4 = 2131952225(0x7f130261, float:1.9540887E38)
            jmw r8 = r2.f(r4)
            if (r8 != 0) goto L_0x0048
            jmw r8 = r2.e(r4)
        L_0x0048:
            r2 = 1
            r1.a((int) r2, (defpackage.jmw) r5)
            r1.a((int) r3, (defpackage.jmw) r6)
            r4 = 3
            r1.a((int) r4, (defpackage.jmw) r7)
            boolean r5 = defpackage.awzr.b()
            r6 = 2
            if (r5 == 0) goto L_0x005e
            r1.a((int) r6, (defpackage.jmw) r8)
        L_0x005e:
            r5 = 4
            r7 = 2131952219(0x7f13025b, float:1.9540875E38)
            r1.a((int) r5, (int) r7)
            r8 = 5
            r9 = 2131952221(0x7f13025d, float:1.9540879E38)
            r1.a((int) r8, (int) r9)
            r10 = 6
            r11 = 2131952224(0x7f130260, float:1.9540885E38)
            r1.a((int) r10, (int) r11)
            r12 = 7
            r13 = 2131952227(0x7f130263, float:1.954089E38)
            r1.a((int) r12, (int) r13)
            defpackage.awzr.b()
            r14 = 0
        L_0x007f:
            java.util.List r15 = r1.c
            int r15 = r15.size()
            r16 = 0
            if (r14 >= r15) goto L_0x0265
            java.util.List r15 = r1.c
            java.lang.Object r15 = r15.get(r14)
            android.os.Parcel r15 = (android.os.Parcel) r15
            r15.setDataPosition(r3)
            android.os.Parcelable$Creator r4 = com.google.android.gms.chimera.GoogleSettingsItem.CREATOR
            java.lang.Object r4 = r4.createFromParcel(r15)
            com.google.android.gms.chimera.GoogleSettingsItem r4 = (com.google.android.gms.chimera.GoogleSettingsItem) r4
            r15.recycle()
            int r15 = r4.c
            if (r15 != r6) goto L_0x00aa
            boolean r6 = r1.a
            boolean r12 = r4.h
            r6 = r6 | r12
            r1.a = r6
        L_0x00aa:
            boolean r6 = defpackage.quj.a(r4, r1, r2)
            if (r6 == 0) goto L_0x0255
            android.content.res.Resources r6 = r1.getResources()
            r12 = 2131953708(0x7f13082c, float:1.9543895E38)
            java.lang.String r6 = r6.getString(r12)
            java.lang.String r12 = r4.d
            boolean r6 = r6.equals(r12)
            if (r6 != 0) goto L_0x0255
            nz r6 = r1.b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            java.lang.Object r6 = r6.get(r12)
            jmw r6 = (defpackage.jmw) r6
            if (r6 != 0) goto L_0x00d3
            goto L_0x0255
        L_0x00d3:
            int r12 = r4.o
            r15 = 25
            switch(r12) {
                case 0: goto L_0x01b5;
                case 1: goto L_0x01b3;
                case 2: goto L_0x01b1;
                case 3: goto L_0x01af;
                case 4: goto L_0x01ad;
                case 5: goto L_0x01ab;
                case 6: goto L_0x01a9;
                case 7: goto L_0x01a6;
                case 8: goto L_0x01a3;
                case 9: goto L_0x01a0;
                case 10: goto L_0x019d;
                case 11: goto L_0x019a;
                case 12: goto L_0x0197;
                case 13: goto L_0x0194;
                case 14: goto L_0x0191;
                case 15: goto L_0x018e;
                case 16: goto L_0x018b;
                case 17: goto L_0x0188;
                case 18: goto L_0x0185;
                case 19: goto L_0x0182;
                case 20: goto L_0x017f;
                case 21: goto L_0x017c;
                case 22: goto L_0x0179;
                case 23: goto L_0x0176;
                case 24: goto L_0x0173;
                case 25: goto L_0x0170;
                case 26: goto L_0x016d;
                case 27: goto L_0x0169;
                case 28: goto L_0x0165;
                case 29: goto L_0x0161;
                case 30: goto L_0x015d;
                case 31: goto L_0x0159;
                case 32: goto L_0x0155;
                case 33: goto L_0x0151;
                case 34: goto L_0x014d;
                case 35: goto L_0x0149;
                case 36: goto L_0x0145;
                case 37: goto L_0x0141;
                case 38: goto L_0x013d;
                case 39: goto L_0x0139;
                case 40: goto L_0x0135;
                case 41: goto L_0x0131;
                case 42: goto L_0x012d;
                case 43: goto L_0x0129;
                case 44: goto L_0x0125;
                case 45: goto L_0x0121;
                case 46: goto L_0x011d;
                case 47: goto L_0x0119;
                case 48: goto L_0x0115;
                case 49: goto L_0x0111;
                case 50: goto L_0x010d;
                case 51: goto L_0x0109;
                case 52: goto L_0x0105;
                case 53: goto L_0x0101;
                case 54: goto L_0x00fd;
                case 55: goto L_0x00f9;
                case 56: goto L_0x00f5;
                case 57: goto L_0x00f1;
                case 58: goto L_0x00ed;
                case 59: goto L_0x00e9;
                case 60: goto L_0x00e5;
                case 61: goto L_0x00e1;
                case 62: goto L_0x00dd;
                default: goto L_0x00da;
            }
        L_0x00da:
            r12 = 0
            goto L_0x01b6
        L_0x00dd:
            r12 = 63
            goto L_0x01b6
        L_0x00e1:
            r12 = 62
            goto L_0x01b6
        L_0x00e5:
            r12 = 61
            goto L_0x01b6
        L_0x00e9:
            r12 = 60
            goto L_0x01b6
        L_0x00ed:
            r12 = 59
            goto L_0x01b6
        L_0x00f1:
            r12 = 58
            goto L_0x01b6
        L_0x00f5:
            r12 = 57
            goto L_0x01b6
        L_0x00f9:
            r12 = 56
            goto L_0x01b6
        L_0x00fd:
            r12 = 55
            goto L_0x01b6
        L_0x0101:
            r12 = 54
            goto L_0x01b6
        L_0x0105:
            r12 = 53
            goto L_0x01b6
        L_0x0109:
            r12 = 52
            goto L_0x01b6
        L_0x010d:
            r12 = 51
            goto L_0x01b6
        L_0x0111:
            r12 = 50
            goto L_0x01b6
        L_0x0115:
            r12 = 49
            goto L_0x01b6
        L_0x0119:
            r12 = 48
            goto L_0x01b6
        L_0x011d:
            r12 = 47
            goto L_0x01b6
        L_0x0121:
            r12 = 46
            goto L_0x01b6
        L_0x0125:
            r12 = 45
            goto L_0x01b6
        L_0x0129:
            r12 = 44
            goto L_0x01b6
        L_0x012d:
            r12 = 43
            goto L_0x01b6
        L_0x0131:
            r12 = 42
            goto L_0x01b6
        L_0x0135:
            r12 = 41
            goto L_0x01b6
        L_0x0139:
            r12 = 40
            goto L_0x01b6
        L_0x013d:
            r12 = 39
            goto L_0x01b6
        L_0x0141:
            r12 = 38
            goto L_0x01b6
        L_0x0145:
            r12 = 37
            goto L_0x01b6
        L_0x0149:
            r12 = 36
            goto L_0x01b6
        L_0x014d:
            r12 = 35
            goto L_0x01b6
        L_0x0151:
            r12 = 34
            goto L_0x01b6
        L_0x0155:
            r12 = 33
            goto L_0x01b6
        L_0x0159:
            r12 = 32
            goto L_0x01b6
        L_0x015d:
            r12 = 31
            goto L_0x01b6
        L_0x0161:
            r12 = 30
            goto L_0x01b6
        L_0x0165:
            r12 = 29
            goto L_0x01b6
        L_0x0169:
            r12 = 28
            goto L_0x01b6
        L_0x016d:
            r12 = 27
            goto L_0x01b6
        L_0x0170:
            r12 = 26
            goto L_0x01b6
        L_0x0173:
            r12 = 25
            goto L_0x01b6
        L_0x0176:
            r12 = 24
            goto L_0x01b6
        L_0x0179:
            r12 = 23
            goto L_0x01b6
        L_0x017c:
            r12 = 22
            goto L_0x01b6
        L_0x017f:
            r12 = 21
            goto L_0x01b6
        L_0x0182:
            r12 = 20
            goto L_0x01b6
        L_0x0185:
            r12 = 19
            goto L_0x01b6
        L_0x0188:
            r12 = 18
            goto L_0x01b6
        L_0x018b:
            r12 = 17
            goto L_0x01b6
        L_0x018e:
            r12 = 16
            goto L_0x01b6
        L_0x0191:
            r12 = 15
            goto L_0x01b6
        L_0x0194:
            r12 = 14
            goto L_0x01b6
        L_0x0197:
            r12 = 13
            goto L_0x01b6
        L_0x019a:
            r12 = 12
            goto L_0x01b6
        L_0x019d:
            r12 = 11
            goto L_0x01b6
        L_0x01a0:
            r12 = 10
            goto L_0x01b6
        L_0x01a3:
            r12 = 9
            goto L_0x01b6
        L_0x01a6:
            r12 = 8
            goto L_0x01b6
        L_0x01a9:
            r12 = 7
            goto L_0x01b6
        L_0x01ab:
            r12 = 6
            goto L_0x01b6
        L_0x01ad:
            r12 = 5
            goto L_0x01b6
        L_0x01af:
            r12 = 4
            goto L_0x01b6
        L_0x01b1:
            r12 = 3
            goto L_0x01b6
        L_0x01b3:
            r12 = 2
            goto L_0x01b6
        L_0x01b5:
            r12 = 1
        L_0x01b6:
            android.content.Intent r2 = r4.b
            java.lang.String r13 = r4.d
            java.lang.String r10 = r4.i
            if (r12 == 0) goto L_0x01bf
            goto L_0x01c0
        L_0x01bf:
            r12 = 1
        L_0x01c0:
            int r11 = r6.b
            ov r8 = r1.d
            java.lang.Object r8 = r8.a(r11)
            if (r8 == 0) goto L_0x0226
            awzr r8 = defpackage.awzr.a
            awzs r8 = r8.a()
            boolean r8 = r8.c()
            if (r8 == 0) goto L_0x0219
            boolean r8 = r1.b((android.content.Intent) r2)
            if (r8 != 0) goto L_0x0202
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r6 = java.lang.String.valueOf(r2)
            int r6 = r6.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r6 = r6 + r15
            r8.<init>(r6)
            java.lang.String r6 = "Intent does not resolve: "
            r8.append(r6)
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            java.lang.String r6 = "GoogleSettingsActivity"
            android.util.Log.w(r6, r2)
            r8 = r16
            goto L_0x0247
        L_0x0202:
            com.google.android.gms.chimera.GoogleSettingsItem r8 = new com.google.android.gms.chimera.GoogleSettingsItem
            int r6 = r6.b
            r8.<init>((android.content.Intent) r2, (int) r6, (java.lang.String) r13, (int) r12)
            r8.i = r10
            ov r2 = r1.d
            java.lang.Object r2 = r2.a(r11)
            java.util.List r2 = (java.util.List) r2
            r2.add(r8)
            r8 = r16
            goto L_0x0247
        L_0x0219:
            nz r6 = r1.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Object r6 = r6.get(r8)
            jmw r6 = (defpackage.jmw) r6
            goto L_0x0227
        L_0x0226:
        L_0x0227:
            boolean r8 = r1.b((android.content.Intent) r2)
            if (r8 == 0) goto L_0x0245
            jmc r8 = defpackage.hde.b((android.content.Context) r1)
            r8.a((java.lang.CharSequence) r13)
            r8.a((android.content.Intent) r2)
            r8.b((java.lang.CharSequence) r10)
            boolean r2 = r6.b(r8)
            if (r2 != 0) goto L_0x0244
            r6.a((defpackage.jmc) r8)
            goto L_0x0247
        L_0x0244:
            goto L_0x0247
        L_0x0245:
            r8 = r16
        L_0x0247:
            if (r8 == 0) goto L_0x0255
            boolean r2 = r4.j
            r8.a((boolean) r2)
            int r2 = r4.e
            if (r2 <= 0) goto L_0x0255
            r8.a((int) r2)
        L_0x0255:
            int r14 = r14 + 1
            r2 = 1
            r4 = 3
            r6 = 2
            r8 = 5
            r10 = 6
            r11 = 2131952224(0x7f130260, float:1.9540885E38)
            r12 = 7
            r13 = 2131952227(0x7f130263, float:1.954089E38)
            goto L_0x007f
        L_0x0265:
            r1.b(r5, r7)
            r2 = 5
            r1.b(r2, r9)
            r2 = 2131952224(0x7f130260, float:1.9540885E38)
            r3 = 6
            r1.b(r3, r2)
            r2 = 2131952227(0x7f130263, float:1.954089E38)
            r3 = 7
            r1.b(r3, r2)
            java.util.List r1 = r1.c
            r1.clear()
            defpackage.drp.e = r16
            return
        L_0x0283:
        L_0x0284:
            java.util.List r2 = r1.c
            int r2 = r2.size()
            if (r3 >= r2) goto L_0x029a
            java.util.List r2 = r1.c
            java.lang.Object r2 = r2.get(r3)
            android.os.Parcel r2 = (android.os.Parcel) r2
            r2.recycle()
            int r3 = r3 + 1
            goto L_0x0284
        L_0x029a:
            java.util.List r1 = r1.c
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drn.run():void");
    }
}
