package defpackage;

import java.util.concurrent.Executor;

/* renamed from: afay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afay implements bapu {
    private final afbj a;

    public afay(afbj afbj) {
        this.a = afbj;
    }

    /* renamed from: b */
    public final Executor a() {
        Executor w = this.a.w();
        awdx.a((Object) w, "Cannot return null from a non-@Nullable component method");
        return w;
    }
}
