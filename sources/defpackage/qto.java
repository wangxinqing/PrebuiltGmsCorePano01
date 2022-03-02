package defpackage;

/* renamed from: qto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qto implements Runnable {
    private final qtp a;
    private final boolean b;
    private final boolean c;

    public qto(qtp qtp, boolean z, boolean z2) {
        this.a = qtp;
        this.b = z;
        this.c = z2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x08aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r39 = this;
            r1 = r39
            qtp r2 = r1.a
            boolean r0 = r1.b
            boolean r3 = r1.c
            antf r4 = defpackage.antf.h
            aucd r4 = r4.o()
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            if (r0 != 0) goto L_0x002f
            if (r3 != 0) goto L_0x002f
            boolean r10 = r4.c
            if (r10 != 0) goto L_0x001f
            goto L_0x0024
        L_0x001f:
            r4.c()
            r4.c = r8
        L_0x0024:
            aucj r10 = r4.b
            antf r10 = (defpackage.antf) r10
            int r11 = defpackage.ante.a(r6)
            r10.a = r11
            goto L_0x0066
        L_0x002f:
            if (r0 != 0) goto L_0x0046
            boolean r10 = r4.c
            if (r10 != 0) goto L_0x0036
            goto L_0x003b
        L_0x0036:
            r4.c()
            r4.c = r8
        L_0x003b:
            aucj r10 = r4.b
            antf r10 = (defpackage.antf) r10
            int r11 = defpackage.ante.a(r7)
            r10.a = r11
            goto L_0x0066
        L_0x0046:
            if (r3 != 0) goto L_0x0052
            qoh r10 = defpackage.qoh.a()
            r11 = 11
            r10.a((int) r11)
            goto L_0x0066
        L_0x0052:
            boolean r10 = r4.c
            if (r10 != 0) goto L_0x0057
            goto L_0x005c
        L_0x0057:
            r4.c()
            r4.c = r8
        L_0x005c:
            aucj r10 = r4.b
            antf r10 = (defpackage.antf) r10
            int r11 = defpackage.ante.a(r5)
            r10.a = r11
        L_0x0066:
            aucj r4 = r4.i()
            antf r4 = (defpackage.antf) r4
            java.lang.Object r5 = r4.c(r5)
            aucd r5 = (defpackage.aucd) r5
            r5.a((defpackage.aucj) r4)
            long r10 = android.os.SystemClock.elapsedRealtime()
            if (r0 != 0) goto L_0x007c
            goto L_0x0081
        L_0x007c:
            android.content.Context r0 = r2.d
            defpackage.qtp.b(r0)
        L_0x0081:
            java.lang.String r4 = "mms"
            java.lang.String r12 = "sms"
            r13 = 2
            if (r3 == 0) goto L_0x0089
            goto L_0x00e9
        L_0x0089:
            qtv r0 = r2.e
            long r6 = r2.b()
            int r15 = r2.d()
            int r0 = r0.a((java.lang.String) r12, (long) r6, (int) r15)
            qtv r6 = r2.e
            long r14 = r2.c()
            int r7 = r2.e()
            int r6 = r6.a((java.lang.String) r4, (long) r14, (int) r7)
            int r7 = r0 + r6
            long r14 = (long) r7
            axvz r7 = defpackage.axvz.a
            axwa r7 = r7.a()
            long r19 = r7.W()
            int r7 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r7 <= 0) goto L_0x00e9
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r8] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r3 = 1
            r2[r3] = r0
            java.lang.String r0 = "Too many new messages. numNewSms = %d, numNewMms = %d Wait for batch indexing instead."
            defpackage.qoi.b(r0, r2)
            boolean r0 = r5.c
            if (r0 != 0) goto L_0x00cf
            goto L_0x00d4
        L_0x00cf:
            r5.c()
            r5.c = r8
        L_0x00d4:
            aucj r0 = r5.b
            antf r0 = (defpackage.antf) r0
            r2 = 1
            r0.b = r2
            qoh r0 = defpackage.qoh.a()
            aucj r2 = r5.i()
            antf r2 = (defpackage.antf) r2
            r0.a((defpackage.antf) r2)
            return
        L_0x00e9:
            r2.f()
            aucj r0 = r5.b
            antf r0 = (defpackage.antf) r0
            int r0 = r0.e
            qtr r6 = r2.a()
            qtv r14 = r2.e
            long r7 = r2.b()
            int r15 = r2.d()
            qts r13 = new qts
            r21 = r3
            r22 = r4
            long r3 = defpackage.qtv.a()
            long r3 = java.lang.Math.max(r7, r3)
            r13.<init>(r14, r3, r15)
            qtq r3 = r6.a((java.lang.String) r12, (java.util.Iterator) r13)
            oq r4 = r3.b
            java.lang.String r6 = "last_sms_date"
            if (r4 == 0) goto L_0x0151
            java.lang.Object r4 = r4.a
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            android.content.Context r4 = r2.d
            android.content.SharedPreferences r4 = defpackage.qtp.f(r4)
            android.content.SharedPreferences$Editor r4 = r4.edit()
            android.content.SharedPreferences$Editor r4 = r4.putLong(r6, r7)
            r4.apply()
            oq r4 = r3.b
            java.lang.Object r4 = r4.b
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            android.content.Context r7 = r2.d
            android.content.SharedPreferences r7 = defpackage.qtp.f(r7)
            android.content.SharedPreferences$Editor r7 = r7.edit()
            java.lang.String r8 = "last_sms_id"
            android.content.SharedPreferences$Editor r4 = r7.putInt(r8, r4)
            r4.apply()
        L_0x0151:
            int r3 = r3.a
            int r0 = r0 + r3
            boolean r3 = r5.c
            if (r3 == 0) goto L_0x015e
            r5.c()
            r3 = 0
            r5.c = r3
        L_0x015e:
            aucj r3 = r5.b
            antf r3 = (defpackage.antf) r3
            r3.e = r0
            long r3 = android.os.SystemClock.elapsedRealtime()
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            long r13 = r3 - r10
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
            r13 = 0
            r0[r13] = r8
            aucj r0 = r5.b
            antf r0 = (defpackage.antf) r0
            int r0 = r0.e
            qtr r8 = r2.a()
            qtv r13 = r2.e
            long r14 = r2.c()
            int r7 = r2.e()
            qtt r1 = new qtt
            long r23 = defpackage.qtv.a()
            r25 = 1000(0x3e8, double:4.94E-321)
            r27 = r10
            long r10 = r23 / r25
            long r10 = java.lang.Math.max(r14, r10)
            r1.<init>(r13, r10, r7)
            r10 = r22
            qtq r1 = r8.a((java.lang.String) r10, (java.util.Iterator) r1)
            oq r7 = r1.b
            java.lang.String r8 = "last_mms_date"
            if (r7 == 0) goto L_0x01dd
            java.lang.Object r7 = r7.a
            java.lang.Long r7 = (java.lang.Long) r7
            long r13 = r7.longValue()
            android.content.Context r7 = r2.d
            android.content.SharedPreferences r7 = defpackage.qtp.f(r7)
            android.content.SharedPreferences$Editor r7 = r7.edit()
            android.content.SharedPreferences$Editor r7 = r7.putLong(r8, r13)
            r7.apply()
            oq r7 = r1.b
            java.lang.Object r7 = r7.b
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            android.content.Context r11 = r2.d
            android.content.SharedPreferences r11 = defpackage.qtp.f(r11)
            android.content.SharedPreferences$Editor r11 = r11.edit()
            java.lang.String r13 = "last_mms_id"
            android.content.SharedPreferences$Editor r7 = r11.putInt(r13, r7)
            r7.apply()
        L_0x01dd:
            int r1 = r1.a
            int r0 = r0 + r1
            boolean r1 = r5.c
            if (r1 != 0) goto L_0x01e5
            goto L_0x01eb
        L_0x01e5:
            r5.c()
            r1 = 0
            r5.c = r1
        L_0x01eb:
            aucj r1 = r5.b
            antf r1 = (defpackage.antf) r1
            r1.e = r0
            long r13 = android.os.SystemClock.elapsedRealtime()
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            long r3 = r13 - r3
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r3 = 0
            r0[r3] = r1
            if (r21 == 0) goto L_0x09ae
            r1 = 2
            java.lang.Object[] r0 = new java.lang.Object[r1]
            long r18 = r2.b()
            java.lang.Long r1 = java.lang.Long.valueOf(r18)
            r0[r3] = r1
            long r3 = r2.c()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r3 = 1
            r0[r3] = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            qtr r4 = r2.a()
            android.database.sqlite.SQLiteDatabase r0 = r4.getReadableDatabase()     // Catch:{ SQLiteException -> 0x0230 }
            r29 = r0
            goto L_0x0233
        L_0x0230:
            r0 = move-exception
            r29 = 0
        L_0x0233:
            if (r29 == 0) goto L_0x02e1
            java.lang.String[] r31 = defpackage.qtr.a
            r7 = 1
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.String r15 = "0"
            r18 = 0
            r0[r18] = r15
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            java.lang.String r30 = "mmssms"
            java.lang.String r32 = "read=?"
            r33 = r0
            android.database.Cursor r15 = r29.query(r30, r31, r32, r33, r34, r35, r36, r37)
            if (r15 == 0) goto L_0x02cb
        L_0x0254:
            boolean r0 = r15.moveToNext()     // Catch:{ all -> 0x02c8 }
            if (r0 == 0) goto L_0x02c0
            r7 = 0
            java.lang.Integer r0 = defpackage.jit.a((android.database.Cursor) r15, (int) r7, (java.lang.Integer) r9)     // Catch:{ all -> 0x02c8 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x02c8 }
            r7 = 1
            java.lang.String r11 = r15.getString(r7)     // Catch:{ all -> 0x02c8 }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x02c8 }
            java.lang.String r7 = "'%d;%d'"
            if (r11 != 0) goto L_0x0298
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ all -> 0x02c8 }
            r23 = r6
            r22 = r8
            r8 = 2
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch:{ all -> 0x02c8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02c8 }
            r19 = 0
            r6[r19] = r0     // Catch:{ all -> 0x02c8 }
            long r24 = r15.getLong(r8)     // Catch:{ all -> 0x02c8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x02c8 }
            r8 = 1
            r6[r8] = r0     // Catch:{ all -> 0x02c8 }
            java.lang.String r0 = java.lang.String.format(r11, r7, r6)     // Catch:{ all -> 0x02c8 }
            r3.add(r0)     // Catch:{ all -> 0x02c8 }
            r8 = r22
            r6 = r23
            goto L_0x0254
        L_0x0298:
            r23 = r6
            r22 = r8
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ all -> 0x02c8 }
            r11 = 2
            java.lang.Object[] r8 = new java.lang.Object[r11]     // Catch:{ all -> 0x02c8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02c8 }
            r19 = 0
            r8[r19] = r0     // Catch:{ all -> 0x02c8 }
            long r24 = r15.getLong(r11)     // Catch:{ all -> 0x02c8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x02c8 }
            r11 = 1
            r8[r11] = r0     // Catch:{ all -> 0x02c8 }
            java.lang.String r0 = java.lang.String.format(r6, r7, r8)     // Catch:{ all -> 0x02c8 }
            r1.add(r0)     // Catch:{ all -> 0x02c8 }
            r8 = r22
            r6 = r23
            goto L_0x0254
        L_0x02c0:
            r23 = r6
            r22 = r8
            r15.close()
            goto L_0x02ea
        L_0x02c8:
            r0 = move-exception
            r1 = r0
            goto L_0x02d5
        L_0x02cb:
            r23 = r6
            r22 = r8
            java.lang.String r0 = "Got null Cursor in SmsCorpusDbOpenHelpe.insertNewIdsAndDatesIntoSets"
            defpackage.qoi.b(r0)     // Catch:{ all -> 0x02c8 }
            goto L_0x02ea
        L_0x02d5:
            if (r15 == 0) goto L_0x02e0
            r15.close()     // Catch:{ all -> 0x02db }
            goto L_0x02e0
        L_0x02db:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)
        L_0x02e0:
            throw r1
        L_0x02e1:
            r23 = r6
            r22 = r8
            java.lang.String r0 = "Got null db in SmsCorpusDbOpenHelpe.insertNewIdsAndDatesIntoSets"
            defpackage.qoi.b(r0)
        L_0x02ea:
            r6 = 2
            java.lang.Object[] r0 = new java.lang.Object[r6]
            int r6 = r1.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 0
            r0[r7] = r6
            int r6 = r3.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 1
            r0[r7] = r6
            axvz r0 = defpackage.axvz.a
            axwa r0 = r0.a()
            long r7 = r0.N()
            int r0 = (int) r7
            r6 = 1
            int r0 = java.lang.Math.max(r6, r0)
            qtv r6 = r2.e
            android.net.Uri r8 = defpackage.qtp.a
            java.util.List r1 = r6.a((int) r0, (android.net.Uri) r8, (java.util.Set) r1)
            qtv r6 = r2.e
            int r6 = r4.a(r1, r12, r6)
            qtv r8 = r2.e
            android.net.Uri r11 = defpackage.qtp.b
            java.util.List r0 = r8.a((int) r0, (android.net.Uri) r11, (java.util.Set) r3)
            r3 = 2
            java.lang.Object[] r8 = new java.lang.Object[r3]
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 0
            r8[r3] = r1
            int r1 = r0.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7 = 1
            r8[r7] = r1
            qtv r1 = r2.e
            int r0 = r4.a(r0, r10, r1)
            int r6 = r6 + r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0[r3] = r1
            boolean r0 = r5.c
            if (r0 != 0) goto L_0x0356
            goto L_0x035b
        L_0x0356:
            r5.c()
            r5.c = r3
        L_0x035b:
            aucj r0 = r5.b
            antf r0 = (defpackage.antf) r0
            r0.d = r6
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            long r13 = r0 - r13
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r6 = 0
            r4[r6] = r3
            qtr r3 = r2.a()
            qtv r4 = r2.e
            android.net.Uri r6 = defpackage.qtp.a
            java.util.Iterator r4 = r4.a((android.net.Uri) r6)
            qtv r6 = r2.e
            android.net.Uri r8 = defpackage.qtp.b
            java.util.Iterator r6 = r6.a((android.net.Uri) r8)
            android.database.sqlite.SQLiteDatabase r8 = r3.a()
            if (r8 != 0) goto L_0x039a
            java.lang.String r3 = "Got null db in SmsCorpusDbOpenHelper.processDeletions."
            defpackage.qoi.b(r3)
            oq r3 = new oq
            r4 = 0
            r3.<init>(r4, r9)
            r21 = r2
            goto L_0x04ca
        L_0x039a:
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            java.lang.String[] r31 = defpackage.qtr.b
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            java.lang.String r30 = "mmssms"
            r29 = r8
            android.database.Cursor r14 = r29.query(r30, r31, r32, r33, r34, r35, r36, r37)
            if (r14 == 0) goto L_0x04bd
        L_0x03bc:
            boolean r15 = r14.moveToNext()     // Catch:{ all -> 0x04b9 }
            if (r15 == 0) goto L_0x03e5
            r15 = 0
            java.lang.Integer r7 = defpackage.jit.a((android.database.Cursor) r14, (int) r15)     // Catch:{ all -> 0x04b9 }
            if (r7 == 0) goto L_0x03e2
            r21 = r2
            r15 = 1
            java.lang.String r2 = defpackage.jit.c(r14, r15)     // Catch:{ all -> 0x04b9 }
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x04b9 }
            if (r2 != 0) goto L_0x03dc
            r13.add(r7)     // Catch:{ all -> 0x04b9 }
            r2 = r21
            goto L_0x03bc
        L_0x03dc:
            r11.add(r7)     // Catch:{ all -> 0x04b9 }
            r2 = r21
            goto L_0x03bc
        L_0x03e2:
            r21 = r2
            goto L_0x03bc
        L_0x03e5:
            r21 = r2
            r14.close()
        L_0x03ea:
            boolean r2 = r4.hasNext()
            if (r2 != 0) goto L_0x04b0
        L_0x03f0:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x03fe
            java.lang.Object r2 = r6.next()
            r13.remove(r2)
            goto L_0x03f0
        L_0x03fe:
            r8.beginTransaction()
            qtb r2 = new qtb     // Catch:{ all -> 0x04ab }
            aplf r3 = r3.d     // Catch:{ all -> 0x04ab }
            axvz r4 = defpackage.axvz.a     // Catch:{ all -> 0x04ab }
            axwa r4 = r4.a()     // Catch:{ all -> 0x04ab }
            long r6 = r4.K()     // Catch:{ all -> 0x04ab }
            int r4 = (int) r6     // Catch:{ all -> 0x04ab }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x04ab }
            java.util.Iterator r3 = r11.iterator()     // Catch:{ all -> 0x04ab }
        L_0x0417:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x04ab }
            java.lang.String r6 = "_id=? AND msg_type=?"
            java.lang.String r14 = "mmssms"
            if (r4 == 0) goto L_0x0440
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x04ab }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x04ab }
            r7 = 2
            java.lang.String[] r15 = new java.lang.String[r7]     // Catch:{ all -> 0x04ab }
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x04ab }
            r19 = 0
            r15[r19] = r7     // Catch:{ all -> 0x04ab }
            r7 = 1
            r15[r7] = r12     // Catch:{ all -> 0x04ab }
            r8.delete(r14, r6, r15)     // Catch:{ all -> 0x04ab }
            java.lang.String r4 = defpackage.qtr.a((java.lang.String) r12, (java.lang.Integer) r4)     // Catch:{ all -> 0x04ab }
            r2.a(r4)     // Catch:{ all -> 0x04ab }
            goto L_0x0417
        L_0x0440:
            java.util.Iterator r3 = r13.iterator()     // Catch:{ all -> 0x04ab }
        L_0x0444:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x04ab }
            if (r4 == 0) goto L_0x0469
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x04ab }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x04ab }
            r15 = 2
            java.lang.String[] r7 = new java.lang.String[r15]     // Catch:{ all -> 0x04ab }
            java.lang.String r15 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x04ab }
            r19 = 0
            r7[r19] = r15     // Catch:{ all -> 0x04ab }
            r15 = 1
            r7[r15] = r10     // Catch:{ all -> 0x04ab }
            r8.delete(r14, r6, r7)     // Catch:{ all -> 0x04ab }
            java.lang.String r4 = defpackage.qtr.a((java.lang.String) r10, (java.lang.Integer) r4)     // Catch:{ all -> 0x04ab }
            r2.a(r4)     // Catch:{ all -> 0x04ab }
            goto L_0x0444
        L_0x0469:
            r2.b()     // Catch:{ all -> 0x04ab }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04ab }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x04ab }
            r8.setTransactionSuccessful()     // Catch:{ all -> 0x04ab }
            r8.endTransaction()
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r11.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 0
            r4[r6] = r3
            int r3 = r13.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 1
            r4[r6] = r3
            java.lang.String r3 = "Processed %d SMS and %d MMS deletions"
            defpackage.qoi.b(r3, r4)
            oq r3 = new oq
            int r4 = r11.size()
            int r6 = r13.size()
            int r4 = r4 + r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.<init>(r2, r4)
            goto L_0x04ca
        L_0x04ab:
            r0 = move-exception
            r8.endTransaction()
            throw r0
        L_0x04b0:
            java.lang.Object r2 = r4.next()
            r11.remove(r2)
            goto L_0x03ea
        L_0x04b9:
            r0 = move-exception
            r1 = r0
            goto L_0x09a2
        L_0x04bd:
            r21 = r2
            java.lang.String r2 = "Got null cursor in SmsCorpusDbOpenHelper.processDeletions."
            defpackage.qoi.b(r2)     // Catch:{ all -> 0x04b9 }
            oq r3 = new oq     // Catch:{ all -> 0x04b9 }
            r2 = 0
            r3.<init>(r2, r9)     // Catch:{ all -> 0x04b9 }
        L_0x04ca:
            java.lang.Object r2 = r3.b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r3 = r5.c
            if (r3 != 0) goto L_0x04d7
            goto L_0x04dd
        L_0x04d7:
            r5.c()
            r3 = 0
            r5.c = r3
        L_0x04dd:
            aucj r3 = r5.b
            antf r3 = (defpackage.antf) r3
            r3.f = r2
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r10 = r10 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r1 = 0
            r3[r1] = r0
            boolean r0 = defpackage.axvz.k()
            if (r0 == 0) goto L_0x09ae
            qtr r0 = r21.a()
            r1 = r21
            android.content.Context r2 = r1.d
            aplf r2 = defpackage.qtp.d(r2)
            qte r3 = r1.f
            qtv r1 = r1.e
            boolean r4 = defpackage.axvz.k()
            if (r4 == 0) goto L_0x0981
            android.database.sqlite.SQLiteDatabase r4 = r0.a()
            if (r4 != 0) goto L_0x051e
            java.lang.String r0 = "Null db in sms contact annotations"
            defpackage.qoi.b(r0)
            r26 = r5
            r6 = -1
            goto L_0x0984
        L_0x051e:
            ancp r8 = defpackage.ancp.a()
            r10 = 0
            r11 = 0
        L_0x0524:
            long r13 = (long) r10
            axvz r15 = defpackage.axvz.a
            axwa r15 = r15.a()
            long r24 = r15.h()
            int r15 = (r13 > r24 ? 1 : (r13 == r24 ? 0 : -1))
            if (r15 >= 0) goto L_0x05d1
            java.util.Locale r13 = java.util.Locale.US
            r14 = 2
            java.lang.Object[] r15 = new java.lang.Object[r14]
            long r24 = defpackage.axvz.b()
            java.lang.Long r14 = java.lang.Long.valueOf(r24)
            r19 = 0
            r15[r19] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            r7 = 1
            r15[r7] = r14
            java.lang.String r14 = "_id DESC LIMIT %d OFFSET %d"
            java.lang.String r34 = java.lang.String.format(r13, r14, r15)
            qog r13 = r3.c
            android.net.Uri r30 = android.provider.ContactsContract.Data.CONTENT_URI
            java.lang.String[] r31 = defpackage.qte.a
            java.lang.String[] r33 = defpackage.qte.b
            java.lang.String r32 = "mimetype = ?"
            r29 = r13
            android.database.Cursor r13 = r29.a(r30, r31, r32, r33, r34)
            if (r13 != 0) goto L_0x0575
            java.lang.String r13 = "Null cursor in updatePhoneNumberToNamesMap()"
            defpackage.qoi.b(r13)
            qoh r13 = defpackage.qoh.a()
            r14 = 22
            r13.a((int) r14)
            r21 = r3
            r14 = -1
            goto L_0x05b4
        L_0x0575:
            r14 = 0
        L_0x0576:
            boolean r15 = r13.moveToNext()
            if (r15 == 0) goto L_0x05b2
            int r14 = r14 + 1
            r15 = 0
            java.lang.String r7 = defpackage.jit.c(r13, r15)
            android.content.Context r15 = r3.d
            r21 = r3
            r6 = 1
            java.lang.String r3 = defpackage.jit.c(r13, r6)
            java.lang.String r3 = defpackage.qoj.a(r15, r3)
            boolean r15 = android.text.TextUtils.isEmpty(r7)
            if (r15 != 0) goto L_0x05a1
            boolean r15 = android.text.TextUtils.isEmpty(r3)
            if (r15 == 0) goto L_0x059d
            goto L_0x05a1
        L_0x059d:
            r8.a((java.lang.Object) r3, (java.lang.Object) r7)
            goto L_0x05af
        L_0x05a1:
            r15 = 2
            java.lang.Object[] r6 = new java.lang.Object[r15]
            r15 = 0
            r6[r15] = r7
            r7 = 1
            r6[r7] = r3
            java.lang.String r3 = "Empty contactName<%s> or phoneNumber<%s>"
            defpackage.qoi.b(r3, r6)
        L_0x05af:
            r3 = r21
            goto L_0x0576
        L_0x05b2:
            r21 = r3
        L_0x05b4:
            r3 = -1
            if (r14 == r3) goto L_0x05cd
            int r10 = r10 + r14
            long r13 = (long) r14
            long r25 = defpackage.axvz.b()
            int r3 = (r13 > r25 ? 1 : (r13 == r25 ? 0 : -1))
            if (r3 < 0) goto L_0x05d1
            long r13 = (long) r11
            long r25 = defpackage.axvz.b()
            long r13 = r13 + r25
            int r11 = (int) r13
            r3 = r21
            goto L_0x0524
        L_0x05cd:
            r3 = 1
            r7 = 0
            r8 = 0
            goto L_0x05d7
        L_0x05d1:
            r3 = 1
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r7 = 0
            r6[r7] = r8
        L_0x05d7:
            if (r8 == 0) goto L_0x0978
            r6 = 2
            java.lang.String[] r10 = new java.lang.String[r6]
            java.lang.String r6 = "phone_number"
            r10[r7] = r6
            java.lang.String r11 = "contact_name"
            r10[r3] = r11
            java.lang.String r3 = "contact_annotation"
            r13 = 0
            android.database.Cursor r10 = defpackage.qtd.a(r4, r3, r10, r13, r13)
            java.lang.String r13 = ""
            if (r10 != 0) goto L_0x05f8
            java.lang.String r14 = "Null Cursor in getPhoneNumberToNamesMap()"
            defpackage.qoi.b(r14)     // Catch:{ all -> 0x096a }
            r26 = r5
            r5 = 0
            goto L_0x0645
        L_0x05f8:
            ancp r14 = defpackage.ancp.a()     // Catch:{ all -> 0x096a }
        L_0x05fc:
            boolean r15 = r10.moveToNext()     // Catch:{ all -> 0x096a }
            if (r15 == 0) goto L_0x063c
            r15 = 0
            java.lang.String r21 = defpackage.jit.a((android.database.Cursor) r10, (int) r15, (java.lang.String) r13)     // Catch:{ all -> 0x096a }
            java.lang.String r15 = defpackage.amrk.b(r21)     // Catch:{ all -> 0x096a }
            r7 = 1
            java.lang.String r21 = defpackage.jit.a((android.database.Cursor) r10, (int) r7, (java.lang.String) r13)     // Catch:{ all -> 0x096a }
            java.lang.String r7 = defpackage.amrk.b(r21)     // Catch:{ all -> 0x096a }
            boolean r21 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x096a }
            if (r21 == 0) goto L_0x061b
        L_0x061a:
            goto L_0x0625
        L_0x061b:
            boolean r21 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x096a }
            if (r21 != 0) goto L_0x061a
            r14.a((java.lang.Object) r15, (java.lang.Object) r7)     // Catch:{ all -> 0x096a }
            goto L_0x05fc
        L_0x0625:
            r26 = r5
            r21 = r14
            r14 = 2
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x096a }
            r14 = 0
            r5[r14] = r15     // Catch:{ all -> 0x096a }
            r14 = 1
            r5[r14] = r7     // Catch:{ all -> 0x096a }
            java.lang.String r14 = "Empty phoneNumber<%s> or contactName<%s>"
            defpackage.qoi.b(r14, r5)     // Catch:{ all -> 0x096a }
            r14 = r21
            r5 = r26
            goto L_0x05fc
        L_0x063c:
            r26 = r5
            r21 = r14
            r10.close()
            r5 = r21
        L_0x0645:
            if (r5 == 0) goto L_0x0962
            r10 = 2
            java.lang.Object[] r14 = new java.lang.Object[r10]
            r10 = 0
            r14[r10] = r8
            r7 = 1
            r14[r7] = r5
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.List r14 = r5.b()
            java.util.Iterator r14 = r14.iterator()
        L_0x065d:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x069c
            java.lang.Object r15 = r14.next()
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15
            java.lang.Object r21 = r15.getKey()
            r7 = r21
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r15 = r15.getValue()
            java.lang.String r15 = (java.lang.String) r15
            boolean r21 = r8.b(r7, r15)
            if (r21 != 0) goto L_0x0697
            r38 = r1
            r21 = r14
            r14 = 2
            java.lang.String[] r1 = new java.lang.String[r14]
            r14 = 0
            r1[r14] = r7
            r14 = 1
            r1[r14] = r15
            java.lang.String r15 = "phone_number=? AND contact_name=?"
            r4.delete(r3, r15, r1)
            r10.add(r7)
            r14 = r21
            r1 = r38
            goto L_0x065d
        L_0x0697:
            r38 = r1
            r21 = r14
            goto L_0x065d
        L_0x069c:
            r38 = r1
            java.util.List r1 = r8.b()
            java.util.Iterator r1 = r1.iterator()
        L_0x06a6:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x06d9
            java.lang.Object r7 = r1.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            boolean r15 = r5.b(r8, r7)
            if (r15 != 0) goto L_0x06d7
            android.content.ContentValues r15 = new android.content.ContentValues
            r15.<init>()
            defpackage.jit.a((android.content.ContentValues) r15, (java.lang.String) r6, (java.lang.String) r8)
            defpackage.jit.a((android.content.ContentValues) r15, (java.lang.String) r11, (java.lang.String) r7)
            r7 = 0
            r4.insert(r3, r7, r15)
            r10.add(r8)
            goto L_0x06a6
        L_0x06d7:
            r7 = 0
            goto L_0x06a6
        L_0x06d9:
            r7 = 0
            boolean r1 = defpackage.axvz.j()
            if (r1 == 0) goto L_0x06ed
            qta r1 = new qta
            r3 = 25
            long r5 = defpackage.axvz.q()
            int r6 = (int) r5
            r1.<init>(r2, r3, r6)
            goto L_0x06f9
        L_0x06ed:
            qtc r1 = new qtc
            r3 = 20
            long r5 = defpackage.axvz.q()
            int r6 = (int) r5
            r1.<init>(r2, r3, r6)
        L_0x06f9:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r3 = r10.iterator()
            r5 = 0
        L_0x0703:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x095a
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            android.content.Context r8 = r0.c
            android.content.SharedPreferences r8 = defpackage.qtp.f(r8)
            r10 = r23
            boolean r11 = r8.contains(r10)
            if (r11 != 0) goto L_0x0737
            r11 = r22
            boolean r8 = r8.contains(r11)
            if (r8 == 0) goto L_0x0726
            goto L_0x0739
        L_0x0726:
            amzy r8 = defpackage.amzy.h()
            r21 = r0
            r22 = r3
            r17 = r5
            r29 = r9
            r24 = r10
            r3 = 3
            goto L_0x089a
        L_0x0737:
            r11 = r22
        L_0x0739:
            r8 = 4
            java.lang.String[] r15 = new java.lang.String[r8]
            r8 = 0
            r15[r8] = r6
            java.lang.String r8 = java.lang.String.valueOf(r6)
            java.lang.String r7 = ",%"
            java.lang.String r8 = r8.concat(r7)
            r14 = 1
            r15[r14] = r8
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r21 = r8.length()
            java.lang.String r14 = "%,"
            if (r21 != 0) goto L_0x075e
            java.lang.String r8 = new java.lang.String
            r8.<init>(r14)
            goto L_0x0762
        L_0x075e:
            java.lang.String r8 = r14.concat(r8)
        L_0x0762:
            r20 = 2
            r15[r20] = r8
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            r21 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r22 = r3
            r3 = 4
            int r8 = r8 + r3
            r0.<init>(r8)
            r0.append(r14)
            r0.append(r6)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r8 = 3
            r15[r8] = r0
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.String r7 = "_id"
            r14 = 0
            r0[r14] = r7
            java.lang.String r7 = "msg_type"
            r14 = 1
            r0[r14] = r7
            java.lang.String r14 = "phone_numbers"
            r16 = 2
            r0[r16] = r14
            java.lang.String r14 = "msg_box"
            r0[r8] = r14
            r8 = r15
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            java.lang.String r30 = "mmssms"
            java.lang.String r32 = "phone_numbers=? OR phone_numbers LIKE ? OR phone_numbers LIKE ? OR phone_numbers LIKE ?"
            r29 = r4
            r31 = r0
            r33 = r8
            android.database.Cursor r8 = r29.query(r30, r31, r32, r33, r34, r35, r36, r37)
            if (r8 != 0) goto L_0x07ca
            java.lang.String r0 = "Got null cursor in getMessagesByPhoneNumber()"
            defpackage.qoi.b(r0)     // Catch:{ all -> 0x094c }
            amzy r8 = defpackage.amzy.h()     // Catch:{ all -> 0x094c }
            r17 = r5
            r29 = r9
            r24 = r10
            r3 = 3
            goto L_0x089a
        L_0x07ca:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x094c }
            r0.<init>()     // Catch:{ all -> 0x094c }
        L_0x07cf:
            boolean r14 = r8.moveToNext()     // Catch:{ all -> 0x094c }
            if (r14 == 0) goto L_0x088b
            r14 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x094c }
            r14 = 0
            java.lang.Integer r3 = defpackage.jit.a((android.database.Cursor) r8, (int) r14, (java.lang.Integer) r3)     // Catch:{ all -> 0x094c }
            r7 = 1
            java.lang.String r14 = defpackage.jit.a((android.database.Cursor) r8, (int) r7, (java.lang.String) r13)     // Catch:{ all -> 0x094c }
            r7 = 2
            java.lang.String r15 = defpackage.jit.a((android.database.Cursor) r8, (int) r7, (java.lang.String) r13)     // Catch:{ all -> 0x094c }
            r17 = r5
            r7 = 3
            java.lang.Integer r5 = defpackage.jit.a((android.database.Cursor) r8, (int) r7, (java.lang.Integer) r9)     // Catch:{ all -> 0x094c }
            int r7 = r3.intValue()     // Catch:{ all -> 0x094c }
            r29 = r9
            r9 = -1
            if (r7 != r9) goto L_0x07fd
            r24 = r10
            goto L_0x0873
        L_0x07fd:
            boolean r7 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x094c }
            if (r7 != 0) goto L_0x0871
            boolean r7 = r12.equals(r14)     // Catch:{ all -> 0x094c }
            if (r7 != 0) goto L_0x082b
            java.lang.String r7 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x094c }
            java.lang.String r24 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x094c }
            int r24 = r24.length()     // Catch:{ all -> 0x094c }
            int r9 = r24 + 14
            r24 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x094c }
            r10.<init>(r9)     // Catch:{ all -> 0x094c }
            java.lang.String r9 = "content://mms/"
            r10.append(r9)     // Catch:{ all -> 0x094c }
            r10.append(r7)     // Catch:{ all -> 0x094c }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x094c }
            goto L_0x084c
        L_0x082b:
            r24 = r10
            java.lang.String r7 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x094c }
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x094c }
            int r9 = r9.length()     // Catch:{ all -> 0x094c }
            int r9 = r9 + 14
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x094c }
            r10.<init>(r9)     // Catch:{ all -> 0x094c }
            java.lang.String r9 = "content://sms/"
            r10.append(r9)     // Catch:{ all -> 0x094c }
            r10.append(r7)     // Catch:{ all -> 0x094c }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x094c }
        L_0x084c:
            qtf r9 = defpackage.qtg.n()     // Catch:{ all -> 0x094c }
            int r3 = r3.intValue()     // Catch:{ all -> 0x094c }
            r9.a((int) r3)     // Catch:{ all -> 0x094c }
            r9.b((java.lang.String) r14)     // Catch:{ all -> 0x094c }
            r9.c(r7)     // Catch:{ all -> 0x094c }
            r9.c = r15     // Catch:{ all -> 0x094c }
            r9.a = r5     // Catch:{ all -> 0x094c }
            qtg r3 = r9.a()     // Catch:{ all -> 0x094c }
            r0.add(r3)     // Catch:{ all -> 0x094c }
            r5 = r17
            r10 = r24
            r9 = r29
            r3 = 4
            goto L_0x07cf
        L_0x0871:
            r24 = r10
        L_0x0873:
            r5 = 2
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x094c }
            r5 = 0
            r9[r5] = r3     // Catch:{ all -> 0x094c }
            r3 = 1
            r9[r3] = r14     // Catch:{ all -> 0x094c }
            r3 = 3
            java.lang.String r5 = "Invalid msgId<%d> or msgType<%s>"
            defpackage.qoi.b(r5, r9)     // Catch:{ all -> 0x094c }
            r5 = r17
            r10 = r24
            r9 = r29
            r3 = 4
            goto L_0x07cf
        L_0x088b:
            r17 = r5
            r29 = r9
            r24 = r10
            r3 = 3
            amzy r0 = defpackage.amzy.a((java.util.Collection) r0)     // Catch:{ all -> 0x094c }
            r8.close()
            r8 = r0
        L_0x089a:
            r5 = 2
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r9 = 0
            r0[r9] = r6
            r6 = 1
            r0[r6] = r8
            int r0 = r8.size()
            r6 = 0
        L_0x08a8:
            if (r6 >= r0) goto L_0x093b
            java.lang.Object r9 = r8.get(r6)
            qtg r9 = (defpackage.qtg) r9
            java.lang.String r10 = r9.c()
            boolean r10 = r2.contains(r10)
            if (r10 == 0) goto L_0x08be
            r10 = r38
            goto L_0x0934
        L_0x08be:
            java.lang.String r10 = r9.c()
            r2.add(r10)
            boolean r10 = defpackage.axvz.j()
            if (r10 != 0) goto L_0x08f4
            java.lang.String r10 = r9.b()
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x08e0
            int r9 = r9.a()
            r10 = r38
            qtg r9 = r10.a((int) r9)
            goto L_0x08ea
        L_0x08e0:
            r10 = r38
            int r9 = r9.a()
            qtg r9 = r10.b((int) r9)
        L_0x08ea:
            if (r9 == 0) goto L_0x08f2
            aplu r9 = r9.a(r4)
            r3 = r9
            goto L_0x092d
        L_0x08f2:
            r3 = 0
            goto L_0x092d
        L_0x08f4:
            r10 = r38
            aply r14 = defpackage.aplz.a()
            java.lang.String r15 = r9.c()
            r14.b(r15)
            java.util.Set r15 = r9.p()
            defpackage.amrl.a((java.lang.Object) r15)
            boolean r9 = r9.o()
            if (r9 == 0) goto L_0x0919
            aply r9 = defpackage.qtg.b(r15, r4)
            defpackage.amrl.a((java.lang.Object) r9)
            r14.a((defpackage.aply) r9)
            goto L_0x0929
        L_0x0919:
            java.util.List r9 = defpackage.qtg.a((java.util.Collection) r15, (android.database.sqlite.SQLiteDatabase) r4)
            r15 = 0
            aply[] r3 = new defpackage.aply[r15]
            java.lang.Object[] r3 = r9.toArray(r3)
            aply[] r3 = (defpackage.aply[]) r3
            r14.a((defpackage.aply[]) r3)
        L_0x0929:
            aplu r3 = r14.a()
        L_0x092d:
            if (r3 == 0) goto L_0x0934
            r1.a(r3)
            int r17 = r17 + 1
        L_0x0934:
            int r6 = r6 + 1
            r38 = r10
            r3 = 3
            goto L_0x08a8
        L_0x093b:
            r10 = r38
            r5 = r17
            r0 = r21
            r3 = r22
            r23 = r24
            r9 = r29
            r7 = 0
            r22 = r11
            goto L_0x0703
        L_0x094c:
            r0 = move-exception
            r1 = r0
            if (r8 == 0) goto L_0x0959
            r8.close()     // Catch:{ all -> 0x0954 }
            goto L_0x0959
        L_0x0954:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)
        L_0x0959:
            throw r1
        L_0x095a:
            r17 = r5
            r1.b()
            r6 = r17
            goto L_0x0984
        L_0x0962:
            java.lang.String r0 = "Null phoneNumberToNamesMap"
            defpackage.qoi.b(r0)
            r6 = -1
            goto L_0x0984
        L_0x096a:
            r0 = move-exception
            r1 = r0
            if (r10 == 0) goto L_0x0977
            r10.close()     // Catch:{ all -> 0x0972 }
            goto L_0x0977
        L_0x0972:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)
        L_0x0977:
            throw r1
        L_0x0978:
            r26 = r5
            java.lang.String r0 = "Null freshPhoneNumberToNamesMap"
            defpackage.qoi.b(r0)
            r6 = -1
            goto L_0x0984
        L_0x0981:
            r26 = r5
            r6 = 0
        L_0x0984:
            r5 = r26
            boolean r0 = r5.c
            if (r0 != 0) goto L_0x098c
            r1 = 0
            goto L_0x0992
        L_0x098c:
            r5.c()
            r1 = 0
            r5.c = r1
        L_0x0992:
            aucj r0 = r5.b
            antf r0 = (defpackage.antf) r0
            r0.g = r6
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r0[r1] = r2
            goto L_0x09ae
        L_0x09a2:
            if (r14 == 0) goto L_0x09ad
            r14.close()     // Catch:{ all -> 0x09a8 }
            goto L_0x09ad
        L_0x09a8:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)
        L_0x09ad:
            throw r1
        L_0x09ae:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r27
            boolean r2 = r5.c
            if (r2 != 0) goto L_0x09b9
            goto L_0x09bf
        L_0x09b9:
            r5.c()
            r2 = 0
            r5.c = r2
        L_0x09bf:
            aucj r2 = r5.b
            antf r2 = (defpackage.antf) r2
            r2.c = r0
            qoh r0 = defpackage.qoh.a()
            aucj r1 = r5.i()
            antf r1 = (defpackage.antf) r1
            r0.a((defpackage.antf) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qto.run():void");
    }
}
