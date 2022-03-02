package defpackage;

import android.content.Context;

/* renamed from: siy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class siy implements awdt {
    private final bapu a;

    public siy(bapu bapu) {
        this.a = bapu;
    }

    /* renamed from: b */
    public final ahgm a() {
        ahgm a2 = ahgn.a((Context) this.a.a());
        awdx.a((Object) a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
