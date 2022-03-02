package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: arzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arzi {
    public AtomicBoolean a;
    public int b;
    private final Runnable c;

    public arzi(long j) {
        this((Runnable) new arzh(j));
    }

    public final arzj a() {
        if (this.c == null) {
            ((anih) tgb.a.c()).a("AttemptRepeatedlyOptions.build() with null recoveryRunnable.");
        }
        return new arzj(this.c, this.a, this.b);
    }

    public arzi(Runnable runnable) {
        this.b = 3;
        this.c = runnable;
    }
}
