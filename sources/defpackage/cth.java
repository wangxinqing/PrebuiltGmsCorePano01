package defpackage;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: cth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cth implements icm {
    private final dih a;
    private final cry b;

    public cth(dih dih, cry cry) {
        this.a = dih;
        this.b = cry;
    }

    public final void a(icl icl) {
        dih dih = this.a;
        cry cry = this.b;
        wla wla = (wla) icl;
        WeakReference weakReference = cti.a;
        try {
            if (wla.aO().c() && wla.b() != null) {
                Iterator it = wla.b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        xaa xaa = (xaa) it.next();
                        if (xaa.k() && dih.a.equals(xaa.c())) {
                            aucd o = dii.d.o();
                            String c = xaa.c();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            c.getClass();
                            ((dii) o.b).a = c;
                            String d = xaa.d();
                            if (!jlh.d(d)) {
                                if (!dih.a.equals(d)) {
                                    String d2 = xaa.d();
                                    if (o.c) {
                                        o.c();
                                        o.c = false;
                                    }
                                    d2.getClass();
                                    ((dii) o.b).b = d2;
                                }
                            }
                            if (!jlh.d(xaa.i())) {
                                int hashCode = Arrays.hashCode(new Object[]{xaa.i()});
                                if (o.c) {
                                    o.c();
                                    o.c = false;
                                }
                                ((dii) o.b).c = hashCode;
                            }
                            cry.b(amri.b((dii) o.i()));
                        }
                    }
                    break;
                }
            }
            break;
            aucd o2 = dii.d.o();
            String str = dih.a;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            str.getClass();
            ((dii) o2.b).a = str;
            cry.b(amri.b((dii) o2.i()));
        } finally {
            wla.c();
        }
    }
}
