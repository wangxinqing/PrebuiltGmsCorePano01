package defpackage;

import android.content.Context;

/* renamed from: aaiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaiz extends iby implements aaig {
    private static final ibq a = new ibq("SearchIndex.CORPORA_API", l, b);
    private static final ibg b = new ibg();
    private static final ibn l = new aaiy();

    public aaiz(Context context, aafk aafk) {
        super(context, a, (ibm) aafk, ibx.a);
    }

    public final acwa a(String str, String str2) {
        iha b2 = ihb.b();
        b2.a = new aaiv(str, str2);
        return a(b2.a());
    }

    public final acwa b(String str, String str2) {
        iha b2 = ihb.b();
        b2.a = new aaiw(str, str2);
        return a(b2.a());
    }

    public final acwa a(String str, String str2, long j) {
        iha b2 = ihb.b();
        b2.a = new aaiu(str, str2, j);
        return a(b2.a());
    }
}
