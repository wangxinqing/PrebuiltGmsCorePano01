package defpackage;

/* renamed from: afjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afjr extends afjp {
    public final afjx a;
    public final amri b;

    public afjr(afjx afjx, amri amri) {
        this.a = afjx;
        this.b = amri;
    }

    public final afjx a() {
        return this.a;
    }

    public final amri b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afjp) {
            afjp afjp = (afjp) obj;
            return this.a.equals(afjp.a()) && this.b.equals(afjp.b());
        }
    }

    public final int hashCode() {
        afjx afjx = this.a;
        int i = afjx.S;
        if (i == 0) {
            i = aueh.a.a((Object) afjx).a(afjx);
            afjx.S = i;
        }
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length());
        sb.append("AddFileGroupRequest{dataFileGroup=");
        sb.append(valueOf);
        sb.append(", accountOptional=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
