package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lkc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lkc {
    public static final List a(SQLiteDatabase sQLiteDatabase, int i) {
        kqh kqh;
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            llr llr = llr.d;
            cursor = sQLiteDatabase.query(llr.b(), llr.e, (String) null, (String[]) null, (String) null, (String) null, String.valueOf(llr.a.a()).concat(" DESC"));
            kqh = llq.MUTATION.c;
        } else if (i == 1) {
            kqh = lln.MUTATION.c;
            llo llo = llo.d;
            cursor = sQLiteDatabase.query(llo.b(), llo.e, (String) null, (String[]) null, (String) null, (String) null, String.valueOf(llo.a.a()).concat(" DESC"));
        } else {
            kqh = lli.MUTATION.b;
            llj llj = llj.d;
            cursor = sQLiteDatabase.query(llj.b(), llj.e, (String) null, (String[]) null, (String) null, (String) null, String.valueOf(llj.a.a()).concat(" DESC"));
        }
        while (cursor.moveToNext()) {
            try {
                arrayList.add((amiw) lkg.a(kqh.a(cursor)));
            } finally {
                cursor.close();
            }
        }
        return arrayList;
    }
}
