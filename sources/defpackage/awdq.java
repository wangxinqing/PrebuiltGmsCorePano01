package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: awdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awdq {
    public static List a(int i) {
        if (i != 0) {
            return new ArrayList(i);
        }
        return Collections.emptyList();
    }

    public static LinkedHashMap b(int i) {
        return new LinkedHashMap(c(i));
    }

    public static int c(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
