package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* renamed from: jjm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jjm {
    private static final Uri a = Uri.parse("content://com.google.settings/partner");
    private static Boolean b = null;
    private static int c = 2;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r10v7 */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r1 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r1 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        r1.close();
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r10 == 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        r1 = java.lang.Integer.parseInt(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a A[Catch:{ all -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r10) {
        /*
            java.lang.String r0 = "GoogleLocSettingHelper"
            boolean r1 = b(r10)
            r2 = 1
            if (r1 == 0) goto L_0x006f
            int r1 = android.os.Build.VERSION.SDK_INT
            int r1 = c
            r3 = 0
            if (r1 != r2) goto L_0x0011
            goto L_0x0063
        L_0x0011:
            android.content.ContentResolver r4 = r10.getContentResolver()
            r10 = 0
            android.net.Uri r5 = a     // Catch:{ RuntimeException -> 0x0040, all -> 0x003e }
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ RuntimeException -> 0x0040, all -> 0x003e }
            java.lang.String r1 = "value"
            r6[r3] = r1     // Catch:{ RuntimeException -> 0x0040, all -> 0x003e }
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ RuntimeException -> 0x0040, all -> 0x003e }
            java.lang.String r1 = "use_location_for_services"
            r8[r3] = r1     // Catch:{ RuntimeException -> 0x0040, all -> 0x003e }
            java.lang.String r7 = "name=?"
            r9 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ RuntimeException -> 0x0040, all -> 0x003e }
            if (r1 == 0) goto L_0x003a
            boolean r4 = r1.moveToNext()     // Catch:{ RuntimeException -> 0x0038 }
            if (r4 == 0) goto L_0x003a
            java.lang.String r10 = r1.getString(r3)     // Catch:{ RuntimeException -> 0x0038 }
            goto L_0x003b
        L_0x0038:
            r4 = move-exception
            goto L_0x0043
        L_0x003a:
        L_0x003b:
            if (r1 == 0) goto L_0x0056
            goto L_0x0051
        L_0x003e:
            r0 = move-exception
            goto L_0x0069
        L_0x0040:
            r1 = move-exception
            r4 = r1
            r1 = r10
        L_0x0043:
            r5 = 5
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x0066 }
            if (r5 == 0) goto L_0x004f
            java.lang.String r5 = "Failed to get 'Use My Location' setting"
            android.util.Log.w(r0, r5, r4)     // Catch:{ all -> 0x0066 }
        L_0x004f:
            if (r1 == 0) goto L_0x0055
        L_0x0051:
            r1.close()
            goto L_0x0056
        L_0x0055:
        L_0x0056:
            if (r10 == 0) goto L_0x0065
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x005e }
            r1 = r10
            goto L_0x0061
        L_0x005e:
            r10 = move-exception
            r10 = 2
            r1 = 2
        L_0x0061:
            c = r1
        L_0x0063:
            if (r1 == r2) goto L_0x006f
        L_0x0065:
            return r3
        L_0x0066:
            r10 = move-exception
            r0 = r10
            r10 = r1
        L_0x0069:
            if (r10 == 0) goto L_0x006e
            r10.close()
        L_0x006e:
            throw r0
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jjm.a(android.content.Context):boolean");
    }

    public static synchronized boolean b(Context context) {
        boolean booleanValue;
        boolean z;
        synchronized (jjm.class) {
            if (b == null) {
                if (context.getPackageManager().resolveActivity(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"), 65536) != null) {
                    z = true;
                } else {
                    z = false;
                }
                b = Boolean.valueOf(z);
            }
            booleanValue = b.booleanValue();
        }
        return booleanValue;
    }

    public static boolean c(Context context) {
        int i = Build.VERSION.SDK_INT;
        return b(context);
    }
}
