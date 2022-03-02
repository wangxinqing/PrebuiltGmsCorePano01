package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: wwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wwx {
    public static Set a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            Cursor query = context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.CommonDataKinds.Email.CONTENT_LOOKUP_URI, Uri.encode(str)), wws.a, (String) null, (String[]) null, (String) null);
            if (query != null) {
                try {
                    HashSet hashSet = new HashSet();
                    while (query.moveToNext()) {
                        hashSet.add(query.getString(0));
                    }
                    return hashSet;
                } finally {
                    query.close();
                }
            } else {
                Log.w("ContactsDataLoader", "null retrieveContactsFromEmailId cursor");
                return Collections.emptySet();
            }
        } else {
            Log.w("ContactsDataLoader", "empty email address");
            return Collections.emptySet();
        }
    }

    public static Set b(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            Cursor query = context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), www.a, (String) null, (String[]) null, (String) null);
            if (query != null) {
                try {
                    HashSet hashSet = new HashSet();
                    while (query.moveToNext()) {
                        hashSet.add(query.getString(0));
                    }
                    return hashSet;
                } finally {
                    query.close();
                }
            } else {
                Log.w("ContactsDataLoader", "null retrieveContactsFromPhoneNumberId cursor");
                return Collections.emptySet();
            }
        } else {
            Log.w("ContactsDataLoader", "empty phone number");
            return Collections.emptySet();
        }
    }

    public static Set a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            long b = wto.b(context, str, str2);
            return b >= 0 ? Collections.singleton(String.valueOf(b)) : Collections.emptySet();
        }
        Log.w("ContactsDataLoader", "empty focus ID");
        return Collections.emptySet();
    }
}
