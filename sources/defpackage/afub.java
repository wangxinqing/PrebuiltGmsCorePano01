package defpackage;

/* renamed from: afub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afub extends afud {
    private final auco a;
    private final aorr b;
    private final int c;

    public afub(auco auco, int i, aorr aorr) {
        if (auco != null) {
            this.a = auco;
            if (i != 0) {
                this.c = i;
                this.b = aorr;
                return;
            }
            throw new NullPointerException("Null syncContextType");
        }
        throw new NullPointerException("Null syncId");
    }

    public final auco a() {
        return this.a;
    }

    public final aorr b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afud) {
            afud afud = (afud) obj;
            return this.a.equals(afud.a()) && this.c == afud.c() && this.b.equals(afud.b());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ afui.b(this.c)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String a2 = afui.a(this.c);
        String valueOf2 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 56 + String.valueOf(a2).length() + String.valueOf(valueOf2).length());
        sb.append("MultiSyncResult{syncId=");
        sb.append(valueOf);
        sb.append(", syncContextType=");
        sb.append(a2);
        sb.append(", syncResults=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
