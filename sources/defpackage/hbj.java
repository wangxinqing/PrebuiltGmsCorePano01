package defpackage;

import android.content.Context;

/* renamed from: hbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hbj implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;

    public hbj(bapu bapu, bapu bapu2, bapu bapu3) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        amri a2 = hbb.a((Context) this.a.a(), (amri) this.b.a(), ((Boolean) this.c.a()).booleanValue());
        awdx.a((Object) a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
