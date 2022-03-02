package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: alxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class alxd {
    protected final String a = a("id").b();
    protected final String b = a("type").b();
    protected final Map c;
    private final amic d;

    public alxd(amic amic) {
        this.d = amic;
        this.c = amic.d().a();
    }

    public final amic a(String str) {
        if (this.c.containsKey(str)) {
            return (amic) this.c.get(str);
        }
        throw new alrz(str, alsc.a(this.d));
    }

    public abstract List a();
}
