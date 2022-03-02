package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: pbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pbo extends pbm {
    private final Map c;

    public pbo(String str, Map map) {
        super(str);
        this.c = map;
    }

    public static ouz b(String str) {
        aucd o = ouz.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ouz ouz = (ouz) o.b;
        str.getClass();
        ouz.a |= 1;
        ouz.b = str;
        return (ouz) o.i();
    }

    public static boolean b(char c2) {
        if (c2 < 'a' || c2 > 'z') {
            return (c2 >= 'A' && c2 <= 'Z') || c2 == '_';
        }
        return true;
    }

    public static boolean c(char c2) {
        return b(c2) || pbm.a(c2);
    }

    public final int a(Pair pair) {
        if (pair.second == null) {
            a("length must specify a value", ((pbl) pair.first).a);
        }
        if (!(((pbl) pair.second).b instanceof Integer)) {
            a("Expected an integer", ((pbl) pair.second).a);
        }
        int intValue = ((Integer) ((pbl) pair.second).b).intValue();
        if (intValue <= 0) {
            a("length must be greater than zero", ((pbl) pair.second).a);
        }
        return intValue;
    }

    public final pbl g() {
        if (a()) {
            a("Expected a name or $");
        }
        b();
        if (e() == '$') {
            d();
        }
        if (a() || !b(e())) {
            a("Expected a name", this.b);
        }
        d();
        while (!a() && c(e())) {
            d();
        }
        pbl c2 = c();
        return new pbl(c2.a, new pbn((String) c2.b));
    }

    public final pbl h() {
        f();
        if (a()) {
            a("Expected a value");
        }
        char e = e();
        int i = 0;
        if (pbm.a(e) || e == '-') {
            f();
            b();
            if (!a() && e() == '-') {
                d();
            }
            while (!a() && pbm.a(e())) {
                d();
                i++;
            }
            if (i == 0) {
                a("Expected an integer", this.b);
            }
            return new pbl(this.b, Integer.valueOf((String) c().b));
        } else if (b(e) || e == '$') {
            return g();
        } else {
            if (e == '\"') {
                d();
                int i2 = this.a;
                StringBuilder sb = new StringBuilder();
                b();
                while (!a() && e() != '\"') {
                    if (e() == '\\') {
                        sb.append((String) c().b);
                        d();
                        if (a()) {
                            a("Expected an escape sequence");
                        }
                        char e2 = e();
                        if (!(e2 == '\"' || e2 == '\\')) {
                            a("Expected \" or \\");
                        }
                        b();
                    }
                    d();
                }
                if (a()) {
                    a("Expected string literal end");
                }
                sb.append((String) c().b);
                d();
                return new pbl(i2, sb.toString());
            } else if (e == '(') {
                int i3 = this.a;
                ArrayList arrayList = new ArrayList();
                do {
                    boolean z = true;
                    if (a() || !(e() == '(' || e() == ',')) {
                        z = false;
                    }
                    iva.a(z);
                    d();
                    f();
                    if (a() || e() == ')') {
                        break;
                    }
                    arrayList.add(h());
                    f();
                    if (a()) {
                        break;
                    }
                } while (e() != ',');
                if (a() || e() != ')') {
                    a("Expected )");
                }
                d();
                return new pbl(i3, arrayList);
            } else {
                a("Expected a value");
                return null;
            }
        }
    }

    public final int a(pbl pbl) {
        String str = ((pbn) pbl.b).a;
        if (!this.c.containsKey(str)) {
            a("Corpus doesn't have section with such name.", pbl.a);
        }
        return ((Integer) this.c.get(str)).intValue();
    }

    public final boolean b(pbl pbl) {
        if (pbl == null) {
            return true;
        }
        Object obj = pbl.b;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            if (intValue == 0) {
                return false;
            }
            if (intValue == 1) {
                return true;
            }
            a("Expected a boolean", pbl.a);
            return false;
        } else if (obj instanceof pbn) {
            String str = ((pbn) obj).a;
            if ("true".equals(str)) {
                return true;
            }
            if (!"false".equals(str)) {
                a("Expected a boolean", pbl.a);
            }
            return false;
        } else {
            a("Expected a boolean", pbl.a);
            return false;
        }
    }
}
