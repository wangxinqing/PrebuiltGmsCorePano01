package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: aqjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aqjh implements aqji {
    protected final aqjq f;
    public final aqjk g;
    protected final ArrayList h;
    protected final ArrayList i;
    public final ArrayDeque j;

    public aqjh(aqjq aqjq, int i2, double d) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        ativ.a(z, (Object) "numberOfParticles must be greater than 0!");
        ativ.a((Object) aqjq, (Object) "seedBox needs to be set!");
        this.f = aqjq;
        aqjk aqjk = new aqjk(aqjq, i2, d);
        this.g = aqjk;
        aqjk.a(this);
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayDeque();
    }

    public final void a(double d, aqje aqje) {
    }

    public void b(aqjb aqjb) {
        throw null;
    }
}
