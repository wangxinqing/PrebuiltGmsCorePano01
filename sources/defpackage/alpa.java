package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: alpa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alpa {
    private static final List a = Arrays.asList(new Integer[]{400, 403, 404, 423, 500});

    public static boolean a(int i) {
        return a.contains(Integer.valueOf(i));
    }
}
