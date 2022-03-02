package defpackage;

import java.util.List;

/* renamed from: aesr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aesr extends aeta {
    private final amzy c;

    public aesr(amzy amzy) {
        this.c = amzy;
    }

    public final amzy a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeta) {
            return anda.a((List) this.c, (Object) ((aeta) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("CoreLatestFootprintsFilter{secondaryIdMatchers=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
