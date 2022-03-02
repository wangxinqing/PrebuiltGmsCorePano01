package defpackage;

import android.database.Cursor;
import java.util.Collection;

/* renamed from: zto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class zto {
    protected static final int a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getInt(columnIndex);
        }
        ztx.a.d("Requested column %s didn't exist in the cursor.", str);
        return 0;
    }

    protected static final String b(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getString(columnIndex);
        }
        ztx.a.d("Requested column %s didn't exist in the cursor.", str);
        return "";
    }

    public abstract void a(Collection collection);

    public abstract void a(zuv zuv, Cursor cursor);
}
