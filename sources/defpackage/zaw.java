package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.provider.PlusChimeraContentProvider;
import java.io.IOException;
import java.util.List;

/* renamed from: zaw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zaw implements zav {
    public static ConnectionResult a(Context context, ClientContext clientContext, boolean z, boolean z2) {
        yuf yuf = new yuf(context, clientContext);
        if (z) {
            yuf.b();
            yuf.a = 2;
        }
        if (z2) {
            yuf.a = 0;
        }
        return a(context, clientContext.e, 4, yuf.a());
    }

    public static ConnectionResult a(Context context, String str, int i, Intent intent) {
        PendingIntent pendingIntent;
        if (intent != null) {
            intent.putExtra("com.google.android.gms.plus.intent.extra.AUTHENTICATED_CALLING_PACKAGE", str);
            pendingIntent = PendingIntent.getActivity(context, 0, intent, 134217728);
        } else {
            pendingIntent = null;
        }
        return new ConnectionResult(i, pendingIntent);
    }

    public final ConnectionResult a(Context context, ClientContext clientContext, String[] strArr) {
        Account account;
        SQLiteDatabase writableDatabase;
        String str = clientContext.e;
        String b = clientContext.b();
        List d = jgu.d(context, str);
        int size = d.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                account = null;
                break;
            }
            account = (Account) d.get(i);
            if (b.equals(account.name)) {
                break;
            }
            i++;
        }
        if (account == null) {
            return new ConnectionResult(8, (PendingIntent) null);
        }
        try {
            Boolean bool = (Boolean) qub.a(context).a(account, strArr, (AccountManagerCallback) null).getResult();
            if (bool != null && !bool.booleanValue()) {
                ContentResolver contentResolver = context.getContentResolver();
                String b2 = clientContext.b();
                ContentProviderClient acquireContentProviderClient = contentResolver.acquireContentProviderClient("com.google.android.gms.plus");
                try {
                    PlusChimeraContentProvider plusChimeraContentProvider = (PlusChimeraContentProvider) ContentProvider.getLocalContentProvider(acquireContentProviderClient);
                    writableDatabase = plusChimeraContentProvider.b.getWritableDatabase();
                    writableDatabase.beginTransactionWithListener(plusChimeraContentProvider);
                    plusChimeraContentProvider.a(b2, writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    acquireContentProviderClient.release();
                } catch (Throwable th) {
                    acquireContentProviderClient.release();
                    throw th;
                }
            }
            if (bool != null) {
                if (bool.booleanValue()) {
                    return ConnectionResult.a;
                }
            }
            yuf yuf = new yuf(context, clientContext);
            yuf.a = 1;
            return a(context, clientContext.e, 4, yuf.a());
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            return new ConnectionResult(8, (PendingIntent) null);
        }
    }

    public final ConnectionResult a(Context context, String str, int i, String str2, String str3, String[] strArr) {
        Bundle bundle = new Bundle();
        bundle.putString(eig.b, str);
        bundle.putBoolean("suppressProgressScreen", true);
        if (strArr != null) {
            bundle.putString("request_visible_actions", TextUtils.join(" ", strArr));
        }
        bundle.putInt(eig.a, i);
        if (str2 != null) {
            try {
                eig.a(context, str3, str2, bundle);
            } catch (eif e) {
                zaj.a(context.getContentResolver(), str3, str);
                throw e;
            }
        }
        return ConnectionResult.a;
    }
}
