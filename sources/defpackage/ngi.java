package defpackage;

import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: ngi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ngi implements Runnable {
    private final ngm a;
    private final FontMatchSpec b;

    public ngi(ngm ngm, FontMatchSpec fontMatchSpec) {
        this.a = ngm;
        this.b = fontMatchSpec;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r7 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        r1.c(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        r5.e();
        defpackage.ngz.c("FontDisk", "Updating last accessed time for %s took %d ms", r2, java.lang.Long.valueOf(r5.a(java.util.concurrent.TimeUnit.MILLISECONDS)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        if (r7 == null) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050 A[SYNTHETIC, Splitter:B:13:0x0050] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            java.lang.String r0 = "FontDisk"
            ngm r1 = r11.a
            com.google.android.gms.fonts.FontMatchSpec r2 = r11.b
            r3 = 0
            r4 = 1
            amtd r5 = defpackage.ampt.a     // Catch:{ Exception -> 0x0073 }
            amsn r5 = defpackage.amsn.b(r5)     // Catch:{ Exception -> 0x0073 }
            ngh r1 = r1.d     // Catch:{ Exception -> 0x0073 }
            r6 = 2
            r7 = 0
            android.database.sqlite.SQLiteDatabase r7 = r1.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0054, all -> 0x004d }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ SQLiteException -> 0x004b, all -> 0x0049 }
            r8[r3] = r2     // Catch:{ SQLiteException -> 0x004b, all -> 0x0049 }
            java.lang.String r9 = "FontsDBHelper"
            java.lang.String r10 = "Updating last accessed time for %s"
            defpackage.ngz.c(r9, r10, r8)     // Catch:{ SQLiteException -> 0x004b, all -> 0x0049 }
            r8 = 4
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x004b, all -> 0x0049 }
            java.lang.String r9 = r2.b     // Catch:{ SQLiteException -> 0x004b, all -> 0x0049 }
            r8[r3] = r9     // Catch:{ SQLiteException -> 0x004b, all -> 0x0049 }
            float r9 = r2.c     // Catch:{ SQLiteException -> 0x004b, all -> 0x0049 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x004b, all -> 0x0049 }
            r8[r4] = r9     // Catch:{ SQLiteException -> 0x004b, all -> 0x0049 }
            int r9 = r2.d     // Catch:{ SQLiteException -> 0x004b, all -> 0x0049 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x004b, all -> 0x0049 }
            r8[r6] = r9     // Catch:{ SQLiteException -> 0x004b, all -> 0x0049 }
            r9 = 3
            float r10 = r2.e     // Catch:{ SQLiteException -> 0x004b, all -> 0x0049 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteException -> 0x004b, all -> 0x0049 }
            r8[r9] = r10     // Catch:{ SQLiteException -> 0x004b, all -> 0x0049 }
            java.lang.String r9 = "UPDATE metadata SET last_accessed = CURRENT_TIMESTAMP WHERE family = ? AND width = ? AND weight = ? AND italic = ?"
            r7.execSQL(r9, r8)     // Catch:{ SQLiteException -> 0x004b, all -> 0x0049 }
            if (r7 != 0) goto L_0x0057
            goto L_0x005a
        L_0x0049:
            r5 = move-exception
            goto L_0x004e
        L_0x004b:
            r8 = move-exception
            goto L_0x0055
        L_0x004d:
            r5 = move-exception
        L_0x004e:
            if (r7 == 0) goto L_0x0053
            r1.c(r7)     // Catch:{ Exception -> 0x0073 }
        L_0x0053:
            throw r5     // Catch:{ Exception -> 0x0073 }
        L_0x0054:
            r8 = move-exception
        L_0x0055:
            if (r7 == 0) goto L_0x005a
        L_0x0057:
            r1.c(r7)     // Catch:{ Exception -> 0x0073 }
        L_0x005a:
            r5.e()     // Catch:{ Exception -> 0x0073 }
            java.lang.String r1 = "Updating last accessed time for %s took %d ms"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0073 }
            r6[r3] = r2     // Catch:{ Exception -> 0x0073 }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x0073 }
            long r7 = r5.a((java.util.concurrent.TimeUnit) r7)     // Catch:{ Exception -> 0x0073 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0073 }
            r6[r4] = r5     // Catch:{ Exception -> 0x0073 }
            defpackage.ngz.c(r0, r1, r6)     // Catch:{ Exception -> 0x0073 }
            return
        L_0x0073:
            r1 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r2
            java.lang.String r2 = "Error updating last accessed time for %s."
            defpackage.ngz.a((java.lang.String) r0, (java.lang.Throwable) r1, (java.lang.String) r2, (java.lang.Object[]) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngi.run():void");
    }
}
