package defpackage;

import android.content.Context;

/* renamed from: tuu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tuu implements Runnable {
    private final Context a;
    private final arxt b;
    private final tzi c;

    public tuu(Context context, arxt arxt, tzi tzi) {
        this.a = context;
        this.b = arxt;
        this.c = tzi;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: android.accounts.Account} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            android.content.Context r0 = r13.a
            arxt r1 = r13.b
            tzi r2 = r13.c
            java.lang.String r3 = r0.getPackageName()
            java.util.List r3 = defpackage.jgu.d(r0, r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x0012:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x006a
            java.lang.Object r4 = r3.next()
            r5 = r4
            android.accounts.Account r5 = (android.accounts.Account) r5
            aorr r4 = r1.a((android.accounts.Account) r5)     // Catch:{ ExecutionException -> 0x005b, InterruptedException -> 0x0059 }
            java.lang.Object r4 = r4.get()     // Catch:{ ExecutionException -> 0x005b, InterruptedException -> 0x0059 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ ExecutionException -> 0x005b, InterruptedException -> 0x0059 }
            tzj r4 = defpackage.tvd.a((java.util.List) r4, (defpackage.tzi) r2)
            if (r4 == 0) goto L_0x0057
            ttg r6 = new ttg     // Catch:{ auda -> 0x0048 }
            auay r4 = r4.c     // Catch:{ auda -> 0x0048 }
            byte[] r4 = r4.k()     // Catch:{ auda -> 0x0048 }
            aubs r7 = defpackage.aubs.c()     // Catch:{ auda -> 0x0048 }
            uaj r8 = defpackage.uaj.K     // Catch:{ auda -> 0x0048 }
            aucj r4 = defpackage.aucj.a((defpackage.aucj) r8, (byte[]) r4, (defpackage.aubs) r7)     // Catch:{ auda -> 0x0048 }
            uaj r4 = (defpackage.uaj) r4     // Catch:{ auda -> 0x0048 }
            r6.<init>(r0, r4)     // Catch:{ auda -> 0x0048 }
            goto L_0x006b
        L_0x0048:
            r4 = move-exception
            jjg r4 = defpackage.tsp.a
            anie r4 = r4.c()
            anih r4 = (defpackage.anih) r4
            java.lang.String r5 = "FastPair: RemoveBond: parse item failed"
            r4.a((java.lang.String) r5)
            goto L_0x0058
        L_0x0057:
        L_0x0058:
            goto L_0x0012
        L_0x0059:
            r4 = move-exception
            goto L_0x005c
        L_0x005b:
            r4 = move-exception
        L_0x005c:
            jjg r4 = defpackage.tsp.a
            anie r4 = r4.c()
            anih r4 = (defpackage.anih) r4
            java.lang.String r5 = "FastPair: RemoveBond: read footprints failed"
            r4.a((java.lang.String) r5)
            goto L_0x0012
        L_0x006a:
            r6 = r5
        L_0x006b:
            java.lang.String r3 = r2.b
            boolean r4 = defpackage.aymw.ab()
            if (r4 == 0) goto L_0x007e
            java.lang.Class<tza> r4 = defpackage.tza.class
            java.lang.Object r4 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r4)
            tza r4 = (defpackage.tza) r4
            r4.a((java.lang.String) r3)
        L_0x007e:
            if (r5 == 0) goto L_0x0111
            auay r4 = r2.c
            byte[] r4 = r4.k()
            anli r7 = defpackage.anln.d()
            r8 = 2
            byte[][] r9 = new byte[r8][]
            r10 = 0
            r9[r10] = r4
            byte[] r11 = defpackage.aeez.a((java.lang.String) r3)
            r12 = 1
            r9[r12] = r11
            byte[] r9 = defpackage.aooa.a((byte[][]) r9)
            anlh r7 = r7.a((byte[]) r9)
            byte[] r7 = r7.b()
            r1.a((android.accounts.Account) r5, (byte[]) r4, (byte[]) r7)
            tvo r1 = new tvo
            r1.<init>(r0, r6, r12)
            boolean r4 = defpackage.aymw.L()
            if (r4 == 0) goto L_0x00b4
            r1.a()
        L_0x00b4:
            java.lang.Class<tvs> r4 = defpackage.tvs.class
            java.lang.Object r4 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r4)
            tvs r4 = (defpackage.tvs) r4
            java.lang.String r6 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            r4.b(r6, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r4 > r6) goto L_0x0111
            java.lang.String r4 = r5.name
            android.content.Context r6 = r1.d
            java.lang.Class<tso> r7 = defpackage.tso.class
            java.lang.Object r6 = defpackage.thl.a((android.content.Context) r6, (java.lang.Class) r7)
            tso r6 = (defpackage.tso) r6
            java.lang.Object[] r7 = new java.lang.Object[r8]
            ttg r8 = r1.e
            java.lang.String r8 = r8.k()
            r7[r10] = r8
            r7[r12] = r4
            java.lang.String r4 = "fast_pair_finish_forget_device_description"
            java.lang.String r4 = r6.a(r4, r7)
            udg r6 = r1.b()
            r6.b(r4)
            java.lang.String r7 = "msg"
            r6.s = r7
            ttg r7 = r1.e
            java.lang.String r7 = r7.k()
            r6.e(r7)
            r6.b((java.lang.CharSequence) r4)
            aymt r4 = defpackage.aymt.a
            aymu r4 = r4.a()
            long r7 = r4.ac()
            r6.A = r7
            android.app.Notification r4 = r6.b()
            int r6 = r1.a
            r1.a((android.app.Notification) r4, (int) r6)
        L_0x0111:
            java.lang.Class<ttf> r1 = defpackage.ttf.class
            java.lang.Object r1 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r1)
            ttf r1 = (defpackage.ttf) r1
            aymw r4 = defpackage.aymw.a
            aymx r4 = r4.a()
            boolean r4 = r4.C()
            if (r4 == 0) goto L_0x0126
            goto L_0x0128
        L_0x0126:
            if (r5 == 0) goto L_0x015e
        L_0x0128:
            jjg r4 = defpackage.tsp.a
            anie r4 = r4.d()
            anih r4 = (defpackage.anih) r4
            java.lang.String r5 = "FastPair: RemoveBond: Remove device %s from local cache"
            r4.a((java.lang.String) r5, (java.lang.Object) r3)
            r1.c(r3)
            boolean r3 = defpackage.aymw.i()
            if (r3 == 0) goto L_0x014b
            java.lang.String r3 = r2.k
            int r1 = r1.b((java.lang.String) r3)
            if (r1 != 0) goto L_0x014b
            java.lang.String r1 = r2.k
            defpackage.uac.a((android.content.Context) r0, (java.lang.String) r1)
        L_0x014b:
            boolean r1 = defpackage.aymw.F()
            if (r1 == 0) goto L_0x015e
            java.lang.Class<txb> r1 = defpackage.txb.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r1)
            txb r0 = (defpackage.txb) r0
            auay r1 = r2.c
            r0.a((defpackage.auay) r1)
        L_0x015e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tuu.run():void");
    }
}
