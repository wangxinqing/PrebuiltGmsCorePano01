package defpackage;

import com.google.android.gms.drive.networkcontrol.BatteryStateChangeReceiver;
import com.google.android.gms.drive.networkcontrol.ConnectivityChangeReceiver;
import java.util.HashSet;
import java.util.Set;

/* renamed from: lhv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lhv {
    protected final ConnectivityChangeReceiver a;
    public final lhk b;
    public final BatteryStateChangeReceiver c;
    public final kew d;
    public final lhx e;

    public final lhi a(boolean z, khq khq) {
        lhi lhi = new lhi(this.b);
        lhi.a((lhs) new lhj(this, lhi, z, khq));
        lhk lhk = this.b;
        lhe lhe = lhi.g;
        synchronized (((lhn) lhk).c) {
            if (!((lhn) lhk).e.add(lhe)) {
                lhn.a.c("NetworkStoreImpl", "Duplicate listener.");
            }
        }
        lhe.a();
        this.c.a((lgu) lhi.e);
        if (z) {
            lhx lhx = this.e;
            lhd lhd = lhi.f;
            lhy lhy = (lhy) lhx;
            Set set = lhy.b;
            iva.a((Object) lhd);
            if (set.add(lhd)) {
                lhd.a(lhy.a(lhy.a()));
            } else {
                lhy.a.c("PreferencesImpl", "Attempt to add duplicate sync preferences listener.");
            }
        } else {
            kew kew = this.d;
            lhd lhd2 = lhi.f;
            synchronized (((kex) kew).c) {
                Set set2 = (Set) ((kex) kew).c.get(khq);
                if (set2 == null) {
                    set2 = new HashSet();
                }
                set2.add(lhd2);
                lhd2.a(((kex) kew).a(khq));
                ((kex) kew).c.put(khq, set2);
            }
        }
        return lhi;
    }

    public lhv(ConnectivityChangeReceiver connectivityChangeReceiver, lhk lhk, BatteryStateChangeReceiver batteryStateChangeReceiver, kew kew, lhx lhx) {
        iva.a((Object) connectivityChangeReceiver);
        this.a = connectivityChangeReceiver;
        iva.a((Object) lhk);
        this.b = lhk;
        iva.a((Object) batteryStateChangeReceiver);
        this.c = batteryStateChangeReceiver;
        iva.a((Object) kew);
        this.d = kew;
        iva.a((Object) lhx);
        this.e = lhx;
    }

    public final lht a() {
        lia lia = new lia();
        lhz lhz = lia.a;
        this.a.a((lgu) lhz);
        lia.a((lhs) new lhu(this, lhz));
        return lia;
    }
}
