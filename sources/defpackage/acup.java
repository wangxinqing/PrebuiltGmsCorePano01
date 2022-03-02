package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.util.Log;
import java.util.Arrays;
import java.util.List;

/* renamed from: acup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acup {
    /* JADX INFO: finally extract failed */
    public static boolean a(ContentResolver contentResolver, Account account, String str, String str2, String... strArr) {
        List<String> asList = Arrays.asList(strArr);
        nz nzVar = new nz();
        Cursor query = contentResolver.query(acuo.a, new String[]{"_id", "feed"}, "_sync_account=? AND _sync_account_type=? AND authority=?", new String[]{account.name, account.type, str}, (String) null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    long j = query.getLong(0);
                    String string = query.getString(1);
                    if (nzVar.containsKey(string)) {
                        contentResolver.delete(acuo.a, "_id=?", new String[]{Long.toString(j)});
                    } else {
                        nzVar.put(string, Long.valueOf(j));
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            for (String str3 : asList) {
                if (!nzVar.containsKey(str3)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_sync_account", account.name);
                    contentValues.put("_sync_account_type", account.type);
                    contentValues.put("feed", str3);
                    contentValues.put("service", str2);
                    contentValues.put("authority", str);
                    try {
                        contentResolver.insert(acuo.a, contentValues);
                    } catch (IllegalArgumentException e) {
                        Log.e("GmsSubscribedFeeds", "Could not insert entries in the provider.");
                        return false;
                    }
                } else {
                    nzVar.remove(str3);
                }
            }
            for (Long longValue : nzVar.values()) {
                try {
                    contentResolver.delete(ContentUris.withAppendedId(acuo.a, longValue.longValue()), (String) null, (String[]) null);
                } catch (IllegalArgumentException e2) {
                    Log.e("GmsSubscribedFeeds", "Could not delete entries in the provider.");
                    return false;
                }
            }
            return true;
        }
        Log.e("GmsSubscribedFeeds", "Could not query the provider.");
        return false;
    }
}
