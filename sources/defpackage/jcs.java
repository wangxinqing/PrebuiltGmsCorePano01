package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: jcs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jcs implements jcu {
    public static final long a = TimeUnit.DAYS.toMillis(1);
    public final Random b;

    public jcs(Random random) {
        this.b = random;
    }

    public static jcs a() {
        Random random = new Random();
        random.nextLong();
        random.nextLong();
        return new jcs(random);
    }
}
