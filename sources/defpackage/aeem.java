package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aeem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeem {
    /* JADX INFO: finally extract failed */
    public static void a(ContentResolver contentResolver, Account account, String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(r0);
        for (String add : strArr) {
            arrayList.add(add);
        }
        HashMap hashMap = new HashMap();
        Cursor query = contentResolver.query(aeel.a, new String[]{"_id", "feed"}, "_sync_account=? AND _sync_account_type=? AND authority=?", new String[]{account.name, account.type, str}, (String) null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    long j = query.getLong(0);
                    String string = query.getString(1);
                    if (hashMap.containsKey(string)) {
                        contentResolver.delete(aeel.a, "_id=?", new String[]{Long.toString(j)});
                    } else {
                        hashMap.put(string, Long.valueOf(j));
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                String str3 = (String) arrayList.get(i);
                if (!hashMap.containsKey(str3)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_sync_account", account.name);
                    contentValues.put("_sync_account_type", account.type);
                    contentValues.put("feed", str3);
                    contentValues.put("service", str2);
                    contentValues.put("authority", str);
                    try {
                        contentResolver.insert(aeel.a, contentValues);
                    } catch (IllegalArgumentException e) {
                        return;
                    }
                } else {
                    hashMap.remove(str3);
                }
            }
            for (Map.Entry value : hashMap.entrySet()) {
                try {
                    contentResolver.delete(ContentUris.withAppendedId(aeel.a, ((Long) value.getValue()).longValue()), (String) null, (String[]) null);
                } catch (IllegalArgumentException e2) {
                    return;
                }
            }
        }
    }
}
