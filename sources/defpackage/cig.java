package defpackage;

import java.util.Comparator;

/* renamed from: cig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cig {
    private static final Comparator a = new cik();
    private static final Comparator b = new cii();

    protected static Comparator a(atjv atjv) {
        atjv atjv2 = atjv.UNKNOWN_CONTEXT_NAME;
        return atjv.ordinal() != 3 ? a : b;
    }
}
