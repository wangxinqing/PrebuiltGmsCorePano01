package defpackage;

import android.content.Context;

/* renamed from: hbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hbg implements awdt {
    private final bapu a;
    private final bapu b;

    public hbg(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        amri b2 = hbb.b((Context) this.a.a(), ((Boolean) this.b.a()).booleanValue());
        awdx.a((Object) b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
