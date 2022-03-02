package defpackage;

/* renamed from: baix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baix extends azzg {
    public badk a;
    final /* synthetic */ baji b;

    public baix(baji baji) {
        this.b = baji;
    }

    public final azxj a() {
        return this.b.E;
    }

    public final void a(azxz azxz, azzm azzm) {
        amrl.a((Object) azxz, (Object) "newState");
        amrl.a((Object) azzm, (Object) "newPicker");
        this.b.a("updateBalancingState()");
        this.b.l.execute(new baiw(this, azzm, azxz));
    }
}
