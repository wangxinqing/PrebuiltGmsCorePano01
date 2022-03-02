package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: kkz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kkz {
    public final String a;
    public final long b;

    public kkz(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            kkz kkz = (kkz) obj;
            return this.a.equals(kkz.a) && this.b == kkz.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b)});
    }

    public final String toString() {
        return String.format(Locale.US, "Account[%s, %d]", new Object[]{this.a, Long.valueOf(this.b)});
    }
}
