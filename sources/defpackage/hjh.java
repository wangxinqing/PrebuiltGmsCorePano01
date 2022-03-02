package defpackage;

import java.util.Locale;

/* renamed from: hjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hjh {
    public static hjg a(int i) {
        if (i == 1) {
            return new hjk();
        }
        if (i == 2) {
            return new hjj();
        }
        if (i == 4) {
            return new hjf();
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Unable to create the processor with data type: %d.", new Object[]{Integer.valueOf(i)}));
    }
}
