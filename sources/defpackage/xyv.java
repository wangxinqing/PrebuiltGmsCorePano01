package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.RemoteException;
import android.provider.ContactsContract;

/* renamed from: xyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xyv {
    private static final String[] a = {"_id", "data_sync1", "data_version", "data14", "data_sync4"};

    public static Cursor a(Account account, ContentResolver contentResolver, String str) {
        Cursor query = contentResolver.query(xvw.a(ContactsContract.Data.CONTENT_URI, account), a, str, (String[]) null, (String) null);
        if (query != null) {
            return query;
        }
        throw new xye(new RemoteException("Unable to get photos."));
    }

    public static void a(Cursor cursor, xvw xvw, xvp xvp, int i) {
        int i2 = 0;
        while (true) {
            try {
                if (cursor.moveToNext()) {
                    if (i2 >= i) {
                        break;
                    }
                    xvp.a();
                    long j = cursor.getLong(0);
                    String string = cursor.getString(1);
                    String b = xwz.b(string);
                    boolean c = xwz.c(string);
                    Long valueOf = Long.valueOf(cursor.getLong(2));
                    String string2 = cursor.getString(3);
                    Long valueOf2 = Long.valueOf(cursor.getLong(4));
                    if (!c && string2 == null && yau.a(valueOf, valueOf2)) {
                        xvw.a(xwc.a(j, valueOf.longValue()).withValue("data_sync1", xwz.a(b, true)).withValue("data_sync3", (Object) null).withValue("data_sync4", Long.valueOf(valueOf2.longValue() + 1)));
                        xvw.a();
                        i2++;
                    }
                } else {
                    break;
                }
            } finally {
                cursor.close();
            }
        }
        xvw.b();
    }
}
