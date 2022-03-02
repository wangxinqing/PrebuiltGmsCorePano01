package defpackage;

import android.content.Context;
import android.os.SystemClock;

/* renamed from: admb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class admb extends adlz {
    public static final adrg h = new adrg("retry_count", 0);
    public static final adrk i = new adrk("initial_delay", 0L);
    public static final adrk j = new adrk("maximum_delay", Long.MAX_VALUE);
    public static final adrb k = new adrb("multiply_factor", Double.valueOf(2.0d));

    public admb(Context context, adre adre) {
        super("exponential-backoff-delay-execution", context, adre);
    }

    public static adma f() {
        return new adma();
    }

    /* access modifiers changed from: protected */
    public final long e() {
        return SystemClock.elapsedRealtime() + Math.min(((Long) a(i)).longValue() * ((long) Math.pow(((Double) a(k)).doubleValue(), (double) ((Integer) a(h)).intValue())), ((Long) a(j)).longValue());
    }
}
