package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: czw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class czw {
    public final cuj a;
    public final ctf b;
    public final djs c;
    private final Context d;
    private djk e;

    public czw(Context context, cuj cuj) {
        this.d = context;
        this.a = cuj;
        cti cti = (cti) cti.a.get();
        if (cti == null) {
            cti = new cti(amta.a((amsv) new ctg(context)));
            cti.a = new WeakReference(cti);
        }
        this.b = cti;
        this.c = new djs(ihs.b().getRequestQueue());
    }

    public final synchronized djk a() {
        if (this.e == null) {
            this.e = new djr(this.d);
        }
        return this.e;
    }

    public final synchronized void b() {
        djk djk = this.e;
        if (djk != null) {
            ((djr) djk).b.cancelAll(djl.a);
            ((djr) djk).b.stop();
            this.e = null;
        }
    }
}
