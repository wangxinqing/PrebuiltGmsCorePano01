package defpackage;

/* renamed from: amqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amqf extends amqe {
    private final char a;
    private final char b;

    public amqf(char c, char c2) {
        amrl.a(c2 >= c);
        this.a = c;
        this.b = c2;
    }

    public final boolean a(char c) {
        return this.a <= c && c <= this.b;
    }

    public final String toString() {
        String c = amqm.c(this.a);
        String c2 = amqm.c(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 27 + String.valueOf(c2).length());
        sb.append("CharMatcher.inRange('");
        sb.append(c);
        sb.append("', '");
        sb.append(c2);
        sb.append("')");
        return sb.toString();
    }
}
