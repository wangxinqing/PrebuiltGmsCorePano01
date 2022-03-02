package defpackage;

/* renamed from: ahgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahgi extends ahgj {
    public final audx a;
    private final aubs b;

    public ahgi(audx audx, aubs aubs) {
        if (audx != null) {
            this.a = audx;
            if (aubs != null) {
                this.b = aubs;
                return;
            }
            throw new NullPointerException("Null extensionRegistryLite");
        }
        throw new NullPointerException("Null defaultValue");
    }

    public final audx a() {
        return this.a;
    }

    public final aubs b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahgj) {
            ahgj ahgj = (ahgj) obj;
            return this.a.equals(ahgj.a()) && this.b.equals(ahgj.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54 + String.valueOf(valueOf2).length());
        sb.append("ProtoSerializer{defaultValue=");
        sb.append(valueOf);
        sb.append(", extensionRegistryLite=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
