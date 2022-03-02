package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.util.Base64;
import android.util.Log;
import java.util.List;

/* renamed from: xwb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xwb extends xwa {
    public static final String b = String.format("%s IS NULL AND %s !=0", new Object[]{"data_set", "should_sync"});
    public static final String c = String.format("%s IS NULL", new Object[]{"data_set"});

    private xwb(Cursor cursor) {
        super(cursor);
    }

    public static List a(ContentResolver contentResolver, Account account, String str) {
        return a(contentResolver, xvw.a(ContactsContract.Groups.CONTENT_URI, account), new String[]{"_id", "sourceid"}, str, (String[]) null, (String) null).e();
    }

    public static xwb b(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query = contentResolver.query(uri, strArr, str, strArr2, str2);
        if (query != null) {
            return new xwb(query);
        }
        throw new RemoteException("Unable to query CP2.");
    }

    public static xwb a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            return b(contentResolver, uri, strArr, str, strArr2, str2);
        } catch (RemoteException e) {
            throw new xye(e);
        }
    }

    public static boolean a(ContentResolver contentResolver, Account account) {
        Cursor query = contentResolver.query(xvw.a(ContactsContract.Settings.CONTENT_URI, account), new String[]{"should_sync"}, (String) null, (String[]) null, (String) null);
        if (query != null) {
            boolean z = true;
            while (query.moveToNext()) {
                try {
                    z = query.getLong(0) != 0;
                } finally {
                    query.close();
                }
            }
            return z;
        }
        throw new xye(new RemoteException("Unable to query CP2."));
    }

    /* renamed from: a */
    public final xvu b() {
        if (!d()) {
            return null;
        }
        xvt r = xvu.r();
        r.a = b("_id");
        r.d = a("sourceid");
        r.e = a("system_id");
        r.f = a("title");
        r.c = b("sync3");
        r.g = a("sync2");
        r.h = a("account_name");
        r.b = b("version");
        if (aytd.a.a().i()) {
            r.i = a("account_type");
        }
        if (aytd.d()) {
            r.j = a("data_set");
        }
        if (aytr.b() && !amrk.a(a("sync1"))) {
            try {
                r.k = (wvq) aucj.a((aucj) wvq.d, Base64.decode(a("sync1"), 2), aubs.c());
            } catch (auda | IllegalArgumentException e) {
                Log.e("FSA2_GroupsCursor", "SyncOneColumnData parsing error", e);
            }
        }
        if (d("favorites")) {
            r.d(true);
        }
        if (d("group_visible")) {
            r.f(true);
        }
        if (d("group_is_read_only")) {
            r.e(true);
        }
        if (d("auto_add")) {
            r.a(true);
        }
        if (d("dirty")) {
            r.c(true);
        }
        if (d("deleted")) {
            r.b(true);
        }
        return r.a();
    }
}
