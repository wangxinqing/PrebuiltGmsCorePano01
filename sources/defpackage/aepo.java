package defpackage;

/* renamed from: aepo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aepo extends aept {
    public final aukf a;

    public aepo(aukf aukf) {
        this.a = aukf;
    }

    public final aukf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aept)) {
            return false;
        }
        aept aept = (aept) obj;
        aukf aukf = this.a;
        return aukf != null ? aukf.equals(aept.a()) : aept.a() == null;
    }

    public final int hashCode() {
        int i;
        aukf aukf = this.a;
        if (aukf != null) {
            i = aukf.S;
            if (i == 0) {
                i = aueh.a.a((Object) aukf).a(aukf);
                aukf.S = i;
            }
        } else {
            i = 0;
        }
        return 1000003 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("CoreBroadcastSubscriptionParams{channelFilter=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
