package defpackage;

import android.graphics.Path;

/* renamed from: aye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aye implements ayc {
    public final Path.FillType a;
    public final axp b;
    public final axq c;
    public final axs d;
    public final axs e;
    public final String f;
    public final boolean g;
    public final int h;

    public aye(String str, int i, Path.FillType fillType, axp axp, axq axq, axs axs, axs axs2, boolean z) {
        this.h = i;
        this.a = fillType;
        this.b = axp;
        this.c = axq;
        this.d = axs;
        this.e = axs2;
        this.f = str;
        this.g = z;
    }

    public final avu a(avc avc, ayu ayu) {
        return new avz(avc, ayu, this);
    }
}
