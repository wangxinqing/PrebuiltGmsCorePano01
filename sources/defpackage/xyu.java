package defpackage;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: xyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xyu {
    public final Account a;
    private final ContentResolver b;

    static {
        iva.b(TextUtils.equals("sourceid", "sourceid"));
    }

    public xyu(Account account, ContentResolver contentResolver) {
        this.a = account;
        this.b = contentResolver;
    }

    public final void a(ContentProviderOperation contentProviderOperation, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(contentProviderOperation);
        try {
            xvw.a(this.b, arrayList);
        } catch (OperationApplicationException | RemoteException e) {
            xdt.a("FSA2_MarkAndSweepUtil", "Failed to perform %s operation", str);
            throw new xye(e);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void a(Uri uri) {
        Cursor query = this.b.query(xvw.a(uri, this.a), xvw.a, "sync2='SWEEP_MARK'", (String[]) null, (String) null);
        if (query != null) {
            try {
                query.moveToLast();
                query.getInt(0);
                query.close();
                ContentProviderOperation build = ContentProviderOperation.newDelete(xvw.a(uri, this.a)).withSelection("sync2='SWEEP_MARK'", (String[]) null).build();
                build.toString().replace("%40g", "%%40g");
                a(build, "sweep");
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } else {
            throw new xye(new RemoteException("Unable to query CP2."));
        }
    }
}
