package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: atxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atxz {
    public static final amsk a = amsk.a('=').a().a(2);
    public static final amre b = amre.a("/");
    public static final amre c = amre.a("=");
    private static final amsk d = amsk.a('/');
    private static final amsk e = amsk.a('-');
    private static final amre f = amre.a("-");
    private static final amzy g;

    static {
        amsk.a(':');
        atxy atxy = new atxy("s", false);
        atxy atxy2 = new atxy("w", false);
        atxy atxy3 = new atxy("c", true);
        atxy atxy4 = new atxy("d", true);
        atxy atxy5 = new atxy("h", false);
        atxy atxy6 = new atxy("s", true);
        atxy atxy7 = new atxy("h", true);
        atxy atxy8 = new atxy("p", true);
        atxy atxy9 = new atxy("pp", true);
        atxy atxy10 = new atxy("pf", true);
        atxy atxy11 = atxy10;
        g = amzy.a(atxy, atxy2, atxy3, atxy4, atxy5, atxy6, atxy7, atxy8, atxy9, atxy11, new atxy("n", true), new atxy("r", false), new atxy("r", true), new atxy("o", true), new atxy("o", false), new atxy("j", false), new atxy("x", false), new atxy("y", false), new atxy("z", false), new atxy("g", true), new atxy("e", false), new atxy("f", false), new atxy("k", true), new atxy("u", true), new atxy("ut", true), new atxy("i", true), new atxy("a", true), new atxy("b", true), new atxy("b", false), new atxy("c", false), new atxy("t", false), new atxy("nt0", false), new atxy("v", true), new atxy("q", false), new atxy("fh", true), new atxy("fv", true), new atxy("fg", true), new atxy("ci", true), new atxy("rw", true), new atxy("rwu", true), new atxy("rwa", true), new atxy("nw", true), new atxy("rh", true), new atxy("no", true), new atxy("ns", true), new atxy("k", false), new atxy("p", false), new atxy("l", false), new atxy("v", false), new atxy("nu", true), new atxy("ft", true), new atxy("cc", true), new atxy("nd", true), new atxy("ip", true), new atxy("nc", true), new atxy("a", false), new atxy("rj", true), new atxy("rp", true), new atxy("rg", true), new atxy("pd", true), new atxy("pa", true), new atxy("m", false), new atxy("vb", false), new atxy("vl", false), new atxy("lf", true), new atxy("mv", true), new atxy("id", true), new atxy("al", true), new atxy("ic", false), new atxy("pg", true), new atxy("mo", true), new atxy("iv", false), new atxy("il", false), new atxy("ba", false));
    }

    public static String a(String str, String str2) {
        boolean z = true;
        amrl.a(str != null, (Object) "oldOptions is null");
        amrl.a(str2 != null, (Object) "newOptions is null");
        if (!str.isEmpty()) {
            List a2 = a(str);
            if (!a2.isEmpty()) {
                a2.addAll(a(str2));
                if (a2 == null) {
                    z = false;
                }
                amrl.a(z, (Object) "options is null");
                amxc p = amxc.p();
                ArrayList a3 = anda.a();
                int size = a2.size();
                for (int i = 0; i < size; i++) {
                    String str3 = (String) a2.get(i);
                    anhk i2 = g.listIterator();
                    atxy atxy = null;
                    while (true) {
                        if (!i2.hasNext()) {
                            break;
                        }
                        atxy atxy2 = (atxy) i2.next();
                        if (str3.toLowerCase().startsWith(atxy2.a)) {
                            if (!atxy2.b) {
                                atxy = atxy2;
                            } else if (str3.length() == atxy2.a.length()) {
                                atxy = atxy2;
                                break;
                            }
                        }
                    }
                    if (atxy == null) {
                        a3.add(str3);
                    } else {
                        p.a((Object) atxy, (Object) str3);
                    }
                }
                ArrayList a4 = anda.a();
                anhk i3 = g.listIterator();
                while (i3.hasNext()) {
                    String str4 = "";
                    for (String str5 : p.a((atxy) i3.next())) {
                        if (Character.isUpperCase(str5.charAt(0))) {
                            a4.add(str5);
                        } else {
                            str4 = str5;
                        }
                    }
                    if (!str4.isEmpty()) {
                        a4.add(str4);
                    }
                }
                a4.addAll(a3);
                return f.a((Iterable) a4);
            }
        }
        return str2;
    }

    public static final List a(aeli aeli) {
        amrl.a((Object) aeli);
        ArrayList a2 = anda.a(d.a((CharSequence) aeli.a()));
        return (a2.size() <= 0 || !((String) a2.get(0)).isEmpty()) ? a2 : a2.subList(1, a2.size());
    }

    public static List a(String str) {
        boolean z;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, (Object) "options is null");
        ArrayList a2 = anda.a();
        Iterator it = e.a((CharSequence) str).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!str2.isEmpty()) {
                Object obj = "";
                if (str2.startsWith("O") || str2.startsWith("J")) {
                    while (str2.length() < 12) {
                        str2 = f.a(str2, !it.hasNext() ? obj : it.next(), new Object[0]);
                    }
                }
                if (str2.equals("pi") || str2.equals("ya") || str2.equals("ro")) {
                    amre amre = f;
                    if (it.hasNext()) {
                        obj = it.next();
                    }
                    str2 = amre.a(str2, obj, new Object[0]);
                }
                a2.add(str2);
            }
        }
        return a2;
    }
}
