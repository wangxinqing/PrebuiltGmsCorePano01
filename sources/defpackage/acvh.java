package defpackage;

import java.util.concurrent.Executor;

/* renamed from: acvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acvh implements acwb {
    public final acvf a;
    public final acwi b;
    private final Executor c;

    public acvh(Executor executor, acvf acvf, acwi acwi) {
        this.c = executor;
        this.a = acvf;
        this.b = acwi;
    }

    public final void a() {
        throw new UnsupportedOperationException();
    }

    public final void a(acwa acwa) {
        this.c.execute(new acvg(this, acwa));
    }
}
