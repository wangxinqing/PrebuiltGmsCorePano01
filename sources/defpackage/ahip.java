package defpackage;

import java.util.Locale;

/* renamed from: ahip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahip {
    public static final ahip c = a(Long.MAX_VALUE);
    public final int a;
    public final String b;
    private final Long d;

    private ahip(int i, Long l, String str) {
        this.a = i;
        this.d = l;
        this.b = str;
    }

    public static ahip a(long j) {
        ativ.b(j >= 0);
        return new ahip(0, Long.valueOf(j), (String) null);
    }

    public static ahip b(long j) {
        ativ.b(true);
        return new ahip(1, Long.valueOf(j), (String) null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Error [errorCode=");
        int i = this.a;
        if (i == 0) {
            sb.append(String.format(Locale.ENGLISH, "ERROR_CODE_SUCCESS, skipTimeMillis=%d]", new Object[]{this.d}));
        } else if (i == 1) {
            sb.append(String.format(Locale.ENGLISH, "ERROR_CODE_INSUFFICIENT_SAMPLES, numOfSamples=%d]", new Object[]{this.d}));
        } else {
            sb.append("ERROR_CODE_FATAL]");
        }
        return sb.toString();
    }

    public static ahip a(String str) {
        ativ.a((Object) str);
        return new ahip(2, (Long) null, str);
    }

    public final long a() {
        if (this.a == 0) {
            return this.d.longValue();
        }
        return Long.MAX_VALUE;
    }
}
