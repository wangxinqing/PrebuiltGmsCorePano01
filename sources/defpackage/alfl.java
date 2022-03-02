package defpackage;

/* renamed from: alfl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alfl extends alfo {
    public alfl() {
        super(amzy.a((Object) alfg.HIDDEN, (Object) alfg.FULLY_EXPANDED));
    }

    public final alfg a(alfg alfg) {
        return alfg != alfg.COLLAPSED ? alfg == alfg.EXPANDED ? alfg.FULLY_EXPANDED : alfg : alfg.HIDDEN;
    }

    public final alfg b(alfg alfg) {
        alfg alfg2 = alfg.e;
        return alfg2 == alfg.EXPANDED ? alfg.HIDDEN : alfg2;
    }
}
