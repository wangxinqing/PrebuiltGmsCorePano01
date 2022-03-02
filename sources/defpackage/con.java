package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.List;

/* renamed from: con  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class con implements cpb {
    private final List a;
    private final cmm b;

    public con(List list, cmm cmm) {
        this.a = list;
        this.b = cmm;
    }

    public final Object a(Object obj) {
        clo clo;
        List list = this.a;
        cmm cmm = this.b;
        Cursor cursor = (Cursor) obj;
        clo clo2 = cpe.a;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            cmh cmh = new cmh();
            cmh.b = new HashMap();
            cmh.a(cursor.getString(1));
            cmh.a(cursor.getLong(2));
            cmh.b(cursor.getLong(3));
            String string = cursor.getString(4);
            if (string != null) {
                clo = clo.a(string);
            } else {
                clo = cpe.a;
            }
            cmh.a(new cmg(clo, cursor.getBlob(5)));
            if (!cursor.isNull(6)) {
                cmh.a = Integer.valueOf(cursor.getInt(6));
            }
            list.add(cok.a(j, cmm, cmh.a()));
        }
        return null;
    }
}
