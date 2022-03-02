package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cnb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cnb {
    private final cna a;
    private final cmy b;
    private final Map c = new HashMap();

    public cnb(Context context, cmy cmy) {
        cna cna = new cna(context);
        this.a = cna;
        this.b = cmy;
    }

    public final synchronized cnd a(String str) {
        if (this.c.containsKey(str)) {
            return (cnd) this.c.get(str);
        }
        cmt a2 = this.a.a(str);
        if (a2 == null) {
            return null;
        }
        cmy cmy = this.b;
        cnd a3 = a2.a(new cms(cmy.a, cmy.b, cmy.c, str));
        this.c.put(str, a3);
        return a3;
    }
}
