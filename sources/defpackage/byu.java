package defpackage;

import com.google.android.contextmanager.fence.PlaceFenceHelper;

/* renamed from: byu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class byu implements Runnable {
    final /* synthetic */ byy a;
    final /* synthetic */ int b;
    final /* synthetic */ PlaceFenceHelper c;

    public byu(PlaceFenceHelper placeFenceHelper, byy byy, int i) {
        this.c = placeFenceHelper;
        this.a = byy;
        this.b = i;
    }

    public final void run() {
        PlaceFenceHelper placeFenceHelper = this.c;
        byy byy = this.a;
        int i = this.b;
        byz byz = (byz) placeFenceHelper.b.get(byy);
        if (byz == null) {
            ((anih) ((anih) bxk.a.b()).a("com.google.android.contextmanager.fence.PlaceFenceHelper", "a", 208, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PlaceFenceHelper] No record for NearbyAlertKey");
            return;
        }
        long a2 = cbi.i().a();
        for (bzv bzv : byz.a.keySet()) {
            int i2 = 0;
            new Object[1][0] = Integer.valueOf(i);
            cbi.G().a();
            int i3 = bzv.f;
            if (i != 2) {
                i2 = i == 1 ? 1 : i3;
            }
            if (i2 != i3) {
                bzv.g = i3;
                bzv.f = i2;
                bzv.h = a2;
                if (i2 != 1 || bzv.m() <= 0) {
                    cbi.E().a(bzv.d);
                } else {
                    cbi.E().a(bzv.m(), bzv.d);
                }
            }
        }
        if (a2 - placeFenceHelper.f < 86400000 || placeFenceHelper.b.isEmpty()) {
            placeFenceHelper.f = a2;
            return;
        }
        placeFenceHelper.f = a2;
        placeFenceHelper.a();
    }
}
