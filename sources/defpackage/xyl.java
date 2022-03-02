package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;

/* renamed from: xyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class xyl {
    public final ContentResolver a;
    public final Account b;
    public final xvp c;
    public volatile Thread d;

    public xyl(ContentResolver contentResolver, Account account, xvp xvp) {
        this.a = contentResolver;
        this.b = account;
        this.c = xvp;
    }

    public abstract void b(List list, yaq yaq);

    public final int a(Uri uri, String str) {
        Cursor query = this.a.query(uri, xvw.a, str, (String[]) null, (String) null);
        if (query != null) {
            try {
                query.moveToLast();
                return query.getInt(0);
            } finally {
                query.close();
            }
        } else {
            Log.e("FSA2_DatabaseReader", "Failed to query CP2.");
            throw new xye(new RemoteException("Unable to query CP2."));
        }
    }

    public final void a(List list, yaq yaq) {
        b(list, yaq);
        list.clear();
    }

    public final void a(yaq yaq, yaq yaq2) {
        iva.b(true);
        this.d = new Thread(new xyj(this, yaq, yaq2));
        this.d.getId();
        this.c.a(this.d);
        this.d.start();
    }
}
