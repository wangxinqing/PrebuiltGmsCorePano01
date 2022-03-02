package defpackage;

import org.chromium.net.CronetEngine;

/* renamed from: rbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rbz implements awdt {
    public final /* bridge */ /* synthetic */ Object a() {
        CronetEngine cronetEngine = ihs.b().getCronetEngine();
        awdx.a((Object) cronetEngine, "Cannot return null from a non-@Nullable @Provides method");
        return cronetEngine;
    }
}
