package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: rzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rzb {
    public final Executor a;
    public final Executor b;
    public final sbb c;
    public final sbe d;

    public rzb(Context context, Executor executor, Executor executor2) {
        this.a = executor;
        this.b = executor2;
        this.c = new sbb(context);
        this.d = new sbe(context);
    }
}
