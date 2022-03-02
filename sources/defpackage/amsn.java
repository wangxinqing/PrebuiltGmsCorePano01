package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: amsn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amsn {
    public boolean a;
    private final amtd b;
    private long c;
    private long d;

    public amsn() {
        this.b = amtd.a;
    }

    public static amsn a() {
        return new amsn();
    }

    public static amsn b() {
        amsn amsn = new amsn();
        amsn.d();
        return amsn;
    }

    private final long f() {
        return this.a ? (this.b.a() - this.d) + this.c : this.c;
    }

    public final void c() {
        this.c = 0;
        this.a = false;
    }

    public final void d() {
        amrl.b(!this.a, (Object) "This stopwatch is already running.");
        this.a = true;
        this.d = this.b.a();
    }

    public final void e() {
        long a2 = this.b.a();
        amrl.b(this.a, (Object) "This stopwatch is already stopped.");
        this.a = false;
        this.c += a2 - this.d;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long f = f();
        if (TimeUnit.DAYS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (TimeUnit.MICROSECONDS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        double d2 = (double) f;
        double convert = (double) TimeUnit.NANOSECONDS.convert(1, timeUnit);
        Double.isNaN(d2);
        Double.isNaN(convert);
        String a2 = amrk.a(d2 / convert);
        switch (amsm.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 1 + str.length());
        sb.append(a2);
        sb.append(" ");
        sb.append(str);
        return sb.toString();
    }

    public amsn(amtd amtd) {
        amrl.a((Object) amtd, (Object) "ticker");
        this.b = amtd;
    }

    public static amsn a(amtd amtd) {
        return new amsn(amtd);
    }

    public static amsn b(amtd amtd) {
        amsn amsn = new amsn(amtd);
        amsn.d();
        return amsn;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(f(), TimeUnit.NANOSECONDS);
    }
}
