package defpackage;

/* renamed from: aiwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiwc implements Runnable {
    final aqek a;
    final /* synthetic */ aiwd b;
    final airt c;

    public aiwc(aiwd aiwd, aqek aqek, airt airt) {
        this.b = aiwd;
        this.a = aqek;
        this.c = airt;
    }

    /* JADX WARNING: Removed duplicated region for block: B:94:0x0300  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r29 = this;
            r1 = r29
            aqek r0 = r1.a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 33
            r3.<init>(r2)
            java.lang.String r2 = "In ReceiverRunnable, response is "
            r3.append(r2)
            r3.append(r0)
            r3.toString()
            airt r2 = r1.c
            aiwd r0 = r1.b
            aiwa r0 = r0.a
            aizy r3 = r0.b
            aqek r4 = r1.a
            airv r0 = r2.c
            airu r0 = r0.a
            airu r5 = r2.a
            if (r0 != r5) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            defpackage.amrl.b(r0)
            airv r0 = r2.c
            airu r0 = r0.a
            defpackage.amrl.a((java.lang.Object) r0)
            airv r0 = r2.c
            airu r5 = r0.a
            aiaq r5 = r5.a
            airu r8 = r0.b
            r0.a = r8
            r8 = 0
            r0.b = r8
            airu r9 = r0.a
            if (r9 != 0) goto L_0x0053
            goto L_0x0056
        L_0x0053:
            r0.a()
        L_0x0056:
            java.util.ArrayList r0 = r5.b
            r0.clear()
            boolean r0 = defpackage.ajqt.b(r4)
            r9 = 2
            if (r0 != 0) goto L_0x0063
            goto L_0x0077
        L_0x0063:
            defpackage.amrl.a((java.lang.Object) r4)
            int r10 = r4.j(r9)
            r11 = 0
        L_0x006b:
            if (r11 >= r10) goto L_0x0077
            aqek r12 = r4.f(r9, r11)
            r5.a(r12)
            int r11 = r11 + 1
            goto L_0x006b
        L_0x0077:
            airv r10 = r2.c
            ahqj r11 = r10.f
            if (r11 != 0) goto L_0x0083
            r27 = r3
            r28 = r4
            goto L_0x025f
        L_0x0083:
            aqek r6 = r2.b
            boolean r15 = r10.d
            boolean r10 = r10.c
            r8 = 0
            r13 = 0
            r14 = 0
            r19 = 0
        L_0x008e:
            r7 = 4
            int r12 = r6.j(r7)
            if (r8 >= r12) goto L_0x00d8
            aqek r7 = r6.f(r7, r8)
            r12 = 2
            boolean r20 = r7.i(r12)
            int r14 = r14 + r20
            r9 = 6
            r11.a(r9, r7, r12)
            r9 = 17
            boolean r12 = r7.i(r9)
            if (r12 == 0) goto L_0x00c3
            aqek r9 = r7.e(r9)
            r12 = 5
            boolean r21 = r9.i(r12)
            if (r21 == 0) goto L_0x00c3
            int r13 = r13 + 1
            aqek r9 = r9.e(r12)
            r1 = 8
            r11.a(r1, r9, r12)
        L_0x00c3:
            r1 = 1
            boolean r9 = r7.i(r1)
            r12 = r19
            int r19 = r12 + r9
            r9 = 10
            r11.a(r9, r7, r1)
            int r8 = r8 + 1
            r1 = r29
            r9 = 2
            goto L_0x008e
        L_0x00d8:
            r12 = r19
            if (r4 == 0) goto L_0x0158
            r6 = 0
            r8 = 0
            r9 = 0
            r19 = 0
        L_0x00e1:
            r7 = 2
            int r1 = r4.j(r7)
            if (r6 >= r1) goto L_0x014d
            aqek r1 = r4.f(r7, r6)
            r25 = r9
            r7 = 3
            int r9 = r1.j(r7)
            r7 = 0
        L_0x00f5:
            if (r7 >= r9) goto L_0x0121
            r27 = r3
            r26 = r9
            r9 = 3
            aqek r3 = r1.f(r9, r7)
            boolean r18 = r3.i(r9)
            int r19 = r19 + r18
            r28 = r4
            r4 = 7
            r11.a(r4, r3, r9)
            r4 = 2
            boolean r9 = r3.i(r4)
            int r25 = r25 + r9
            r9 = 17
            r11.a(r9, r3, r4)
            int r7 = r7 + 1
            r9 = r26
            r3 = r27
            r4 = r28
            goto L_0x00f5
        L_0x0121:
            r27 = r3
            r28 = r4
            r3 = 11
            boolean r4 = r1.i(r3)
            if (r4 != 0) goto L_0x012e
            goto L_0x0143
        L_0x012e:
            aqek r1 = r1.e(r3)
            r3 = 9
            boolean r4 = r1.i(r3)
            if (r4 == 0) goto L_0x0143
            int r8 = r8 + 1
            aqek r1 = r1.e(r3)
            r11.a(r3, r1, r3)
        L_0x0143:
            int r6 = r6 + 1
            r9 = r25
            r3 = r27
            r4 = r28
            r7 = 4
            goto L_0x00e1
        L_0x014d:
            r27 = r3
            r28 = r4
            r25 = r9
            r1 = r19
            r3 = r25
            goto L_0x015f
        L_0x0158:
            r27 = r3
            r28 = r4
            r1 = 0
            r3 = 0
            r8 = 0
        L_0x015f:
            r4 = 6
            int r4 = r11.b(r4)
            r6 = 7
            int r6 = r11.b(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r9 = 193(0xc1, float:2.7E-43)
            r7.<init>(r9)
            java.lang.String r9 = "Wifi cluster counts and sizes: wifiClusterQueryCount is "
            r7.append(r9)
            r7.append(r14)
            java.lang.String r9 = ", bytesUploadedByWifiCluster is "
            r7.append(r9)
            r7.append(r4)
            java.lang.String r4 = ", wifiClusterReplyCount is "
            r7.append(r4)
            r7.append(r1)
            java.lang.String r4 = ", bytesDownloadedByWifiCluster is "
            r7.append(r4)
            r7.append(r6)
            r7.toString()
            r4 = 10
            int r6 = r11.b(r4)
            r4 = 17
            int r4 = r11.b(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r9 = 157(0x9d, float:2.2E-43)
            r7.<init>(r9)
            java.lang.String r9 = "Cell counts and sizes: cellQueryCount is "
            r7.append(r9)
            r7.append(r12)
            java.lang.String r9 = ", bytesUploadedByCell is "
            r7.append(r9)
            r7.append(r6)
            java.lang.String r6 = ", cellReplyCount is "
            r7.append(r6)
            r7.append(r3)
            java.lang.String r6 = ", bytesDownloadedByCell is "
            r7.append(r6)
            r7.append(r4)
            r7.toString()
            r4 = 8
            int r6 = r11.b(r4)
            r4 = 9
            int r7 = r11.b(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r9 = 167(0xa7, float:2.34E-43)
            r4.<init>(r9)
            java.lang.String r9 = "Frewle counts and sizes: frewleQueryCount is "
            r4.append(r9)
            r4.append(r13)
            java.lang.String r9 = ", bytesUploadedByFrewle is "
            r4.append(r9)
            r4.append(r6)
            java.lang.String r6 = ", frewleReplyCount is "
            r4.append(r6)
            r4.append(r8)
            java.lang.String r6 = ", bytesDownloadedByFrewle is "
            r4.append(r6)
            r4.append(r7)
            r4.toString()
            if (r0 != 0) goto L_0x0217
            if (r10 == 0) goto L_0x020a
            r4 = 16
            r11.a((int) r4)
            goto L_0x0211
        L_0x020a:
            if (r15 == 0) goto L_0x0211
            r4 = 14
            r11.a((int) r4)
        L_0x0211:
            r4 = 19
            r11.a((int) r4)
            goto L_0x022b
        L_0x0217:
            if (r10 == 0) goto L_0x021f
            r4 = 15
            r11.a((int) r4)
            goto L_0x0226
        L_0x021f:
            if (r15 == 0) goto L_0x0226
            r4 = 13
            r11.a((int) r4)
        L_0x0226:
            r4 = 18
            r11.a((int) r4)
        L_0x022b:
            if (r14 <= 0) goto L_0x023c
            if (r1 > 0) goto L_0x0230
            goto L_0x0237
        L_0x0230:
            if (r0 == 0) goto L_0x0237
            r1 = 1
            r11.a((int) r1)
            goto L_0x023c
        L_0x0237:
            r1 = 2
            r11.a((int) r1)
        L_0x023c:
            if (r12 <= 0) goto L_0x024e
            if (r3 > 0) goto L_0x0241
            goto L_0x0249
        L_0x0241:
            if (r0 == 0) goto L_0x0249
            r1 = 11
            r11.a((int) r1)
            goto L_0x024e
        L_0x0249:
            r1 = 12
            r11.a((int) r1)
        L_0x024e:
            if (r13 <= 0) goto L_0x025f
            if (r8 > 0) goto L_0x0253
            goto L_0x025a
        L_0x0253:
            if (r0 == 0) goto L_0x025a
            r1 = 3
            r11.a((int) r1)
            goto L_0x025f
        L_0x025a:
            r0 = 4
            r11.a((int) r0)
        L_0x025f:
            airv r0 = r2.c
            airo r1 = r0.e
            ahyt r0 = r1.e
            r0.a()
            ahqq r0 = r1.d
            aizy r3 = r1.b
            long r3 = r3.b()
            r6 = 1
            r0.a(r5, r6, r3)
            airq r0 = r1.f
            arpl r0 = r0.a
            arsf r3 = r0.a
            r4 = 0
            r3.l = r4
            r3.m = r6
            java.util.ArrayList r4 = r5.b
            int r6 = r4.size()
            r7 = 0
        L_0x0286:
            r8 = 3000(0xbb8, float:4.204E-42)
            if (r7 >= r6) goto L_0x0319
            java.lang.Object r0 = r4.get(r7)
            aqek r0 = (defpackage.aqek) r0
            r9 = 11
            boolean r10 = r0.i(r9)
            if (r10 != 0) goto L_0x029c
            r9 = 9
            goto L_0x0315
        L_0x029c:
            aqek r0 = r0.e(r9)
            if (r0 == 0) goto L_0x0310
            r9 = 9
            boolean r10 = r0.i(r9)
            if (r10 == 0) goto L_0x0312
            arqz r10 = r3.v
            aizy r11 = r3.c
            long r11 = r11.b()
            r10.b(r11)
            aqek r0 = r0.e(r9)
            r10 = 1
            boolean r11 = r0.i(r10)
            if (r11 == 0) goto L_0x0312
            aqek r11 = r0.e(r10)
            r10 = 2
            boolean r0 = r11.i(r10)
            if (r0 == 0) goto L_0x0312
            aqek r12 = r11.e(r10)
            r3.a((defpackage.aqek) r12)
            arsj r10 = r3.h
            aqek r0 = r10.d
            if (r0 != 0) goto L_0x02d9
            goto L_0x02f3
        L_0x02d9:
            boolean r0 = r10.e
            if (r0 != 0) goto L_0x02f3
            if (r12 == 0) goto L_0x02f3
            byte[] r0 = r12.b()     // Catch:{ IOException -> 0x02f2 }
            aqek r13 = r10.d     // Catch:{ IOException -> 0x02f2 }
            byte[] r13 = r13.b()     // Catch:{ IOException -> 0x02f2 }
            boolean r0 = java.util.Arrays.equals(r0, r13)     // Catch:{ IOException -> 0x02f2 }
            if (r0 != 0) goto L_0x02f0
            goto L_0x02f3
        L_0x02f0:
            r12 = 1
            goto L_0x02f8
        L_0x02f2:
            r0 = move-exception
        L_0x02f3:
            r10.d = r12
            r12 = 1
            r10.e = r12
        L_0x02f8:
            int r0 = r11.j(r12)
            if (r0 > 0) goto L_0x0300
            goto L_0x0302
        L_0x0300:
            r3.k = r8
        L_0x0302:
            aizy r0 = r3.c
            long r12 = r0.b()
            arsn r0 = r3.i
            arqz r8 = r3.v
            r0.a(r11, r12, r8)
            goto L_0x0312
        L_0x0310:
            r9 = 9
        L_0x0312:
            r8 = 0
            r3.m = r8
        L_0x0315:
            int r7 = r7 + 1
            goto L_0x0286
        L_0x0319:
            boolean r0 = r1.a()
            if (r0 == 0) goto L_0x047e
            airm r0 = r1.a
            boolean r1 = r0.a()
            if (r1 == 0) goto L_0x047e
            arhu r1 = r0.b
            defpackage.amrl.a((java.lang.Object) r1)
            arhu r0 = r0.b
            arhz r0 = r0.a
            arhy r0 = (defpackage.arhy) r0
            aria r0 = r0.b
            r4 = 0
            r0.b = r4
            long r6 = r0.k
            r9 = 1
            long r6 = r6 + r9
            r0.k = r6
            java.util.ArrayList r1 = r5.b
            int r3 = r1.size()
            r5 = 0
        L_0x0345:
            r6 = 0
            if (r5 >= r3) goto L_0x047c
            java.lang.Object r11 = r1.get(r5)
            aqek r11 = (defpackage.aqek) r11
            r12 = 11
            boolean r13 = r11.i(r12)
            if (r13 != 0) goto L_0x035d
            r8 = 0
            r9 = 1
            r10 = 8
            goto L_0x0473
        L_0x035d:
            aqek r11 = r11.e(r12)
            if (r11 == 0) goto L_0x046f
            r13 = 10
            boolean r14 = r11.i(r13)
            if (r14 == 0) goto L_0x046a
            aqek r11 = r11.e(r13)
            r14 = 1
            boolean r15 = r11.i(r14)
            if (r15 == 0) goto L_0x0465
            aqek r11 = r11.e(r14)
            int r15 = r11.j(r14)
            if (r15 == 0) goto L_0x0460
            long r12 = r0.l
            long r12 = r12 + r9
            r0.l = r12
            arhy r12 = r0.e
            arhs r12 = r12.d
            int r13 = r12.g
            int r13 = r13 + r14
            r12.g = r13
            int r12 = r0.g
            r0.h = r8
            aizy r12 = r0.f
            long r12 = r12.b()
            r0.d = r12
            arhy r15 = r0.e
            arib r15 = r15.a
            boolean r17 = r11.i(r14)
            if (r17 == 0) goto L_0x0408
            aqek r11 = r11.e(r14)
            int r4 = r11.j(r14)
            r8 = 2
            int r9 = r11.j(r8)
            if (r4 != r9) goto L_0x0400
            r4 = 3
            int r8 = r11.b((int) r4)
            int r9 = r11.j(r14)
            r10 = 8
            int r9 = r9 * 8
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r14 = 39
            r9.<init>(r14)
            java.lang.String r14 = "Total download byte counts: "
            r9.append(r14)
            r9.append(r8)
            r9.toString()
            arhy r9 = r15.e
            arhs r9 = r9.d
            int r14 = r9.h
            int r14 = r14 + r8
            r9.h = r14
            r8 = 0
        L_0x03dd:
            r9 = 1
            int r14 = r11.j(r9)
            if (r8 >= r14) goto L_0x03fb
            arhx r14 = r15.b
            long r22 = r11.d(r9, r8)
            r4 = 2
            byte[] r26 = r11.b((int) r4, (int) r8)
            r21 = r14
            r24 = r12
            r21.a(r22, r24, r26)
            int r8 = r8 + 1
            r4 = 3
            goto L_0x03dd
        L_0x03fb:
            r4 = 2
            r8 = 0
            r15.f = r8
            goto L_0x040d
        L_0x0400:
            r4 = 2
            r8 = 0
            r9 = 1
            r10 = 8
            r15.f = r8
            goto L_0x040d
        L_0x0408:
            r4 = 2
            r8 = 0
            r9 = 1
            r10 = 8
        L_0x040d:
            int r11 = r15.a()
            r12 = 500000(0x7a120, float:7.00649E-40)
            if (r11 > r12) goto L_0x041e
            arhy r12 = r15.e
            arhs r12 = r12.d
            r12.a(r11)
            goto L_0x0449
        L_0x041e:
            arhx r13 = r15.b
            arhw r13 = r13.entrySet()
            arsz r13 = r13.iterator()
            r14 = 0
        L_0x0429:
            boolean r16 = r13.hasNext()
            if (r16 == 0) goto L_0x0449
            r13.f()
            byte[] r4 = r13.a()
            int r4 = r4.length
            int r14 = r14 + r4
            r13.remove()
            int r4 = r11 - r14
            if (r4 > r12) goto L_0x0447
            arhy r11 = r15.e
            arhs r11 = r11.d
            r11.a(r4)
            goto L_0x0449
        L_0x0447:
            r4 = 2
            goto L_0x0429
        L_0x0449:
            long r11 = r0.d
            long r13 = r0.m
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0473
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0473
            arhy r4 = r0.e
            arhs r4 = r4.d
            long r6 = r4.i
            long r11 = r11 - r13
            long r6 = r6 + r11
            r4.i = r6
            goto L_0x0473
        L_0x0460:
            r8 = 0
            r9 = 1
            r10 = 8
            goto L_0x0473
        L_0x0465:
            r8 = 0
            r9 = 1
            r10 = 8
            goto L_0x0473
        L_0x046a:
            r8 = 0
            r9 = 1
            r10 = 8
            goto L_0x0473
        L_0x046f:
            r8 = 0
            r9 = 1
            r10 = 8
        L_0x0473:
            int r5 = r5 + 1
            r4 = 0
            r8 = 3000(0xbb8, float:4.204E-42)
            r9 = 1
            goto L_0x0345
        L_0x047c:
            r0.m = r6
        L_0x047e:
            airu r0 = r2.a
            airs r0 = r0.c
            r1 = r27
            r2 = r28
            r0.a(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwc.run():void");
    }
}
