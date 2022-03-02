package defpackage;

import java.util.Locale;

/* renamed from: ahqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahqo {
    public final long a;
    public final long b;
    public final long c;

    public ahqo(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "[Capacity: %d, Refill Amount: %d, Refill interval: %d]", new Object[]{Long.valueOf(this.c), Long.valueOf(this.a), Long.valueOf(this.b)});
    }
}
