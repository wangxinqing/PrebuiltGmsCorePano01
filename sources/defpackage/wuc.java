package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;

/* renamed from: wuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wuc {
    private final ContentValues a = new ContentValues();

    private final ContentValues a() {
        this.a.clear();
        return this.a;
    }

    private final void a(wtx wtx, long j, long j2, String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            ContentValues a2 = a();
            a2.put("owner_id", Long.valueOf(j));
            a2.put("item_id", Long.valueOf(j2));
            a(wtx, a2, str, i);
        }
    }

    static final void a(wtx wtx, ContentValues contentValues, String str, int i) {
        contentValues.put("is_normalized", 1);
        contentValues.put("kind", Integer.valueOf(i));
        for (String str2 : wue.a(str)) {
            contentValues.put("value", wue.c(str2));
            wtx.a("ac_index", contentValues);
            if (wue.c.matcher(str2).find()) {
                String[] b = wue.b(str2);
                for (int i2 = 1; i2 < b.length; i2++) {
                    contentValues.put("value", wub.a(b[i2]));
                    wtx.a("ac_index", contentValues);
                }
            }
        }
    }

    public final void a(wtx wtx, long j) {
        wtx wtx2 = wtx;
        wtx.e();
        Cursor a2 = wtx2.a("SELECT p.owner_id,i._id,i.item_type,i.value,i.value2,c.nickname,c.given_name,c.family_name,c.middle_name,c.honorific_prefix,c.honorific_suffix,c.yomi_given_name,c.yomi_family_name,c.yomi_honorific_prefix,c.yomi_honorific_suffix FROM ac_people AS p JOIN ac_container AS c ON p._id=c.people_id JOIN ac_item AS i ON c._id=i.container_id WHERE (p._id = ?1)", new String[]{String.valueOf(j)});
        try {
            int columnCount = a2.getColumnCount() - 1;
            while (a2.moveToNext()) {
                long j2 = (long) a2.getInt(0);
                int i = a2.getInt(1);
                int i2 = a2.getInt(2);
                if (i2 == 0) {
                    long j3 = (long) i;
                    long j4 = j3;
                    a(wtx, j2, j3, a2.getString(5), 40);
                    int i3 = 6;
                    while (i3 <= columnCount) {
                        int i4 = i3;
                        a(wtx, j2, j4, a2.getString(i3), 20);
                        i3 = i4 + 1;
                    }
                } else if (i2 == 1) {
                    long j5 = (long) i;
                    String string = a2.getString(3);
                    if (!TextUtils.isEmpty(string)) {
                        ContentValues a3 = a();
                        a3.put("owner_id", Long.valueOf(j2));
                        a3.put("item_id", Long.valueOf(j5));
                        a3.put("is_normalized", 0);
                        a3.put("kind", 0);
                        a3.put("value", string);
                        wtx2.a("ac_index", a3);
                        xip.a();
                        if (Boolean.valueOf(aywy.a.a().aC()).booleanValue()) {
                            int indexOf = string.indexOf("@");
                            if (indexOf != -1) {
                                string = string.substring(0, indexOf);
                            }
                            a(wtx2, a3, string, 1);
                        } else {
                            a(wtx2, a3, string, 1);
                        }
                    }
                }
            }
        } finally {
            a2.close();
        }
    }
}
