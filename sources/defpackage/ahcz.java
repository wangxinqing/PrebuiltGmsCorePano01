package defpackage;

/* renamed from: ahcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahcz extends ahem {
    private final ahel a;

    public ahcz(ahel ahel) {
        if (ahel != null) {
            this.a = ahel;
            return;
        }
        throw new NullPointerException("Null service");
    }

    public final ahel a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahem) {
            return this.a.equals(((ahem) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("SignallingConfig{service=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
