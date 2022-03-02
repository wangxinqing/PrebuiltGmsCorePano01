package defpackage;

import android.accounts.Account;

/* renamed from: sfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sfz implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;
    private final bapu d;

    public sfz(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
        this.d = bapu4;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        amsv b2 = ((siz) this.b).a();
        ahee g = ahef.g();
        g.a((ahfm) ahem.a((ahdo) this.c.a()));
        g.a((audx) afus.d);
        agzz agzz = (agzz) b2.a();
        agzz.a((Account) ((awdu) this.a).a);
        agzz.b("profilesync/public/profile_info.pb");
        g.a(agzz.a());
        afua afua = new afua(((ahei) this.d.a()).a(g.a()));
        awdx.a((Object) afua, "Cannot return null from a non-@Nullable @Provides method");
        return afua;
    }
}
