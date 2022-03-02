package defpackage;

/* renamed from: alxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alxi {
    public final alxk a;

    public alxi(alxk alxk) {
        alys.a((Object) alxk, "metadata");
        this.a = alxk;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof alxi) {
            return this.a.equals(((alxi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("SessionJoinEvent [metadata=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
