package defpackage;

/* renamed from: aiqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aiqe implements Runnable {
    private final aiqo a;
    private final arnb b;

    public aiqe(aiqo aiqo, arnb arnb) {
        this.a = aiqo;
        this.b = arnb;
    }

    public final void run() {
        aiqo aiqo = this.a;
        arnb arnb = this.b;
        aiqn aiqn = (aiqn) aiqo.b.get(arnb);
        if (aiqn != null) {
            aiqo.a.c(Long.valueOf(aiqn.a), aiqn);
            aiqo.b.remove(arnb);
            Object[] objArr = {"Manager:", Long.valueOf(aiqn.a)};
        }
    }
}
