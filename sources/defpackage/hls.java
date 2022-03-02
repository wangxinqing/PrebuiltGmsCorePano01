package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: hls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hls {
    public static final String a = ("account=?");
    public static final String b = ("account=? AND type=?");
    public static final String c = ("is_dirty=1 AND account=? AND type=?");
    public static final String d = ("SELECT COUNT(*) FROM sync_entities WHERE " + c);
    public static final fzi e = new hlr();
    private static final String h = ("is_deleted_locally!=1 AND account=? AND type=?");
    public final pyr f;
    public final hle g;

    public hls(Context context) {
        this.f = new pyr(context);
        this.g = hle.a(context);
    }

    public static ContentValues a(pyv pyv, hln hln) {
        byte[] bArr;
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", pyv.d);
        contentValues.put("type", Integer.valueOf(hln.b));
        contentValues.put("id", hln.c);
        contentValues.put("value", hln.d.k());
        contentValues.put("is_dirty", Boolean.valueOf(hln.f));
        if (!hln.e.j()) {
            bArr = hln.e.k();
        } else {
            bArr = null;
        }
        contentValues.put("version", bArr);
        contentValues.put("is_deleted_locally", Boolean.valueOf(hln.g));
        return contentValues;
    }

    public final List b(pyv pyv, int i) {
        return a(pyv, i, h);
    }

    public static hln a(Cursor cursor) {
        auay auay;
        byte[] a2 = hll.a(cursor, "version");
        hlm hlm = new hlm();
        hlm.a(hll.c(cursor, "type"));
        hlm.a = hll.d(cursor, "id");
        hlm.b = auay.a(hll.a(cursor, "value"));
        hlm.d = hll.b(cursor, "is_dirty");
        if (a2 != null) {
            auay = auay.a(a2);
        } else {
            auay = auay.b;
        }
        hlm.c = auay;
        hlm.e = hll.b(cursor, "is_deleted_locally");
        return hlm.a();
    }

    public final List a(pyv pyv, int i) {
        return a(pyv, i, b);
    }

    public final List a(pyv pyv, int i, String str) {
        Cursor query = this.g.a().query("sync_entities", (String[]) null, str, new String[]{pyv.d, String.valueOf(i)}, (String) null, (String) null, (String) null);
        try {
            ArrayList arrayList = new ArrayList();
            query.moveToFirst();
            while (!query.isAfterLast()) {
                arrayList.add(a(query));
                query.moveToNext();
            }
            return arrayList;
        } finally {
            query.close();
        }
    }

    public final List a(pyv pyv, int i, List list) {
        SQLiteDatabase a2 = this.g.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(pyv.d);
        arrayList.add(String.valueOf(i));
        arrayList.addAll(list);
        Cursor query = a2.query("sync_entities", (String[]) null, String.format("%s=? AND %s=? AND %s IN (%s)", new Object[]{"account", "type", "id", amre.a(',').a((Iterable) Collections.nCopies(list.size(), "?"))}), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            ArrayList arrayList2 = new ArrayList();
            query.moveToFirst();
            while (!query.isAfterLast()) {
                arrayList2.add(a(query));
                query.moveToNext();
            }
            return arrayList2;
        } finally {
            query.close();
        }
    }

    public final void a(pyv pyv, List list) {
        SQLiteDatabase a2 = this.g.a();
        a2.beginTransaction();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hll.a(a2, "sync_entities", a(pyv, (hln) it.next()));
            }
            a2.setTransactionSuccessful();
        } finally {
            a2.endTransaction();
        }
    }

    public final void a(pyv pyv, hln... hlnArr) {
        a(pyv, (List) amzy.a((Object[]) hlnArr));
    }
}
