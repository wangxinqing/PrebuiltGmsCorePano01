package defpackage;

/* renamed from: jsh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jsh extends jsr {
    private final String a;
    private final amri b;

    public jsh(String str, amri amri) {
        this.a = str;
        this.b = amri;
    }

    public final String a() {
        return this.a;
    }

    public final amri b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jsr) {
            jsr jsr = (jsr) obj;
            return this.a.equals(jsr.a()) && this.b.equals(jsr.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(valueOf).length());
        sb.append("TextEntryData{text=");
        sb.append(str);
        sb.append(", subtext=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
