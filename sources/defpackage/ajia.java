package defpackage;

import com.google.android.gms.beacon.BleSighting;
import java.util.Collections;
import java.util.List;

/* renamed from: ajia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajia extends gth {
    final /* synthetic */ ajic a;

    public ajia(ajic ajic) {
        this.a = ajic;
    }

    public final void a(int i) {
        if (i != 5) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Unable to scan for BLE beacons, errorCode: ");
            sb.append(i);
            ajix.c("GCoreUlr", sb.toString());
            return;
        }
        ajix.a("GCoreUlr", "Bluetooth disabled; disabling ULR BLE scanner");
        this.a.b();
        this.a.d();
    }

    public final void a(int i, BleSighting bleSighting) {
        if (i != 4) {
            this.a.a((List) ajml.a(this.a.c, Collections.singletonList(bleSighting)));
        }
    }

    public final void a(List list) {
        this.a.a((List) ajml.a(this.a.c, list));
    }
}
