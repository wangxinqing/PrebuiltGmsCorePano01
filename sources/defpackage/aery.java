package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aery  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aery implements awdt {
    private final bapu a;
    private final bapu b;

    public aery(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        amsv amsv;
        awdn b2 = awds.b(this.a);
        Executor executor = (Executor) this.b.a();
        amsv b3 = aesb.b();
        amsv b4 = aesc.b();
        if (!axtl.a.a().e()) {
            String str = (String) b3.a();
            Integer num = (Integer) b4.a();
            ((pia) b2.a()).a("[ProdGrpcChannelModule] Binding to %s:%d with OkHttp", str, num);
            amsv = amta.a((amsv) new aerx(str, num, executor));
        } else {
            amsv = new aero(b2, b3, b4, new aerw(b2, executor));
        }
        awdx.a((Object) amsv, "Cannot return null from a non-@Nullable @Provides method");
        return amsv;
    }
}
