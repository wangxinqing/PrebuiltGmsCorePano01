package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: jzp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jzp {
    private static final ith a = new ith("FeatureChecker", "");

    public static boolean a(jzo jzo) {
        HashSet hashSet = new HashSet();
        for (String trim : ((String) jzq.I.c()).split(",")) {
            String trim2 = trim.trim();
            if (!TextUtils.isEmpty(trim2)) {
                try {
                    hashSet.add(jzo.a(trim2.toUpperCase(Locale.US)));
                } catch (IllegalArgumentException e) {
                    a.b("Can't disable feature, not found: %s", trim2);
                }
            }
        }
        return !hashSet.contains(jzo);
    }
}
