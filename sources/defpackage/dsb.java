package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;

/* renamed from: dsb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dsb extends ContentProvider {
    public static void a(Context context) {
        int callingUid = Binder.getCallingUid();
        if (callingUid != Process.myUid()) {
            try {
                if (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).uid == callingUid) {
                    int i = hxy.a;
                    return;
                }
                StringBuilder sb = new StringBuilder(52);
                sb.append("Calling UID ");
                sb.append(callingUid);
                sb.append(" is not Google Play Services.");
                throw new SecurityException(sb.toString());
            } catch (PackageManager.NameNotFoundException e) {
                throw new SecurityException("Google Play Services not installed", e);
            }
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw null;
    }

    public final String getType(Uri uri) {
        throw null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw null;
    }

    public final boolean onCreate() {
        throw null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw null;
    }
}
