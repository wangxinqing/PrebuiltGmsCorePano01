package defpackage;

import android.content.ContentValues;
import java.util.Map;

/* renamed from: xqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xqd {
    public static void a(Object[] objArr, Map map, String str, Object obj) {
        if (obj != null && map.containsKey(str)) {
            objArr[((Integer) map.get(str)).intValue()] = obj;
        }
    }

    public static Object[] a(Map map, ContentValues contentValues, long j) {
        if (contentValues == null) {
            return null;
        }
        Object[] objArr = new Object[map.size()];
        Long valueOf = Long.valueOf(j);
        a(objArr, map, "contact_id", valueOf);
        a(objArr, map, "raw_contact_id", valueOf);
        for (Map.Entry next : contentValues.valueSet()) {
            a(objArr, map, (String) next.getKey(), next.getValue());
        }
        return objArr;
    }
}
