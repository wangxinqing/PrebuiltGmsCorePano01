package defpackage;

/* renamed from: afyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afyu extends afyy {
    private final afyw a;
    private final afza b;

    public afyu(afyw afyw, afza afza) {
        this.a = afyw;
        this.b = afza;
    }

    public final afyw a() {
        return this.a;
    }

    public final afza b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afyy) {
            afyy afyy = (afyy) obj;
            return this.a.equals(afyy.a()) && this.b.equals(afyy.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 86 + String.valueOf(valueOf2).length());
        sb.append("PdsMobstoreSyncMetadataManagerFactory{mobstoreHelper=");
        sb.append(valueOf);
        sb.append(", pdsSyncMetadataManagerFactory=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
