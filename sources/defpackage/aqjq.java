package defpackage;

import java.io.Serializable;
import java.util.Random;

/* renamed from: aqjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqjq implements Serializable {
    private final Random a;

    public aqjq(aqjp aqjp) {
        this.a = new Random(aqjp.a);
    }

    public static aqjp c() {
        return new aqjp();
    }

    public final long a() {
        return this.a.nextLong();
    }

    public final Random b() {
        return new Random(a());
    }
}
