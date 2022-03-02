package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: aluv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aluv {
    public static final amih a;
    public static final amih b;
    public static final amih c;
    public static final amih d;
    private static final amiv e = amiw.a.b;

    static {
        amif b2 = amih.b();
        amjb amjb = amjb.a;
        b2.a = amig.MAP;
        b2.b = amjb;
        a = b2.a();
        amif b3 = amih.b();
        amja amja = amja.a;
        b3.a = amig.LIST;
        b3.b = amja;
        b = b3.a();
        amif b4 = amih.b();
        amjc amjc = amjc.a;
        b4.a = amig.STRING;
        b4.b = amjc;
        c = b4.a();
        amif b5 = amih.b();
        amiz amiz = amiz.a;
        b5.a = amig.INDEX_REFERENCE;
        b5.b = amiz;
        d = b5.a();
    }

    public static int a(amir amir) {
        if (amir.b().isEmpty()) {
            return amir.d.length();
        }
        return amir.a();
    }

    public static amiw b(String str) {
        amil amil = amil.a;
        amiu i = amiw.i();
        i.b = str;
        i.a = amiv.DESTROY_OBJECT;
        i.c = amil;
        return i.a();
    }

    public static boolean b(amiw amiw) {
        return amiw.b == e;
    }

    public static amiw c(String str) {
        return a(str, "", -1, amii.SHIFT_AFTER_DELETE);
    }

    public static int a(amiw amiw) {
        amit f = amiw.f();
        String str = amiw.c;
        int i = f.b;
        String str2 = f.d;
        int i2 = f.c;
        return (i2 <= i || !str.equals(str2)) ? i2 : i2 - 1;
    }

    public static amiw b(String str, int i, Iterable iterable) {
        amjk c2 = amjl.c();
        c2.a = i;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c2.b.add((amjf) it.next());
        }
        return a(str, c2.a());
    }

    public static amih a(String str) {
        if ("List".equals(str)) {
            return b;
        }
        if ("Map".equals(str)) {
            return a;
        }
        if ("EditableString".equals(str)) {
            return c;
        }
        if ("IndexReference".equals(str)) {
            return d;
        }
        amif b2 = amih.b();
        amix a2 = amiy.a();
        a2.c = str;
        amiy amiy = new amiy(a2);
        a2.a = "";
        a2.b = new HashMap();
        a2.c = "";
        b2.a = amig.CUSTOM;
        b2.b = amiy;
        return b2.a();
    }

    public static final amiw a() {
        return amiw.a;
    }

    public static amiw a(amid amid) {
        if (amid.b.isEmpty() && !amid.c) {
            if (amid.a() == 0) {
                return amiw.a;
            }
            if (amid.a() == 1) {
                return (amiw) amid.a.get(0);
            }
        }
        return a(amid.b());
    }

    public static final amiw a(amie amie) {
        amiu i = amiw.i();
        i.a = amiv.COMPOUND;
        i.c = amie;
        return i.a();
    }

    public static amiw a(String str, int i, int i2) {
        amij b2 = amik.b();
        b2.a = i;
        b2.b = i2;
        return a(str, b2.a());
    }

    public static amiw a(String str, int i, Iterable iterable) {
        amiq d2 = amir.d();
        d2.a = i;
        d2.a(iterable);
        return a(str, d2.a());
    }

    public static amiw a(String str, int i, String str2) {
        amiq d2 = amir.d();
        d2.a = i;
        d2.c = str2;
        return a(str, d2.a());
    }

    public static amiw a(String str, int i, String str2, int i2) {
        amis a2 = amit.a();
        a2.a = i;
        a2.c = str2;
        a2.b = i2;
        amit amit = new amit(a2);
        a2.a = 0;
        a2.b = 0;
        a2.c = "";
        amiu i3 = amiw.i();
        i3.b = str;
        i3.a = amiv.MOVE;
        i3.c = amit;
        return i3.a();
    }

    public static final amiw a(String str, amih amih) {
        amiu i = amiw.i();
        i.b = str;
        i.a = amiv.CREATE;
        i.c = amih;
        return i.a();
    }

    public static final amiw a(String str, amik amik) {
        amiu i = amiw.i();
        i.b = str;
        i.a = amiv.DELETE;
        i.c = amik;
        return i.a();
    }

    public static final amiw a(String str, amip amip) {
        amiu i = amiw.i();
        i.b = str;
        i.a = amiv.INDEX;
        i.c = amip;
        return i.a();
    }

    public static final amiw a(String str, amir amir) {
        amiu i = amiw.i();
        i.b = str;
        i.a = amiv.INSERT;
        i.c = amir;
        return i.a();
    }

    public static final amiw a(String str, amjl amjl) {
        amiu i = amiw.i();
        i.b = str;
        i.a = amiv.SET;
        i.c = amjl;
        return i.a();
    }

    public static amiw a(String str, String str2) {
        return a(str, a(str2));
    }

    public static amiw a(String str, String str2, int i, amii amii) {
        amio b2 = amip.b();
        b2.a = str2;
        b2.b = i;
        b2.c = amii;
        return a(str, b2.a());
    }

    public static final amiw a(String str, String str2, amjf amjf) {
        amjm a2 = amjn.a();
        a2.a = str2;
        a2.b = amjf;
        amjn amjn = new amjn(a2);
        a2.a = "";
        a2.b = amjf.a;
        amiu i = amiw.i();
        i.b = str;
        i.a = amiv.UPDATE;
        i.c = amjn;
        return i.a();
    }

    public static amiw a(List list) {
        if (list.isEmpty()) {
            return amiw.a;
        }
        if (list.size() == 1) {
            return (amiw) list.get(0);
        }
        amid b2 = amie.b();
        b2.a((Iterable) list);
        return a(b2);
    }

    public static String a(amih amih) {
        amig amig = amig.KIND_NOT_SET;
        int ordinal = amih.b.ordinal();
        if (ordinal == 1) {
            return "Map";
        }
        if (ordinal == 2) {
            return "List";
        }
        if (ordinal == 3) {
            return "EditableString";
        }
        if (ordinal == 4) {
            return "IndexReference";
        }
        if (ordinal == 5) {
            return amih.a().b;
        }
        throw new alti(a("", amih));
    }

    public static void a(List list, String str) {
        int i = 0;
        while (i < list.size()) {
            if (aluw.a(str, (amjf) list.get(i))) {
                list.remove(i);
                i--;
            }
            i++;
        }
    }
}
