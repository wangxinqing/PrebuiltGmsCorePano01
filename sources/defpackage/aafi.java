package defpackage;

import android.content.Context;

/* renamed from: aafi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aafi {
    public static final ibg a = new ibg();
    public static final ibg b = new ibg();
    public static final ibg c = new ibg();
    public static final ibg d = new ibg();
    public static final ibg e = new ibg();
    public static final ibg f = new ibg();
    static final ibn g = new aafc();
    static final ibn h = new aafd();
    static final ibn i = new aafe();
    static final ibn j = new aaff();
    static final ibn k = new aafg();
    static final ibn l = new aafh();

    static {
        new ibq("SearchIndex.ADMINISTRATION_API", g, a);
        new ibq("SearchIndex.QUERIES_API", h, b);
        new ibq("SearchIndex.GLOBAL_ADMIN_API", i, c);
        new ibq("SearchIndex.CORPORA_API", j, d);
        new ibq("SearchIndex.IME_UPDATES_API", k, e);
        new ibq("SearchIndex.NATIVE_API", l, f);
    }

    public static aajk a(Context context) {
        return new aakd(context);
    }

    public static aagp b(Context context) {
        return new aahk(context);
    }

    public static aalw a(Context context, aafk aafk) {
        return new aamm(context, aafk);
    }

    public static aaig b(Context context, aafk aafk) {
        return new aaiz(context, aafk);
    }
}
