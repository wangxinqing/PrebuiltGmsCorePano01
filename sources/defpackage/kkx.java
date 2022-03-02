package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: kkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kkx {
    public Long a;

    public kkx(Long l) {
        this.a = l;
        if (l != null) {
            iva.b(l.longValue() >= 0);
        }
    }

    public static kkx a(long j) {
        return new kkx(Long.valueOf(j));
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean equals(Object obj) {
        Long l;
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            kkx kkx = (kkx) obj;
            Long l2 = this.a;
            if (!(l2 == null || (l = kkx.a) == null)) {
                return l2.equals(l);
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return String.format(Locale.US, "EntryKey[%s]", new Object[]{this.a});
    }
}
