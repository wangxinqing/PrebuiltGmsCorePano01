package defpackage;

import java.util.List;

/* renamed from: axv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axv implements axz {
    private final axo a;
    private final axo b;

    public axv(axo axo, axo axo2) {
        this.a = axo;
        this.b = axo2;
    }

    public final awm a() {
        return new awy(this.a.a(), this.b.a());
    }

    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    public final boolean c() {
        return this.a.c() && this.b.c();
    }
}
