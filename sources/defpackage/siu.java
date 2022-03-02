package defpackage;

import android.content.Context;

/* renamed from: siu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class siu implements awdt {
    private final bapu a;
    private final bapu b;

    public siu(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        aekn b2 = aeko.b();
        ahgm b3 = ((siy) this.b).a();
        long a2 = aygw.a.a().a();
        amsv amsv = sio.a;
        amsv amsv2 = sip.a;
        amsv amsv3 = siq.a;
        ahgf a3 = ahgg.a((Context) this.a.a());
        a3.b = jfm.b(10);
        a3.c = afjn.a(b2, b3.a(), (int) a2);
        a3.d = amsv;
        a3.e = amsv2;
        a3.f = amsv3;
        ahgg a4 = a3.a();
        awdx.a((Object) a4, "Cannot return null from a non-@Nullable @Provides method");
        return a4;
    }
}
