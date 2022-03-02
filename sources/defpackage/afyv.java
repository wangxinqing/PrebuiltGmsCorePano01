package defpackage;

/* renamed from: afyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afyv extends afza {
    private final Class a;
    private final aucp b;
    private final ahei c;
    private final aekn d;
    private final anij e;

    public afyv(Class cls, aucp aucp, ahei ahei, aekn aekn, anij anij) {
        this.a = cls;
        this.b = aucp;
        this.c = ahei;
        this.d = aekn;
        this.e = anij;
    }

    public final Class a() {
        return this.a;
    }

    public final aucp b() {
        return this.b;
    }

    public final ahei c() {
        return this.c;
    }

    public final aekn d() {
        return this.d;
    }

    public final anij e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof afza)) {
            return false;
        }
        afza afza = (afza) obj;
        Class cls = this.a;
        if (cls == null ? afza.a() == null : cls.equals(afza.a())) {
            aucp aucp = this.b;
            if (aucp == null ? afza.b() == null : aucp.equals(afza.b())) {
                return this.c.equals(afza.c()) && this.d.equals(afza.d()) && this.e.equals(afza.e());
            }
        }
    }

    public final int hashCode() {
        int i;
        Class cls = this.a;
        int i2 = 0;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        int i3 = (i ^ 1000003) * 1000003;
        aucp aucp = this.b;
        if (aucp != null) {
            i2 = aucp.hashCode();
        }
        return ((((((i3 ^ i2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 81 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("PdsSyncMetadataManagerFactory{eventType=");
        sb.append(valueOf);
        sb.append(", enumMap=");
        sb.append(valueOf2);
        sb.append(", pdsFactory=");
        sb.append(valueOf3);
        sb.append(", clock=");
        sb.append(valueOf4);
        sb.append(", logger=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
