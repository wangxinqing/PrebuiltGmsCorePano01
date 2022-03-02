package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: aepl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aepl {
    private boolean a;
    private int b;

    public final aepm a() {
        return new aepe(this.a, this.b);
    }

    public final void a(int i, TimeUnit timeUnit) {
        this.a = true;
        this.b = (int) timeUnit.toSeconds((long) i);
    }
}
