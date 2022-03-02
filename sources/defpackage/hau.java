package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: hau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hau implements awdt {
    private final bapu a;
    private final bapu b;

    public hau(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        List a2 = hat.a((Context) this.a.a(), (amzy) ((awdu) this.b).a);
        awdx.a((Object) a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
