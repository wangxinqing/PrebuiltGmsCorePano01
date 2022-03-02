package defpackage;

import java.util.Locale;

/* renamed from: mzr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mzr extends Exception {
    public mzr(int i) {
        super(String.format(Locale.US, "Error code %d is not supported", new Object[]{Integer.valueOf(i)}));
    }
}
