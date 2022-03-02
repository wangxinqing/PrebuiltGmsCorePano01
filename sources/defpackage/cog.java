package defpackage;

/* renamed from: cog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cog extends cok {
    private final long a;
    private final cmm b;
    private final cmi c;

    public cog(long j, cmm cmm, cmi cmi) {
        this.a = j;
        if (cmm != null) {
            this.b = cmm;
            this.c = cmi;
            return;
        }
        throw new NullPointerException("Null transportContext");
    }

    public final long a() {
        return this.a;
    }

    public final cmm b() {
        return this.b;
    }

    public final cmi c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cok) {
            cok cok = (cok) obj;
            return this.a == cok.a() && this.b.equals(cok.b()) && this.c.equals(cok.c());
        }
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66 + String.valueOf(valueOf2).length());
        sb.append("PersistedEvent{id=");
        sb.append(j);
        sb.append(", transportContext=");
        sb.append(valueOf);
        sb.append(", event=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
