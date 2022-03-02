package defpackage;

import android.content.Context;

/* renamed from: fhv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fhv implements aoqb {
    private final fib a;
    private final fde b;

    public fhv(fib fib, fde fde) {
        this.a = fib;
        this.b = fde;
    }

    public final aorr a(Object obj) {
        fib fib = this.a;
        fde fde = this.b;
        amzy amzy = (amzy) obj;
        if (amzy.isEmpty()) {
            throw qbf.a(28433);
        } else if (!fib.d.b.a) {
            return aorl.a((Object) amzy.h());
        } else {
            Context context = fib.b;
            String str = fib.c;
            wlr wlr = new wlr();
            wlr.a = 80;
            return new fnb(context, wlt.d(context, wlr.a()), str, amzy).a(fde);
        }
    }
}
