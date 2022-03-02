package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: adnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adnw extends IOException {
    public final anaf a;

    public adnw(String str) {
        this((Map) anfu.b, str);
    }

    public adnw(String str, Throwable th) {
        super(str, th);
        this.a = anfu.b;
    }

    public adnw(Map map, String str) {
        super(str);
        anab h = anaf.h();
        for (Map.Entry entry : map.entrySet()) {
            if (!((List) entry.getValue()).isEmpty()) {
                h.a(jlh.a((String) entry.getKey()), jlh.a((String) ((List) entry.getValue()).get(0)));
            }
        }
        this.a = h.a();
    }
}
