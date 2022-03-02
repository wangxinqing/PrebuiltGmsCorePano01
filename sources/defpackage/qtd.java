package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: qtd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qtd {
    public static Cursor a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2) {
        return sQLiteDatabase.query(str, strArr, str2, strArr2, (String) null, (String) null, (String) null, (String) null);
    }

    static Set a(SQLiteDatabase sQLiteDatabase, String str) {
        if (!axvz.k()) {
            return anfv.a;
        }
        Cursor a = a(sQLiteDatabase, "contact_annotation", new String[]{"contact_name"}, "phone_number=?", new String[]{str});
        if (a == null) {
            try {
                qoi.b("Got null cursor in getContactNames()");
                return anfv.a;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            HashSet hashSet = new HashSet();
            while (a.moveToNext()) {
                String a2 = jit.a(a, 0, "");
                if (!TextUtils.isEmpty(a2)) {
                    hashSet.add(a2);
                }
            }
            a.close();
            return hashSet;
        }
        throw th;
    }
}
