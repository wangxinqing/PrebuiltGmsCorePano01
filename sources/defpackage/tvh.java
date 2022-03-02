package defpackage;

import android.content.Context;

/* renamed from: tvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tvh implements Runnable {
    private final Context a;
    private final String b;
    private final String c;
    private final arxt d;

    public tvh(Context context, String str, String str2, arxt arxt) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = arxt;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0101, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0101 A[ExcHandler: InterruptedException | ExecutionException (e java.lang.Throwable), Splitter:B:4:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            android.content.Context r11 = r1.a
            java.lang.String r12 = r1.b
            java.lang.String r13 = r1.c
            arxt r14 = r1.d
            java.lang.Class<ttf> r0 = defpackage.ttf.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r11, (java.lang.Class) r0)
            ttf r0 = (defpackage.ttf) r0
            tzi r15 = r0.a((java.lang.String) r13)
            java.lang.String r0 = r11.getPackageName()
            java.util.List r0 = defpackage.jgu.d(r11, r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x0022:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0118
            java.lang.Object r0 = r16.next()
            r6 = r0
            android.accounts.Account r6 = (android.accounts.Account) r6
            aorr r0 = r14.a((android.accounts.Account) r6)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            java.util.List r0 = (java.util.List) r0     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            tzj r7 = defpackage.tvd.a((java.util.List) r0, (defpackage.tzi) r15)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            if (r7 == 0) goto L_0x00fb
            uaj r0 = defpackage.uaj.K     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            aucd r4 = r0.o()     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            auay r0 = r7.c     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            aubs r2 = defpackage.aubs.c()     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            aubc r0 = r0.h()     // Catch:{ auda -> 0x00f9, IOException -> 0x00c0, ExecutionException -> 0x0103, InterruptedException -> 0x0101 }
            r4.a((defpackage.aubc) r0, (defpackage.aubs) r2)     // Catch:{ auda -> 0x00f9, IOException -> 0x00c0, ExecutionException -> 0x0103, InterruptedException -> 0x0101 }
            r2 = 0
            r0.a((int) r2)     // Catch:{ auda -> 0x00f9, IOException -> 0x00c0, ExecutionException -> 0x0103, InterruptedException -> 0x0101 }
            aucj r0 = r4.b     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            uaj r0 = (defpackage.uaj) r0     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            java.lang.String r0 = r0.h     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            boolean r0 = r0.equals(r12)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            if (r0 != 0) goto L_0x00bc
            boolean r0 = r4.c     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            if (r0 != 0) goto L_0x0067
            goto L_0x006c
        L_0x0067:
            r4.c()     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            r4.c = r2     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
        L_0x006c:
            aucj r0 = r4.b     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            uaj r0 = (defpackage.uaj) r0     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            r12.getClass()     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            int r2 = r0.a     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            r2 = r2 | 32
            r0.a = r2     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            r0.h = r12     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            jjg r0 = defpackage.tsp.a     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            anie r0 = r0.d()     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            anih r0 = (defpackage.anih) r0     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            java.lang.String r2 = "FastPair: update title to alias name = %s"
            r0.a((java.lang.String) r2, (java.lang.Object) r12)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            ttu r0 = new ttu     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            aucj r2 = r4.b     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            uaj r2 = (defpackage.uaj) r2     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            java.lang.String r2 = r2.y     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            r0.<init>(r2, r13, r11)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            tts r2 = defpackage.ttt.f()     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            aspb r3 = defpackage.aspb.DEVICE_ALIAS_CHANGED     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            r2.a((defpackage.aspb) r3)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            ttt r2 = r2.a()     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            r0.a((defpackage.ttt) r2)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            java.lang.Class<arwg> r0 = defpackage.arwg.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r11, (java.lang.Class) r0)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            arwg r0 = (defpackage.arwg) r0     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            tvi r10 = new tvi     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            java.lang.String r3 = "updateDiscoveryItemTitle"
            r2 = r10
            r5 = r14
            r8 = r13
            r9 = r11
            r1 = r10
            r10 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            r0.c(r1)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            return
        L_0x00bc:
            r1 = r17
            goto L_0x0022
        L_0x00c0:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            java.lang.Class r2 = r4.getClass()     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            java.lang.String r2 = r2.getName()     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            int r3 = r3.length()     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            int r3 = r3 + 70
            r4.<init>(r3)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            java.lang.String r3 = "Reading "
            r4.append(r3)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            r4.append(r2)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            java.lang.String r2 = " from a "
            r4.append(r2)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            java.lang.String r2 = "ByteString"
            r4.append(r2)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            java.lang.String r2 = " threw an IOException (should never happen)."
            r4.append(r2)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            java.lang.String r2 = r4.toString()     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            r1.<init>(r2, r0)     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
            throw r1     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
        L_0x00f9:
            r0 = move-exception
            throw r0     // Catch:{ ExecutionException -> 0x0103, InterruptedException -> 0x0101, auda -> 0x00ff }
        L_0x00fb:
            r1 = r17
            goto L_0x0022
        L_0x00ff:
            r0 = move-exception
            goto L_0x0104
        L_0x0101:
            r0 = move-exception
            goto L_0x0104
        L_0x0103:
            r0 = move-exception
        L_0x0104:
            jjg r1 = defpackage.tsp.a
            anie r1 = r1.c()
            anih r1 = (defpackage.anih) r1
            r1.a((java.lang.Throwable) r0)
            java.lang.String r0 = "FastPair: Failed to read device from Footprints."
            r1.a((java.lang.String) r0)
            r1 = r17
            goto L_0x0022
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvh.run():void");
    }
}
