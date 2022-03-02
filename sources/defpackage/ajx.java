package defpackage;

import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: ajx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class ajx extends adh {
    boolean n;
    final /* synthetic */ akb o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajx(akb akb) {
        super(akb.c.getContext());
        this.o = akb;
    }

    /* access modifiers changed from: protected */
    public final float a(DisplayMetrics displayMetrics) {
        return super.a(displayMetrics) * this.o.a;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        super.c();
        if (!this.n) {
            d();
        }
        akb akb = this.o;
        if (akb.n == this) {
            akb.n = null;
        }
        if (akb.o == this) {
            akb.o = null;
        }
    }

    /* access modifiers changed from: protected */
    public final int d(int i) {
        int d = super.d(i);
        int i2 = this.o.L.d.f;
        if (i2 > 0) {
            float f = (30.0f / ((float) i2)) * ((float) i);
            if (((float) d) < f) {
                return (int) f;
            }
        }
        return d;
    }

    /* access modifiers changed from: protected */
    public final void a(View view, adf adf) {
        int i;
        int i2;
        if (this.o.a(view, (View) null, akb.M)) {
            if (this.o.d == 0) {
                i = akb.M[0];
                i2 = akb.M[1];
            } else {
                i = akb.M[1];
                i2 = akb.M[0];
            }
            adf.a(i, i2, c((int) Math.sqrt((double) ((i * i) + (i2 * i2)))), this.i);
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        View b = b(this.a);
        if (b != null) {
            akb akb = this.o;
            int i = akb.m;
            int i2 = this.a;
            if (i != i2) {
                akb.m = i2;
            }
            if (akb.w()) {
                this.o.k |= 32;
                b.requestFocus();
                this.o.k &= -33;
            }
            this.o.k();
            this.o.m();
            return;
        }
        int i3 = this.a;
        if (i3 >= 0) {
            this.o.a(i3, false);
        }
    }
}
