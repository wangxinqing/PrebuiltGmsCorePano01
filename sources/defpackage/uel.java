package defpackage;

import java.util.Arrays;

/* renamed from: uel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uel {
    public final String a;
    private final long b;

    public uel(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uel) {
            uel uel = (uel) obj;
            return ius.a(this.a, uel.a) && ius.a(Long.valueOf(this.b), Long.valueOf(uel.b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b)});
    }
}
