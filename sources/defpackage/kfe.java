package defpackage;

/* renamed from: kfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kfe extends kfg {
    protected kfe(String str, kec kec, kwg kwg) {
        super(str, kec, kwg, 64);
    }

    /* access modifiers changed from: protected */
    public abstract void d();

    /* access modifiers changed from: protected */
    public final void e() {
        if (this.a.f()) {
            d();
            return;
        }
        throw new nja(10, "App is not authorized to make this request.");
    }
}
