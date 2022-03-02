package defpackage;

import android.content.Context;

/* renamed from: apyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apyx implements awdt {
    private final bapu a;

    public apyx(bapu bapu) {
        this.a = bapu;
    }

    public static apyx a(bapu bapu) {
        return new apyx(bapu);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        aeko.b();
        apzd apzd = new apzd(((Context) this.a.a()).getApplicationContext());
        awdx.a((Object) apzd, "Cannot return null from a non-@Nullable @Provides method");
        return apzd;
    }
}
