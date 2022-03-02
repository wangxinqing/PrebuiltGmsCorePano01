package defpackage;

import java.util.concurrent.Callable;

/* renamed from: dlv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dlv implements Callable {
    final /* synthetic */ dpc a;
    final /* synthetic */ dly b;

    public dlv(dly dly, dpc dpc) {
        this.b = dly;
        this.a = dpc;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0105, code lost:
        if (r8 != null) goto L_0x0117;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011b A[Catch:{ SQLiteException -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011f A[Catch:{ SQLiteException -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015f A[Catch:{ SQLiteException -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0167 A[Catch:{ SQLiteException -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017f A[Catch:{ SQLiteException -> 0x018f }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0189 A[Catch:{ SQLiteException -> 0x018f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r0 = "hit_id"
            dly r2 = r1.b
            dms r2 = r2.a
            dpc r3 = r1.a
            defpackage.iva.a((java.lang.Object) r3)
            defpackage.dkw.a()
            r2.q()
            r2.f()
            java.lang.String r4 = "Storing hit"
            r2.b(r4, r3)
            r4 = 0
            dmm r5 = r2.b     // Catch:{ SQLiteException -> 0x0199 }
            defpackage.iva.a((java.lang.Object) r3)     // Catch:{ SQLiteException -> 0x0199 }
            defpackage.dkw.a()     // Catch:{ SQLiteException -> 0x0199 }
            r5.q()     // Catch:{ SQLiteException -> 0x0199 }
            defpackage.iva.a((java.lang.Object) r3)     // Catch:{ SQLiteException -> 0x0199 }
            android.net.Uri$Builder r6 = new android.net.Uri$Builder     // Catch:{ SQLiteException -> 0x0199 }
            r6.<init>()     // Catch:{ SQLiteException -> 0x0199 }
            java.util.Map r7 = r3.a     // Catch:{ SQLiteException -> 0x0199 }
            java.util.Set r7 = r7.entrySet()     // Catch:{ SQLiteException -> 0x0199 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ SQLiteException -> 0x0199 }
        L_0x0039:
            boolean r8 = r7.hasNext()     // Catch:{ SQLiteException -> 0x0199 }
            if (r8 == 0) goto L_0x006d
            java.lang.Object r8 = r7.next()     // Catch:{ SQLiteException -> 0x0199 }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.Object r9 = r8.getKey()     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.String r10 = "ht"
            boolean r10 = r10.equals(r9)     // Catch:{ SQLiteException -> 0x0199 }
            if (r10 != 0) goto L_0x0039
            java.lang.String r10 = "qt"
            boolean r10 = r10.equals(r9)     // Catch:{ SQLiteException -> 0x0199 }
            if (r10 != 0) goto L_0x0039
            java.lang.String r10 = "AppUID"
            boolean r10 = r10.equals(r9)     // Catch:{ SQLiteException -> 0x0199 }
            if (r10 != 0) goto L_0x0039
            java.lang.Object r8 = r8.getValue()     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ SQLiteException -> 0x0199 }
            r6.appendQueryParameter(r9, r8)     // Catch:{ SQLiteException -> 0x0199 }
            goto L_0x0039
        L_0x006d:
            android.net.Uri r6 = r6.build()     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.String r6 = r6.getEncodedQuery()     // Catch:{ SQLiteException -> 0x0199 }
            if (r6 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            java.lang.String r6 = ""
        L_0x007a:
            int r7 = r6.length()     // Catch:{ SQLiteException -> 0x0199 }
            r8 = 8192(0x2000, float:1.14794E-41)
            if (r7 <= r8) goto L_0x008d
            dpk r0 = r5.e()     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.String r5 = "Hit length exceeds the maximum allowed size"
            r0.a((defpackage.dpc) r3, (java.lang.String) r5)     // Catch:{ SQLiteException -> 0x0199 }
            goto L_0x0195
        L_0x008d:
            r5.f()     // Catch:{ SQLiteException -> 0x0199 }
            doy r7 = defpackage.doz.e     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.Object r7 = r7.a()     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ SQLiteException -> 0x0199 }
            int r7 = r7.intValue()     // Catch:{ SQLiteException -> 0x0199 }
            long r8 = r5.u()     // Catch:{ SQLiteException -> 0x0199 }
            int r10 = r7 + -1
            long r10 = (long) r10     // Catch:{ SQLiteException -> 0x0199 }
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 > 0) goto L_0x00a9
            goto L_0x0137
        L_0x00a9:
            long r10 = (long) r7     // Catch:{ SQLiteException -> 0x0199 }
            long r8 = r8 - r10
            r10 = 1
            long r8 = r8 + r10
            defpackage.dkw.a()     // Catch:{ SQLiteException -> 0x0199 }
            r5.q()     // Catch:{ SQLiteException -> 0x0199 }
            r10 = 0
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0123
            android.database.sqlite.SQLiteDatabase r10 = r5.v()     // Catch:{ SQLiteException -> 0x0199 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0199 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x0199 }
            r11 = 1
            java.lang.String[] r12 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            r15 = 0
            r12[r15] = r0     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            r11[r15] = r0     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            java.lang.String r0 = "hits2"
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            java.lang.String r15 = "%s ASC"
            java.lang.String r19 = java.lang.String.format(r15, r11)     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            java.lang.String r8 = java.lang.Long.toString(r8)     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            r11 = r0
            r0 = 0
            r15 = r16
            r16 = r17
            r17 = r19
            r18 = r8
            android.database.Cursor r8 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x010e, all -> 0x010b }
            boolean r9 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0109 }
            if (r9 == 0) goto L_0x0105
        L_0x00f3:
            long r9 = r8.getLong(r0)     // Catch:{ SQLiteException -> 0x0109 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ SQLiteException -> 0x0109 }
            r7.add(r9)     // Catch:{ SQLiteException -> 0x0109 }
            boolean r9 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x0109 }
            if (r9 != 0) goto L_0x00f3
        L_0x0105:
            if (r8 == 0) goto L_0x0108
            goto L_0x0117
        L_0x0108:
            goto L_0x0127
        L_0x0109:
            r0 = move-exception
            goto L_0x0110
        L_0x010b:
            r0 = move-exception
            r8 = r4
            goto L_0x011d
        L_0x010e:
            r0 = move-exception
            r8 = r4
        L_0x0110:
            java.lang.String r9 = "Error selecting hit ids"
            r5.d(r9, r0)     // Catch:{ all -> 0x011c }
            if (r8 == 0) goto L_0x011b
        L_0x0117:
            r8.close()     // Catch:{ SQLiteException -> 0x0199 }
            goto L_0x0127
        L_0x011b:
            goto L_0x0127
        L_0x011c:
            r0 = move-exception
        L_0x011d:
            if (r8 == 0) goto L_0x0122
            r8.close()     // Catch:{ SQLiteException -> 0x0199 }
        L_0x0122:
            throw r0     // Catch:{ SQLiteException -> 0x0199 }
        L_0x0123:
            java.util.List r7 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x0199 }
        L_0x0127:
            java.lang.String r0 = "Store full, deleting hits to make room, count"
            int r8 = r7.size()     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ SQLiteException -> 0x0199 }
            r5.d(r0, r8)     // Catch:{ SQLiteException -> 0x0199 }
            r5.a((java.util.List) r7)     // Catch:{ SQLiteException -> 0x0199 }
        L_0x0137:
            android.database.sqlite.SQLiteDatabase r0 = r5.v()     // Catch:{ SQLiteException -> 0x0199 }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x0199 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.String r8 = "hit_string"
            r7.put(r8, r6)     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.String r6 = "hit_time"
            long r8 = r3.d     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteException -> 0x0199 }
            r7.put(r6, r8)     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.String r6 = "hit_app_id"
            int r8 = r3.e     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ SQLiteException -> 0x0199 }
            r7.put(r6, r8)     // Catch:{ SQLiteException -> 0x0199 }
            boolean r6 = r3.f     // Catch:{ SQLiteException -> 0x0199 }
            if (r6 != 0) goto L_0x0167
            r5.f()     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.String r6 = defpackage.dmy.i()     // Catch:{ SQLiteException -> 0x0199 }
            goto L_0x016e
        L_0x0167:
            r5.f()     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.String r6 = defpackage.dmy.g()     // Catch:{ SQLiteException -> 0x0199 }
        L_0x016e:
            java.lang.String r8 = "hit_url"
            r7.put(r8, r6)     // Catch:{ SQLiteException -> 0x0199 }
            java.lang.String r6 = "hits2"
            long r6 = r0.insert(r6, r4, r7)     // Catch:{ SQLiteException -> 0x018f }
            r8 = -1
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0189
            java.lang.String r0 = "Hit saved to database. db-id, hit"
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x018f }
            r5.b(r0, r6, r3)     // Catch:{ SQLiteException -> 0x018f }
            goto L_0x0195
        L_0x0189:
            java.lang.String r0 = "Failed to insert a hit (got -1)"
            r5.e(r0)     // Catch:{ SQLiteException -> 0x018f }
            goto L_0x0195
        L_0x018f:
            r0 = move-exception
            java.lang.String r6 = "Error storing a hit"
            r5.e(r6, r0)     // Catch:{ SQLiteException -> 0x0199 }
        L_0x0195:
            r2.s()     // Catch:{ SQLiteException -> 0x0199 }
            goto L_0x01a8
        L_0x0199:
            r0 = move-exception
            java.lang.String r5 = "Storing hit failed to save hit to the database"
            r2.e(r5, r0)
            dpk r0 = r2.e()
            java.lang.String r2 = "store: failed to insert in database"
            r0.a((defpackage.dpc) r3, (java.lang.String) r2)
        L_0x01a8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlv.call():java.lang.Object");
    }
}
