package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: did  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class did {
    public final dfd a;
    public final dhe b = new dhe(this.a, this.h);
    public final dhl c;
    public final dfy d;
    public final dgk e;
    public final dib f;
    public final dhn g;
    public final dgm h;

    public did(Context context, cuj cuj, dih dih, cvm cvm, aqsr aqsr, List list, dia dia, djs djs, ctf ctf) {
        this.a = new dfd(cuj, dih, cvm, ctf);
        this.h = new dgm(context, this.a);
        this.c = new dhl(this.a, this.h, aqsr, list);
        this.d = new dfy();
        this.e = new dgk(this.a, aqsr, djs);
        this.f = new dib(this.e, this.a, this.d, dia, this.b);
        this.g = new dhn(this.e, this.a, this.d, this.b, this.h);
    }

    public final dfp a(dfo dfo) {
        return new dfp(dfo, this.a, this.b, this.d, this.h);
    }
}
