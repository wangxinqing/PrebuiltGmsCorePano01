package defpackage;

/* renamed from: afis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afis extends afiw {
    public final afhr a;

    public afis(afhr afhr) {
        this.a = afhr;
    }

    public final afhr a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof afiw)) {
            return false;
        }
        afiw afiw = (afiw) obj;
        afhr afhr = this.a;
        return afhr != null ? afhr.equals(afiw.a()) : afiw.a() == null;
    }

    public final int hashCode() {
        afhr afhr = this.a;
        return (afhr != null ? afhr.hashCode() : 0) ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
        sb.append("MdhBroadcastListenerParams{latestFootprintFilter=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
