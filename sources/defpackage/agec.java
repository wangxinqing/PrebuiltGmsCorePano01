package defpackage;

import android.app.Application;

/* renamed from: agec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agec implements awdt {
    private final bapu a;

    public agec(bapu bapu) {
        this.a = bapu;
    }

    /* renamed from: b */
    public final agcz a() {
        agcz a2 = agcz.a((Application) ((awdu) this.a).a);
        awdx.a((Object) a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
