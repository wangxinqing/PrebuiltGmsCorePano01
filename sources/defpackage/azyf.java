package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: azyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azyf implements Comparable {
    private static final long b;
    private static final long c;
    private static final long d = TimeUnit.SECONDS.toNanos(1);
    private static final azye g = new azye();
    public final long a;
    private final azye e;
    private volatile boolean f;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500);
        b = nanos;
        c = -nanos;
    }

    private azyf(azye azye, long j, long j2) {
        this.e = azye;
        long min = Math.min(b, Math.max(c, j2));
        this.a = j + min;
        this.f = min <= 0;
    }

    public static azyf a(long j, TimeUnit timeUnit) {
        azye azye = g;
        if (timeUnit != null) {
            return new azyf(azye, System.nanoTime(), timeUnit.toNanos(j));
        }
        throw new NullPointerException("units");
    }

    public final void b(azyf azyf) {
        azye azye = this.e;
        if (azye != azyf.e) {
            String valueOf = String.valueOf(azye);
            String valueOf2 = String.valueOf(azyf.e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72 + String.valueOf(valueOf2).length());
            sb.append("Tickers (");
            sb.append(valueOf);
            sb.append(" and ");
            sb.append(valueOf2);
            sb.append(") don't match. Custom Ticker should only be used in tests!");
            throw new AssertionError(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof azyf)) {
            return false;
        }
        azyf azyf = (azyf) obj;
        azye azye = this.e;
        if (azye == null ? azyf.e == null : azye == azyf.e) {
            if (this.a == azyf.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(new Object[]{this.e, Long.valueOf(this.a)}).hashCode();
    }

    public final String toString() {
        long a2 = a(TimeUnit.NANOSECONDS);
        long abs = Math.abs(a2) / d;
        long abs2 = Math.abs(a2) % d;
        StringBuilder sb = new StringBuilder();
        if (a2 < 0) {
            sb.append('-');
        }
        sb.append(abs);
        if (abs2 > 0) {
            sb.append(String.format(".%09d", new Object[]{Long.valueOf(abs2)}));
        }
        sb.append("s from now");
        azye azye = this.e;
        if (azye != g) {
            String valueOf = String.valueOf(azye);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 10);
            sb2.append(" (ticker=");
            sb2.append(valueOf);
            sb2.append(")");
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final int compareTo(azyf azyf) {
        b(azyf);
        long j = this.a - azyf.a;
        if (j >= 0) {
            return j <= 0 ? 0 : 1;
        }
        return -1;
    }

    public final long a(TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        if (!this.f && this.a - nanoTime <= 0) {
            this.f = true;
        }
        return timeUnit.convert(this.a - nanoTime, TimeUnit.NANOSECONDS);
    }

    public final boolean a() {
        if (!this.f) {
            if (this.a - System.nanoTime() > 0) {
                return false;
            }
            this.f = true;
        }
        return true;
    }
}
