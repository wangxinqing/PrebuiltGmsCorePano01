package defpackage;

/* renamed from: wlr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wlr {
    public int a = -1;

    public final wls a() {
        boolean z;
        if (this.a >= 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Must provide valid client application ID!");
        return new wls(this);
    }
}
