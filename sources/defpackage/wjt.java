package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

/* renamed from: wjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wjt {
    private static final jjg a = jjg.a(iyc.GUNS);

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r7 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        if (r7 != null) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007a A[SYNTHETIC, Splitter:B:40:0x007a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.List a(android.content.Context r7) {
        /*
            java.lang.Class<wjt> r0 = defpackage.wjt.class
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0080 }
            r1.<init>()     // Catch:{ all -> 0x0080 }
            android.database.sqlite.SQLiteDatabase r7 = defpackage.wjh.a((android.content.Context) r7)     // Catch:{ all -> 0x0080 }
            if (r7 == 0) goto L_0x007e
            r2 = 0
            java.lang.String r3 = "SELECT * FROM notifications"
            android.database.Cursor r7 = r7.rawQuery(r3, r2)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
        L_0x0015:
            boolean r3 = r7.moveToNext()     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            if (r3 == 0) goto L_0x0051
            java.lang.String r3 = "payload"
            int r3 = r7.getColumnIndex(r3)     // Catch:{ auda -> 0x0039 }
            byte[] r3 = r7.getBlob(r3)     // Catch:{ auda -> 0x0039 }
            if (r3 == 0) goto L_0x0037
            int r4 = r3.length     // Catch:{ auda -> 0x0039 }
            if (r4 <= 0) goto L_0x0037
            aubs r4 = defpackage.aubs.c()     // Catch:{ auda -> 0x0039 }
            amen r5 = defpackage.amen.k     // Catch:{ auda -> 0x0039 }
            aucj r3 = defpackage.aucj.a((defpackage.aucj) r5, (byte[]) r3, (defpackage.aubs) r4)     // Catch:{ auda -> 0x0039 }
            amen r3 = (defpackage.amen) r3     // Catch:{ auda -> 0x0039 }
            goto L_0x004b
        L_0x0037:
            r3 = r2
            goto L_0x004b
        L_0x0039:
            r3 = move-exception
            jjg r4 = a     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            anie r4 = r4.b()     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            anih r4 = (defpackage.anih) r4     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r4.a((java.lang.Throwable) r3)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            java.lang.String r3 = "Exception trying to parse payload from protocol buffer."
            r4.a((java.lang.String) r3)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r3 = r2
        L_0x004b:
            if (r3 == 0) goto L_0x0015
            r1.add(r3)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            goto L_0x0015
        L_0x0051:
            if (r7 == 0) goto L_0x007e
        L_0x0053:
            r7.close()     // Catch:{ all -> 0x0080 }
            goto L_0x007e
        L_0x0057:
            r1 = move-exception
            r2 = r7
            goto L_0x0078
        L_0x005a:
            r2 = move-exception
            goto L_0x0063
        L_0x005c:
            r7 = move-exception
            r1 = r7
            goto L_0x0078
        L_0x005f:
            r7 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L_0x0063:
            jjg r3 = a     // Catch:{ all -> 0x0076 }
            anie r3 = r3.b()     // Catch:{ all -> 0x0076 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0076 }
            r3.a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0076 }
            java.lang.String r2 = "Error while loading notifications from DB."
            r3.a((java.lang.String) r2)     // Catch:{ all -> 0x0076 }
            if (r7 == 0) goto L_0x007e
            goto L_0x0053
        L_0x0076:
            r1 = move-exception
            r2 = r7
        L_0x0078:
            if (r2 == 0) goto L_0x007d
            r2.close()     // Catch:{ all -> 0x0080 }
        L_0x007d:
            throw r1     // Catch:{ all -> 0x0080 }
        L_0x007e:
            monitor-exit(r0)
            return r1
        L_0x0080:
            r7 = move-exception
            monitor-exit(r0)
            goto L_0x0084
        L_0x0083:
            throw r7
        L_0x0084:
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjt.a(android.content.Context):java.util.List");
    }

    public static synchronized void a(Context context, String str) {
        SQLiteDatabase b;
        synchronized (wjt.class) {
            if (!TextUtils.isEmpty(str) && (b = wjh.b(context)) != null) {
                try {
                    int delete = b.delete("notifications", "key = ? ", new String[]{str});
                } catch (Exception e) {
                    anih anih = (anih) a.b();
                    anih.a((Throwable) e);
                    anih.a("Error deleting from DB.");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r7, java.lang.String r8, defpackage.amen r9) {
        /*
            java.lang.Class<wjt> r0 = defpackage.wjt.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x00ba }
            if (r1 != 0) goto L_0x00b8
            boolean r1 = defpackage.wjp.c(r9)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x00b8
            boolean r1 = defpackage.wjp.d(r9)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x00b8
            long r1 = r9.h     // Catch:{ all -> 0x00ba }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x001e
            goto L_0x004d
        L_0x001e:
            amen r1 = defpackage.amen.k     // Catch:{ all -> 0x00ba }
            aucd r9 = r1.a((defpackage.aucj) r9)     // Catch:{ all -> 0x00ba }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x00ba }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ba }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00ba }
            long r1 = r1.convert(r5, r2)     // Catch:{ all -> 0x00ba }
            boolean r5 = r9.c     // Catch:{ all -> 0x00ba }
            if (r5 != 0) goto L_0x0035
            goto L_0x003b
        L_0x0035:
            r9.c()     // Catch:{ all -> 0x00ba }
            r5 = 0
            r9.c = r5     // Catch:{ all -> 0x00ba }
        L_0x003b:
            aucj r5 = r9.b     // Catch:{ all -> 0x00ba }
            amen r5 = (defpackage.amen) r5     // Catch:{ all -> 0x00ba }
            int r6 = r5.a     // Catch:{ all -> 0x00ba }
            r6 = r6 | 64
            r5.a = r6     // Catch:{ all -> 0x00ba }
            r5.h = r1     // Catch:{ all -> 0x00ba }
            aucj r9 = r9.i()     // Catch:{ all -> 0x00ba }
            amen r9 = (defpackage.amen) r9     // Catch:{ all -> 0x00ba }
        L_0x004d:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x00ba }
            r2 = 4
            r1.<init>(r2)     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = "key"
            r1.put(r2, r8)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "payload"
            byte[] r2 = r9.k()     // Catch:{ all -> 0x00ba }
            r1.put(r8, r2)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "insertion_time_ms"
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ba }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00ba }
            r1.put(r8, r2)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "creation_time_usec"
            long r5 = r9.h     // Catch:{ all -> 0x00ba }
            java.lang.Long r9 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00ba }
            r1.put(r8, r9)     // Catch:{ all -> 0x00ba }
            android.database.sqlite.SQLiteDatabase r7 = defpackage.wjh.b(r7)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x00a3
            java.lang.String r8 = "notifications"
            r9 = 0
            r2 = 5
            long r8 = r7.insertWithOnConflict(r8, r9, r1, r2)     // Catch:{ Exception -> 0x00a5 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ Exception -> 0x00a5 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00a5 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x00a5 }
            long r1 = r1.convert(r5, r2)     // Catch:{ Exception -> 0x00a5 }
            aynt r5 = defpackage.aynt.a     // Catch:{ Exception -> 0x00a5 }
            aynu r5 = r5.a()     // Catch:{ Exception -> 0x00a5 }
            long r5 = r5.q()     // Catch:{ Exception -> 0x00a5 }
            long r1 = r1 - r5
            defpackage.wjh.a(r7, r1)     // Catch:{ Exception -> 0x00a5 }
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
        L_0x00a3:
            monitor-exit(r0)
            return
        L_0x00a5:
            r7 = move-exception
            jjg r8 = a     // Catch:{ all -> 0x00ba }
            anie r8 = r8.b()     // Catch:{ all -> 0x00ba }
            anih r8 = (defpackage.anih) r8     // Catch:{ all -> 0x00ba }
            r8.a((java.lang.Throwable) r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "Error inserting in DB."
            r8.a((java.lang.String) r7)     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)
            return
        L_0x00b8:
            monitor-exit(r0)
            return
        L_0x00ba:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjt.a(android.content.Context, java.lang.String, amen):void");
    }
}
