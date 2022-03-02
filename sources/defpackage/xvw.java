package defpackage;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: xvw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xvw {
    public static final String[] a = {"_count"};
    public final xvy b;
    public final xvx c;
    public final xvx d;
    public final xvx e;
    private final ContentResolver f;
    private final xwp g;

    public xvw(Account account, ContentResolver contentResolver, yaz yaz) {
        this(account, contentResolver, yaz, true);
    }

    public static int a(ContentResolver contentResolver, Uri uri, String str, String[] strArr) {
        Cursor query = contentResolver.query(uri, new String[]{"_count"}, str, strArr, (String) null);
        if (query != null) {
            try {
                query.moveToLast();
                return query.getInt(0);
            } finally {
                query.close();
            }
        } else {
            throw new RemoteException("Unable to query CP2");
        }
    }

    public final void b() {
        synchronized (this.g) {
            a(this.f, this.g);
        }
    }

    public xvw(Account account, ContentResolver contentResolver, yaz yaz, boolean z) {
        this.g = new xwp();
        this.c = new xvx(a(ContactsContract.Groups.CONTENT_URI, account, z), this.g, yaz);
        this.b = new xvy(account, z, contentResolver, this.g, yaz);
        this.d = new xvx(a(ContactsContract.Data.CONTENT_URI, account, z), this.g, yaz);
        this.e = new xvx(a(ContactsContract.Data.CONTENT_URI, account, z), this.g, yaz);
        this.f = contentResolver;
    }

    public static Uri a(Uri uri) {
        return uri.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
    }

    public static Uri a(Uri uri, Account account) {
        return a(uri, account, true);
    }

    public static Uri a(Uri uri, Account account, boolean z) {
        if (account == null) {
            return uri;
        }
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("account_name", account.name).appendQueryParameter("account_type", account.type);
        if (z) {
            appendQueryParameter.appendQueryParameter("caller_is_syncadapter", "true");
        }
        return appendQueryParameter.build();
    }

    public static void a(ContentResolver contentResolver, xwp xwp) {
        if (!xwp.c()) {
            int d2 = xwp.d();
            try {
                int length = a(contentResolver, xwp.b()).length;
            } catch (RemoteException e2) {
                Log.e("FSA2_DatabaseHelper", "Failed to apply at least one operation", e2);
                throw new xye(e2);
            } catch (OperationApplicationException e3) {
                int numSuccessfulYieldPoints = e3.getNumSuccessfulYieldPoints();
                Log.e("FSA2_DatabaseHelper", String.format(Locale.US, "Failed to apply %d of the %d operations", new Object[]{Integer.valueOf(d2 - numSuccessfulYieldPoints), Integer.valueOf(d2)}), e3);
                throw new xye(e3);
            }
        }
    }

    public static ContentProviderResult[] a(ContentResolver contentResolver, ArrayList arrayList) {
        return contentResolver.applyBatch("com.android.contacts", arrayList);
    }

    public final void a() {
        xip.a();
        int intValue = Integer.valueOf((int) ayrj.a.a().m()).intValue();
        synchronized (this.g) {
            if (this.g.d() >= intValue) {
                b();
            }
        }
    }

    public final void a(ContentProviderOperation.Builder builder) {
        this.g.a(builder, true);
    }
}
