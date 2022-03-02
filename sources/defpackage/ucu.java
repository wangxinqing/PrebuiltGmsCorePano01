package defpackage;

/* renamed from: ucu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ucu extends arwm {
    final /* synthetic */ String a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ boolean c;
    final /* synthetic */ byte[] d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;
    final /* synthetic */ udb g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ucu(udb udb, String str, String str2, byte[] bArr, boolean z, byte[] bArr2, int i, String str3) {
        super(str);
        this.g = udb;
        this.a = str2;
        this.b = bArr;
        this.c = z;
        this.d = bArr2;
        this.e = i;
        this.f = str3;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [twf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v36 */
    /* JADX WARNING: type inference failed for: r0v37 */
    /* JADX WARNING: type inference failed for: r4v10, types: [twe] */
    /* JADX WARNING: type inference failed for: r4v11, types: [ttz] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            java.lang.String r0 = r10.a
            r1 = 0
            if (r0 == 0) goto L_0x000e
            udb r1 = r10.g
            ttf r1 = r1.b
            ttg r1 = r1.e(r0)
            goto L_0x003f
        L_0x000e:
            byte[] r0 = r10.b
            if (r0 == 0) goto L_0x003e
            ttg r2 = new ttg     // Catch:{ auda -> 0x0029 }
            udb r3 = r10.g     // Catch:{ auda -> 0x0029 }
            android.content.Context r3 = r3.e     // Catch:{ auda -> 0x0029 }
            aubs r4 = defpackage.aubs.c()     // Catch:{ auda -> 0x0029 }
            uaj r5 = defpackage.uaj.K     // Catch:{ auda -> 0x0029 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r5, (byte[]) r0, (defpackage.aubs) r4)     // Catch:{ auda -> 0x0029 }
            uaj r0 = (defpackage.uaj) r0     // Catch:{ auda -> 0x0029 }
            r2.<init>(r3, r0)     // Catch:{ auda -> 0x0029 }
            r1 = r2
            goto L_0x003f
        L_0x0029:
            r0 = move-exception
            jjg r2 = defpackage.tsp.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            r2.a((java.lang.Throwable) r0)
            byte[] r0 = r10.b
            int r0 = r0.length
            java.lang.String r3 = "Error parsing serialized discovery item with size %d"
            r2.a((java.lang.String) r3, (int) r0)
            goto L_0x003f
        L_0x003e:
        L_0x003f:
            if (r1 != 0) goto L_0x0043
            goto L_0x0125
        L_0x0043:
            java.lang.String r0 = r1.m()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0125
            int r0 = r1.J()
            r2 = 2
            if (r0 != r2) goto L_0x0055
            goto L_0x006e
        L_0x0055:
            boolean r0 = defpackage.aymw.x()
            if (r0 != 0) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x006e
        L_0x0060:
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "Incorrect state, ignore pairing"
            r0.a((java.lang.String) r1)
            return
        L_0x006e:
            byte[] r0 = r10.d
            r2 = 1
            if (r0 != 0) goto L_0x007b
            byte[] r0 = r1.n()
            if (r0 != 0) goto L_0x007b
            r2 = 0
            goto L_0x007c
        L_0x007b:
        L_0x007c:
            int r0 = r10.e
            r3 = -1
            if (r0 != r3) goto L_0x008c
            tvo r0 = new tvo
            udb r3 = r10.g
            android.content.Context r3 = r3.e
            r0.<init>(r3, r1, r2)
            r9 = r0
            goto L_0x0096
        L_0x008c:
            tvo r3 = new tvo
            udb r4 = r10.g
            android.content.Context r4 = r4.e
            r3.<init>(r4, r1, r2, r0)
            r9 = r3
        L_0x0096:
            tyw r0 = new tyw
            udb r2 = r10.g
            android.content.Context r2 = r2.e
            r0.<init>(r2)
            udb r2 = r10.g
            android.content.Context r5 = r2.e
            java.lang.String r7 = r10.f
            byte[] r8 = r10.d
            arxt r2 = r2.g
            boolean r3 = r10.c
            boolean r4 = defpackage.aymw.E()
            if (r4 != 0) goto L_0x00f8
            auzo r0 = r1.p()
            if (r0 == 0) goto L_0x00e8
            auzo r0 = r1.p()
            boolean r0 = r0.e
            if (r0 == 0) goto L_0x00e8
            boolean r0 = defpackage.aymw.D()
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = r1.t()
            if (r0 == 0) goto L_0x00dd
            java.lang.String r0 = defpackage.aymt.s()
            java.lang.String r4 = r1.t()
            java.lang.String r4 = defpackage.tvq.a((java.lang.String) r4)
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00e8
        L_0x00dd:
            ttz r0 = new ttz
            r4 = r0
            r6 = r1
            r7 = r2
            r8 = r9
            r9 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0106
        L_0x00e8:
            if (r3 != 0) goto L_0x00f2
            twe r0 = new twe
            r4 = r0
            r6 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0106
        L_0x00f2:
            twt r0 = new twt
            r0.<init>(r5, r1, r2, r9)
            goto L_0x0106
        L_0x00f8:
            if (r3 != 0) goto L_0x0100
            twa r0 = new twa
            r0.<init>(r5, r1, r8)
            goto L_0x0106
        L_0x0100:
            twi r3 = new twi
            r3.<init>(r5, r1, r2, r0)
            r0 = r3
        L_0x0106:
            jjg r2 = defpackage.tsp.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.String r4 = "PairingProgressHandler:Create %s for pairing"
            r2.a((java.lang.String) r4, (java.lang.Object) r3)
            udb r2 = r10.g
            byte[] r3 = r10.d
            java.lang.String r4 = r10.f
            r2.a((defpackage.ttg) r1, (byte[]) r3, (java.lang.String) r4, (defpackage.twf) r0)
            return
        L_0x0125:
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "Invalid DiscoveryItem, ignore pairing"
            r0.a((java.lang.String) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ucu.run():void");
    }
}
