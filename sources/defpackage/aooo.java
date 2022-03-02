package defpackage;

import java.util.Comparator;

/* renamed from: aooo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aooo {
    static final String a;
    public static final Comparator b;

    static {
        Comparator comparator;
        String concat = String.valueOf(aooo.class.getName()).concat("$UnsafeComparator");
        a = concat;
        try {
            comparator = (Comparator) Class.forName(concat).getEnumConstants()[0];
        } catch (Throwable th) {
            comparator = aoon.a;
        }
        b = comparator;
    }

    aooo() {
    }
}
