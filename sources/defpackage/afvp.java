package defpackage;

/* renamed from: afvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afvp extends afxk {
    private final Object a;
    private final Object b;

    public afvp(Object obj, Object obj2) {
        if (obj != null) {
            this.a = obj;
            if (obj2 != null) {
                this.b = obj2;
                return;
            }
            throw new NullPointerException("Null storedResponse");
        }
        throw new NullPointerException("Null rpcResponse");
    }

    public final Object a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afxk) {
            afxk afxk = (afxk) obj;
            return this.a.equals(afxk.a()) && this.b.equals(afxk.b());
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Object obj = this.b;
        aucj aucj = (aucj) obj;
        int i = aucj.S;
        if (i == 0) {
            i = aueh.a.a(obj).a(obj);
            aucj.S = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
        sb.append("ResponseHolder{rpcResponse=");
        sb.append(valueOf);
        sb.append(", storedResponse=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
