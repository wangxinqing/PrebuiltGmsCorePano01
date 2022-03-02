package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: ihb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ihb {
    private final Feature[] a;

    @Deprecated
    public ihb() {
        this.a = null;
    }

    public static iha b() {
        return new iha();
    }

    /* access modifiers changed from: protected */
    public abstract void a(ibf ibf, acwd acwd);

    public Feature[] a() {
        return this.a;
    }

    public ihb(Feature[] featureArr) {
        this.a = featureArr;
    }
}
