package defpackage;

import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: jtf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jtf {
    public final Set a = new HashSet();
    private final jte b;

    public jtf(Bundle bundle, jte jte) {
        this.b = jte;
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("veRecordedImpressionNodeIds");
            int[] intArray2 = bundle.getIntArray("veRecordedImpressionIndexes");
            if (intArray != null && intArray2 != null) {
                for (int i = 0; i < intArray.length; i++) {
                    int i2 = intArray2[i];
                    if (i2 == -1) {
                        this.a.add(new jtb(Integer.valueOf(intArray[i]), (Integer) null));
                    } else {
                        this.a.add(new jtb(Integer.valueOf(intArray[i]), Integer.valueOf(i2)));
                    }
                }
            }
        }
    }

    public final void a(jtg jtg, jth... jthArr) {
        if (this.a.add(jtg)) {
            jtd jtd = (jtd) this.b;
            jth[] a2 = jtd.a(jthArr);
            aucd o = aujr.c.o();
            aucd a3 = jtd.a(jtg, a2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aujr aujr = (aujr) o.b;
            anod anod = (anod) a3.i();
            anod.getClass();
            aujr.b = anod;
            aujr.a |= 1;
            jtd.a((aujr) o.i());
        }
    }

    public final void b(jth jth, jth... jthArr) {
        a(jtg.a(jth), jthArr);
    }

    public final void a(jth jth, jth... jthArr) {
        jte jte = this.b;
        jtg a2 = jtg.a(jth);
        jtd jtd = (jtd) jte;
        jth[] a3 = jtd.a(jthArr);
        aucd o = aujr.c.o();
        aucd a4 = jtd.a(a2, a3);
        if (a4.c) {
            a4.c();
            a4.c = false;
        }
        anod anod = (anod) a4.b;
        anod anod2 = anod.f;
        anod.e = 4;
        anod.a = 4 | anod.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aujr aujr = (aujr) o.b;
        anod anod3 = (anod) a4.i();
        anod3.getClass();
        aujr.b = anod3;
        aujr.a |= 1;
        jtd.a((aujr) o.i());
    }
}
