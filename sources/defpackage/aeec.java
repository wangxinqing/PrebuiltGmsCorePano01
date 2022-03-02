package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.SQLException;
import android.net.Uri;
import android.provider.BaseColumns;
import android.util.Log;
import java.util.HashMap;

/* renamed from: aeec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aeec implements BaseColumns {
    static final HashMap a = new HashMap();

    private static aeee a(ContentResolver contentResolver, Uri uri) {
        aeee aeee = (aeee) a.get(uri);
        if (aeee == null) {
            aeee aeee2 = new aeee();
            a.put(uri, aeee2);
            contentResolver.registerContentObserver(uri, true, new aeeb(aeee2));
            return aeee2;
        } else if (!aeee.c.getAndSet(false)) {
            return aeee;
        } else {
            synchronized (aeee) {
                aeee.a.clear();
                aeee.b = new Object();
            }
            return aeee;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r12 = r12.query(r13, new java.lang.String[]{"value"}, "name=?", new java.lang.String[]{r14}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r12 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r12.moveToFirst() == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        r3 = r12.getString(0);
        a(r1, r0, r14, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        a(r1, r0, r14, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        if (r12 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0055, code lost:
        r3 = r12;
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005a, code lost:
        r13 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005c, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005d, code lost:
        r0 = r12;
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        android.util.Log.e("GoogleSettings", "Can't get key " + r14 + " from " + r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        if (r3 != null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0082, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        if (r3 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0085, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        throw r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static java.lang.String a(android.content.ContentResolver r12, android.net.Uri r13, java.lang.String r14) {
        /*
            java.lang.Class<aeec> r0 = defpackage.aeec.class
            monitor-enter(r0)
            aeee r1 = a(r12, r13)     // Catch:{ all -> 0x008c }
            monitor-exit(r0)     // Catch:{ all -> 0x008c }
            monitor-enter(r1)
            java.lang.Object r0 = r1.b     // Catch:{ all -> 0x0089 }
            java.util.HashMap r2 = r1.a     // Catch:{ all -> 0x0089 }
            boolean r2 = r2.containsKey(r14)     // Catch:{ all -> 0x0089 }
            if (r2 == 0) goto L_0x001d
            java.util.HashMap r12 = r1.a     // Catch:{ all -> 0x0089 }
            java.lang.Object r12 = r12.get(r14)     // Catch:{ all -> 0x0089 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0089 }
            monitor-exit(r1)     // Catch:{ all -> 0x0089 }
            return r12
        L_0x001d:
            monitor-exit(r1)     // Catch:{ all -> 0x0089 }
            r2 = 1
            r3 = 0
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ SQLException -> 0x005c }
            java.lang.String r4 = "value"
            r10 = 0
            r6[r10] = r4     // Catch:{ SQLException -> 0x005c }
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ SQLException -> 0x005c }
            r8[r10] = r14     // Catch:{ SQLException -> 0x005c }
            java.lang.String r7 = "name=?"
            r9 = 0
            r4 = r12
            r5 = r13
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ SQLException -> 0x005c }
            if (r12 == 0) goto L_0x0047
            boolean r2 = r12.moveToFirst()     // Catch:{ SQLException -> 0x0054, all -> 0x0051 }
            if (r2 == 0) goto L_0x0047
            java.lang.String r3 = r12.getString(r10)     // Catch:{ SQLException -> 0x0054, all -> 0x0051 }
            a((defpackage.aeee) r1, (java.lang.Object) r0, (java.lang.String) r14, (java.lang.String) r3)     // Catch:{ SQLException -> 0x0054, all -> 0x0051 }
            r12.close()
            return r3
        L_0x0047:
            a((defpackage.aeee) r1, (java.lang.Object) r0, (java.lang.String) r14, (java.lang.String) r3)     // Catch:{ SQLException -> 0x0054, all -> 0x0051 }
            if (r12 == 0) goto L_0x0050
            r12.close()
        L_0x0050:
            return r3
        L_0x0051:
            r13 = move-exception
            r3 = r12
            goto L_0x0083
        L_0x0054:
            r0 = move-exception
            r11 = r3
            r3 = r12
            r12 = r11
            goto L_0x005f
        L_0x0059:
            r12 = move-exception
            r13 = r12
            goto L_0x0083
        L_0x005c:
            r12 = move-exception
            r0 = r12
            r12 = r3
        L_0x005f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r1.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = "Can't get key "
            r1.append(r2)     // Catch:{ all -> 0x0059 }
            r1.append(r14)     // Catch:{ all -> 0x0059 }
            java.lang.String r14 = " from "
            r1.append(r14)     // Catch:{ all -> 0x0059 }
            r1.append(r13)     // Catch:{ all -> 0x0059 }
            java.lang.String r13 = "GoogleSettings"
            java.lang.String r14 = r1.toString()     // Catch:{ all -> 0x0059 }
            android.util.Log.e(r13, r14, r0)     // Catch:{ all -> 0x0059 }
            if (r3 == 0) goto L_0x0082
            r3.close()
        L_0x0082:
            return r12
        L_0x0083:
            if (r3 == 0) goto L_0x0088
            r3.close()
        L_0x0088:
            throw r13
        L_0x0089:
            r12 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0089 }
            throw r12
        L_0x008c:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008c }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeec.a(android.content.ContentResolver, android.net.Uri, java.lang.String):java.lang.String");
    }

    private static void a(aeee aeee, Object obj, String str, String str2) {
        synchronized (aeee) {
            if (obj == aeee.b) {
                aeee.a.put(str, str2);
            }
        }
    }

    protected static void a(ContentResolver contentResolver, Uri uri, String str, String str2) {
        aeee a2;
        synchronized (aeec.class) {
            a2 = a(contentResolver, uri);
        }
        synchronized (a2) {
            a2.a.remove(str);
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("value", str2);
            contentResolver.insert(uri, contentValues);
        } catch (SQLException e) {
            Log.e("GoogleSettings", "Can't set key " + str + " in " + uri, e);
        } catch (IllegalArgumentException e2) {
            Log.e("GoogleSettings", "Can't set key " + str + " in " + uri, e2);
        }
    }
}
