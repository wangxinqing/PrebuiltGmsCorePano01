package defpackage;

/* renamed from: asca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asca implements ashq {
    final /* synthetic */ asgs a;
    final /* synthetic */ ascb b;

    public asca(ascb ascb, asgs asgs) {
        this.b = ascb;
        this.a = asgs;
    }

    public final void a() {
        this.b.d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012d, code lost:
        if (r3.d() != false) goto L_0x0178;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            ascb r1 = r13.b
            asda r1 = r1.d
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0266
            ascb r1 = r13.b
            ascd r2 = r1.b
            asfj r3 = r1.e
            asfs r3 = r3.b
            if (r3 != 0) goto L_0x0018
            asfs r3 = defpackage.asfs.f
        L_0x0018:
            ashv r2 = r2.b((defpackage.asfs) r3)
            ascc r2 = (defpackage.ascc) r2
            r1.g = r2
            ascb r1 = r13.b
            ascc r2 = r1.g
            if (r2 == 0) goto L_0x025e
            r2.c()     // Catch:{ IOException -> 0x0235 }
            ascc r2 = r1.g     // Catch:{ IOException -> 0x0235 }
            boolean r3 = r2.a     // Catch:{ IOException -> 0x0235 }
            r4 = 0
            r5 = 4
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x0044
            byte[] r3 = new byte[r6]     // Catch:{ IOException -> 0x0235 }
            int r1 = r1.i     // Catch:{ IOException -> 0x0235 }
            int r8 = r1 + -1
            if (r1 == 0) goto L_0x0042
            byte r1 = (byte) r8     // Catch:{ IOException -> 0x0235 }
            r3[r7] = r1     // Catch:{ IOException -> 0x0235 }
            r2.a(r3)     // Catch:{ IOException -> 0x0235 }
            goto L_0x0059
        L_0x0042:
            throw r4     // Catch:{ IOException -> 0x0235 }
        L_0x0044:
            byte[] r2 = r2.b()     // Catch:{ IOException -> 0x0235 }
            if (r2 == 0) goto L_0x022d
            int r3 = r2.length     // Catch:{ IOException -> 0x0235 }
            if (r3 != r6) goto L_0x022d
            int r3 = r1.i     // Catch:{ IOException -> 0x0235 }
            if (r3 != r5) goto L_0x0059
            byte r2 = r2[r7]     // Catch:{ IOException -> 0x0235 }
            int r2 = defpackage.asfr.a(r2)     // Catch:{ IOException -> 0x0235 }
            r1.i = r2     // Catch:{ IOException -> 0x0235 }
        L_0x0059:
            ascb r1 = r13.b
            int r2 = r1.i
            int r3 = r2 + -1
            if (r2 == 0) goto L_0x022b
            r2 = 2
            if (r3 == 0) goto L_0x0090
            if (r3 == r6) goto L_0x007c
            if (r3 != r2) goto L_0x0074
            jjg r3 = defpackage.asil.a
            asix r3 = new asix
            ascc r4 = r1.g
            r3.<init>(r4)
            r1.h = r3
            goto L_0x0096
        L_0x0074:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unrecognized encryption type"
            r0.<init>(r1)
            throw r0
        L_0x007c:
            jjg r3 = defpackage.asil.a
            asiy r3 = new asiy
            ascc r4 = r1.g
            asfj r8 = r1.e
            auay r8 = r8.c
            byte[] r8 = r8.k()
            r3.<init>(r4, r8)
            r1.h = r3
            goto L_0x0096
        L_0x0090:
            jjg r3 = defpackage.asil.a
            ascc r3 = r1.g
            r1.h = r3
        L_0x0096:
            ascb r1 = r13.b     // Catch:{ IOException -> 0x009e }
            ashv r1 = r1.h     // Catch:{ IOException -> 0x009e }
            r1.c()     // Catch:{ IOException -> 0x009e }
            goto L_0x009f
        L_0x009e:
            r1 = move-exception
        L_0x009f:
            ascb r1 = r13.b
            ashu r3 = r1.c
            ashv r1 = r1.h
            r3.a(r1)
            ascb r1 = r13.b
            int r3 = r1.i
            r4 = 3
            if (r3 != r4) goto L_0x0142
            ashv r3 = r1.h
            asix r3 = (defpackage.asix) r3
            asgs r8 = r13.a
            java.lang.String r9 = r3.i()     // Catch:{ IOException -> 0x0130 }
            asfk r10 = defpackage.asfk.g     // Catch:{ IOException -> 0x0130 }
            aucd r10 = r10.o()     // Catch:{ IOException -> 0x0130 }
            boolean r11 = r10.c     // Catch:{ IOException -> 0x0130 }
            if (r11 != 0) goto L_0x00c4
            goto L_0x00c9
        L_0x00c4:
            r10.c()     // Catch:{ IOException -> 0x0130 }
            r10.c = r7     // Catch:{ IOException -> 0x0130 }
        L_0x00c9:
            aucj r11 = r10.b     // Catch:{ IOException -> 0x0130 }
            asfk r11 = (defpackage.asfk) r11     // Catch:{ IOException -> 0x0130 }
            r12 = 5
            r11.c = r12     // Catch:{ IOException -> 0x0130 }
            int r12 = r11.a     // Catch:{ IOException -> 0x0130 }
            r12 = r12 | r2
            r11.a = r12     // Catch:{ IOException -> 0x0130 }
            r9.getClass()     // Catch:{ IOException -> 0x0130 }
            r12 = r12 | 16
            r11.a = r12     // Catch:{ IOException -> 0x0130 }
            r11.f = r9     // Catch:{ IOException -> 0x0130 }
            aucj r9 = r10.i()     // Catch:{ IOException -> 0x0130 }
            asfk r9 = (defpackage.asfk) r9     // Catch:{ IOException -> 0x0130 }
            r8.a(r9)     // Catch:{ IOException -> 0x0130 }
            boolean r8 = r3.g()     // Catch:{ IOException -> 0x0130 }
            if (r8 == 0) goto L_0x0131
        L_0x00ed:
            boolean r8 = r3.d()
            if (r8 != 0) goto L_0x0129
            boolean r8 = r3.k()
            if (r8 == 0) goto L_0x0129
            java.util.concurrent.CountDownLatch r8 = r1.a     // Catch:{ InterruptedException -> 0x0103 }
            r9 = 500(0x1f4, double:2.47E-321)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0103 }
            r8.await(r9, r11)     // Catch:{ InterruptedException -> 0x0103 }
            goto L_0x0120
        L_0x0103:
            r8 = move-exception
            jjg r9 = defpackage.asil.a
            anie r9 = r9.c()
            anih r9 = (defpackage.anih) r9
            r9.a((java.lang.Throwable) r8)
            r8 = 210(0xd2, float:2.94E-43)
            java.lang.String r10 = "ascb"
            java.lang.String r11 = "a"
            anie r8 = r9.a((java.lang.String) r10, (java.lang.String) r11, (int) r8, (java.lang.String) r0)
            anih r8 = (defpackage.anih) r8
            java.lang.String r9 = "ConnectionStatusCheck interrupted"
            r8.a((java.lang.String) r9)
        L_0x0120:
            java.util.concurrent.atomic.AtomicBoolean r8 = r1.f
            boolean r8 = r8.get()
            if (r8 == 0) goto L_0x00ed
            goto L_0x0131
        L_0x0129:
            boolean r0 = r3.d()
            if (r0 == 0) goto L_0x0131
            goto L_0x0178
        L_0x0130:
            r0 = move-exception
        L_0x0131:
            ascb r0 = r13.b
            r0.d()
            asgs r0 = r13.a
            ascb r1 = r13.b
            asfk r1 = r1.c()
            r0.a(r1)
            return
        L_0x0142:
            if (r3 != r2) goto L_0x0178
            ashv r0 = r1.h
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x0178
            ascb r0 = r13.b
            r0.d()
            asgs r0 = r13.a
            asfk r1 = defpackage.asfk.g
            aucd r1 = r1.o()
            boolean r3 = r1.c
            if (r3 != 0) goto L_0x015e
            goto L_0x0163
        L_0x015e:
            r1.c()
            r1.c = r7
        L_0x0163:
            aucj r3 = r1.b
            asfk r3 = (defpackage.asfk) r3
            r3.c = r5
            int r4 = r3.a
            r2 = r2 | r4
            r3.a = r2
            aucj r1 = r1.i()
            asfk r1 = (defpackage.asfk) r1
            r0.a(r1)
            return
        L_0x0178:
            asgs r0 = r13.a
            ascb r1 = r13.b
            asfk r1 = r1.c()
            r0.a(r1)
            ascb r0 = r13.b     // Catch:{ IOException -> 0x0229 }
            ashv r0 = r0.h     // Catch:{ IOException -> 0x0229 }
            boolean r0 = r0.d()     // Catch:{ IOException -> 0x0229 }
            if (r0 == 0) goto L_0x0228
        L_0x018d:
            ascb r0 = r13.b     // Catch:{ IOException -> 0x0229 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f     // Catch:{ IOException -> 0x0229 }
            boolean r0 = r0.get()     // Catch:{ IOException -> 0x0229 }
            if (r0 != 0) goto L_0x0228
            ascb r0 = r13.b     // Catch:{ IOException -> 0x0229 }
            ashv r0 = r0.h     // Catch:{ IOException -> 0x0229 }
            byte[] r0 = r0.b()     // Catch:{ IOException -> 0x0229 }
            asgs r1 = r13.a     // Catch:{ IOException -> 0x0229 }
            ascb r3 = r13.b     // Catch:{ IOException -> 0x0229 }
            asfk r8 = defpackage.asfk.g     // Catch:{ IOException -> 0x0229 }
            aucd r8 = r8.o()     // Catch:{ IOException -> 0x0229 }
            boolean r9 = r8.c     // Catch:{ IOException -> 0x0229 }
            if (r9 != 0) goto L_0x01ae
            goto L_0x01b3
        L_0x01ae:
            r8.c()     // Catch:{ IOException -> 0x0229 }
            r8.c = r7     // Catch:{ IOException -> 0x0229 }
        L_0x01b3:
            aucj r9 = r8.b     // Catch:{ IOException -> 0x0229 }
            asfk r9 = (defpackage.asfk) r9     // Catch:{ IOException -> 0x0229 }
            r9.c = r4     // Catch:{ IOException -> 0x0229 }
            int r10 = r9.a     // Catch:{ IOException -> 0x0229 }
            r10 = r10 | r2
            r9.a = r10     // Catch:{ IOException -> 0x0229 }
            ashv r3 = r3.h     // Catch:{ IOException -> 0x0229 }
            asfn r3 = r3.e()     // Catch:{ IOException -> 0x0229 }
            boolean r9 = r8.c     // Catch:{ IOException -> 0x0229 }
            if (r9 != 0) goto L_0x01c9
            goto L_0x01ce
        L_0x01c9:
            r8.c()     // Catch:{ IOException -> 0x0229 }
            r8.c = r7     // Catch:{ IOException -> 0x0229 }
        L_0x01ce:
            aucj r9 = r8.b     // Catch:{ IOException -> 0x0229 }
            asfk r9 = (defpackage.asfk) r9     // Catch:{ IOException -> 0x0229 }
            r3.getClass()     // Catch:{ IOException -> 0x0229 }
            r9.d = r3     // Catch:{ IOException -> 0x0229 }
            int r3 = r9.a     // Catch:{ IOException -> 0x0229 }
            r3 = r3 | r5
            r9.a = r3     // Catch:{ IOException -> 0x0229 }
            asfp r3 = defpackage.asfp.c     // Catch:{ IOException -> 0x0229 }
            aucd r3 = r3.o()     // Catch:{ IOException -> 0x0229 }
            auay r0 = defpackage.auay.a((byte[]) r0)     // Catch:{ IOException -> 0x0229 }
            boolean r9 = r3.c     // Catch:{ IOException -> 0x0229 }
            if (r9 != 0) goto L_0x01eb
            goto L_0x01f0
        L_0x01eb:
            r3.c()     // Catch:{ IOException -> 0x0229 }
            r3.c = r7     // Catch:{ IOException -> 0x0229 }
        L_0x01f0:
            aucj r9 = r3.b     // Catch:{ IOException -> 0x0229 }
            asfp r9 = (defpackage.asfp) r9     // Catch:{ IOException -> 0x0229 }
            r0.getClass()     // Catch:{ IOException -> 0x0229 }
            int r10 = r9.a     // Catch:{ IOException -> 0x0229 }
            r10 = r10 | r6
            r9.a = r10     // Catch:{ IOException -> 0x0229 }
            r9.b = r0     // Catch:{ IOException -> 0x0229 }
            boolean r0 = r8.c     // Catch:{ IOException -> 0x0229 }
            if (r0 != 0) goto L_0x0203
            goto L_0x0208
        L_0x0203:
            r8.c()     // Catch:{ IOException -> 0x0229 }
            r8.c = r7     // Catch:{ IOException -> 0x0229 }
        L_0x0208:
            aucj r0 = r8.b     // Catch:{ IOException -> 0x0229 }
            asfk r0 = (defpackage.asfk) r0     // Catch:{ IOException -> 0x0229 }
            aucj r3 = r3.i()     // Catch:{ IOException -> 0x0229 }
            asfp r3 = (defpackage.asfp) r3     // Catch:{ IOException -> 0x0229 }
            r3.getClass()     // Catch:{ IOException -> 0x0229 }
            r0.e = r3     // Catch:{ IOException -> 0x0229 }
            int r3 = r0.a     // Catch:{ IOException -> 0x0229 }
            r3 = r3 | 8
            r0.a = r3     // Catch:{ IOException -> 0x0229 }
            aucj r0 = r8.i()     // Catch:{ IOException -> 0x0229 }
            asfk r0 = (defpackage.asfk) r0     // Catch:{ IOException -> 0x0229 }
            r1.a(r0)     // Catch:{ IOException -> 0x0229 }
            goto L_0x018d
        L_0x0228:
            return
        L_0x0229:
            r0 = move-exception
            return
        L_0x022b:
            throw r4
        L_0x022d:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0235 }
            java.lang.String r2 = "Unexpected data while negotiating encryption type"
            r1.<init>(r2)     // Catch:{ IOException -> 0x0235 }
            throw r1     // Catch:{ IOException -> 0x0235 }
        L_0x0235:
            r1 = move-exception
            jjg r2 = defpackage.asil.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            r2.a((java.lang.Throwable) r1)
            r1 = 87
            java.lang.String r3 = "asca"
            java.lang.String r4 = "run"
            anie r0 = r2.a((java.lang.String) r3, (java.lang.String) r4, (int) r1, (java.lang.String) r0)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "Fail to negotiate encryption type"
            r0.a((java.lang.String) r1)
            asgs r0 = r13.a
            ascb r1 = r13.b
            asfk r1 = r1.c()
            r0.a(r1)
            return
        L_0x025e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Error getting connection."
            r0.<init>(r1)
            throw r0
        L_0x0266:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Fail to enable bluetooth"
            r0.<init>(r1)
            goto L_0x026f
        L_0x026e:
            throw r0
        L_0x026f:
            goto L_0x026e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asca.run():void");
    }
}
