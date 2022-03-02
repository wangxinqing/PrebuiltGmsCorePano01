package defpackage;

/* renamed from: syz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class syz implements suu {
    final /* synthetic */ sze a;

    public syz(sze sze) {
        this.a = sze;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0140, code lost:
        if (r10 == 429) goto L_0x0142;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map r13) {
        /*
            r8 = this;
            java.lang.String r9 = ")"
            sze r13 = r8.a
            r13.r()
            r13.s()
            r0 = 0
            if (r12 != 0) goto L_0x0013
            byte[] r12 = new byte[r0]     // Catch:{ all -> 0x0010 }
            goto L_0x0014
        L_0x0010:
            r9 = move-exception
            goto L_0x020b
        L_0x0013:
        L_0x0014:
            java.util.List r1 = r13.n     // Catch:{ all -> 0x0010 }
            r2 = 0
            r13.n = r2     // Catch:{ all -> 0x0010 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 0
            if (r10 == r3) goto L_0x0025
            r3 = 204(0xcc, float:2.86E-43)
            if (r10 == r3) goto L_0x0025
            goto L_0x0119
        L_0x0025:
            if (r11 != 0) goto L_0x0119
            svf r9 = r13.e()     // Catch:{ SQLiteException -> 0x00f0 }
            svc r9 = r9.d     // Catch:{ SQLiteException -> 0x00f0 }
            jiq r11 = r13.o()     // Catch:{ SQLiteException -> 0x00f0 }
            long r6 = r11.a()     // Catch:{ SQLiteException -> 0x00f0 }
            r9.a(r6)     // Catch:{ SQLiteException -> 0x00f0 }
            svf r9 = r13.e()     // Catch:{ SQLiteException -> 0x00f0 }
            svc r9 = r9.e     // Catch:{ SQLiteException -> 0x00f0 }
            r9.a(r4)     // Catch:{ SQLiteException -> 0x00f0 }
            r13.w()     // Catch:{ SQLiteException -> 0x00f0 }
            sut r9 = r13.E()     // Catch:{ SQLiteException -> 0x00f0 }
            sur r9 = r9.k     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r11 = "Successful upload. Got network response. code, size"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ SQLiteException -> 0x00f0 }
            int r12 = r12.length     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x00f0 }
            r9.a(r11, r10, r12)     // Catch:{ SQLiteException -> 0x00f0 }
            spj r9 = r13.h()     // Catch:{ SQLiteException -> 0x00f0 }
            r9.b()     // Catch:{ SQLiteException -> 0x00f0 }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ all -> 0x00e7 }
        L_0x0063:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x00e7 }
            if (r10 == 0) goto L_0x00b7
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x00e7 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x00e7 }
            spj r11 = r13.h()     // Catch:{ SQLiteException -> 0x00aa }
            long r6 = r10.longValue()     // Catch:{ SQLiteException -> 0x00aa }
            r11.h()     // Catch:{ SQLiteException -> 0x00aa }
            r11.q()     // Catch:{ SQLiteException -> 0x00aa }
            android.database.sqlite.SQLiteDatabase r12 = r11.e()     // Catch:{ SQLiteException -> 0x00aa }
            r1 = 1
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x00aa }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x00aa }
            r3[r0] = r6     // Catch:{ SQLiteException -> 0x00aa }
            java.lang.String r6 = "queue"
            java.lang.String r7 = "rowid=?"
            int r12 = r12.delete(r6, r7, r3)     // Catch:{ SQLiteException -> 0x009d }
            if (r12 != r1) goto L_0x0095
            goto L_0x0063
        L_0x0095:
            android.database.sqlite.SQLiteException r12 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x009d }
            java.lang.String r1 = "Deleted fewer rows from queue than expected"
            r12.<init>(r1)     // Catch:{ SQLiteException -> 0x009d }
            throw r12     // Catch:{ SQLiteException -> 0x009d }
        L_0x009d:
            r12 = move-exception
            sut r11 = r11.E()     // Catch:{ SQLiteException -> 0x00aa }
            sur r11 = r11.c     // Catch:{ SQLiteException -> 0x00aa }
            java.lang.String r1 = "Failed to delete a bundle in a queue table"
            r11.a(r1, r12)     // Catch:{ SQLiteException -> 0x00aa }
            throw r12     // Catch:{ SQLiteException -> 0x00aa }
        L_0x00aa:
            r11 = move-exception
            java.util.List r12 = r13.o     // Catch:{ all -> 0x00e7 }
            if (r12 == 0) goto L_0x00b6
            boolean r10 = r12.contains(r10)     // Catch:{ all -> 0x00e7 }
            if (r10 == 0) goto L_0x00b6
            goto L_0x0063
        L_0x00b6:
            throw r11     // Catch:{ all -> 0x00e7 }
        L_0x00b7:
            spj r9 = r13.h()     // Catch:{ all -> 0x00e7 }
            r9.c()     // Catch:{ all -> 0x00e7 }
            spj r9 = r13.h()     // Catch:{ SQLiteException -> 0x00f0 }
            r9.d()     // Catch:{ SQLiteException -> 0x00f0 }
            r13.o = r2     // Catch:{ SQLiteException -> 0x00f0 }
            sux r9 = r13.g()     // Catch:{ SQLiteException -> 0x00f0 }
            boolean r9 = r9.c()     // Catch:{ SQLiteException -> 0x00f0 }
            if (r9 != 0) goto L_0x00d2
        L_0x00d1:
            goto L_0x00dc
        L_0x00d2:
            boolean r9 = r13.v()     // Catch:{ SQLiteException -> 0x00f0 }
            if (r9 == 0) goto L_0x00d1
            r13.u()     // Catch:{ SQLiteException -> 0x00f0 }
            goto L_0x00e3
        L_0x00dc:
            r9 = -1
            r13.p = r9     // Catch:{ SQLiteException -> 0x00f0 }
            r13.w()     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00e3:
            r13.i = r4     // Catch:{ SQLiteException -> 0x00f0 }
            goto L_0x0205
        L_0x00e7:
            r9 = move-exception
            spj r10 = r13.h()     // Catch:{ SQLiteException -> 0x00f0 }
            r10.d()     // Catch:{ SQLiteException -> 0x00f0 }
            throw r9     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00f0:
            r9 = move-exception
            sut r10 = r13.E()     // Catch:{ all -> 0x0010 }
            sur r10 = r10.c     // Catch:{ all -> 0x0010 }
            java.lang.String r11 = "Database error while trying to delete uploaded bundles"
            r10.a(r11, r9)     // Catch:{ all -> 0x0010 }
            jiq r9 = r13.o()     // Catch:{ all -> 0x0010 }
            long r9 = r9.b()     // Catch:{ all -> 0x0010 }
            r13.i = r9     // Catch:{ all -> 0x0010 }
            sut r9 = r13.E()     // Catch:{ all -> 0x0010 }
            sur r9 = r9.k     // Catch:{ all -> 0x0010 }
            java.lang.String r10 = "Disable upload, time"
            long r11 = r13.i     // Catch:{ all -> 0x0010 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0010 }
            r9.a(r10, r11)     // Catch:{ all -> 0x0010 }
            goto L_0x0205
        L_0x0119:
            sut r12 = r13.E()     // Catch:{ all -> 0x0010 }
            sur r12 = r12.k     // Catch:{ all -> 0x0010 }
            java.lang.String r3 = "Network upload failed. Will retry later. code, error"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0010 }
            r12.a(r3, r6, r11)     // Catch:{ all -> 0x0010 }
            svf r11 = r13.e()     // Catch:{ all -> 0x0010 }
            svc r11 = r11.e     // Catch:{ all -> 0x0010 }
            jiq r12 = r13.o()     // Catch:{ all -> 0x0010 }
            long r6 = r12.a()     // Catch:{ all -> 0x0010 }
            r11.a(r6)     // Catch:{ all -> 0x0010 }
            r11 = 503(0x1f7, float:7.05E-43)
            if (r10 != r11) goto L_0x013e
            goto L_0x0142
        L_0x013e:
            r11 = 429(0x1ad, float:6.01E-43)
            if (r10 != r11) goto L_0x0153
        L_0x0142:
            svf r10 = r13.e()     // Catch:{ all -> 0x0010 }
            svc r10 = r10.f     // Catch:{ all -> 0x0010 }
            jiq r11 = r13.o()     // Catch:{ all -> 0x0010 }
            long r11 = r11.a()     // Catch:{ all -> 0x0010 }
            r10.a(r11)     // Catch:{ all -> 0x0010 }
        L_0x0153:
            spj r10 = r13.h()     // Catch:{ all -> 0x0010 }
            java.lang.String r11 = " AND retry_count =  2147483647 LIMIT 1"
            r10.h()     // Catch:{ all -> 0x0010 }
            r10.q()     // Catch:{ all -> 0x0010 }
            defpackage.iva.a((java.lang.Object) r1)     // Catch:{ all -> 0x0010 }
            int r12 = r1.size()     // Catch:{ all -> 0x0010 }
            defpackage.iva.a((int) r12)     // Catch:{ all -> 0x0010 }
            boolean r12 = r10.l()     // Catch:{ all -> 0x0010 }
            if (r12 == 0) goto L_0x0202
            java.lang.String r12 = ","
            java.lang.String r12 = android.text.TextUtils.join(r12, r1)     // Catch:{ all -> 0x0010 }
            java.lang.String r1 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0010 }
            int r1 = r1.length()     // Catch:{ all -> 0x0010 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0010 }
            int r1 = r1 + 2
            r3.<init>(r1)     // Catch:{ all -> 0x0010 }
            java.lang.String r1 = "("
            r3.append(r1)     // Catch:{ all -> 0x0010 }
            r3.append(r12)     // Catch:{ all -> 0x0010 }
            r3.append(r9)     // Catch:{ all -> 0x0010 }
            java.lang.String r12 = r3.toString()     // Catch:{ all -> 0x0010 }
            java.lang.String r1 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0010 }
            int r1 = r1.length()     // Catch:{ all -> 0x0010 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0010 }
            int r1 = r1 + 80
            r3.<init>(r1)     // Catch:{ all -> 0x0010 }
            java.lang.String r1 = "SELECT COUNT(1) FROM queue WHERE rowid IN "
            r3.append(r1)     // Catch:{ all -> 0x0010 }
            r3.append(r12)     // Catch:{ all -> 0x0010 }
            r3.append(r11)     // Catch:{ all -> 0x0010 }
            java.lang.String r11 = r3.toString()     // Catch:{ all -> 0x0010 }
            long r1 = r10.a((java.lang.String) r11, (java.lang.String[]) r2)     // Catch:{ all -> 0x0010 }
            int r11 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r11 > 0) goto L_0x01ba
            goto L_0x01c5
        L_0x01ba:
            sut r11 = r10.E()     // Catch:{ all -> 0x0010 }
            sur r11 = r11.f     // Catch:{ all -> 0x0010 }
            java.lang.String r1 = "The number of upload retries exceeds the limit. Will remain unchanged."
            r11.a(r1)     // Catch:{ all -> 0x0010 }
        L_0x01c5:
            android.database.sqlite.SQLiteDatabase r11 = r10.e()     // Catch:{ SQLiteException -> 0x01f6 }
            java.lang.String r1 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteException -> 0x01f6 }
            int r1 = r1.length()     // Catch:{ SQLiteException -> 0x01f6 }
            int r1 = r1 + 127
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x01f6 }
            r2.<init>(r1)     // Catch:{ SQLiteException -> 0x01f6 }
            java.lang.String r1 = "UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN "
            r2.append(r1)     // Catch:{ SQLiteException -> 0x01f6 }
            r2.append(r12)     // Catch:{ SQLiteException -> 0x01f6 }
            java.lang.String r12 = " AND (retry_count IS NULL OR retry_count < "
            r2.append(r12)     // Catch:{ SQLiteException -> 0x01f6 }
            r12 = 2147483647(0x7fffffff, float:NaN)
            r2.append(r12)     // Catch:{ SQLiteException -> 0x01f6 }
            r2.append(r9)     // Catch:{ SQLiteException -> 0x01f6 }
            java.lang.String r9 = r2.toString()     // Catch:{ SQLiteException -> 0x01f6 }
            r11.execSQL(r9)     // Catch:{ SQLiteException -> 0x01f6 }
            goto L_0x0202
        L_0x01f6:
            r9 = move-exception
            sut r10 = r10.E()     // Catch:{ all -> 0x0010 }
            sur r10 = r10.c     // Catch:{ all -> 0x0010 }
            java.lang.String r11 = "Error incrementing retry count. error"
            r10.a(r11, r9)     // Catch:{ all -> 0x0010 }
        L_0x0202:
            r13.w()     // Catch:{ all -> 0x0010 }
        L_0x0205:
            r13.m = r0
            r13.x()
            return
        L_0x020b:
            r13.m = r0
            r13.x()
            goto L_0x0212
        L_0x0211:
            throw r9
        L_0x0212:
            goto L_0x0211
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.syz.a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }
}
