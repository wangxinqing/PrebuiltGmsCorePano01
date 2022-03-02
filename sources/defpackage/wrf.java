package defpackage;

import android.util.Log;

/* renamed from: wrf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wrf {
    public static final String[] a = {"_id"};
    public static final String[] b = {"_id"};

    public static double a() {
        try {
            return Double.parseDouble("20.12.16 (080306-{{cl}})".substring(0, "20.12.16 (080306-{{cl}})".indexOf(".", "20.12.16 (080306-{{cl}})".indexOf(".") + 1)));
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            Log.e("ContactsLoggerCommonUtils", "Cannot parse GmsCore version.", e);
            return -1.0d;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r8, android.net.Uri r9, java.lang.String[] r10) {
        /*
            java.lang.String r0 = "ContactsLoggerCommonUtils"
            r1 = 0
            android.content.ContentResolver r2 = r8.getContentResolver()     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r9
            r4 = r10
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
            if (r1 != 0) goto L_0x0018
            java.lang.String r8 = "CP2 failed to fetch ReadOnlyRawContacts."
            android.util.Log.w(r0, r8)     // Catch:{ SQLiteException -> 0x0020 }
            goto L_0x002f
        L_0x0018:
            int r8 = r1.getCount()     // Catch:{ SQLiteException -> 0x0020 }
            r1.close()
            return r8
        L_0x0020:
            r8 = move-exception
            goto L_0x0025
        L_0x0022:
            r8 = move-exception
            goto L_0x0032
        L_0x0024:
            r8 = move-exception
        L_0x0025:
            java.lang.String r9 = "CP2 Query Exception when fetching read-only-raw-contacts."
            android.util.Log.e(r0, r9, r8)     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            r8 = -1
            return r8
        L_0x0031:
            r8 = move-exception
        L_0x0032:
            if (r1 == 0) goto L_0x0037
            r1.close()
        L_0x0037:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrf.a(android.content.Context, android.net.Uri, java.lang.String[]):int");
    }
}
