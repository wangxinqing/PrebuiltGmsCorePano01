package defpackage;

import java.util.concurrent.Executor;

/* renamed from: pca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pca implements awdt {
    private final bapu a;

    public pca(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Object obj = (Executor) this.a.a();
        if (axtl.a.a().b()) {
            obj = new izk(-1, 22784);
        }
        awdx.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
