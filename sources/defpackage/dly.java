package defpackage;

/* renamed from: dly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dly extends dma {
    public final dms a;

    public dly(dmd dmd, dme dme) {
        super(dmd);
        iva.a((Object) dme);
        this.a = new dms(dmd, dme);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(defpackage.dmf r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            java.lang.String r0 = "properties"
            java.lang.String r3 = "Failed to end transaction"
            r18.q()
            defpackage.iva.a((java.lang.Object) r19)
            defpackage.dkw.a()
            dms r4 = r1.a
            defpackage.iva.a((java.lang.Object) r19)
            r4.q()
            java.lang.String r5 = "0"
            defpackage.dkw.a()
            r6 = 0
            r7 = 0
            r8 = 0
            r12 = 1
            dmm r13 = r4.b     // Catch:{ SQLiteException -> 0x012f }
            r13.b()     // Catch:{ SQLiteException -> 0x012f }
            dmm r13 = r4.b     // Catch:{ SQLiteException -> 0x012f }
            java.lang.String r14 = r2.a     // Catch:{ SQLiteException -> 0x012f }
            defpackage.iva.c(r14)     // Catch:{ SQLiteException -> 0x012f }
            r13.q()     // Catch:{ SQLiteException -> 0x012f }
            defpackage.dkw.a()     // Catch:{ SQLiteException -> 0x012f }
            android.database.sqlite.SQLiteDatabase r15 = r13.v()     // Catch:{ SQLiteException -> 0x012f }
            r10 = 2
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x012f }
            r11[r6] = r5     // Catch:{ SQLiteException -> 0x012f }
            r11[r12] = r14     // Catch:{ SQLiteException -> 0x012f }
            java.lang.String r14 = "app_uid=? AND cid<>?"
            int r11 = r15.delete(r0, r14, r11)     // Catch:{ SQLiteException -> 0x012f }
            if (r11 <= 0) goto L_0x0051
            java.lang.String r14 = "Deleted property records"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ SQLiteException -> 0x012f }
            r13.a(r14, r11)     // Catch:{ SQLiteException -> 0x012f }
        L_0x0051:
            dmm r11 = r4.b     // Catch:{ SQLiteException -> 0x012f }
            java.lang.String r13 = r2.a     // Catch:{ SQLiteException -> 0x012f }
            java.lang.String r14 = r2.b     // Catch:{ SQLiteException -> 0x012f }
            defpackage.iva.c(r13)     // Catch:{ SQLiteException -> 0x012f }
            defpackage.iva.c(r14)     // Catch:{ SQLiteException -> 0x012f }
            r11.q()     // Catch:{ SQLiteException -> 0x012f }
            defpackage.dkw.a()     // Catch:{ SQLiteException -> 0x012f }
            r15 = 3
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x012f }
            r15[r6] = r5     // Catch:{ SQLiteException -> 0x012f }
            r15[r12] = r13     // Catch:{ SQLiteException -> 0x012f }
            r15[r10] = r14     // Catch:{ SQLiteException -> 0x012f }
            java.lang.String r5 = "SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?"
            long r10 = r11.a(r5, r15)     // Catch:{ SQLiteException -> 0x012f }
            r13 = 1
            long r13 = r13 + r10
            r2.d = r13     // Catch:{ SQLiteException -> 0x012f }
            dmm r5 = r4.b     // Catch:{ SQLiteException -> 0x012f }
            defpackage.iva.a((java.lang.Object) r19)     // Catch:{ SQLiteException -> 0x012f }
            r5.q()     // Catch:{ SQLiteException -> 0x012f }
            defpackage.dkw.a()     // Catch:{ SQLiteException -> 0x012f }
            android.database.sqlite.SQLiteDatabase r13 = r5.v()     // Catch:{ SQLiteException -> 0x012f }
            java.util.Map r14 = r2.e     // Catch:{ SQLiteException -> 0x012f }
            defpackage.iva.a((java.lang.Object) r14)     // Catch:{ SQLiteException -> 0x012f }
            android.net.Uri$Builder r15 = new android.net.Uri$Builder     // Catch:{ SQLiteException -> 0x012f }
            r15.<init>()     // Catch:{ SQLiteException -> 0x012f }
            java.util.Set r14 = r14.entrySet()     // Catch:{ SQLiteException -> 0x012f }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ SQLiteException -> 0x012f }
        L_0x0098:
            boolean r16 = r14.hasNext()     // Catch:{ SQLiteException -> 0x012f }
            if (r16 == 0) goto L_0x00ba
            java.lang.Object r16 = r14.next()     // Catch:{ SQLiteException -> 0x012f }
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16     // Catch:{ SQLiteException -> 0x012f }
            java.lang.Object r17 = r16.getKey()     // Catch:{ SQLiteException -> 0x012f }
            r6 = r17
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ SQLiteException -> 0x012f }
            java.lang.Object r16 = r16.getValue()     // Catch:{ SQLiteException -> 0x012f }
            r12 = r16
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ SQLiteException -> 0x012f }
            r15.appendQueryParameter(r6, r12)     // Catch:{ SQLiteException -> 0x012f }
            r6 = 0
            r12 = 1
            goto L_0x0098
        L_0x00ba:
            android.net.Uri r6 = r15.build()     // Catch:{ SQLiteException -> 0x012f }
            java.lang.String r6 = r6.getEncodedQuery()     // Catch:{ SQLiteException -> 0x012f }
            if (r6 == 0) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            java.lang.String r6 = ""
        L_0x00c7:
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x012f }
            r12.<init>()     // Catch:{ SQLiteException -> 0x012f }
            java.lang.String r14 = "app_uid"
            java.lang.Long r15 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteException -> 0x012f }
            r12.put(r14, r15)     // Catch:{ SQLiteException -> 0x012f }
            java.lang.String r14 = "cid"
            java.lang.String r15 = r2.a     // Catch:{ SQLiteException -> 0x012f }
            r12.put(r14, r15)     // Catch:{ SQLiteException -> 0x012f }
            java.lang.String r14 = "tid"
            java.lang.String r15 = r2.b     // Catch:{ SQLiteException -> 0x012f }
            r12.put(r14, r15)     // Catch:{ SQLiteException -> 0x012f }
            java.lang.String r14 = "adid"
            boolean r15 = r2.c     // Catch:{ SQLiteException -> 0x012f }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x012f }
            r12.put(r14, r15)     // Catch:{ SQLiteException -> 0x012f }
            java.lang.String r14 = "hits_count"
            long r8 = r2.d     // Catch:{ SQLiteException -> 0x012f }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteException -> 0x012f }
            r12.put(r14, r8)     // Catch:{ SQLiteException -> 0x012f }
            java.lang.String r8 = "params"
            r12.put(r8, r6)     // Catch:{ SQLiteException -> 0x012f }
            r6 = 5
            long r8 = r13.insertWithOnConflict(r0, r7, r12, r6)     // Catch:{ SQLiteException -> 0x0111 }
            r12 = -1
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0119
            java.lang.String r0 = "Failed to insert/update a property (got -1)"
            r5.e(r0)     // Catch:{ SQLiteException -> 0x010f }
            goto L_0x0119
        L_0x010f:
            r0 = move-exception
            goto L_0x0114
        L_0x0111:
            r0 = move-exception
            r12 = -1
        L_0x0114:
            java.lang.String r6 = "Error storing a property"
            r5.e(r6, r0)     // Catch:{ SQLiteException -> 0x0129 }
        L_0x0119:
            dmm r0 = r4.b     // Catch:{ SQLiteException -> 0x0129 }
            r0.s()     // Catch:{ SQLiteException -> 0x0129 }
            dmm r0 = r4.b     // Catch:{ SQLiteException -> 0x0124 }
            r0.t()     // Catch:{ SQLiteException -> 0x0124 }
            goto L_0x0143
        L_0x0124:
            r0 = move-exception
            r4.e(r3, r0)
            goto L_0x0143
        L_0x0129:
            r0 = move-exception
            goto L_0x0132
        L_0x012b:
            r0 = move-exception
            r2 = r0
            goto L_0x031c
        L_0x012f:
            r0 = move-exception
            r12 = -1
        L_0x0132:
            java.lang.String r5 = "Failed to update Analytics property"
            r4.e(r5, r0)     // Catch:{ all -> 0x012b }
            dmm r0 = r4.b     // Catch:{ SQLiteException -> 0x013e }
            r0.t()     // Catch:{ SQLiteException -> 0x013e }
            r10 = r12
            goto L_0x0143
        L_0x013e:
            r0 = move-exception
            r4.e(r3, r0)
            r10 = r12
        L_0x0143:
            r3 = 0
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x031b
            dms r0 = r1.a
            defpackage.dkw.a()
            java.lang.String r3 = r2.b
            java.lang.String r4 = "Sending first hit to property"
            r0.b(r4, r3)
            dpp r3 = r0.l()
            dpw r4 = new dpw
            jiq r5 = r3.c()
            long r8 = r3.b()
            r4.<init>(r5, r8)
            r0.f()
            doy r3 = defpackage.doz.A
            java.lang.Object r3 = r3.a()
            java.lang.Long r3 = (java.lang.Long) r3
            long r5 = r3.longValue()
            boolean r3 = r4.a(r5)
            if (r3 != 0) goto L_0x031b
            dpp r3 = r0.l()
            defpackage.dkw.a()
            r3.q()
            android.content.SharedPreferences r3 = r3.a
            java.lang.String r4 = "installation_campaign"
            java.lang.String r3 = r3.getString(r4, r7)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0195
            r7 = r3
            goto L_0x0196
        L_0x0195:
        L_0x0196:
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 != 0) goto L_0x031b
            dpk r3 = r0.e()
            dle r3 = defpackage.dpx.a((defpackage.dpk) r3, (java.lang.String) r7)
            java.lang.String r4 = "Found relevant installation campaign"
            r0.b(r4, r3)
            defpackage.iva.a((java.lang.Object) r19)
            defpackage.iva.a((java.lang.Object) r3)
            dkd r4 = new dkd
            dmd r5 = r0.d
            r4.<init>(r5)
            java.lang.String r5 = r2.b
            defpackage.iva.c(r5)
            android.net.Uri r6 = defpackage.dke.a((java.lang.String) r5)
            java.util.List r7 = r4.c()
            java.util.ListIterator r7 = r7.listIterator()
        L_0x01c7:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01e1
            java.lang.Object r8 = r7.next()
            dky r8 = (defpackage.dky) r8
            android.net.Uri r8 = r8.a()
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x01c7
            r7.remove()
            goto L_0x01c7
        L_0x01e1:
            java.util.List r6 = r4.c()
            dke r7 = new dke
            dmd r8 = r4.a
            r7.<init>(r8, r5)
            r6.add(r7)
            boolean r5 = r2.c
            r4.b = r5
            dkn r5 = r4.g
            dkn r5 = r5.a()
            dmd r6 = r4.a
            dmn r6 = r6.h()
            dld r6 = r6.b()
            r5.a((defpackage.dkp) r6)
            dmd r6 = r4.a
            dnc r6 = r6.h
            dli r6 = r6.b()
            r5.a((defpackage.dkp) r6)
            java.util.List r4 = r4.h
            int r6 = r4.size()
            r7 = 0
        L_0x0218:
            if (r7 < r6) goto L_0x030b
            java.lang.Class<dlm> r4 = defpackage.dlm.class
            dkp r4 = r5.b(r4)
            dlm r4 = (defpackage.dlm) r4
            java.lang.String r6 = "data"
            r4.a = r6
            r6 = 1
            r4.f = r6
            r5.a((defpackage.dkp) r3)
            java.lang.Class<dlh> r6 = defpackage.dlh.class
            dkp r6 = r5.b(r6)
            dlh r6 = (defpackage.dlh) r6
            java.lang.Class<dld> r7 = defpackage.dld.class
            dkp r7 = r5.b(r7)
            dld r7 = (defpackage.dld) r7
            java.util.Map r8 = r2.e
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0246:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x02b5
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r12 = r9.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r13 = "an"
            boolean r13 = r13.equals(r12)
            if (r13 != 0) goto L_0x02b2
            java.lang.String r13 = "av"
            boolean r13 = r13.equals(r12)
            if (r13 != 0) goto L_0x02af
            java.lang.String r13 = "aid"
            boolean r13 = r13.equals(r12)
            if (r13 != 0) goto L_0x02ac
            java.lang.String r13 = "aiid"
            boolean r13 = r13.equals(r12)
            if (r13 != 0) goto L_0x02a9
            java.lang.String r13 = "uid"
            boolean r13 = r13.equals(r12)
            if (r13 != 0) goto L_0x02a6
            defpackage.iva.c(r12)
            if (r12 == 0) goto L_0x0299
            java.lang.String r13 = "&"
            boolean r13 = r12.startsWith(r13)
            if (r13 == 0) goto L_0x0299
            r13 = 1
            java.lang.String r12 = r12.substring(r13)
            goto L_0x029a
        L_0x0299:
        L_0x029a:
            java.lang.String r13 = "Name can not be empty or \"&\""
            defpackage.iva.a((java.lang.String) r12, (java.lang.Object) r13)
            java.util.Map r13 = r6.a
            r13.put(r12, r9)
            goto L_0x0246
        L_0x02a6:
            r4.c = r9
            goto L_0x0246
        L_0x02a9:
            r7.d = r9
            goto L_0x0246
        L_0x02ac:
            r7.c = r9
            goto L_0x0246
        L_0x02af:
            r7.b = r9
            goto L_0x0246
        L_0x02b2:
            r7.a = r9
            goto L_0x0246
        L_0x02b5:
            java.lang.String r2 = r2.b
            java.lang.String r4 = "Sending installation campaign to"
            r0.b(r4, r2, r3)
            dpp r0 = r0.l()
            long r2 = r0.b()
            r5.e = r2
            dkq r0 = r5.a
            dkw r0 = r0.f
            boolean r2 = r5.g
            if (r2 != 0) goto L_0x0303
            boolean r2 = r5.c
            if (r2 != 0) goto L_0x02fb
            dkn r2 = r5.a()
            long r3 = android.os.SystemClock.elapsedRealtime()
            r2.f = r3
            long r3 = r2.e
            r8 = 0
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x02eb
            long r3 = java.lang.System.currentTimeMillis()
            r2.d = r3
            goto L_0x02ed
        L_0x02eb:
            r2.d = r3
        L_0x02ed:
            r12 = 1
            r2.c = r12
            dkt r3 = r0.d
            dkr r4 = new dkr
            r4.<init>(r0, r2)
            r3.execute(r4)
            goto L_0x031b
        L_0x02fb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Measurement can only be submitted once"
            r0.<init>(r2)
            throw r0
        L_0x0303:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Measurement prototype can't be submitted"
            r0.<init>(r2)
            throw r0
        L_0x030b:
            r8 = 0
            r12 = 1
            java.lang.Object r13 = r4.get(r7)
            dko r13 = (defpackage.dko) r13
            r13.a()
            int r7 = r7 + 1
            goto L_0x0218
        L_0x031b:
            return r10
        L_0x031c:
            dmm r0 = r4.b     // Catch:{ SQLiteException -> 0x0322 }
            r0.t()     // Catch:{ SQLiteException -> 0x0322 }
            goto L_0x0326
        L_0x0322:
            r0 = move-exception
            r4.e(r3, r0)
        L_0x0326:
            goto L_0x0328
        L_0x0327:
            throw r2
        L_0x0328:
            goto L_0x0327
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dly.a(dmf):long");
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        dkw.a();
        dms dms = this.a;
        dkw.a();
        dms.g = dms.c().a();
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.a.r();
    }

    public final void a(dne dne) {
        q();
        g().a((Runnable) new dlx(this, dne));
    }

    public final void a(dpc dpc) {
        iva.a((Object) dpc);
        q();
        b("Hit delivery requested", dpc);
        g().a((Runnable) new dlu(this, dpc));
    }
}
