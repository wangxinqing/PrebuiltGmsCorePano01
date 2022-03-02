package defpackage;

/* renamed from: agta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agta {
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a0 A[Catch:{ all -> 0x0096, all -> 0x00a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.database.sqlite.SQLiteDatabase r19, android.accounts.Account r20, java.lang.Runnable r21) {
        /*
            r10 = r19
            r0 = r20
            java.lang.String r11 = "account"
            java.lang.String r12 = "type"
            java.lang.String r13 = "name"
            r19.beginTransaction()
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x00a4 }
            r14 = 0
            r3[r14] = r13     // Catch:{ all -> 0x00a4 }
            r15 = 1
            r3[r15] = r12     // Catch:{ all -> 0x00a4 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00a4 }
            r9.<init>()     // Catch:{ all -> 0x00a4 }
            r8 = 0
            java.lang.String r2 = "account"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r16 = 0
            r17 = 0
            r1 = r19
            r8 = r16
            r18 = r9
            r9 = r17
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0098 }
        L_0x0032:
            boolean r1 = r8.moveToNext()     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x004d
            java.lang.String r1 = r8.getString(r14)     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = r8.getString(r15)     // Catch:{ all -> 0x0096 }
            android.accounts.Account r3 = new android.accounts.Account     // Catch:{ all -> 0x0096 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0096 }
            r1 = r18
            r1.add(r3)     // Catch:{ all -> 0x0096 }
            r18 = r1
            goto L_0x0032
        L_0x004d:
            r1 = r18
            if (r8 != 0) goto L_0x0052
            goto L_0x0055
        L_0x0052:
            r8.close()     // Catch:{ all -> 0x00a4 }
        L_0x0055:
            int r2 = r1.size()     // Catch:{ all -> 0x00a4 }
            if (r2 != r15) goto L_0x0067
            java.lang.Object r1 = r1.get(r14)     // Catch:{ all -> 0x00a4 }
            android.accounts.Account r1 = (android.accounts.Account) r1     // Catch:{ all -> 0x00a4 }
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x00a4 }
            if (r1 != 0) goto L_0x0087
        L_0x0067:
            r21.run()     // Catch:{ all -> 0x00a4 }
            r1 = 0
            r10.delete(r11, r1, r1)     // Catch:{ all -> 0x00a4 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x00a4 }
            r2.<init>()     // Catch:{ all -> 0x00a4 }
            java.lang.String r3 = r0.name     // Catch:{ all -> 0x00a4 }
            r2.put(r13, r3)     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = r0.type     // Catch:{ all -> 0x00a4 }
            r2.put(r12, r0)     // Catch:{ all -> 0x00a4 }
            long r0 = r10.insertOrThrow(r11, r1, r2)     // Catch:{ all -> 0x00a4 }
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x008e
        L_0x0087:
            r19.setTransactionSuccessful()     // Catch:{ all -> 0x00a4 }
            r19.endTransaction()
            return
        L_0x008e:
            android.database.SQLException r0 = new android.database.SQLException     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "insertOrThrow returned -1"
            r0.<init>(r1)     // Catch:{ all -> 0x00a4 }
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x0096:
            r0 = move-exception
            goto L_0x009e
        L_0x0098:
            r0 = move-exception
            r1 = 0
            goto L_0x009d
        L_0x009b:
            r0 = move-exception
            r1 = r8
        L_0x009d:
            r8 = r1
        L_0x009e:
            if (r8 == 0) goto L_0x00a3
            r8.close()     // Catch:{ all -> 0x00a4 }
        L_0x00a3:
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            r19.endTransaction()
            goto L_0x00aa
        L_0x00a9:
            throw r0
        L_0x00aa:
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agta.a(android.database.sqlite.SQLiteDatabase, android.accounts.Account, java.lang.Runnable):void");
    }
}
