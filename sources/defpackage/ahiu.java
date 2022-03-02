package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: ahiu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahiu extends ahis {
    public final ahld r;

    public ahiu(aizl aizl, ajqq ajqq, aizy aizy, aicn aicn, ahli ahli, ahld ahld) {
        super(aizl, ajqq, aicn, ahli);
        this.r = ahld;
    }

    /* access modifiers changed from: protected */
    public final ahtp a(Map map, int i, long j, aizx aizx, boolean z) {
        int i2 = i;
        ahuu ahuu = new ahuu(i, j / 1000000);
        Set a = ahup.a(ahup.ACCELEROMETER);
        if (z) {
            a.add(ahup.LIGHT);
        }
        return this.o.a(true, a, map, 0, ahuu, new ahit(this), "SignalCollector", aizx);
    }
}
