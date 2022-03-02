package defpackage;

import java.io.IOException;

/* renamed from: afxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afxr {
    public final afxu a;
    public final anij b;

    public afxr(afxu afxu, anij anij) {
        this.a = afxu;
        this.b = anij;
    }

    public final afxq a() {
        try {
            return new afxq(new afxt((afyl) afxu.a(this.a.a.a())), this.b);
        } catch (IOException e) {
            anie c = this.b.c();
            c.a((Throwable) e);
            c.a("afxr", "a", 49, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Failed to retrieve sync metadata at sync start!");
            return new afxq((afxt) null, this.b);
        }
    }

    public final void a(Enum enumR) {
        try {
            afxu.a(this.a.a.a(enumR));
        } catch (IOException e) {
            anie c = this.b.c();
            c.a((Throwable) e);
            c.a("afxr", "a", 33, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Failed to register event occurrence!");
        }
    }

    public final void a(Iterable iterable) {
        try {
            afxu.a(this.a.a.a(anbs.a(anbs.a(iterable, afxp.a), afxs.a)));
        } catch (IOException e) {
            anie c = this.b.c();
            c.a((Throwable) e);
            c.a("afxr", "a", 60, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Failed to flush sync metadata!");
        }
    }
}
