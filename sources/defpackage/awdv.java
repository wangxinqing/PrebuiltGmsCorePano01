package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: awdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awdv extends awdp {
    static {
        awdu.a(Collections.emptyMap());
    }

    public awdv(Map map) {
        super(map);
    }

    public static awdo a(int i) {
        return new awdo(i);
    }

    /* renamed from: b */
    public final Map a() {
        LinkedHashMap b = awdq.b(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            b.put(entry.getKey(), ((bapu) entry.getValue()).a());
        }
        return Collections.unmodifiableMap(b);
    }
}
