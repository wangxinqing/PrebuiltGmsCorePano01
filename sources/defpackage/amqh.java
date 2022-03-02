package defpackage;

/* renamed from: amqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amqh extends amqe {
    private final char a;
    private final char b;

    public amqh(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    public final boolean a(char c) {
        return c == this.a || c == this.b;
    }

    public final String toString() {
        String c = amqm.c(this.a);
        String c2 = amqm.c(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 21 + String.valueOf(c2).length());
        sb.append("CharMatcher.anyOf(\"");
        sb.append(c);
        sb.append(c2);
        sb.append("\")");
        return sb.toString();
    }
}
