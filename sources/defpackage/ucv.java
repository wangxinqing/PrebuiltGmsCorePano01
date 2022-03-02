package defpackage;

/* renamed from: ucv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ucv extends arwm {
    final /* synthetic */ String a;
    final /* synthetic */ udb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ucv(udb udb, String str, String str2) {
        super(str);
        this.b = udb;
        this.a = str2;
    }

    public final void run() {
        aorr aorr = (aorr) this.b.p.remove(this.a);
        if (aorr != null && !aorr.isDone()) {
            aorr.cancel(true);
        }
    }
}
