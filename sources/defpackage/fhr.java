package defpackage;

/* renamed from: fhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fhr implements aoqb {
    private final fib a;
    private final fde b;

    public fhr(fib fib, fde fde) {
        this.a = fib;
        this.b = fde;
    }

    public final aorr a(Object obj) {
        fib fib = this.a;
        fde fde = this.b;
        amzy amzy = (amzy) obj;
        if (amzy.isEmpty()) {
            throw qbf.a(28433);
        } else if (!fib.d.a.a) {
            return aorl.a((Object) amzy.h());
        } else {
            return new fnf(fib.b, fib.c, amzy).a(fde);
        }
    }
}
