package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import com.google.android.chimera.ContentProvider;

/* renamed from: pli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class pli extends ContentProvider {
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

    public abstract Cursor a(Uri uri, String[] strArr);

    public abstract String a(Uri uri);

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("delete not supported.");
    }

    public final String getType(Uri uri) {
        a(getContext());
        return a(uri);
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("insert not supported.");
    }

    public final boolean onCreate() {
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        a(getContext());
        return a(uri, strArr2);
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("update not supported.");
    }
}
