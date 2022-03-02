package defpackage;

import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aguw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aguw implements agvb {
    private final aguy a;

    public aguw(aguy aguy) {
        this.a = aguy;
    }

    /* JADX INFO: finally extract failed */
    public final Object a() {
        Map map;
        aguy aguy = this.a;
        Cursor query = aguy.a.query(aguy.b, aguy.c, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                Map emptyMap = Collections.emptyMap();
                query.close();
                return emptyMap;
            }
            if (count > 256) {
                map = new HashMap(count, 1.0f);
            } else {
                map = new nz(count);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
