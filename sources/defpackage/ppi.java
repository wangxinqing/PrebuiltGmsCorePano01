package defpackage;

/* renamed from: ppi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ppi {
    private static final String[] a = {"event_id", "fingerprint"};

    private static void a(long j, long j2) {
        boolean z;
        if (j2 > j) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, "IDs must be strictly increasing (previous was: %d, next is: %d)", Long.valueOf(j), Long.valueOf(j2));
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:96:0x0247=Splitter:B:96:0x0247, B:144:0x038a=Splitter:B:144:0x038a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(android.content.Context r40, java.util.Iterator r41, boolean r42, defpackage.aplf r43, defpackage.oyq r44) {
        /*
            r0 = r43
            java.lang.String r1 = "DROP TABLE EventFingerprintsUpdates"
            java.lang.String r2 = "INSERT OR REPLACE INTO EventFingerprints(event_id,fingerprint) SELECT event_id,fingerprint FROM EventFingerprintsUpdates WHERE fingerprint IS NOT NULL"
            java.lang.String r3 = "DELETE FROM EventFingerprints WHERE event_id IN (SELECT event_id FROM EventFingerprintsUpdates WHERE fingerprint IS NULL)"
            ppm r4 = new ppm
            r5 = r40
            r4.<init>(r5)
            android.database.sqlite.SQLiteDatabase r13 = r4.getWritableDatabase()
            r13.beginTransaction()     // Catch:{ all -> 0x03aa }
            java.lang.String r6 = "EventFingerprints"
            java.lang.String[] r7 = a     // Catch:{ all -> 0x03a5 }
            java.lang.String r12 = "event_id"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r5 = r13
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x03a5 }
            if (r5 != 0) goto L_0x0033
            java.lang.String r0 = "Failed to query Event Fingerprint table."
            defpackage.pnz.b(r0)     // Catch:{ all -> 0x03a5 }
        L_0x002c:
            r13.endTransaction()     // Catch:{ all -> 0x03aa }
            r4.close()
            return
        L_0x0033:
            java.lang.String r6 = "CREATE TEMP TABLE EventFingerprintsUpdates(event_id INTEGER PRIMARY KEY, fingerprint INTEGER)"
            r13.execSQL(r6)     // Catch:{ all -> 0x03a0 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0383 }
            java.lang.String r8 = "EventIndexer: starting %s update"
            if (r42 != 0) goto L_0x0043
            java.lang.String r9 = "incremental"
            goto L_0x0045
        L_0x0043:
            java.lang.String r9 = "full"
        L_0x0045:
            defpackage.pnz.c((java.lang.String) r8, (java.lang.Object) r9)     // Catch:{ all -> 0x0383 }
            r8 = -9223372036854775808
            r10 = r8
            r40 = 0
            r12 = 0
            r18 = 0
            r20 = 1
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
        L_0x005e:
            r27 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r20 != 0) goto L_0x0071
            r33 = r2
            r34 = r3
            r38 = r18
            r19 = r1
            r0 = r38
            goto L_0x0193
        L_0x0071:
            boolean r18 = r41.hasNext()     // Catch:{ all -> 0x0383 }
            if (r18 == 0) goto L_0x0080
            java.lang.Object r18 = r41.next()     // Catch:{ all -> 0x0383 }
            ppd r18 = (defpackage.ppd) r18     // Catch:{ all -> 0x0383 }
            r15 = r18
            goto L_0x0081
        L_0x0080:
            r15 = 0
        L_0x0081:
            if (r15 == 0) goto L_0x0091
            r19 = r1
            long r0 = r15.a     // Catch:{ all -> 0x0088 }
            goto L_0x0095
        L_0x0088:
            r0 = move-exception
            r36 = r2
            r35 = r3
            r37 = r19
            goto L_0x038a
        L_0x0091:
            r19 = r1
            r0 = r27
        L_0x0095:
            a(r8, r0)     // Catch:{ all -> 0x0088 }
            if (r15 == 0) goto L_0x0186
            r8 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r25 = r15
            r14 = 1
            long r8 = defpackage.ppg.a((long) r8, (long) r14)     // Catch:{ all -> 0x0088 }
            r31 = r0
            r14 = r25
            long r0 = r14.a     // Catch:{ all -> 0x0088 }
            long r0 = defpackage.ppg.a((long) r8, (long) r0)     // Catch:{ all -> 0x0088 }
            r8 = 2
            long r0 = defpackage.ppg.a((long) r0, (long) r8)     // Catch:{ all -> 0x0088 }
            java.lang.String r15 = r14.b     // Catch:{ all -> 0x0088 }
            long r0 = defpackage.ppg.a((long) r0, (java.lang.String) r15)     // Catch:{ all -> 0x0088 }
            java.lang.String r15 = r14.c     // Catch:{ all -> 0x0088 }
            r8 = 3
            if (r15 == 0) goto L_0x00cd
            long r0 = defpackage.ppg.a((long) r0, (long) r8)     // Catch:{ all -> 0x0088 }
            java.lang.String r15 = r14.c     // Catch:{ all -> 0x0088 }
            long r0 = defpackage.ppg.a((long) r0, (java.lang.String) r15)     // Catch:{ all -> 0x0088 }
        L_0x00cd:
            java.lang.String r15 = r14.d     // Catch:{ all -> 0x0088 }
            if (r15 == 0) goto L_0x00de
            r8 = 4
            long r0 = defpackage.ppg.a((long) r0, (long) r8)     // Catch:{ all -> 0x0088 }
            java.lang.String r8 = r14.d     // Catch:{ all -> 0x0088 }
            long r0 = defpackage.ppg.a((long) r0, (java.lang.String) r8)     // Catch:{ all -> 0x0088 }
            goto L_0x00df
        L_0x00de:
        L_0x00df:
            java.lang.Boolean r8 = r14.e     // Catch:{ all -> 0x0088 }
            if (r8 == 0) goto L_0x00fb
            r8 = 7
            long r0 = defpackage.ppg.a((long) r0, (long) r8)     // Catch:{ all -> 0x0088 }
            java.lang.Boolean r8 = r14.e     // Catch:{ all -> 0x0088 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0088 }
            if (r8 != 0) goto L_0x00f4
            r8 = 0
            goto L_0x00f6
        L_0x00f4:
            r8 = 1
        L_0x00f6:
            long r0 = defpackage.ppg.a((long) r0, (long) r8)     // Catch:{ all -> 0x0088 }
            goto L_0x00fc
        L_0x00fb:
        L_0x00fc:
            ppl[] r8 = r14.f     // Catch:{ all -> 0x0088 }
            int r9 = r8.length     // Catch:{ all -> 0x0088 }
            r15 = 0
        L_0x0100:
            if (r15 >= r9) goto L_0x0131
            r25 = r9
            r9 = r8[r15]     // Catch:{ all -> 0x0088 }
            r33 = r2
            r34 = r3
            r2 = 5
            long r0 = defpackage.ppg.a((long) r0, (long) r2)     // Catch:{ all -> 0x01ab }
            r2 = 1
            long r0 = defpackage.ppg.a((long) r0, (long) r2)     // Catch:{ all -> 0x01ab }
            long r2 = r9.a     // Catch:{ all -> 0x01ab }
            long r0 = defpackage.ppg.a((long) r0, (long) r2)     // Catch:{ all -> 0x01ab }
            r2 = 2
            long r0 = defpackage.ppg.a((long) r0, (long) r2)     // Catch:{ all -> 0x01ab }
            long r2 = r9.b     // Catch:{ all -> 0x01ab }
            long r0 = defpackage.ppg.a((long) r0, (long) r2)     // Catch:{ all -> 0x01ab }
            int r15 = r15 + 1
            r9 = r25
            r2 = r33
            r3 = r34
            goto L_0x0100
        L_0x0131:
            r33 = r2
            r34 = r3
            ppa[] r2 = r14.g     // Catch:{ all -> 0x01ab }
            int r3 = r2.length     // Catch:{ all -> 0x01ab }
            r8 = 0
        L_0x0139:
            if (r8 >= r3) goto L_0x0185
            r9 = r2[r8]     // Catch:{ all -> 0x01ab }
            r15 = r2
            r25 = r3
            r2 = 6
            long r0 = defpackage.ppg.a((long) r0, (long) r2)     // Catch:{ all -> 0x01ab }
            r2 = 1
            long r0 = defpackage.ppg.a((long) r0, (long) r2)     // Catch:{ all -> 0x01ab }
            java.lang.String r2 = r9.a     // Catch:{ all -> 0x01ab }
            long r0 = defpackage.ppg.a((long) r0, (java.lang.String) r2)     // Catch:{ all -> 0x01ab }
            java.lang.String r2 = r9.b     // Catch:{ all -> 0x01ab }
            if (r2 == 0) goto L_0x0163
            r2 = 2
            long r0 = defpackage.ppg.a((long) r0, (long) r2)     // Catch:{ all -> 0x01ab }
            java.lang.String r2 = r9.b     // Catch:{ all -> 0x01ab }
            long r0 = defpackage.ppg.a((long) r0, (java.lang.String) r2)     // Catch:{ all -> 0x01ab }
            goto L_0x0164
        L_0x0163:
        L_0x0164:
            java.lang.String r2 = "none"
            java.lang.String r3 = r9.a()     // Catch:{ all -> 0x01ab }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x01ab }
            if (r2 != 0) goto L_0x017d
            r2 = 3
            long r0 = defpackage.ppg.a((long) r0, (long) r2)     // Catch:{ all -> 0x01ab }
            java.lang.String r9 = r9.c     // Catch:{ all -> 0x01ab }
            long r0 = defpackage.ppg.a((long) r0, (java.lang.String) r9)     // Catch:{ all -> 0x01ab }
            goto L_0x017f
        L_0x017d:
            r2 = 3
        L_0x017f:
            int r8 = r8 + 1
            r2 = r15
            r3 = r25
            goto L_0x0139
        L_0x0185:
            goto L_0x018f
        L_0x0186:
            r31 = r0
            r33 = r2
            r34 = r3
            r14 = r15
            r0 = 0
        L_0x018f:
            r25 = r14
            r8 = r31
        L_0x0193:
            if (r21 == 0) goto L_0x01b4
            r5.moveToNext()     // Catch:{ all -> 0x01ab }
            boolean r2 = r5.isAfterLast()     // Catch:{ all -> 0x01ab }
            if (r2 != 0) goto L_0x01a4
            r2 = 0
            long r14 = r5.getLong(r2)     // Catch:{ all -> 0x01ab }
            goto L_0x01a6
        L_0x01a4:
            r14 = r27
        L_0x01a6:
            a(r10, r14)     // Catch:{ all -> 0x01ab }
            r10 = r14
            goto L_0x01b5
        L_0x01ab:
            r0 = move-exception
            r37 = r19
            r36 = r33
            r35 = r34
            goto L_0x038a
        L_0x01b4:
        L_0x01b5:
            r2 = 3
            java.lang.String r3 = "IcingInternalCorpora"
            r14 = 2
            int r15 = (r8 > r27 ? 1 : (r8 == r27 ? 0 : -1))
            if (r15 != 0) goto L_0x0261
            int r15 = (r10 > r27 ? 1 : (r10 == r27 ? 0 : -1))
            if (r15 != 0) goto L_0x0261
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x01ab }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x01ab }
            r8 = 0
            r0[r8] = r1     // Catch:{ all -> 0x01ab }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x01ab }
            r8 = 1
            r0[r8] = r1     // Catch:{ all -> 0x01ab }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r40)     // Catch:{ all -> 0x01ab }
            r0[r14] = r1     // Catch:{ all -> 0x01ab }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x01ab }
            r0[r2] = r1     // Catch:{ all -> 0x01ab }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)     // Catch:{ all -> 0x01ab }
            r2 = 4
            r0[r2] = r1     // Catch:{ all -> 0x01ab }
            java.lang.String r1 = "EventIndexer: %d added, %d removed, %d changed, %d unchanged, %d errors."
            boolean r8 = android.util.Log.isLoggable(r3, r2)     // Catch:{ all -> 0x01ab }
            if (r8 == 0) goto L_0x01f4
            java.lang.String r0 = defpackage.pnz.a((java.lang.String) r1, (java.lang.Object[]) r0)     // Catch:{ all -> 0x01ab }
            android.util.Log.i(r3, r0)     // Catch:{ all -> 0x01ab }
        L_0x01f4:
            aokt r0 = defpackage.aokt.f     // Catch:{ all -> 0x01ab }
            aucd r0 = r0.o()     // Catch:{ all -> 0x01ab }
            java.lang.String r1 = "calendar"
            boolean r3 = r0.c     // Catch:{ all -> 0x01ab }
            if (r3 != 0) goto L_0x0201
            goto L_0x0207
        L_0x0201:
            r0.c()     // Catch:{ all -> 0x01ab }
            r3 = 0
            r0.c = r3     // Catch:{ all -> 0x01ab }
        L_0x0207:
            aucj r3 = r0.b     // Catch:{ all -> 0x01ab }
            aokt r3 = (defpackage.aokt) r3     // Catch:{ all -> 0x01ab }
            r1.getClass()     // Catch:{ all -> 0x01ab }
            int r8 = r3.a     // Catch:{ all -> 0x01ab }
            r9 = 1
            r8 = r8 | r9
            r3.a = r8     // Catch:{ all -> 0x01ab }
            r3.b = r1     // Catch:{ all -> 0x01ab }
            r1 = r8 | 2
            r3.a = r1     // Catch:{ all -> 0x01ab }
            r15 = r23
            r3.c = r15     // Catch:{ all -> 0x01ab }
            r1 = r1 | r2
            r3.a = r1     // Catch:{ all -> 0x01ab }
            r2 = r24
            r3.d = r2     // Catch:{ all -> 0x01ab }
            r1 = r1 | 8
            r3.a = r1     // Catch:{ all -> 0x01ab }
            r1 = r40
            r3.e = r1     // Catch:{ all -> 0x01ab }
            aucj r0 = r0.i()     // Catch:{ all -> 0x01ab }
            aokt r0 = (defpackage.aokt) r0     // Catch:{ all -> 0x01ab }
            r1 = r44
            r1.a((defpackage.aokt) r0)     // Catch:{ all -> 0x01ab }
            pph r0 = new pph     // Catch:{ all -> 0x01ab }
            r0.<init>(r6)     // Catch:{ all -> 0x01ab }
            if (r12 != 0) goto L_0x0244
            r1 = 0
            r0.a(r1)     // Catch:{ all -> 0x01ab }
            goto L_0x0247
        L_0x0244:
            r12.a((defpackage.acvp) r0)     // Catch:{ all -> 0x01ab }
        L_0x0247:
            r5.close()     // Catch:{ all -> 0x03a0 }
            r1 = r34
            r13.execSQL(r1)     // Catch:{ all -> 0x03a0 }
            r2 = r33
            r13.execSQL(r2)     // Catch:{ all -> 0x03a0 }
            r3 = r19
            r13.execSQL(r3)     // Catch:{ all -> 0x03a0 }
            r13.setTransactionSuccessful()     // Catch:{ all -> 0x03a0 }
            r5.close()     // Catch:{ all -> 0x03a5 }
            goto L_0x002c
        L_0x0261:
            r37 = r19
            r15 = r23
            r21 = r24
            r36 = r33
            r35 = r34
            r19 = r40
            int r23 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r23 >= 0) goto L_0x027a
            int r23 = r15 + 1
            r24 = r21
            r2 = 1
            r15 = 1
            r21 = 0
            goto L_0x02ae
        L_0x027a:
            int r23 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r23 >= 0) goto L_0x0286
            int r24 = r21 + 1
            r23 = r15
            r15 = 0
            r21 = 1
            goto L_0x02ae
        L_0x0286:
            r2 = 1
            long r23 = r5.getLong(r2)     // Catch:{ all -> 0x0381 }
            int r2 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r2 == 0) goto L_0x0294
            int r2 = r19 + 1
            r19 = 1
            goto L_0x02a1
        L_0x0294:
            if (r42 != 0) goto L_0x0298
            r2 = 0
            goto L_0x0299
        L_0x0298:
            r2 = 2
        L_0x0299:
            int r22 = r22 + 1
            r38 = r19
            r19 = r2
            r2 = r38
        L_0x02a1:
            r23 = r15
            r24 = r21
            r15 = 1
            r21 = 1
            r38 = r19
            r19 = r2
            r2 = r38
        L_0x02ae:
            java.lang.String r14 = "EventFingerprintsUpdates"
            r28 = r6
            java.lang.String r6 = "fingerprint"
            java.lang.String r7 = "event_id"
            r30 = r12
            r12 = 1
            if (r2 != r12) goto L_0x0316
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0381 }
            r2.<init>()     // Catch:{ all -> 0x0381 }
            java.lang.Long r12 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0381 }
            r2.put(r7, r12)     // Catch:{ all -> 0x0381 }
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0381 }
            r2.put(r6, r7)     // Catch:{ all -> 0x0381 }
            r6 = 0
            long r31 = r13.insertOrThrow(r14, r6, r2)     // Catch:{ all -> 0x0381 }
            r16 = 0
            int r2 = (r31 > r16 ? 1 : (r31 == r16 ? 0 : -1))
            if (r2 < 0) goto L_0x02ef
            r2 = 1
            aplu[] r3 = new defpackage.aplu[r2]     // Catch:{ all -> 0x0381 }
            aply r2 = r25.a()     // Catch:{ all -> 0x0381 }
            aplu r2 = r2.a()     // Catch:{ all -> 0x0381 }
            r6 = 0
            r3[r6] = r2     // Catch:{ all -> 0x0381 }
            r2 = r43
            acwa r3 = r2.a((defpackage.aplu[]) r3)     // Catch:{ all -> 0x0381 }
            r12 = r3
            goto L_0x030f
        L_0x02ef:
            r2 = r43
            java.lang.String r6 = "Update event fingerprint failed! eventId=%d fingerprint=0x%x"
            r14 = 6
            boolean r14 = android.util.Log.isLoggable(r3, r14)     // Catch:{ all -> 0x0381 }
            if (r14 == 0) goto L_0x030b
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ all -> 0x0381 }
            r20 = 0
            r14[r20] = r12     // Catch:{ all -> 0x0381 }
            r12 = 1
            r14[r12] = r7     // Catch:{ all -> 0x0381 }
            java.lang.String r6 = defpackage.pnz.a((java.lang.String) r6, (java.lang.Object[]) r14)     // Catch:{ all -> 0x0381 }
            android.util.Log.e(r3, r6)     // Catch:{ all -> 0x0381 }
        L_0x030b:
            int r26 = r26 + 1
            r12 = r30
        L_0x030f:
            r3 = r2
            r2 = 1
            r6 = 0
            r14 = 0
            r16 = 0
            goto L_0x0370
        L_0x0316:
            r3 = r43
            r12 = 2
            if (r2 != r12) goto L_0x0333
            r2 = 1
            aplu[] r6 = new defpackage.aplu[r2]     // Catch:{ all -> 0x0381 }
            aply r2 = r25.a()     // Catch:{ all -> 0x0381 }
            aplu r2 = r2.a()     // Catch:{ all -> 0x0381 }
            r7 = 0
            r6[r7] = r2     // Catch:{ all -> 0x0381 }
            acwa r12 = r3.a((defpackage.aplu[]) r6)     // Catch:{ all -> 0x0381 }
            r2 = 1
            r6 = 0
            r14 = 0
            r16 = 0
            goto L_0x0370
        L_0x0333:
            r12 = 3
            if (r2 != r12) goto L_0x0369
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0381 }
            r2.<init>()     // Catch:{ all -> 0x0381 }
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0381 }
            r2.put(r7, r12)     // Catch:{ all -> 0x0381 }
            r2.putNull(r6)     // Catch:{ all -> 0x0381 }
            r6 = 0
            long r31 = r13.insertOrThrow(r14, r6, r2)     // Catch:{ all -> 0x0381 }
            r16 = 0
            int r2 = (r31 > r16 ? 1 : (r31 == r16 ? 0 : -1))
            if (r2 < 0) goto L_0x035f
            r2 = 1
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch:{ all -> 0x0381 }
            java.lang.String r12 = defpackage.ppd.a(r10)     // Catch:{ all -> 0x0381 }
            r14 = 0
            r7[r14] = r12     // Catch:{ all -> 0x0381 }
            acwa r12 = r3.a((java.lang.String[]) r7)     // Catch:{ all -> 0x0381 }
            goto L_0x0370
        L_0x035f:
            r2 = 1
            r14 = 0
            java.lang.String r7 = "Delete event fingerprint failed! eventId=%d"
            defpackage.pnz.b((java.lang.String) r7, (java.lang.Object) r12)     // Catch:{ all -> 0x0381 }
            int r26 = r26 + 1
            goto L_0x036e
        L_0x0369:
            r2 = 1
            r6 = 0
            r14 = 0
            r16 = 0
        L_0x036e:
            r12 = r30
        L_0x0370:
            r20 = r15
            r40 = r19
            r6 = r28
            r2 = r36
            r18 = r0
            r0 = r3
            r3 = r35
            r1 = r37
            goto L_0x005e
        L_0x0381:
            r0 = move-exception
            goto L_0x038a
        L_0x0383:
            r0 = move-exception
            r37 = r1
            r36 = r2
            r35 = r3
        L_0x038a:
            r5.close()     // Catch:{ all -> 0x03a0 }
            r1 = r35
            r13.execSQL(r1)     // Catch:{ all -> 0x03a0 }
            r1 = r36
            r13.execSQL(r1)     // Catch:{ all -> 0x03a0 }
            r1 = r37
            r13.execSQL(r1)     // Catch:{ all -> 0x03a0 }
            r13.setTransactionSuccessful()     // Catch:{ all -> 0x03a0 }
            throw r0     // Catch:{ all -> 0x03a0 }
        L_0x03a0:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x03a5 }
            throw r0     // Catch:{ all -> 0x03a5 }
        L_0x03a5:
            r0 = move-exception
            r13.endTransaction()     // Catch:{ all -> 0x03aa }
            throw r0     // Catch:{ all -> 0x03aa }
        L_0x03aa:
            r0 = move-exception
            r4.close()
            goto L_0x03b0
        L_0x03af:
            throw r0
        L_0x03b0:
            goto L_0x03af
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppi.a(android.content.Context, java.util.Iterator, boolean, aplf, oyq):void");
    }
}
