package defpackage;

/* renamed from: ahjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class ahjt extends ahju {
    public ahjt(ahix ahix, boolean z) {
        super(ahix, z);
    }

    /* access modifiers changed from: protected */
    public final ahis a() {
        return this.d.m;
    }

    /* access modifiers changed from: protected */
    public abstract long b();

    /* access modifiers changed from: protected */
    public final int c() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        if (!this.b) {
            ahla ahla = this.d.r;
            if (ahla.a) {
                ahla.a();
            }
            ahla ahla2 = this.d.s;
            if (ahla2.a) {
                ahla2.a();
            }
            this.d.b(false);
            super.a(str);
        }
    }
}
