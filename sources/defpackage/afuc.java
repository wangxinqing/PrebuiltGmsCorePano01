package defpackage;

/* renamed from: afuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afuc extends afuk {
    private final auco a;
    private final int b;

    public afuc(auco auco, int i) {
        if (auco != null) {
            this.a = auco;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null syncId");
    }

    public final auco a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afuk) {
            afuk afuk = (afuk) obj;
            return this.a.equals(afuk.a()) && this.b == afuk.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ afui.b(this.b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String a2 = afui.a(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + String.valueOf(a2).length());
        sb.append("SyncInfo{syncId=");
        sb.append(valueOf);
        sb.append(", syncContextType=");
        sb.append(a2);
        sb.append("}");
        return sb.toString();
    }
}
