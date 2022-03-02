package defpackage;

import android.app.DownloadManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.download.DownloadDetails;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: ipt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ipt {
    static final String[] a = {"_id", "filename", "url", "sizeBytes", "sha1", "destination", "minVersion", "maxVersion", "dm_id"};
    static final String[] b = {"_id", "filename"};
    public static final String[] c = {"filename", "retries"};
    static final String[] d = {"filename", "enabled"};
    public static final String[] e = {"filename", "dm_id"};
    public static final String[] f = {"_id", "filename", "notificationTitle", "notificationDescription"};
    public static final Object g = new Object();

    private static ContentValues a(DownloadDetails downloadDetails) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("filename", downloadDetails.a);
        contentValues.put("url", downloadDetails.b);
        contentValues.put("sizeBytes", Long.valueOf(downloadDetails.c));
        contentValues.put("sha1", downloadDetails.d);
        String str = downloadDetails.e;
        if (str != null) {
            contentValues.put("destination", str);
        }
        int i = downloadDetails.f;
        if (i != 0) {
            contentValues.put("minVersion", Integer.valueOf(i));
        }
        int i2 = downloadDetails.g;
        if (i2 != Integer.MAX_VALUE) {
            contentValues.put("maxVersion", Integer.valueOf(i2));
        }
        return contentValues;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (((android.app.DownloadManager) r5.getSystemService("download")).remove(new long[]{r6}) != 0) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r5, long r6) {
        /*
            java.lang.String r0 = "DownloadServiceState"
            java.lang.String r1 = "download"
            java.lang.Object r1 = r5.getSystemService(r1)
            android.app.DownloadManager r1 = (android.app.DownloadManager) r1
            r2 = 0
            r3 = 1
            long[] r4 = new long[r3]     // Catch:{ IllegalArgumentException -> 0x0017 }
            r4[r2] = r6     // Catch:{ IllegalArgumentException -> 0x0017 }
            int r1 = r1.remove(r4)     // Catch:{ IllegalArgumentException -> 0x0017 }
            if (r1 == 0) goto L_0x0018
            goto L_0x001e
        L_0x0017:
            r1 = move-exception
        L_0x0018:
            java.lang.String r1 = "Failed to clear DownloadManager of id"
            android.util.Log.w(r0, r1)
        L_0x001e:
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r4 = "dm_id"
            r1.putNull(r4)
            android.content.ContentResolver r5 = r5.getContentResolver()
            android.net.Uri r4 = defpackage.iqe.a
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r3[r2] = r6
            java.lang.String r6 = "dm_id=?"
            int r5 = r5.update(r4, r1, r6, r3)
            if (r5 != 0) goto L_0x0043
            java.lang.String r5 = "Failed to clear DownloadManager id in DownloadService"
            android.util.Log.w(r0, r5)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipt.b(android.content.Context, long):void");
    }

    public static DownloadDetails c(Context context, String str) {
        Cursor query = context.getContentResolver().query(a(str), a, (String) null, (String[]) null, (String) null);
        DownloadDetails downloadDetails = null;
        if (query == null) {
            Log.wtf("DownloadServiceState", "getDownloadDetails Cursor was null", new Exception());
            return null;
        }
        try {
            if (query.moveToNext()) {
                downloadDetails = a(query);
            }
            return downloadDetails;
        } finally {
            query.close();
        }
    }

    public static Cursor a(DownloadManager downloadManager, DownloadManager.Query query) {
        try {
            return downloadManager.query(query);
        } catch (SQLException | IllegalArgumentException e2) {
            Log.e("DownloadServiceState", "DownloadManager unexpectedly threw an exception:", e2);
            return null;
        }
    }

    public static Uri a(Context context, DownloadDetails downloadDetails, boolean z) {
        ContentValues a2 = a(downloadDetails);
        if (z) {
            a2.put("enabled", 1);
        }
        return context.getContentResolver().insert(iqe.a, a2);
    }

    public static Uri a(String str) {
        return Uri.withAppendedPath(iqe.a, str);
    }

    public static void b(Context context, DownloadDetails downloadDetails, boolean z) {
        Uri a2 = a(downloadDetails.a);
        ContentValues a3 = a(downloadDetails);
        if (z) {
            a3.put("enabled", 1);
        }
        int update = context.getContentResolver().update(a2, a3, (String) null, (String[]) null);
    }

    public static DownloadDetails a(Context context, long j) {
        Cursor query = context.getContentResolver().query(iqe.a, a, "dm_id=?", new String[]{String.valueOf(j)}, (String) null);
        if (query == null) {
            Log.wtf("DownloadServiceState", "getDownloadManagerDetails Cursor was null", new Exception());
            return null;
        }
        try {
            if (!query.moveToNext()) {
                StringBuilder sb = new StringBuilder(53);
                sb.append("No pending download found for id ");
                sb.append(j);
                Log.w("DownloadServiceState", sb.toString());
                return null;
            }
            DownloadDetails a2 = a(query);
            query.close();
            return a2;
        } finally {
            query.close();
        }
    }

    public static boolean b(Context context, String str) {
        Cursor query = context.getContentResolver().query(a(str), d, (String) null, (String[]) null, (String) null);
        boolean z = false;
        if (query == null) {
            Log.wtf("DownloadServiceState", "isDownloadedFileEnabled Cursor was null", new Exception());
            return false;
        }
        try {
            if (query.moveToNext() && query.getInt(1) == 1) {
                z = true;
            }
            return z;
        } finally {
            query.close();
        }
    }

    static DownloadDetails a(Cursor cursor) {
        ipm ipm = new ipm(cursor.getString(1), cursor.getString(2), cursor.getLong(3), cursor.getString(4));
        if (!cursor.isNull(5)) {
            ipm.e = cursor.getString(5);
        }
        if (!cursor.isNull(6)) {
            ipm.f = cursor.getInt(6);
        }
        if (!cursor.isNull(7)) {
            ipm.g = cursor.getInt(7);
        }
        return ipm.a();
    }

    /* JADX INFO: finally extract failed */
    public static void a(Context context, String str) {
        Uri a2 = a(str);
        synchronized (g) {
            Cursor query = context.getContentResolver().query(a2, c, (String) null, (String[]) null, (String) null);
            if (query != null) {
                try {
                    if (query.moveToNext()) {
                        int i = query.getInt(1);
                        query.close();
                        ContentValues contentValues = new ContentValues(1);
                        contentValues.put("retries", Integer.valueOf(i + 1));
                        context.getContentResolver().update(a2, contentValues, (String) null, (String[]) null);
                        return;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                    sb.append("'");
                    sb.append(str);
                    sb.append("' was not in the DownloadService.");
                    throw new IllegalArgumentException(sb.toString());
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            } else {
                Log.wtf("DownloadServiceState", "markDownloadFailed Cursor was null", new Exception());
            }
        }
    }

    public static DownloadDetails[] a(Context context) {
        Cursor query;
        int i = 0;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            JSONArray jSONArray = new JSONArray(awud.b());
            if (jSONArray.length() > 0) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    DownloadDetails downloadDetails = new DownloadDetails(jSONArray.getJSONObject(i2));
                    query = contentResolver.query(a(downloadDetails.a), b, (String) null, (String[]) null, (String) null);
                    if (query != null) {
                        if (query.getCount() == 0) {
                            a(context, downloadDetails, true);
                        } else {
                            b(context, downloadDetails, false);
                        }
                        query.close();
                    }
                }
            }
        } catch (JSONException e2) {
        } catch (Throwable th) {
            query.close();
            throw th;
        }
        Cursor query2 = context.getContentResolver().query(iqe.a, a, (String) null, (String[]) null, (String) null);
        if (query2 == null) {
            Log.wtf("DownloadServiceState", "getAllDownloadDetails Cursor was null", new Exception());
            return new DownloadDetails[0];
        }
        try {
            DownloadDetails[] downloadDetailsArr = new DownloadDetails[query2.getCount()];
            while (query2.moveToNext()) {
                int i3 = i + 1;
                downloadDetailsArr[i] = a(query2);
                i = i3;
            }
            return downloadDetailsArr;
        } finally {
            query2.close();
        }
    }
}
