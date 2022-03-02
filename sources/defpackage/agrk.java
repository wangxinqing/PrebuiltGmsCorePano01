package defpackage;

/* renamed from: agrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agrk extends agrl {
    private final atwh a;
    private final atvr b;

    public agrk(atwh atwh, atvr atvr) {
        if (atwh != null) {
            this.a = atwh;
            if (atvr != null) {
                this.b = atvr;
                return;
            }
            throw new NullPointerException("Null origin");
        }
        throw new NullPointerException("Null response");
    }

    public final atwh a() {
        return this.a;
    }

    public final atvr b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agrl) {
            agrl agrl = (agrl) obj;
            return this.a.equals(agrl.a()) && this.b.equals(agrl.b());
        }
    }

    public final int hashCode() {
        atwh atwh = this.a;
        int i = atwh.S;
        if (i == 0) {
            i = aueh.a.a((Object) atwh).a(atwh);
            atwh.S = i;
        }
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65 + String.valueOf(valueOf2).length());
        sb.append("GetActivityControlsSettingsResponseWithOrigin{response=");
        sb.append(valueOf);
        sb.append(", origin=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
