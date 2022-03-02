package defpackage;

import java.util.List;
import java.util.Locale;

/* renamed from: dhy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dhy {
    public final dhx a;
    public final dhe b;
    public final dfd c;
    public final as d;
    public final as e;
    public final au f;
    public final aw g = new aw();
    public final as h;
    public final as i;
    public boolean j;

    public dhy(dhx dhx, dfd dfd, dhe dhe) {
        this.a = dhx;
        this.c = dfd;
        this.b = dhe;
        dfk dfk = (dfk) dhx;
        as c2 = dfd.c(dfk.a);
        this.e = c2;
        this.d = bk.b(c2, new dhs(dfd));
        au auVar = new au();
        this.f = auVar;
        auVar.a(this.d, new dht(this));
        this.f.a(this.g, new dhu(this));
        as b2 = dfd.b(dfk.a);
        this.h = new csc(b2, dhe.b(), new dhv(this));
        this.i = bk.a(b2, dhw.a);
    }

    public static final List a(csl csl) {
        aqsy aqsy;
        if (csl == null) {
            return null;
        }
        aqso aqso = csl.a;
        if (aqso.b != 9 || ((aqsy) aqso.c).b.size() == 0) {
            return null;
        }
        aqso aqso2 = csl.a;
        if (aqso2.b == 9) {
            aqsy = (aqsy) aqso2.c;
        } else {
            aqsy = aqsy.e;
        }
        return aqsy.b;
    }

    public final aqsr a() {
        return ((dfk) this.a).a;
    }

    public static final List a(List list, String str) {
        if (jlh.d(str) || list == null) {
            return list;
        }
        List a2 = jir.a();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            aqsz aqsz = (aqsz) list.get(i2);
            if (!a(aqsz.c, str) && !a(aqsz.d, str)) {
                aucx aucx = aqsz.f;
                int size2 = aucx.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    int i4 = i3 + 1;
                    if (a((String) aucx.get(i3), str)) {
                        break;
                    }
                    i3 = i4;
                }
            }
            a2.add(aqsz);
        }
        return a2;
    }

    private static final boolean a(String str, String str2) {
        Locale a2 = dja.a();
        return str.toLowerCase(a2).contains(str2.toLowerCase(a2).trim());
    }
}
