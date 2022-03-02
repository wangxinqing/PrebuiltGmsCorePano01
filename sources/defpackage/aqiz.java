package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* renamed from: aqiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqiz extends aqjl {
    final List a = new ArrayList();
    private final Random b;

    public aqiz(aqjq aqjq) {
        super(aqjq);
        this.b = aqjq.b();
    }

    public final void a() {
        boolean z;
        if (this.d.c == 3) {
            z = true;
        } else {
            z = false;
        }
        ativ.a(z, "Expected type# %s, but got type# %s.", 3, Integer.valueOf(this.d.c));
        aqil aqil = (aqil) this.d;
        aqjb aqjb = aqil.a;
        if (aqjb != null) {
            this.a.add(aqjb);
        }
        aqjb aqjb2 = aqil.b;
        if (aqjb2 != null) {
            this.a.add(aqjb2);
        }
    }

    public final void b() {
        this.a.clear();
    }

    public final void a(aqjc aqjc) {
        aqjc.a = this.d.d;
        List list = this.a;
        aqjb aqjb = (aqjb) list.get(this.b.nextInt(list.size()));
        double a2 = this.c.a() * aqjb.a(2);
        double nextDouble = this.b.nextDouble() * 3.141592653589793d;
        aqjc.b[0] = aqjb.a(0) + (Math.cos(nextDouble) * a2);
        aqjc.b[1] = aqjb.a(1) + (Math.sin(nextDouble) * a2);
    }
}
