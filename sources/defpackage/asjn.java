package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: asjn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asjn {
    public final asht a;
    public final Context b;
    private final asda c;
    private final arwg d;
    private final Executor e;

    public asjn(Context context, Executor executor) {
        this.b = context;
        this.a = (asht) thl.a(context, asht.class);
        this.d = (arwg) thl.a(context, arwg.class);
        this.e = executor;
        this.c = (asda) thl.b(context, asda.class);
        a((asiz) null);
    }

    public final asis a(ashj ashj) {
        if (ashj != null) {
            return new ashp(ashj, this.d);
        }
        return null;
    }

    public final asis a(asjb asjb) {
        if (asjb != null) {
            return new asjh(asjb, this.d, this.e);
        }
        return null;
    }

    public final void a(asiz asiz) {
        asda asda = this.c;
        if (asda != null) {
            if (asda.c(asiz)) {
                jjg jjg = asil.a;
            }
        } else if (asiz != null) {
            asiz.a();
        }
    }
}
