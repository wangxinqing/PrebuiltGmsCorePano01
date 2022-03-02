package defpackage;

import java.util.Map;

/* renamed from: agxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agxa {
    public volatile Map a;
    private final Object b = new Object();
    private amsv c;

    public agxa(amsv amsv) {
        amrl.a((Object) amsv);
        this.c = amsv;
    }

    public final Object a(String str) {
        Object obj;
        Map map = this.a;
        if (map != null) {
            return map.get(str);
        }
        synchronized (this.b) {
            Map map2 = this.a;
            if (map2 == null) {
                map2 = (Map) this.c.a();
                amrl.a((Object) map2);
                this.a = map2;
                this.c = null;
            }
            obj = map2.get(str);
        }
        return obj;
    }

    public final boolean a(Map map) {
        amrl.a((Object) map);
        synchronized (this.b) {
            if (this.a != null) {
                boolean equals = this.a.equals(map);
                return equals;
            }
            this.a = map;
            this.c = null;
            return true;
        }
    }
}
