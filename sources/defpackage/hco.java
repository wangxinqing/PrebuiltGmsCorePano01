package defpackage;

import android.content.Context;

/* renamed from: hco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hco implements awdt {
    private final bapu a;

    public hco(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        lxz lxz = new lxz((Context) this.a.a());
        awdx.a((Object) lxz, "Cannot return null from a non-@Nullable @Provides method");
        return lxz;
    }
}
