package defpackage;

/* renamed from: aotc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aotc {
    static final aotb a;

    static {
        aotb aotb = new aotb();
        a = aotb;
        byte[] bArr = aotb.c;
        int[] iArr = a.d;
        int[] iArr2 = a.b;
        int i = 1;
        int i2 = 0;
        for (int i3 = 0; i3 < 217; i3++) {
            char charAt = "# #s #, #e #.# the #.com/#Â # of # and # in # to #\"#\">#\n#]# for # a # that #. # with #'# from # by #. The # on # as # is #ing #\n\t#:#ed #(# at #ly #=\"# of the #. This #,# not #er #al #='#ful #ive #less #est #ize #ous #".charAt(i3);
            if (charAt == '#') {
                iArr[i] = i2;
                i++;
            } else {
                bArr[i2] = (byte) charAt;
                i2++;
            }
        }
        for (int i4 = 0; i4 < 363; i4++) {
            iArr2[i4] = "     !! ! ,  *!  &!  \" !  ) *   * -  ! # !  #!*!  +  ,$ !  -  %  .  / #   0  1 .  \"   2  3!*   4%  ! # /   5  6  7  8 0  1 &   $   9 +   :  ;  < '  !=  >  ?! 4  @ 4  2  &   A *# (   B  C& ) %  ) !*# *-% A +! *.  D! %'  & E *6  F  G% ! *A *%  H! D  I!+!  J!+   K +- *4! A  L!*4  M  N +6  O!*% +.! K *G  P +%(  ! G *D +D  Q +# *K!*G!+D!+# +G +A +4!+% +K!+4!*D!+K!*K".charAt(i4) - ' ';
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0162 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int a(byte[] r21, int r22, java.nio.ByteBuffer r23, int r24, int r25, defpackage.aotb r26, int r27) {
        /*
            r0 = r25
            r1 = r26
            int[] r2 = r1.b
            byte[] r3 = r1.c
            int[] r4 = r1.d
            int r5 = r27 * 3
            r6 = r2[r5]
            int r7 = r5 + 1
            r7 = r2[r7]
            r8 = 2
            int r5 = r5 + r8
            r2 = r2[r5]
            r5 = r4[r6]
            r9 = 1
            int r6 = r6 + r9
            r6 = r4[r6]
            r10 = r4[r2]
            int r2 = r2 + r9
            r2 = r4[r2]
            int r4 = r7 + -11
            r11 = 9
            if (r4 > 0) goto L_0x0029
            r4 = 0
            goto L_0x002c
        L_0x0029:
            if (r4 <= r11) goto L_0x002c
            r4 = 0
        L_0x002c:
            if (r7 > 0) goto L_0x0032
            r11 = r22
            r13 = 0
            goto L_0x003b
        L_0x0032:
            if (r7 <= r11) goto L_0x0038
            r11 = r22
            r13 = 0
            goto L_0x003b
        L_0x0038:
            r11 = r22
            r13 = r7
        L_0x003b:
            if (r5 == r6) goto L_0x0048
            int r14 = r11 + 1
            int r15 = r5 + 1
            byte r5 = r3[r5]
            r21[r11] = r5
            r11 = r14
            r5 = r15
            goto L_0x003b
        L_0x0048:
            if (r4 > r0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r4 = r0
        L_0x004c:
            int r5 = r24 + r4
            int r0 = r0 - r4
            int r0 = r0 - r13
            r4 = r0
        L_0x0051:
            if (r4 <= 0) goto L_0x0064
            int r6 = r11 + 1
            int r13 = r5 + 1
            r14 = r23
            byte r5 = r14.get(r5)
            r21[r11] = r5
            int r4 = r4 + -1
            r11 = r6
            r5 = r13
            goto L_0x0051
        L_0x0064:
            r4 = 10
            r5 = 224(0xe0, float:3.14E-43)
            r6 = 192(0xc0, float:2.69E-43)
            if (r7 != r4) goto L_0x006e
            goto L_0x0168
        L_0x006e:
            r13 = 11
            if (r7 == r13) goto L_0x0168
            r4 = 21
            if (r7 != r4) goto L_0x0077
            goto L_0x007d
        L_0x0077:
            r13 = 22
            if (r7 == r13) goto L_0x007d
        L_0x007b:
            goto L_0x01a9
        L_0x007d:
            int r13 = r11 - r0
            short[] r1 = r1.e
            short r1 = r1[r27]
            r14 = r1 & 32767(0x7fff, float:4.5916E-41)
            r15 = 16777216(0x1000000, float:2.3509887E-38)
            r16 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r16
            int r15 = r15 - r1
            int r14 = r14 + r15
        L_0x008e:
            if (r0 <= 0) goto L_0x007b
            byte r1 = r21[r13]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r15 = 128(0x80, float:1.794E-43)
            r9 = 4
            r12 = 3
            if (r1 >= r15) goto L_0x00a4
            int r14 = r14 + r1
            r1 = r14 & 127(0x7f, float:1.78E-43)
            byte r1 = (byte) r1
            r21[r13] = r1
        L_0x00a0:
            r4 = 2
            r9 = 1
            goto L_0x015b
        L_0x00a4:
            if (r1 < r6) goto L_0x0159
            if (r1 < r5) goto L_0x0135
            r15 = 240(0xf0, float:3.36E-43)
            if (r1 < r15) goto L_0x00fd
            r12 = 248(0xf8, float:3.48E-43)
            if (r1 < r12) goto L_0x00b1
            goto L_0x00a0
        L_0x00b1:
            if (r0 < r9) goto L_0x00fb
            int r12 = r13 + 1
            byte r9 = r21[r12]
            int r17 = r13 + 2
            byte r4 = r21[r17]
            int r18 = r13 + 3
            byte r8 = r21[r18]
            r19 = r8 & 63
            r20 = r4 & 63
            int r20 = r20 << 6
            r19 = r19 | r20
            r20 = r9 & 63
            int r20 = r20 << 12
            r19 = r19 | r20
            r1 = r1 & 7
            int r1 = r1 << 18
            r1 = r19 | r1
            int r14 = r14 + r1
            int r1 = r14 >> 18
            r1 = r1 & 7
            r1 = r1 | r15
            byte r1 = (byte) r1
            r21[r13] = r1
            r1 = r9 & 192(0xc0, float:2.69E-43)
            int r9 = r14 >> 12
            r9 = r9 & 63
            r1 = r1 | r9
            byte r1 = (byte) r1
            r21[r12] = r1
            r1 = r4 & 192(0xc0, float:2.69E-43)
            int r4 = r14 >> 6
            r4 = r4 & 63
            r1 = r1 | r4
            byte r1 = (byte) r1
            r21[r17] = r1
            r1 = r8 & 192(0xc0, float:2.69E-43)
            r4 = r14 & 63
            r1 = r1 | r4
            byte r1 = (byte) r1
            r21[r18] = r1
            r4 = 2
            r9 = 4
            goto L_0x015b
        L_0x00fb:
            r4 = 2
            goto L_0x0157
        L_0x00fd:
            if (r0 < r12) goto L_0x0133
            int r4 = r13 + 1
            byte r8 = r21[r4]
            int r9 = r13 + 2
            byte r15 = r21[r9]
            r17 = r15 & 63
            r18 = r8 & 63
            int r18 = r18 << 6
            r17 = r17 | r18
            r1 = r1 & 15
            int r1 = r1 << 12
            r1 = r17 | r1
            int r14 = r14 + r1
            int r1 = r14 >> 12
            r1 = r1 & 15
            r1 = r1 | r5
            byte r1 = (byte) r1
            r21[r13] = r1
            r1 = r8 & 192(0xc0, float:2.69E-43)
            int r8 = r14 >> 6
            r8 = r8 & 63
            r1 = r1 | r8
            byte r1 = (byte) r1
            r21[r4] = r1
            r1 = r15 & 192(0xc0, float:2.69E-43)
            r4 = r14 & 63
            r1 = r1 | r4
            byte r1 = (byte) r1
            r21[r9] = r1
            r4 = 2
            r9 = 3
            goto L_0x015b
        L_0x0133:
            r4 = 2
            goto L_0x0157
        L_0x0135:
            r4 = 2
            if (r0 < r4) goto L_0x0156
            int r8 = r13 + 1
            byte r9 = r21[r8]
            r12 = r9 & 63
            r1 = r1 & 31
            int r1 = r1 << 6
            r1 = r1 | r12
            int r14 = r14 + r1
            int r1 = r14 >> 6
            r1 = r1 & 31
            r1 = r1 | r6
            byte r1 = (byte) r1
            r21[r13] = r1
            r1 = r9 & 192(0xc0, float:2.69E-43)
            r9 = r14 & 63
            r1 = r1 | r9
            byte r1 = (byte) r1
            r21[r8] = r1
            r9 = 2
            goto L_0x015b
        L_0x0156:
        L_0x0157:
            r9 = r0
            goto L_0x015b
        L_0x0159:
            r4 = 2
            r9 = 1
        L_0x015b:
            int r13 = r13 + r9
            int r0 = r0 - r9
            r1 = 21
            if (r7 != r1) goto L_0x0162
            r0 = 0
        L_0x0162:
            r4 = 21
            r8 = 2
            r9 = 1
            goto L_0x008e
        L_0x0168:
            int r1 = r11 - r0
            if (r7 != r4) goto L_0x016e
            r9 = 1
            goto L_0x016f
        L_0x016e:
            r9 = r0
        L_0x016f:
            if (r9 <= 0) goto L_0x01a8
            byte r0 = r21[r1]
            r4 = r0 & 255(0xff, float:3.57E-43)
            if (r4 >= r6) goto L_0x018a
            r7 = 97
            if (r4 >= r7) goto L_0x017c
        L_0x017b:
            goto L_0x0185
        L_0x017c:
            r7 = 122(0x7a, float:1.71E-43)
            if (r4 > r7) goto L_0x017b
            r0 = r0 ^ 32
            byte r0 = (byte) r0
            r21[r1] = r0
        L_0x0185:
            int r1 = r1 + 1
            int r9 = r9 + -1
            goto L_0x016f
        L_0x018a:
            if (r4 < r5) goto L_0x019a
            int r0 = r1 + 2
            byte r4 = r21[r0]
            r4 = r4 ^ 5
            byte r4 = (byte) r4
            r21[r0] = r4
            int r1 = r1 + 3
            int r9 = r9 + -3
            goto L_0x016f
        L_0x019a:
            int r0 = r1 + 1
            byte r4 = r21[r0]
            r4 = r4 ^ 32
            byte r4 = (byte) r4
            r21[r0] = r4
            int r1 = r1 + 2
            int r9 = r9 + -2
            goto L_0x016f
        L_0x01a8:
        L_0x01a9:
            if (r10 == r2) goto L_0x01b6
            int r0 = r11 + 1
            int r1 = r10 + 1
            byte r4 = r3[r10]
            r21[r11] = r4
            r11 = r0
            r10 = r1
            goto L_0x01a9
        L_0x01b6:
            int r11 = r11 - r22
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aotc.a(byte[], int, java.nio.ByteBuffer, int, int, aotb, int):int");
    }
}
