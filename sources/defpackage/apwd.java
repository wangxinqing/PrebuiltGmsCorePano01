package defpackage;

/* renamed from: apwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apwd {
    public final Class a;
    private final int b;
    private final int c = 0;

    private apwd(Class cls, int i) {
        apwe.a((Object) cls, "Null dependency anInterface.");
        this.a = cls;
        this.b = i;
    }

    public static apwd a(Class cls) {
        return new apwd(cls, 0);
    }

    public static apwd b(Class cls) {
        return new apwd(cls, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof apwd) {
            apwd apwd = (apwd) obj;
            if (this.a == apwd.a && this.b == apwd.b) {
                int i = apwd.c;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        if (this.b != 1) {
            str = "optional";
        } else {
            str = "required";
        }
        sb.append(str);
        sb.append(", direct=true}");
        return sb.toString();
    }
}
