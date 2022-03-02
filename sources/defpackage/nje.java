package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: nje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nje {
    public static void a(String str, int i, int i2, Set set) {
        if (i2 != 3 && i != 2) {
            if (i2 != 0) {
                ihs b = ihs.b();
                if (!(i == 3 || i == 6)) {
                    hya.a((Context) b).a(str);
                }
                iva.b(!set.isEmpty());
                if (i2 == 2) {
                    return;
                }
                if (i2 == 1) {
                    ivf ivf = ivf.f;
                    if (ivf.b) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            if (ivf.e.contains(Integer.toString(((Integer) it.next()).intValue()))) {
                                return;
                            }
                        }
                    }
                    if (i == 3) {
                        ivf ivf2 = ivf.f;
                        if (ivf2.c && ivf2.d.contains(str) && Math.random() < axcl.a.a().e()) {
                            List a = iwv.a(ihs.b(), true, axcl.a.a().a()).a(ihs.b());
                            aucd o = aogf.d.o();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aogf aogf = (aogf) o.b;
                            str.getClass();
                            aogf.a = 1 | aogf.a;
                            aogf.b = str;
                            iyc a2 = iyc.a(((Integer) set.iterator().next()).intValue());
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aogf aogf2 = (aogf) o.b;
                            aogf2.c = a2.a();
                            aogf2.a |= 2;
                            aogf aogf3 = (aogf) o.i();
                            aucd o2 = aohl.u.o();
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            aohl aohl = (aohl) o2.b;
                            aogf3.getClass();
                            if (!aohl.t.a()) {
                                aohl.t = aucj.a(aohl.t);
                            }
                            aohl.t.add(aogf3);
                            hoi a3 = ((hol) a.get(0)).a((audx) (aohl) o2.i());
                            a3.f = avsd.UNMETERED_ONLY;
                            a3.b();
                            return;
                        }
                        return;
                    }
                    throw new SecurityException(String.format("%s is not allowed to access service# %d which is GMS First party only", new Object[]{str, set.iterator().next()}));
                }
                throw new AssertionError();
            }
            throw new SecurityException("GMS Internal API");
        }
    }
}
