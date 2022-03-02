package defpackage;

/* renamed from: amqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amqg extends amqe {
    private final char a;

    public amqg(char c) {
        this.a = c;
    }

    public final boolean a(char c) {
        return c == this.a;
    }

    public final String toString() {
        String c = amqm.c(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(c);
        sb.append("')");
        return sb.toString();
    }
}
