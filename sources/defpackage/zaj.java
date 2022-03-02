package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.plus.provider.PlusChimeraContentProvider;

/* renamed from: zaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zaj {
    public static Cursor a(ContentResolver contentResolver, String str) {
        ContentProviderClient acquireContentProviderClient = contentResolver.acquireContentProviderClient("com.google.android.gms.plus");
        try {
            return ((PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient)).b.getReadableDatabase().query("plus_accounts", (String[]) null, "account_name=?", new String[]{str}, (String) null, (String) null, (String) null);
        } finally {
            acquireContentProviderClient.release();
        }
    }

    public static void a(ContentResolver contentResolver, String str, String str2) {
        SQLiteDatabase writableDatabase;
        ContentProviderClient acquireContentProviderClient = contentResolver.acquireContentProviderClient("com.google.android.gms.plus");
        try {
            PlusChimeraContentProvider plusChimeraContentProvider = (PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient);
            writableDatabase = plusChimeraContentProvider.b.getWritableDatabase();
            writableDatabase.beginTransactionWithListener(plusChimeraContentProvider);
            writableDatabase.delete("plus_profiles", "accountName=? AND packageName=?", new String[]{str, str2});
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            acquireContentProviderClient.release();
        } catch (Throwable th) {
            acquireContentProviderClient.release();
            throw th;
        }
    }
}
