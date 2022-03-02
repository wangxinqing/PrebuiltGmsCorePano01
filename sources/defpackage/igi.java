package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: igi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class igi {
    public final ige a;
    public final Feature[] b;

    protected igi(ige ige) {
        this.a = ige;
        this.b = null;
    }

    public final igc a() {
        return this.a.b;
    }

    /* access modifiers changed from: protected */
    public abstract void a(ibf ibf, acwd acwd);

    protected igi(ige ige, Feature[] featureArr) {
        this.a = ige;
        this.b = featureArr;
    }
}
