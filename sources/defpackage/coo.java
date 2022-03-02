package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: coo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class coo implements cpb {
    private final Map a;

    public coo(Map map) {
        this.a = map;
    }

    public final Object a(Object obj) {
        Map map = this.a;
        Cursor cursor = (Cursor) obj;
        clo clo = cpe.a;
        while (cursor.moveToNext()) {
            Long valueOf = Long.valueOf(cursor.getLong(0));
            Set set = (Set) map.get(valueOf);
            if (set == null) {
                set = new HashSet();
                map.put(valueOf, set);
            }
            set.add(new cpc(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }
}
