package defpackage;

import java.util.Map;

/* renamed from: pii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pii implements bapu {
    private final pjo a;

    public pii(pjo pjo) {
        this.a = pjo;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Map d = this.a.d();
        awdx.a((Object) d, "Cannot return null from a non-@Nullable component method");
        return d;
    }
}
