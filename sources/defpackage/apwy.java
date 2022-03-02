package defpackage;

/* renamed from: apwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apwy extends apwz {
    private final String a;
    private final String b;

    public apwy(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apwz) {
            apwz apwz = (apwz) obj;
            return this.a.equals(apwz.a()) && this.b.equals(apwz.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 38 + str2.length());
        sb.append("LibraryVersion{libraryName=");
        sb.append(str);
        sb.append(", version=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
