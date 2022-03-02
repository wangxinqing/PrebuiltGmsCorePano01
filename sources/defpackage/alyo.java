package defpackage;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: alyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alyo {
    public static final alyo a = new alyo(false);
    public static final alyo b = new alyo(true);
    private static final Map c = new EnumMap(amiv.class);
    private final alyg d = new alyf(this);

    private alyo(boolean z) {
        amiv amiv = amiv.INSERT;
        a(amiv, amiv, new alxx());
        amiv amiv2 = amiv.DELETE;
        a(amiv2, amiv2, new alxl());
        amiv amiv3 = amiv.UPDATE;
        a(amiv3, amiv3, new alyp());
        amiv amiv4 = amiv.SET;
        a(amiv4, amiv4, new alyh());
        amiv amiv5 = amiv.INDEX;
        a(amiv5, amiv5, new alxv());
        a(amiv.DELETE, amiv.SET, new alxo());
        a(amiv.INSERT, amiv.SET, new alxy());
        a(amiv.DELETE, amiv.INSERT, new alxn());
        a(amiv.INSERT, amiv.INDEX, new alxw());
        a(amiv.DELETE, amiv.INDEX, new alxm());
        a(amiv.MOVE, amiv.DELETE, new alxz());
        a(amiv.MOVE, amiv.INDEX, new alya());
        a(amiv.MOVE, amiv.INSERT, new alyb());
        a(amiv.MOVE, amiv.MOVE, new alyc(z));
        a(amiv.MOVE, amiv.SET, new alyd());
        a(amiv.DESTROY_OBJECT, amiv.CREATE, new alxp());
        a(amiv.DESTROY_OBJECT, amiv.DELETE, new alxp());
        a(amiv.DESTROY_OBJECT, amiv.DESTROY_OBJECT, new alxp());
        a(amiv.DESTROY_OBJECT, amiv.INDEX, new alxq());
        a(amiv.DESTROY_OBJECT, amiv.INSERT, new alxr());
        a(amiv.DESTROY_OBJECT, amiv.MOVE, new alxs());
        a(amiv.DESTROY_OBJECT, amiv.SET, new alxt());
        a(amiv.DESTROY_OBJECT, amiv.UPDATE, new alxu());
    }

    private final alyg a(amiv amiv, amiv amiv2) {
        if (amiv == amiv.COMPOUND || amiv2 == amiv.COMPOUND) {
            return this.d;
        }
        Map map = (Map) c.get(amiv);
        if (map != null) {
            return (alyg) map.get(amiv2);
        }
        return null;
    }

    private static final void a(amiv amiv, amiv amiv2, alyg alyg) {
        Map map = (Map) c.get(amiv);
        if (map == null) {
            map = new EnumMap(amiv.class);
            c.put(amiv, map);
        }
        map.put(amiv2, alyg);
    }

    public final amiw a(List list, amiw amiw) {
        alyk alyk = new alyk(list);
        alyn alyn = new alyn(amiw);
        while (alyk.a != null) {
            a((alym) alyk, (alym) alyn);
            alyk.d();
        }
        return alyn.a;
    }

    public final void a(alyl alyl, alym alym) {
        while (alyl.b() != null) {
            a((alym) alyl, alym);
            alyl.d();
        }
    }

    public final void a(alym alym, alym alym2) {
        amiv f = alym.f();
        amiv f2 = alym2.f();
        alyg a2 = a(f, f2);
        if (a2 != null) {
            a2.a(alym, alym2);
            return;
        }
        alyg a3 = a(f2, f);
        if (a3 != null) {
            a3.a(alym2, alym);
        }
    }
}
