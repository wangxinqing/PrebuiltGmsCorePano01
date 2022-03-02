package defpackage;

import java.util.Locale;

/* renamed from: trj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class trj {
    public final String a;
    public tri b = tri.AVAILABLE;
    public long c = 0;

    public trj(String str) {
        this.a = str;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "EndpointInfo{ id = %s, status = %s, offset = %d }", new Object[]{this.a, this.b, Long.valueOf(this.c)});
    }
}
