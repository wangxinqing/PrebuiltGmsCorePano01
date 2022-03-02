package defpackage;

/* renamed from: ahbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahbd {
    public final String a;
    public final String b;

    public ahbd(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        if (this.b == null) {
            return ahbe.b(this.a);
        }
        String b2 = ahbe.b(this.a);
        String b3 = ahbe.b(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 1 + String.valueOf(b3).length());
        sb.append(b2);
        sb.append("=");
        sb.append(b3);
        return sb.toString();
    }
}
