package defpackage;

/* renamed from: anhu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anhu {
    private final anhy a;
    private final String b;

    public anhu(anhy anhy, String str) {
        ankq.a(anhy, "log site");
        this.a = anhy;
        ankq.a(str, "log site key");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anhu) {
            anhu anhu = (anhu) obj;
            if (!this.a.equals(anhu.a) || !this.b.equals(anhu.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + str.length());
        sb.append("SpecializedLogSiteKey{ logSite=");
        sb.append(valueOf);
        sb.append(", extraKey='");
        sb.append(str);
        sb.append("' }");
        return sb.toString();
    }
}
