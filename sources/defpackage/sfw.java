package defpackage;

import android.content.Context;

/* renamed from: sfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sfw implements awdt {
    private final bapu a;

    public sfw(bapu bapu) {
        this.a = bapu;
    }

    /* renamed from: b */
    public final afvq a() {
        afvq afvq = new afvq((Context) this.a.a());
        awdx.a((Object) afvq, "Cannot return null from a non-@Nullable @Provides method");
        return afvq;
    }
}
