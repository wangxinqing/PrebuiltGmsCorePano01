package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bags  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bags implements azzx {
    public final /* bridge */ /* synthetic */ Object a(String str) {
        boolean z;
        boolean z2;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, (Object) "empty timeout");
        if (str.length() <= 9) {
            z2 = true;
        } else {
            z2 = false;
        }
        amrl.a(z2, (Object) "bad timeout format");
        long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
        char charAt = str.charAt(str.length() - 1);
        if (charAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
        }
        if (charAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
        }
        if (charAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
        }
        if (charAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
        }
        if (charAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
        }
        if (charAt == 'n') {
            return Long.valueOf(parseLong);
        }
        throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", new Object[]{Character.valueOf(charAt)}));
    }

    public final /* bridge */ /* synthetic */ String a(Object obj) {
        Long l = (Long) obj;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l.longValue() < 0) {
            throw new IllegalArgumentException("Timeout too small");
        } else if (l.longValue() < 100000000) {
            String valueOf = String.valueOf(l);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
            sb.append(valueOf);
            sb.append("n");
            return sb.toString();
        } else if (l.longValue() < 100000000000L) {
            long micros = timeUnit.toMicros(l.longValue());
            StringBuilder sb2 = new StringBuilder(21);
            sb2.append(micros);
            sb2.append("u");
            return sb2.toString();
        } else if (l.longValue() < 100000000000000L) {
            long millis = timeUnit.toMillis(l.longValue());
            StringBuilder sb3 = new StringBuilder(21);
            sb3.append(millis);
            sb3.append("m");
            return sb3.toString();
        } else if (l.longValue() < 100000000000000000L) {
            long seconds = timeUnit.toSeconds(l.longValue());
            StringBuilder sb4 = new StringBuilder(21);
            sb4.append(seconds);
            sb4.append("S");
            return sb4.toString();
        } else if (l.longValue() < 6000000000000000000L) {
            long minutes = timeUnit.toMinutes(l.longValue());
            StringBuilder sb5 = new StringBuilder(21);
            sb5.append(minutes);
            sb5.append("M");
            return sb5.toString();
        } else {
            long hours = timeUnit.toHours(l.longValue());
            StringBuilder sb6 = new StringBuilder(21);
            sb6.append(hours);
            sb6.append("H");
            return sb6.toString();
        }
    }
}
