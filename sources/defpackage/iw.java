package defpackage;

/* renamed from: iw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iw extends bl {
    public static final bn c = new iv();
    public final ov d = new ov();
    public boolean e = false;

    /* access modifiers changed from: package-private */
    public final it a(int i) {
        return (it) this.d.a(i);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.e = false;
    }

    /* access modifiers changed from: protected */
    public final void f() {
        int c2 = this.d.c();
        for (int i = 0; i < c2; i++) {
            ((it) this.d.d(i)).a(true);
        }
        ov ovVar = this.d;
        int i2 = ovVar.c;
        Object[] objArr = ovVar.b;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        ovVar.c = 0;
        ovVar.a = false;
    }
}
