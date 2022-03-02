package defpackage;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SyncResult;
import android.database.Cursor;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: ldy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ldy extends jeu {
    private static final ith a = new ith("DriveSyncAdapter", "");
    private static final String[] b = {"_id", "feed"};
    private static final Set c = Collections.singleton("sync");

    public ldy(Context context) {
        super(context, "drive");
    }

    public static void a(Account account, Context context) {
        new ild(context);
        ContentResolver.setIsSyncable(account, "com.google.android.gms.drive.sync", 1);
        ild.a(account, "com.google.android.gms.drive.sync");
        ild.a(account, "com.google.android.gms.drive.sync", Bundle.EMPTY);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 2817;
    }

    public static void a(Context context, Account account, boolean z) {
        Cursor query;
        try {
            String str = account.name;
            ContentResolver contentResolver = context.getContentResolver();
            HashMap hashMap = new HashMap();
            query = contentResolver.query(acuo.a, b, "_sync_account=? AND authority=?", new String[]{str, "com.google.android.gms.drive.sync"}, (String) null);
            if (query != null) {
                while (query.moveToNext()) {
                    hashMap.put(query.getString(1), Long.valueOf(query.getLong(0)));
                }
                query.close();
            }
            if (z) {
                for (String str2 : c) {
                    if (hashMap.containsKey(str2)) {
                        hashMap.remove(str2);
                        a.a("Account %s already subscribed to feed %s", str, str2);
                    } else {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("feed", str2);
                        contentValues.put("_sync_account", account.name);
                        contentValues.put("_sync_account_type", account.type);
                        contentValues.put("authority", "com.google.android.gms.drive.sync");
                        contentValues.put("service", "cosmo");
                        contentResolver.insert(acuo.a, contentValues);
                        a.a("Subscribed account %s to feed %s", str, str2);
                    }
                }
            }
            for (Map.Entry value : hashMap.entrySet()) {
                contentResolver.delete(ContentUris.withAppendedId(acuo.a, ((Long) value.getValue()).longValue()), (String) null, (String[]) null);
            }
        } catch (Exception e) {
            a.c("DriveSyncAdapter", "Error updating feeds", e);
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        boolean d;
        try {
            jzk.b(getContext().getApplicationContext());
            boolean z = false;
            if (ldn.a()) {
                ldj a2 = ldn.c().a(account.name);
                a2.c.incrementAndGet();
                synchronized (a2) {
                    if (a2.d != null) {
                        z = true;
                    }
                    iva.a(z, (Object) "Not initialized yet");
                    if (!a2.f) {
                        a2.e = true;
                    } else {
                        a2.g = true;
                    }
                    d = a2.d();
                }
                if (d) {
                    a2.b();
                    return;
                }
                return;
            }
            a(getContext(), account, false);
        } catch (InterruptedException e) {
            a.b("DriveSyncAdapter", "Interrupted while awaiting for initialization!");
        }
    }
}
