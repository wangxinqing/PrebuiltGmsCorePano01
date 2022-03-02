package defpackage;

import android.app.DownloadManager;
import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;

/* renamed from: cqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cqb implements cqe {
    private final DownloadManager a;

    public cqb(Context context) {
        this.a = (DownloadManager) context.getSystemService("download");
    }

    public final long a(Uri uri, String str, String str2, boolean z, boolean z2, String str3, String str4, int i) {
        DownloadManager.Request request = new DownloadManager.Request(uri);
        int i2 = Build.VERSION.SDK_INT;
        request.setAllowedOverMetered(z);
        if (!z2) {
            int i3 = Build.VERSION.SDK_INT;
            request.setNotificationVisibility(2);
        } else {
            if (str3 != null) {
                request.setTitle(str3);
            }
            if (str4 != null) {
                request.setDescription(str4);
            }
        }
        return this.a.enqueue(request);
    }

    public final void b(long... jArr) {
        this.a.remove(jArr);
    }

    public final ParcelFileDescriptor a(long j) {
        return this.a.openDownloadedFile(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r1 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
        if (r1 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0080, code lost:
        return java.util.Collections.emptyMap();
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map a(long... r7) {
        /*
            r6 = this;
            android.app.DownloadManager$Query r0 = new android.app.DownloadManager$Query
            r0.<init>()
            r0.setFilterById(r7)
            r1 = 0
            android.app.DownloadManager r2 = r6.a     // Catch:{ SQLiteException -> 0x0054, IllegalArgumentException -> 0x0052, all -> 0x0050 }
            android.database.Cursor r1 = r2.query(r0)     // Catch:{ SQLiteException -> 0x0054, IllegalArgumentException -> 0x0052, all -> 0x0050 }
            if (r1 == 0) goto L_0x004a
            boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0048, IllegalArgumentException -> 0x0046 }
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "_id"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ SQLiteException -> 0x0048, IllegalArgumentException -> 0x0046 }
            java.lang.String r2 = "status"
            int r2 = r1.getColumnIndexOrThrow(r2)     // Catch:{ SQLiteException -> 0x0048, IllegalArgumentException -> 0x0046 }
            nz r3 = new nz     // Catch:{ SQLiteException -> 0x0048, IllegalArgumentException -> 0x0046 }
            int r7 = r7.length     // Catch:{ SQLiteException -> 0x0048, IllegalArgumentException -> 0x0046 }
            r3.<init>((int) r7)     // Catch:{ SQLiteException -> 0x0048, IllegalArgumentException -> 0x0046 }
        L_0x0029:
            long r4 = r1.getLong(r0)     // Catch:{ SQLiteException -> 0x0048, IllegalArgumentException -> 0x0046 }
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x0048, IllegalArgumentException -> 0x0046 }
            int r4 = r1.getInt(r2)     // Catch:{ SQLiteException -> 0x0048, IllegalArgumentException -> 0x0046 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x0048, IllegalArgumentException -> 0x0046 }
            r3.put(r7, r4)     // Catch:{ SQLiteException -> 0x0048, IllegalArgumentException -> 0x0046 }
            boolean r7 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0048, IllegalArgumentException -> 0x0046 }
            if (r7 != 0) goto L_0x0029
            r1.close()
            return r3
        L_0x0046:
            r7 = move-exception
            goto L_0x0055
        L_0x0048:
            r7 = move-exception
            goto L_0x0055
        L_0x004a:
            if (r1 == 0) goto L_0x007c
        L_0x004c:
            r1.close()
            goto L_0x007c
        L_0x0050:
            r7 = move-exception
            goto L_0x0082
        L_0x0052:
            r7 = move-exception
            goto L_0x0055
        L_0x0054:
            r7 = move-exception
        L_0x0055:
            java.lang.String r0 = "SystemZappDlMgr"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0081 }
            int r2 = r2.length()     // Catch:{ all -> 0x0081 }
            int r2 = r2 + 32
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r3.<init>(r2)     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "DownloadManager.query() failed: "
            r3.append(r2)     // Catch:{ all -> 0x0081 }
            r3.append(r7)     // Catch:{ all -> 0x0081 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0081 }
            android.util.Log.e(r0, r7)     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x007c
            goto L_0x004c
        L_0x007c:
            java.util.Map r7 = java.util.Collections.emptyMap()
            return r7
        L_0x0081:
            r7 = move-exception
        L_0x0082:
            if (r1 == 0) goto L_0x0087
            r1.close()
        L_0x0087:
            goto L_0x0089
        L_0x0088:
            throw r7
        L_0x0089:
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqb.a(long[]):java.util.Map");
    }

    public final boolean a(Context context) {
        if (this.a != null) {
            try {
                int applicationEnabledSetting = context.getPackageManager().getApplicationEnabledSetting("com.android.providers.downloads");
                if (applicationEnabledSetting != 0) {
                    if (applicationEnabledSetting != 1) {
                        return false;
                    }
                }
                ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("downloads");
                if (acquireContentProviderClient == null) {
                    return false;
                }
                acquireContentProviderClient.release();
                return true;
            } catch (IllegalArgumentException | SecurityException e) {
            }
        }
        return false;
    }
}
