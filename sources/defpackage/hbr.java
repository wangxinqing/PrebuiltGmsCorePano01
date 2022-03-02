package defpackage;

import android.content.Context;

/* renamed from: hbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hbr implements awdt {
    private final bapu a;

    public hbr(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        aucd o = haa.y.o();
        jiw.a((Context) this.a.a(), o);
        haa haa = (haa) o.i();
        awdx.a((Object) haa, "Cannot return null from a non-@Nullable @Provides method");
        return haa;
    }
}
