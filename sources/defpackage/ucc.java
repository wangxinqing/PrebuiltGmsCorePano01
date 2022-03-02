package defpackage;

import android.bluetooth.BluetoothDevice;

/* renamed from: ucc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ucc implements Runnable {
    private final ucd a;
    private final BluetoothDevice b;

    public ucc(ucd ucd, BluetoothDevice bluetoothDevice) {
        this.a = ucd;
        this.b = bluetoothDevice;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: tzj} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r3 = "a"
            java.lang.String r4 = "arxt"
            ucd r0 = r1.a
            android.bluetooth.BluetoothDevice r5 = r1.b
            udb r6 = r0.d
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            boolean r7 = defpackage.aymw.b()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            boolean r8 = defpackage.aymw.x()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.String r9 = "FastPair: handle bonded but not FastPairing for (%s), fastPairAddBondedDeviceFromFootprintsToLocalCache = (%s), fastPairSupportRetroactivePair = (%s)."
            r0.a((java.lang.String) r9, (java.lang.Object) r5, (java.lang.Object) r7, (java.lang.Object) r8)
            boolean r0 = defpackage.aymw.b()
            if (r0 == 0) goto L_0x01eb
            arxt r7 = r6.g
            java.lang.String r8 = r5.getAddress()
            android.content.Context r0 = r7.b
            java.util.List r9 = defpackage.arxt.a((android.content.Context) r0)
            int r10 = r9.size()
            r12 = 0
        L_0x0042:
            if (r12 >= r10) goto L_0x00ed
            java.lang.Object r15 = r9.get(r12)
            android.accounts.Account r15 = (android.accounts.Account) r15
            aorr r16 = r7.a((android.accounts.Account) r15)     // Catch:{ ExecutionException -> 0x00cd, InterruptedException -> 0x00cb }
            java.lang.Object r16 = r16.get()     // Catch:{ ExecutionException -> 0x00cd, InterruptedException -> 0x00cb }
            java.util.List r16 = (java.util.List) r16     // Catch:{ ExecutionException -> 0x00cd, InterruptedException -> 0x00cb }
            java.util.Iterator r16 = r16.iterator()     // Catch:{ ExecutionException -> 0x00cd, InterruptedException -> 0x00cb }
        L_0x0058:
            boolean r17 = r16.hasNext()     // Catch:{ ExecutionException -> 0x00cd, InterruptedException -> 0x00cb }
            if (r17 == 0) goto L_0x00c5
            java.lang.Object r17 = r16.next()     // Catch:{ ExecutionException -> 0x00cd, InterruptedException -> 0x00cb }
            r13 = r17
            tzj r13 = (defpackage.tzj) r13     // Catch:{ ExecutionException -> 0x00cd, InterruptedException -> 0x00cb }
            int r14 = r13.a     // Catch:{ ExecutionException -> 0x00cd, InterruptedException -> 0x00cb }
            r18 = r14 & 1
            if (r18 == 0) goto L_0x00c0
            r14 = r14 & 4
            if (r14 == 0) goto L_0x00c0
            auay r14 = r13.d     // Catch:{ ExecutionException -> 0x00cd, InterruptedException -> 0x00cb }
            byte[] r14 = r14.k()     // Catch:{ ExecutionException -> 0x00cd, InterruptedException -> 0x00cb }
            auay r11 = r13.b     // Catch:{ ExecutionException -> 0x00cd, InterruptedException -> 0x00cb }
            byte[] r11 = r11.k()     // Catch:{ ExecutionException -> 0x00cd, InterruptedException -> 0x00cb }
            anli r0 = defpackage.anln.d()     // Catch:{ ExecutionException -> 0x00cd, InterruptedException -> 0x00cb }
            r19 = r7
            r1 = 2
            byte[][] r7 = new byte[r1][]     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            r1 = 0
            r7[r1] = r11     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            byte[] r1 = defpackage.aeez.a((java.lang.String) r8)     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            r11 = 1
            r7[r11] = r1     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            byte[] r1 = defpackage.aooa.a((byte[][]) r7)     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            anlh r0 = r0.a((byte[]) r1)     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            byte[] r0 = r0.b()     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            boolean r0 = java.util.Arrays.equals(r14, r0)     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            if (r0 == 0) goto L_0x00b7
            aryq r0 = defpackage.aryq.a     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            anie r0 = r0.d()     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            anih r0 = (defpackage.anih) r0     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            r1 = 676(0x2a4, float:9.47E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r3, (int) r1, (java.lang.String) r2)     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            anih r0 = (defpackage.anih) r0     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            java.lang.String r1 = "FastPair: find the matched device (%s) from footprints."
            r0.a((java.lang.String) r1, (java.lang.Object) r8)     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            goto L_0x00c8
        L_0x00b7:
            r1 = r20
            r7 = r19
            goto L_0x0058
        L_0x00bc:
            r0 = move-exception
            goto L_0x00d0
        L_0x00be:
            r0 = move-exception
            goto L_0x00d0
        L_0x00c0:
            r19 = r7
            r1 = r20
            goto L_0x0058
        L_0x00c5:
            r19 = r7
            r13 = 0
        L_0x00c8:
            if (r13 != 0) goto L_0x00ee
            goto L_0x00e5
        L_0x00cb:
            r0 = move-exception
            goto L_0x00ce
        L_0x00cd:
            r0 = move-exception
        L_0x00ce:
            r19 = r7
        L_0x00d0:
            aryq r0 = defpackage.aryq.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r1 = 645(0x285, float:9.04E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r3, (int) r1, (java.lang.String) r2)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPair: fail to read footprints from %s."
            r0.a((java.lang.String) r1, (java.lang.Object) r15)
        L_0x00e5:
            int r12 = r12 + 1
            r1 = r20
            r7 = r19
            goto L_0x0042
        L_0x00ed:
            r13 = 0
        L_0x00ee:
            if (r13 != 0) goto L_0x00ff
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPair: (%s) bonded without through fast pairing, not found in footprints"
            r0.a((java.lang.String) r1, (java.lang.Object) r5)
            goto L_0x01eb
        L_0x00ff:
            ttf r0 = r6.b
            java.lang.String r1 = r5.getAddress()
            auay r2 = r13.c     // Catch:{ auda -> 0x01b4 }
            aubs r3 = defpackage.aubs.c()     // Catch:{ auda -> 0x01b4 }
            uaj r4 = defpackage.uaj.K     // Catch:{ auda -> 0x01b4 }
            aubc r2 = r2.h()     // Catch:{ auda -> 0x01b2 }
            r7 = 4
            java.lang.Object r4 = r4.c(r7)     // Catch:{ auda -> 0x01b2 }
            aucj r4 = (defpackage.aucj) r4     // Catch:{ auda -> 0x01b2 }
            aueh r7 = defpackage.aueh.a     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0187 }
            aueq r7 = r7.a((java.lang.Object) r4)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0187 }
            aubd r8 = defpackage.aubd.a((defpackage.aubc) r2)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0187 }
            r7.a(r4, r8, r3)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0187 }
            r7.d(r4)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0187 }
            r3 = 0
            r2.a((int) r3)     // Catch:{ auda -> 0x0184 }
            defpackage.aucj.b((defpackage.aucj) r4)     // Catch:{ auda -> 0x01b4 }
            uaj r4 = (defpackage.uaj) r4     // Catch:{ auda -> 0x01b4 }
            tzi r2 = defpackage.tzi.p
            aucd r2 = r2.o()
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x013c
            goto L_0x0142
        L_0x013c:
            r2.c()
            r3 = 0
            r2.c = r3
        L_0x0142:
            aucj r3 = r2.b
            tzi r3 = (defpackage.tzi) r3
            r1.getClass()
            int r7 = r3.a
            r8 = 1
            r7 = r7 | r8
            r3.a = r7
            r3.b = r1
            auay r1 = r13.b
            r1.getClass()
            r8 = 2
            r7 = r7 | r8
            r3.a = r7
            r3.c = r1
            java.lang.String r1 = r4.y
            r1.getClass()
            r7 = r7 | 512(0x200, float:7.175E-43)
            r3.a = r7
            r3.k = r1
            auzo r1 = r4.I
            if (r1 == 0) goto L_0x016c
            goto L_0x016e
        L_0x016c:
            auzo r1 = defpackage.auzo.j
        L_0x016e:
            aucu r3 = new aucu
            aucs r1 = r1.f
            auct r4 = defpackage.auzo.g
            r3.<init>(r1, r4)
            r2.aa(r3)
            aucj r1 = r2.i()
            tzi r1 = (defpackage.tzi) r1
            r0.a((defpackage.tzi) r1)
            goto L_0x01c5
        L_0x0184:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ auda -> 0x01b2 }
        L_0x0187:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch:{ auda -> 0x01b2 }
            boolean r1 = r1 instanceof defpackage.auda     // Catch:{ auda -> 0x01b2 }
            if (r1 == 0) goto L_0x0197
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x01b2 }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x01b2 }
            throw r0     // Catch:{ auda -> 0x01b2 }
        L_0x0197:
            throw r0     // Catch:{ auda -> 0x01b2 }
        L_0x0198:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch:{ auda -> 0x01b2 }
            boolean r1 = r1 instanceof defpackage.auda     // Catch:{ auda -> 0x01b2 }
            if (r1 != 0) goto L_0x01ab
            auda r1 = new auda     // Catch:{ auda -> 0x01b2 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ auda -> 0x01b2 }
            r1.<init>((java.lang.String) r0)     // Catch:{ auda -> 0x01b2 }
            throw r1     // Catch:{ auda -> 0x01b2 }
        L_0x01ab:
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x01b2 }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x01b2 }
            throw r0     // Catch:{ auda -> 0x01b2 }
        L_0x01b2:
            r0 = move-exception
            throw r0     // Catch:{ auda -> 0x01b4 }
        L_0x01b4:
            r0 = move-exception
            jjg r1 = defpackage.tsp.a
            anie r1 = r1.c()
            anih r1 = (defpackage.anih) r1
            r1.a((java.lang.Throwable) r0)
            java.lang.String r0 = "FastPair: getStoredDiscoveryItem: Failed to parse device."
            r1.a((java.lang.String) r0)
        L_0x01c5:
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPair: handle bonded but not FastPairing for (%s), added to local cache from footprints."
            r0.a((java.lang.String) r1, (java.lang.Object) r5)
            aymw r0 = defpackage.aymw.a
            aymx r0 = r0.a()
            boolean r0 = r0.bh()
            if (r0 == 0) goto L_0x020a
            arwg r0 = r6.a
            ucp r1 = new ucp
            java.lang.String r2 = "setupFastPairItem"
            r1.<init>(r6, r2, r5)
            r0.c(r1)
            return
        L_0x01eb:
            boolean r0 = defpackage.aymw.x()
            if (r0 == 0) goto L_0x020a
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPair: set retroactive pairing for %s"
            r0.a((java.lang.String) r1, (java.lang.Object) r5)
            tws r0 = r6.j
            java.util.concurrent.Executor r1 = r0.c
            twj r2 = new twj
            r2.<init>(r0, r5)
            r1.execute(r2)
        L_0x020a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ucc.run():void");
    }
}
