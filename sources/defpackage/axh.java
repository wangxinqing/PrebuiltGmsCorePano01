package defpackage;

import java.util.List;

/* renamed from: axh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axh {
    public final List a;
    public final double b;
    private final char c;
    private final String d;
    private final String e;

    public axh(List list, char c2, double d2, String str, String str2) {
        this.a = list;
        this.c = c2;
        this.b = d2;
        this.d = str;
        this.e = str2;
    }

    public static int a(char c2, String str, String str2) {
        return (((c2 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public final int hashCode() {
        return a(this.c, this.e, this.d);
    }
}
