package defpackage;

/* renamed from: xxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xxw extends xxk {
    private final xvp g;
    private final xyo h;

    public xxw(xyp xyp, xwv xwv, xvw xvw, yaz yaz, xvp xvp, xyo xyo, xyg xyg) {
        super(xnd.UPDATE, xyp, xvw, yaz, xwv, xyg);
        this.g = xvp;
        this.h = xyo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (r0.a.r == defpackage.babg.INVALID_ARGUMENT) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.xvs r13, boolean r14) {
        /*
            r12 = this;
            xwv r0 = r12.e     // Catch:{ babk -> 0x0010 }
            amgi r1 = defpackage.xwx.a((defpackage.xvs) r13)     // Catch:{ babk -> 0x0010 }
            java.lang.String r2 = r13.a     // Catch:{ babk -> 0x0010 }
            xvs r0 = r0.a((defpackage.amgi) r1, (java.lang.String) r2)     // Catch:{ babk -> 0x0010 }
            r12.a(r0, r13)     // Catch:{ babk -> 0x0010 }
            return
        L_0x0010:
            r0 = move-exception
            if (r14 == 0) goto L_0x01c7
            xyg r14 = r12.f
            wvo r1 = defpackage.wvo.UPDATE
            babj r2 = r0.a
            babg r3 = r2.r
            int r3 = r3.r
            java.lang.String r2 = r2.s
            int r14 = r14.a((defpackage.wvo) r1, (int) r3, (java.lang.String) r2)
            r1 = 3
            if (r14 == r1) goto L_0x0059
            babj r14 = r0.a
            babg r14 = r14.r
            babg r2 = defpackage.babg.FAILED_PRECONDITION
            if (r14 != r2) goto L_0x003a
            java.lang.String r14 = r0.getMessage()
            java.lang.String r2 = "FingerprintMismatch"
            boolean r14 = r14.contains(r2)
            if (r14 != 0) goto L_0x0059
        L_0x003a:
            defpackage.xip.a()
            ayrj r14 = defpackage.ayrj.a
            aytn r14 = r14.a()
            boolean r14 = r14.L()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x01c7
            babj r14 = r0.a
            babg r14 = r14.r
            babg r2 = defpackage.babg.INVALID_ARGUMENT
            if (r14 != r2) goto L_0x01c7
        L_0x0059:
            java.lang.String r14 = "FSA2_UpdateContactUpSyncer"
            java.lang.String r0 = "Error when update contact to server, doing getContact() now..."
            android.util.Log.w(r14, r0)
            xwv r14 = r12.e     // Catch:{ Exception -> 0x01ad }
            java.lang.String r0 = r13.a     // Catch:{ Exception -> 0x01ad }
            java.lang.String r2 = defpackage.yaw.a((java.lang.String) r0)     // Catch:{ Exception -> 0x01ad }
            aqvp r2 = r14.b(r2)     // Catch:{ Exception -> 0x01ad }
            yav r3 = r14.d     // Catch:{ Exception -> 0x01ad }
            r3.a()     // Catch:{ Exception -> 0x01ad }
            xpp r3 = r14.b     // Catch:{ Exception -> 0x01ad }
            com.google.android.gms.common.internal.ClientContext r4 = r14.a     // Catch:{ Exception -> 0x01ad }
            aqvr r2 = r3.a((com.google.android.gms.common.internal.ClientContext) r4, (defpackage.aqvp) r2)     // Catch:{ Exception -> 0x01ad }
            yav r14 = r14.d     // Catch:{ Exception -> 0x01ad }
            java.lang.String r3 = "FSA_getPerson"
            int r4 = defpackage.xxa.a(r2)     // Catch:{ Exception -> 0x01ad }
            r5 = 1
            r14.a(r3, r5, r4)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r14 = "FSA2_ContactSyncGrpc"
            if (r2 == 0) goto L_0x01a2
            aucx r3 = r2.a     // Catch:{ Exception -> 0x01ad }
            int r3 = r3.size()     // Catch:{ Exception -> 0x01ad }
            if (r3 <= 0) goto L_0x01a2
            aucx r3 = r2.a     // Catch:{ Exception -> 0x01ad }
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x01ad }
            aqwr r3 = (defpackage.aqwr) r3     // Catch:{ Exception -> 0x01ad }
            aurd r6 = r3.b     // Catch:{ Exception -> 0x01ad }
            if (r6 == 0) goto L_0x018f
            int r6 = r6.a     // Catch:{ Exception -> 0x01ad }
            babg r7 = defpackage.babg.OK     // Catch:{ Exception -> 0x01ad }
            int r7 = r7.r     // Catch:{ Exception -> 0x01ad }
            if (r6 != r7) goto L_0x018f
            amgi r3 = r3.a     // Catch:{ Exception -> 0x01ad }
            if (r3 == 0) goto L_0x018f
            xvs r14 = defpackage.xwy.a((defpackage.amgi) r3, (java.lang.String) r0)     // Catch:{ Exception -> 0x01ad }
            if (r14 == 0) goto L_0x018e
            java.lang.String r0 = r13.a
            yad r0 = new yad
            r0.<init>(r14, r13)
            xyp r14 = r12.b
            r14.a((defpackage.yad) r0, (boolean) r5)
            xvw r14 = r12.c
            r14.b()
            defpackage.xip.a()
            ayrj r14 = defpackage.ayrj.a
            aytn r14 = r14.a()
            long r0 = r14.br()
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            long r0 = r14.longValue()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x011c
            xvp r0 = r12.g     // Catch:{ InterruptedException -> 0x00ef }
            r0.a()     // Catch:{ InterruptedException -> 0x00ef }
            long r0 = r14.longValue()     // Catch:{ InterruptedException -> 0x00ef }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x00ef }
            xvp r14 = r12.g     // Catch:{ InterruptedException -> 0x00ef }
            r14.a()     // Catch:{ InterruptedException -> 0x00ef }
            goto L_0x011c
        L_0x00ef:
            r13 = move-exception
            defpackage.xip.a()
            xfs r14 = defpackage.xim.a
            java.lang.Object r14 = r14.a()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x010c
            yaz r14 = r12.d
            xjo r0 = defpackage.xjo.CONTACT
            xnd r1 = defpackage.xnd.UPDATE
            java.lang.String r2 = "InterruptedException_MergeApiContactToLocal"
            r14.a((defpackage.xjo) r0, (defpackage.xnd) r1, (java.lang.String) r2, (java.lang.Exception) r13)
        L_0x010c:
            yaz r13 = r12.d
            ybh r13 = (defpackage.ybh) r13
            android.content.SyncResult r13 = r13.a
            android.content.SyncStats r13 = r13.stats
            long r0 = r13.numIoExceptions
            r2 = 1
            long r0 = r0 + r2
            r13.numIoExceptions = r0
            return
        L_0x011c:
            xyo r14 = r12.h
            java.lang.String r13 = r13.a
            java.lang.String[] r0 = new java.lang.String[r5]
            r0[r4] = r13
            android.content.ContentResolver r13 = r14.a
            android.accounts.Account r1 = r14.b
            anax r2 = defpackage.xyo.e
            java.lang.String[] r3 = defpackage.xvw.a
            java.lang.String r3 = "sourceid=?"
            xvz r13 = defpackage.xvz.a(r13, r1, r2, r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0189 }
            r0.<init>()     // Catch:{ all -> 0x0189 }
            defpackage.xip.a()     // Catch:{ all -> 0x0189 }
            xfs r1 = defpackage.xif.a     // Catch:{ all -> 0x0189 }
            java.lang.Object r1 = r1.a()     // Catch:{ all -> 0x0189 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0189 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0189 }
            r2 = 0
        L_0x0147:
            xvs r3 = r13.b()     // Catch:{ all -> 0x0189 }
            if (r3 != 0) goto L_0x014e
            goto L_0x0165
        L_0x014e:
            if (r2 >= r1) goto L_0x0165
            xvp r5 = r14.c     // Catch:{ all -> 0x0189 }
            r5.a()     // Catch:{ all -> 0x0189 }
            boolean r5 = r3.h     // Catch:{ all -> 0x0189 }
            if (r5 != 0) goto L_0x015f
            boolean r5 = defpackage.xyo.a(r3)     // Catch:{ all -> 0x0189 }
            if (r5 != 0) goto L_0x0147
        L_0x015f:
            r0.add(r3)     // Catch:{ all -> 0x0189 }
            int r2 = r2 + 1
            goto L_0x0147
        L_0x0165:
            android.net.Uri r1 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x0189 }
            android.accounts.Account r2 = r14.b     // Catch:{ all -> 0x0189 }
            android.net.Uri r1 = defpackage.xvw.a((android.net.Uri) r1, (android.accounts.Account) r2)     // Catch:{ all -> 0x0189 }
            java.lang.String r2 = "data_set IS NULL"
            r14.a((android.net.Uri) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0189 }
            int r14 = r0.size()     // Catch:{ all -> 0x0189 }
            if (r14 <= 0) goto L_0x017f
            java.lang.Object r14 = r0.get(r4)     // Catch:{ all -> 0x0189 }
            xvs r14 = (defpackage.xvs) r14     // Catch:{ all -> 0x0189 }
            goto L_0x0180
        L_0x017f:
            r14 = 0
        L_0x0180:
            r13.f()
            if (r14 == 0) goto L_0x018e
            r12.a(r14, r4)
            return
        L_0x0189:
            r14 = move-exception
            r13.f()
            throw r14
        L_0x018e:
            return
        L_0x018f:
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01ad }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x01ad }
            r13[r4] = r0     // Catch:{ Exception -> 0x01ad }
            java.lang.String r0 = "Failed to getPerson: %s"
            defpackage.xdt.b(r14, r0, r13)     // Catch:{ Exception -> 0x01ad }
            xya r13 = new xya     // Catch:{ Exception -> 0x01ad }
            r13.<init>(r1)     // Catch:{ Exception -> 0x01ad }
            throw r13     // Catch:{ Exception -> 0x01ad }
        L_0x01a2:
            java.lang.String r13 = "Unexpected null result returned by getPeople API"
            android.util.Log.e(r14, r13)     // Catch:{ Exception -> 0x01ad }
            xya r13 = new xya     // Catch:{ Exception -> 0x01ad }
            r13.<init>(r1)     // Catch:{ Exception -> 0x01ad }
            throw r13     // Catch:{ Exception -> 0x01ad }
        L_0x01ad:
            r13 = move-exception
            yaz r0 = r12.d
            xnd r1 = defpackage.xnd.UPDATE
            xjo r2 = defpackage.xjo.CONTACT
            r3 = 1
            r4 = 1
            r5 = 1
            r0.a(r1, r2, r3, r4, r5)
            yaz r6 = r12.d
            xnd r7 = defpackage.xnd.UPDATE
            xjo r8 = defpackage.xjo.CONTACT
            r9 = 1
            r10 = 2
            r11 = 1
            r6.a(r7, r8, r9, r10, r11)
            throw r13
        L_0x01c7:
            goto L_0x01c9
        L_0x01c8:
            throw r0
        L_0x01c9:
            goto L_0x01c8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxw.a(xvs, boolean):void");
    }

    /* access modifiers changed from: protected */
    public final boolean b(xvs xvs) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void c(xvs xvs) {
        a(xvs, true);
    }

    /* access modifiers changed from: protected */
    public final void d(xvs xvs) {
        a(this.e.a(xwx.b(xvs), xvs.a), xvs);
    }
}
