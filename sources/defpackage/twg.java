package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.provider.ContactsContract;

/* renamed from: twg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class twg {
    private final Context a;
    private String b;

    public twg(Context context) {
        this.a = context;
    }

    public final synchronized String a() {
        if (this.b == null) {
            Context context = this.a;
            ((anih) tsp.a.d()).a("Start query given name");
            Cursor query = context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.Profile.CONTENT_URI, "data"), new String[]{"data2"}, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query == null) {
                ((anih) tsp.a.d()).a("Get name from cursor fail due to null cursor");
            } else if (!query.moveToFirst()) {
                query.close();
                ((anih) tsp.a.d()).a("Get name from cursor fail due to empty cursor");
            } else {
                try {
                    str = query.getString(query.getColumnIndex("data2"));
                } catch (SQLiteException e) {
                    try {
                        anih anih = (anih) tsp.a.c();
                        anih.a((Throwable) e);
                        anih.a("Get name from cursor fail");
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
            }
            this.b = str;
        }
        return this.b;
    }
}
