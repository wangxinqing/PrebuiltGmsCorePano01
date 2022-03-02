package defpackage;

/* renamed from: afmp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afmp extends afmt {
    private final boolean c;
    private final anax d;

    public afmp(boolean z, anax anax) {
        this.c = z;
        this.d = anax;
    }

    public final boolean a() {
        return this.c;
    }

    public final anax b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afmt) {
            afmt afmt = (afmt) obj;
            return this.c == afmt.a() && this.d.equals(afmt.b());
        }
    }

    public final int hashCode() {
        return (((!this.c ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        boolean z = this.c;
        String valueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73);
        sb.append("DownloadConstraints{requireUnmeteredNetwork=");
        sb.append(z);
        sb.append(", requiredNetworkTypes=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
