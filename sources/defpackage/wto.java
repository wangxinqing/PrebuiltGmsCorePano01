package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: wto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wto {
    static final String[] a = {"photo_id"};
    static final String[] b = {"data15"};
    private static final String[] c = {"_id"};
    private static final String[] d = {"contact_id"};

    public static long a(Context context, String str, String str2) {
        return a(context, str, str2, c);
    }

    public static long b(Context context, String str, String str2) {
        return a(context, str, str2, d);
    }

    /* JADX INFO: finally extract failed */
    private static long a(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        String m = ycm.m(str2);
        int i = Build.VERSION.SDK_INT;
        Cursor query = context.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, strArr, "account_name=?1 AND account_type='com.google' AND sourceid=?2 AND data_set IS NULL", new String[]{str, m}, (String) null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    int i2 = query.getInt(0);
                    query.close();
                    return (long) i2;
                }
                query.close();
                return -1;
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } else {
            Log.w("PeopleCp2Helper", "Contacts query failed.");
            return -1;
        }
    }

    /* JADX INFO: finally extract failed */
    public static byte[] b(Context context, long j, boolean z) {
        if (!z) {
            Log.w("PeopleCp2Helper", "Large contact picture not supported yet.");
        }
        Cursor query = context.getContentResolver().query(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j), a, (String) null, (String[]) null, (String) null);
        long j2 = -1;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    int i = query.getInt(0);
                    query.close();
                    j2 = (long) i;
                } else {
                    query.close();
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } else {
            Log.w("PeopleCp2Helper", "Contacts query failed.");
        }
        byte[] bArr = null;
        if (j2 < 0) {
            return null;
        }
        Cursor query2 = context.getContentResolver().query(ContentUris.withAppendedId(ContactsContract.Data.CONTENT_URI, j2), b, (String) null, (String[]) null, (String) null);
        if (query2 != null) {
            try {
                if (query2.moveToFirst()) {
                    bArr = query2.getBlob(0);
                }
            } finally {
                query2.close();
            }
        } else {
            Log.w("PeopleCp2Helper", "Contacts query failed.");
        }
        return bArr;
    }

    public static byte[] a(Context context, long j, boolean z) {
        if (!z) {
            Log.w("PeopleCp2Helper", "Large contact picture not supported yet.");
        }
        Cursor query = context.getContentResolver().query(ContactsContract.Data.CONTENT_URI, b, "mimetype='vnd.android.cursor.item/photo' AND raw_contact_id=?", new String[]{String.valueOf(j)}, (String) null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    return query.getBlob(0);
                }
                query.close();
                return null;
            } finally {
                query.close();
            }
        } else {
            Log.w("PeopleCp2Helper", "Contacts query failed.");
            return null;
        }
    }
}
