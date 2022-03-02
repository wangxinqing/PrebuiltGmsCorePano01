package defpackage;

import android.database.Cursor;
import android.util.Base64;
import java.util.ArrayList;

/* renamed from: cor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cor implements cpb {
    static final cpb a = new cor();

    private cor() {
    }

    public final Object a(Object obj) {
        byte[] bArr;
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            cml d = cmm.d();
            d.a(cursor.getString(1));
            d.a(cpu.a(cursor.getInt(2)));
            String string = cursor.getString(3);
            if (string != null) {
                bArr = Base64.decode(string, 0);
            } else {
                bArr = null;
            }
            d.a = bArr;
            arrayList.add(d.a());
        }
        return arrayList;
    }
}
