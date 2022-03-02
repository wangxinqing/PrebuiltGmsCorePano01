package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: agxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agxg {
    private final Map a;
    private final agvw b;

    public agxg(agvw agvw, Map map) {
        this.a = new ConcurrentHashMap(map);
        this.b = agvw;
    }

    public final Object a(String str, Object obj, agvv agvv) {
        agvx agvx = (agvx) this.a.get(str);
        if (agvx == null) {
            agvx = agvx.a(this.b, str, obj, agvv);
            this.a.put(str, agvx);
        }
        return agvx.c();
    }
}
