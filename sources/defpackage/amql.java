package defpackage;

/* renamed from: amql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amql extends amqi {
    static final int a = Integer.numberOfLeadingZeros(31);
    public static final amql b = new amql();

    public amql() {
        super("CharMatcher.whitespace()");
    }

    public final boolean a(char c) {
        return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((48906 * c) >>> a) == c;
    }
}
