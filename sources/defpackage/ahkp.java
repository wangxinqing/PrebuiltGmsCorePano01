package defpackage;

/* renamed from: ahkp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahkp extends ahle {
    public ahkp(ahix ahix) {
        super(ahix);
    }

    private final void a(boolean z, boolean z2) {
        long j;
        Object[] objArr = {Boolean.valueOf(z), Boolean.valueOf(z2)};
        if (this.i.a() && this.e.bi() && this.d.o() != Long.MAX_VALUE) {
            if (!z) {
                if (!z2) {
                    j = 0;
                } else {
                    j = 20000;
                }
                a((ahle) new ahkz(this.d, false, j));
                return;
            }
            c(39);
        }
    }

    public final void A() {
        a(false, false);
    }

    public final void g() {
        super.g();
        this.d.a(false, true);
        this.d.a(false);
        if (this.d.B.d()) {
            this.d.B.c();
        }
        this.d.y.b();
    }

    public final String p() {
        return "OffState";
    }

    /* access modifiers changed from: protected */
    public final void s() {
        if (this.d.B.d()) {
            this.d.B.c();
        }
    }

    /* access modifiers changed from: protected */
    public final void u() {
        a(false, false);
    }

    public final void w() {
        a(false, true);
    }

    public final void x() {
    }

    /* access modifiers changed from: protected */
    public final void a(ahle ahle) {
        if (!(ahle instanceof ahkp)) {
            super.a(ahle);
            return;
        }
        throw new IllegalArgumentException("OffState cannot go to itself.");
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        a(z, false);
    }
}
