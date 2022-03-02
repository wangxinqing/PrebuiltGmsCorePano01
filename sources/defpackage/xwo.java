package defpackage;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: xwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xwo {
    private static final String[] b = {"data"};
    private static final Uri c = ContactsContract.SyncState.CONTENT_URI;
    public boolean a = false;
    private final ContentResolver d;
    private final String e;
    private final String[] f;
    private final Object g = new Object();

    public xwo(ContentResolver contentResolver, Account account) {
        this.d = contentResolver;
        String str = account.name;
        String str2 = account.type;
        this.e = "account_name=? AND account_type=?";
        this.f = new String[]{str, str2};
        byte[] bArr = null;
        try {
            bArr = b();
        } catch (SQLException e2) {
            String message = e2.getMessage();
            if (message != null && message.indexOf("Unable to convert") >= 0) {
                Log.e("FSA2_SyncState", "Error to read sync state bytes from CP2, clearing...");
                a(ContentProviderOperation.newDelete(c).withSelection(this.e, this.f).build());
            }
        }
        if (bArr == null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("account_name", str);
            contentValues.put("account_type", str2);
            contentValues.put("data", b(xvk.g));
            a(ContentProviderOperation.newInsert(c).withValues(contentValues).build());
        }
    }

    static final byte[] b(xvk xvk) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            xvk.a(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            Log.e("FSA2_SyncState", "Error when converting FocusSyncState to bytes.", e2);
            return null;
        }
    }

    public final ContentProviderOperation a(xvk xvk) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("data", b(xvk));
        return ContentProviderOperation.newUpdate(c).withValues(contentValues).withSelection(this.e, this.f).build();
    }

    public final xvk a() {
        byte[] b2 = b();
        xvk xvk = xvk.g;
        if (b2 != null) {
            try {
                xvk = (xvk) aucj.a((aucj) xvk.g, b2, aubs.c());
            } catch (auda e2) {
                this.a = true;
                Log.e("FSA2_SyncState", "error when parsing blob to proto", e2);
                a(a(xvk));
            }
        }
        xdt.a("FSA2_SyncState", "@readSyncState: %s", (Object) xvk);
        return xvk;
    }

    /* access modifiers changed from: package-private */
    public final byte[] b() {
        synchronized (this.g) {
            ContentResolver contentResolver = this.d;
            Uri uri = c;
            String[] strArr = b;
            String str = this.e;
            String[] strArr2 = this.f;
            String[] strArr3 = xvw.a;
            Cursor query = contentResolver.query(uri, strArr, str, strArr2, (String) null);
            if (query != null) {
                try {
                    if (query.moveToNext()) {
                        byte[] blob = query.getBlob(0);
                        return blob;
                    }
                    query.close();
                    return null;
                } finally {
                    query.close();
                }
            } else {
                Log.e("FSA2_SyncState", "Failed to query CP2");
                throw new xye(new RemoteException("Unable to query CP2"));
            }
        }
    }

    public final void a(ContentProviderOperation contentProviderOperation) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(contentProviderOperation);
        try {
            synchronized (this.g) {
                xvw.a(this.d, arrayList);
            }
        } catch (OperationApplicationException | RemoteException e2) {
            Log.e("FSA2_SyncState", "Failed to apply database operation", e2);
            throw new xye(e2);
        }
    }
}
