package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: fcd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fcd {
    public Object a;
    public Runnable b;
    public of c;
    private final Map d = new HashMap();
    private hol e;
    private String f;
    private jhz g;

    public final fce a() {
        return new fce(this.a, this.d, this.b, this.c, this.e, this.f, this.g);
    }

    public final void a(hol hol, String str, jhz jhz) {
        this.e = hol;
        this.f = str;
        this.g = jhz;
    }

    public final void a(Object obj, ow owVar) {
        this.d.put(obj, owVar);
    }
}
