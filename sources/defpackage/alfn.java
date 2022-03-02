package defpackage;

/* renamed from: alfn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alfn extends alfo {
    public alfn() {
        super(amzy.a((Object) alfg.COLLAPSED, (Object) alfg.FULLY_EXPANDED));
    }

    public final alfg a(alfg alfg) {
        return alfg == alfg.EXPANDED ? alfg.FULLY_EXPANDED : alfg;
    }

    public final alfg b(alfg alfg) {
        alfg alfg2 = alfg.e;
        return alfg2 == alfg.EXPANDED ? alfg.COLLAPSED : alfg2;
    }
}
