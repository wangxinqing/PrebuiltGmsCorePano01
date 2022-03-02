package defpackage;

/* renamed from: agrj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agrj extends agsb {
    public final atwh a;

    public agrj(atwh atwh) {
        if (atwh != null) {
            this.a = atwh;
            return;
        }
        throw new NullPointerException("Null response");
    }

    public final atwh a() {
        return this.a;
    }

    public final long b() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agsb) {
            agsb agsb = (agsb) obj;
            return this.a.equals(agsb.a()) && agsb.b() == -1;
        }
    }

    public final int hashCode() {
        atwh atwh = this.a;
        int i = atwh.S;
        if (i == 0) {
            i = aueh.a.a((Object) atwh).a(atwh);
            atwh.S = i;
        }
        return ((int) -4294967296L) ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
        sb.append("CachedGetActivityControlsSettingsResponse{response=");
        sb.append(valueOf);
        sb.append(", timestamp=-1}");
        return sb.toString();
    }
}
