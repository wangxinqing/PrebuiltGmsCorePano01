package defpackage;

import java.util.Collection;

/* renamed from: aega  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aega {
    public static final anaf a;
    private static final aefu b = new aefu(1, "HEADSET_AND_HANDS_FREE", "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");

    static {
        aefj.a(10498);
        anab h = anaf.h();
        h.a((short) 4363, new aefu(2, "A2DP", "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"));
        h.a((short) 4360, b);
        h.a((short) 4382, b);
        a = h.a();
    }

    public static short[] a() {
        return aoom.a((Collection) a.keySet());
    }
}
