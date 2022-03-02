package defpackage;

import android.content.Context;
import android.os.SystemClock;

/* renamed from: adme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adme extends adlz {
    public static final adrk h = new adrk("delay", 0L);

    public adme(Context context, adre adre) {
        super("fixed-delay-execution", context, adre);
    }

    public static admd f() {
        return new admd();
    }

    /* access modifiers changed from: protected */
    public final long e() {
        return SystemClock.elapsedRealtime() + ((Long) a(h)).longValue();
    }
}
