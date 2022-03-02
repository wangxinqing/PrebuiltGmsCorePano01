package defpackage;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: yar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yar {
    public static final String[] a = {"_id", "raw_contact_id", "data_sync1", "data_version", "data14", "data_sync4"};
    public static final String[] b = {"vnd.android.cursor.item/photo"};
    private final Context c;

    public yar(Context context) {
        this.c = context;
    }

    public static String a(String[] strArr) {
        return strArr[0] + " " + strArr[1] + " " + strArr[2];
    }

    public final void a(Uri uri) {
        ContentProviderClient acquireContentProviderClient = this.c.getContentResolver().acquireContentProviderClient(uri);
        if (acquireContentProviderClient != null) {
            long parseId = ContentUris.parseId(uri);
            StringBuilder sb = new StringBuilder(50);
            sb.append("mimetype=? AND raw_contact_id=");
            sb.append(parseId);
            try {
                Cursor query = acquireContentProviderClient.query(ContactsContract.Data.CONTENT_URI, a, sb.toString(), b, (String) null);
                while (!Thread.currentThread().isInterrupted() && query.moveToNext()) {
                    try {
                        long j = query.getLong(0);
                        String[] a2 = xwz.a(query.getString(2));
                        long j2 = query.getLong(3);
                        String string = query.getString(4);
                        long j3 = query.getLong(5);
                        String valueOf = String.valueOf(a(a2));
                        if (valueOf.length() == 0) {
                            new String(" EDIT_URI = ");
                        } else {
                            " EDIT_URI = ".concat(valueOf);
                        }
                        if (!TextUtils.isEmpty(a2[1]) && !"Sync_High_Res".equals(a2[2]) && string == null) {
                            a2[2] = "Sync_High_Res";
                            ArrayList arrayList = new ArrayList();
                            ContentProviderOperation.Builder withValue = ContentProviderOperation.newUpdate(ContentUris.withAppendedId(ContactsContract.Data.CONTENT_URI, j).buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build()).withValue("data_sync1", a(a2)).withValue("data_sync3", (Object) null).withValue("data_sync4", Long.valueOf(j3 + 1));
                            StringBuilder sb2 = new StringBuilder(33);
                            sb2.append("data_version=");
                            sb2.append(j2);
                            arrayList.add(withValue.withSelection(sb2.toString(), (String[]) null).build());
                            acquireContentProviderClient.applyBatch(arrayList);
                            ContentResolver.requestSync((Account) null, "com.android.contacts", new Bundle());
                        }
                    } catch (OperationApplicationException e) {
                        throw new nja(13, "error writing photo data into provider");
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
            } catch (RemoteException e2) {
            } catch (Throwable th2) {
                acquireContentProviderClient.release();
                throw th2;
            }
            acquireContentProviderClient.release();
            return;
        }
        Log.e("SyncHighResPhoto", "High res sync request with no content provider client.");
    }
}
