package defpackage;

import android.content.ContentValues;

/* renamed from: nnq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nnq extends npf {
    public static final /* synthetic */ int a = 0;

    public nnq(nog nog) {
    }

    public static String a() {
        String format = String.format(" (%s INTEGER PRIMARY KEY AUTOINCREMENT, ", new Object[]{"_id"});
        String format2 = String.format("%s BLOB, ", new Object[]{"pb"});
        String format3 = String.format("%s INTEGER, ", new Object[]{"timestamp"});
        String format4 = String.format("%s INTEGER)", new Object[]{"operation_status"});
        int length = String.valueOf(format).length();
        int length2 = String.valueOf(format2).length();
        StringBuilder sb = new StringBuilder(length + 27 + length2 + String.valueOf(format3).length() + String.valueOf(format4).length());
        sb.append("CREATE TABLE ad_attestation");
        sb.append(format);
        sb.append(format2);
        sb.append(format3);
        sb.append(format4);
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: nqb} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091 A[Catch:{ all -> 0x008e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.nqb a(java.lang.Long r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = defpackage.nog.b()     // Catch:{ all -> 0x008e }
            java.lang.String r2 = "ad_attestation"
            r3 = 4
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x008e }
            java.lang.String r5 = "_id"
            r9 = 0
            r4[r9] = r5     // Catch:{ all -> 0x008e }
            java.lang.String r5 = "pb"
            r10 = 1
            r4[r10] = r5     // Catch:{ all -> 0x008e }
            java.lang.String r5 = "timestamp"
            r6 = 2
            r4[r6] = r5     // Catch:{ all -> 0x008e }
            java.lang.String r5 = "operation_status"
            r7 = 3
            r4[r7] = r5     // Catch:{ all -> 0x008e }
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x008e }
            java.lang.String r8 = "timestamp"
            r5[r9] = r8     // Catch:{ all -> 0x008e }
            r5[r10] = r13     // Catch:{ all -> 0x008e }
            java.lang.String r13 = "operation_status"
            r5[r6] = r13     // Catch:{ all -> 0x008e }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x008e }
            r5[r7] = r13     // Catch:{ all -> 0x008e }
            java.lang.String r13 = "timestamp"
            r5[r3] = r13     // Catch:{ all -> 0x008e }
            java.lang.String r13 = "%s>=\"%d\" and %s=\"%d\" ORDER BY %s DESC LIMIT 1"
            java.lang.String r13 = java.lang.String.format(r13, r5)     // Catch:{ all -> 0x008e }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r13
            android.database.Cursor r13 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x008e }
            int r1 = r13.getCount()     // Catch:{ all -> 0x0089 }
            if (r1 <= 0) goto L_0x0083
            r13.moveToFirst()     // Catch:{ all -> 0x0089 }
            byte[] r0 = r13.getBlob(r10)     // Catch:{ auda -> 0x0066 }
            aubs r1 = defpackage.aubs.c()     // Catch:{ auda -> 0x0066 }
            nqb r2 = defpackage.nqb.f     // Catch:{ auda -> 0x0066 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r2, (byte[]) r0, (defpackage.aubs) r1)     // Catch:{ auda -> 0x0066 }
            nqb r0 = (defpackage.nqb) r0     // Catch:{ auda -> 0x0066 }
            if (r13 == 0) goto L_0x0064
            r13.close()     // Catch:{ all -> 0x0095 }
        L_0x0064:
            monitor-exit(r12)
            return r0
        L_0x0066:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x0089 }
            r1[r9] = r2     // Catch:{ all -> 0x0089 }
            noh r1 = new noh     // Catch:{ all -> 0x0089 }
            java.lang.Object[] r2 = new java.lang.Object[r10]     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0089 }
            r2[r9] = r0     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "Failed to get app info pb, error: %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0089 }
            r1.<init>(r0)     // Catch:{ all -> 0x0089 }
            throw r1     // Catch:{ all -> 0x0089 }
        L_0x0083:
            if (r13 == 0) goto L_0x0064
            r13.close()     // Catch:{ all -> 0x0095 }
            goto L_0x0064
        L_0x0089:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
            goto L_0x008f
        L_0x008e:
            r13 = move-exception
        L_0x008f:
            if (r0 == 0) goto L_0x0094
            r0.close()     // Catch:{ all -> 0x0095 }
        L_0x0094:
            throw r13     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r13 = move-exception
            monitor-exit(r12)
            goto L_0x0099
        L_0x0098:
            throw r13
        L_0x0099:
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnq.a(java.lang.Long):nqb");
    }

    public final synchronized void a(nqb nqb) {
        Long l;
        Integer num;
        ContentValues contentValues = new ContentValues();
        contentValues.put("pb", nqb.k());
        int i = 1;
        if ((nqb.a & 1) != 0) {
            l = Long.valueOf(nqb.b);
        } else {
            l = null;
        }
        contentValues.put("timestamp", l);
        if ((nqb.a & 2) != 0) {
            int a2 = nqi.a(nqb.c);
            if (a2 != 0) {
                i = a2;
            }
            num = Integer.valueOf(i - 1);
        } else {
            num = null;
        }
        contentValues.put("operation_status", num);
        if (nog.c().insert("ad_attestation", (String) null, contentValues) <= 0) {
            throw new noh("Failed to add ad attestation to sql table.");
        }
    }
}
