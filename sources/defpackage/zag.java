package defpackage;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.AsyncTask;
import android.os.Build;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.plus.provider.PlusChimeraContentProvider;

/* renamed from: zag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zag extends AsyncTask {
    final /* synthetic */ ContentResolver a;

    public zag(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        SQLiteDatabase writableDatabase;
        Cursor query;
        Account[] accountArr = (Account[]) objArr;
        ContentProviderClient acquireContentProviderClient = this.a.acquireContentProviderClient("com.google.android.gms.plus");
        try {
            PlusChimeraContentProvider plusChimeraContentProvider = (PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient);
            if (accountArr != null) {
                writableDatabase = plusChimeraContentProvider.b.getWritableDatabase();
                writableDatabase.beginTransactionWithListener(plusChimeraContentProvider);
                try {
                    query = writableDatabase.query("plus_accounts", zah.a, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                    if (query != null) {
                        while (query.moveToNext()) {
                            int i = 0;
                            String string = query.getString(0);
                            while (true) {
                                if (i < accountArr.length) {
                                    if (accountArr[i].name.equals(string)) {
                                        break;
                                    }
                                    i++;
                                } else {
                                    plusChimeraContentProvider.a(string, writableDatabase);
                                    break;
                                }
                            }
                        }
                        query.close();
                    }
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLiteException e) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (e instanceof SQLiteCantOpenDatabaseException) {
                        plusChimeraContentProvider.getContext().deleteDatabase("plus.db");
                    } else {
                        throw e;
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
                writableDatabase.endTransaction();
            }
            acquireContentProviderClient.release();
            return null;
        } catch (Throwable th2) {
            acquireContentProviderClient.release();
            throw th2;
        }
    }
}
