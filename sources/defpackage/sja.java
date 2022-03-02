package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: sja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sja implements awdt {
    private final bapu a;
    private final bapu b;

    public sja(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Context context = (Context) this.a.a();
        ahgg ahgg = (ahgg) this.b.a();
        amsv amsv = sir.a;
        ahdl a2 = ahdo.a();
        a2.a = context.getApplicationContext();
        a2.c = "com.google.android.gms.permission.INTERNAL_BROADCAST";
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a2.e = amsv;
        a2.f = timeUnit;
        sdy sdy = new sdy(context.getApplicationContext(), jfm.a(10));
        sdy.c = ahgg;
        a2.b = new sdz(sdy.a, sdy.b, sdy.c);
        a2.d = new jfo(new jfp(9));
        a2.g = jfm.a(1, 9);
        a2.h = ahgg;
        ahdo ahdo = new ahdo(a2);
        awdx.a((Object) ahdo, "Cannot return null from a non-@Nullable @Provides method");
        return ahdo;
    }
}
