package defpackage;

import android.bluetooth.BluetoothDevice;
import com.android.setupwizardlib.items.SwitchItem;
import java.util.Map;

/* renamed from: lvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lvb extends lut {
    final /* synthetic */ lvd a;

    public lvb(lvd lvd) {
        this.a = lvd;
    }

    public final void a() {
        boolean a2 = awqe.a.a().a();
        luu luu = this.a.f;
        boolean z = false;
        if (luu.f() && a2) {
            z = true;
        }
        luu.a(z);
        if (lvd.g() && this.a.f.f()) {
            this.a.a.a(a2);
            lvd lvd = this.a;
            lvd.d.add(lvd.b);
            lvd lvd2 = this.a;
            lvd2.d.add(lvd2.a);
        }
        if (!this.a.e.isEmpty()) {
            lvd lvd3 = this.a;
            lvd3.d.add(lvd3.c);
            for (Map.Entry entry : this.a.e.entrySet()) {
                SwitchItem switchItem = (SwitchItem) entry.getKey();
                switchItem.a(this.a.f.a(ltn.a((BluetoothDevice) entry.getValue())));
                this.a.d.add(switchItem);
            }
        }
        this.a.h.as();
    }
}
