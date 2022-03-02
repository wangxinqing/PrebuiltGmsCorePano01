package defpackage;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: alvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alvo extends alvf {
    private static final List a = new alyu(new amih[]{aluv.a, aluv.b, aluv.c, null, aluv.d});
    private final Map b;

    public alvo() {
        super(7);
        EnumMap enumMap = new EnumMap(amig.class);
        this.b = enumMap;
        enumMap.put(amig.MAP, 0);
        this.b.put(amig.LIST, 1);
        this.b.put(amig.STRING, 2);
        this.b.put(amig.INDEX_REFERENCE, 4);
    }

    public final /* bridge */ /* synthetic */ Object a(alze alze) {
        String g = alze.g();
        amic amic = (amic) alze.a((alzf) alsd.a);
        if (amic.b == amib.STRING_VALUE) {
            return aluv.a(g, amic.b());
        }
        return aluv.a(g, (amih) a.get((int) amic.a()));
    }

    public final void a(alzd alzd, amiw amiw) {
        amih a2 = amiw.a();
        a(alzd);
        alzd.b(amiw.c);
        amig amig = a2.b;
        if (amig == amig.CUSTOM) {
            alzd.b(a2.a().b);
        } else {
            Integer num = (Integer) this.b.get(amig);
            if (num != null) {
                alzd.a(num.intValue());
            } else {
                throw new IllegalArgumentException();
            }
        }
        alzd.b();
    }
}
