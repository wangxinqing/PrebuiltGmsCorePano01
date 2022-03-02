package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ch {
    private final cs a;
    private final cc b;
    private final Executor c = c.c;

    public ch(cc ccVar, cs csVar) {
        this.b = ccVar;
        this.a = csVar;
    }

    public final as a() {
        cs csVar = this.a;
        cc ccVar = this.b;
        Executor executor = c.b;
        Executor executor2 = this.c;
        return new x(executor2, ccVar, csVar, executor, executor2).b;
    }
}
