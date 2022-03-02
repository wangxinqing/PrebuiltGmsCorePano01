package defpackage;

import android.graphics.Path;

/* renamed from: aym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aym implements ayc {
    public final Path.FillType a;
    public final String b;
    public final axn c;
    public final axq d;
    public final boolean e;
    private final boolean f;

    public aym(String str, boolean z, Path.FillType fillType, axn axn, axq axq, boolean z2) {
        this.b = str;
        this.f = z;
        this.a = fillType;
        this.c = axn;
        this.d = axq;
        this.e = z2;
    }

    public final avu a(avc avc, ayu ayu) {
        return new avy(avc, ayu, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f + '}';
    }
}
