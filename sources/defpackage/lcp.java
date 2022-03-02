package defpackage;

import java.util.Locale;

/* renamed from: lcp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class lcp {
    public final lcr c;

    protected lcp(lcr lcr) {
        iva.a((Object) lcr);
        this.c = lcr;
    }

    public abstract String a();

    public final String toString() {
        return String.format(Locale.US, "Feed[%s:%s]", new Object[]{this.c, a()});
    }
}
