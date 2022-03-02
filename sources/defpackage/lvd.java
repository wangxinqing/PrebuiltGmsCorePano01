package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.util.Log;
import com.android.setupwizardlib.items.Item;
import com.android.setupwizardlib.items.SwitchItem;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: lvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lvd extends lwc {
    public final SwitchItem a = new SwitchItem();
    public final Item b = new Item();
    public final Item c = new Item();
    public final List d = new ArrayList();
    public final Map e = new HashMap();
    public luu f;
    private ltb i;

    public static boolean g() {
        return awqd.c() && awqd.e() && axxd.c();
    }

    private final void s() {
        if (n()) {
            r();
        } else {
            m().c(new lwe());
        }
    }

    public final bdk a() {
        return new lvc(this);
    }

    public final anxx b() {
        return anxx.DRIVING_MODE_FRX_AUTOLAUNCH_TRIGGER;
    }

    public final CharSequence c() {
        return getString(R.string.car_driving_mode_frx_autolaunch_trigger_header);
    }

    public final void d() {
        s();
    }

    public final CharSequence e() {
        return n() ? getString(R.string.common_done) : getString(R.string.common_continue);
    }

    public final void f() {
        s();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lww.a();
        luu f2 = lww.f(getContext());
        this.f = f2;
        f2.k();
        this.b.h();
        this.b.d(R.layout.car_driving_mode_frx_section_header_item);
        this.b.b(getString(R.string.car_driving_mode_frx_autolaunch_ar_trigger_section_header));
        this.a.d(R.layout.car_driving_mode_frx_summary_only_switch_item);
        this.a.a((CharSequence) getString(R.string.car_driving_mode_frx_autolaunch_ar_trigger_summary));
        this.a.f = new lux(this);
        this.c.h();
        this.c.d(R.layout.car_driving_mode_frx_section_header_item);
        this.c.b(getString(R.string.car_driving_mode_frx_autolaunch_bluetooth_trigger_section_header));
        lww.a();
        ltb c2 = lww.c(getContext());
        this.i = c2;
        List c3 = c2.c();
        int size = c3.size();
        for (int i2 = 0; i2 < size; i2++) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) c3.get(i2);
            SwitchItem switchItem = new SwitchItem();
            switchItem.b(this.i.a(bluetoothDevice));
            switchItem.c = kf.a(getContext(), (int) R.drawable.quantum_ic_bluetooth_grey600_24);
            switchItem.b();
            switchItem.f = new luy(this, bluetoothDevice);
            this.e.put(switchItem, bluetoothDevice);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f.n();
    }

    public final void onPause() {
        super.onPause();
        if (this.f.j() == 2) {
            this.f.b(this.f.a().a());
        }
        this.f.a((lut) null);
        this.d.clear();
    }

    public final void onResume() {
        super.onResume();
        Log.i("CAR.DRIVINGMODE", "DrivingModeFrxBluetoothAutoLaunchFragment#onResume");
        this.f.a((lut) new lvb(this));
    }

    public final void a(bdi bdi) {
        SwitchItem switchItem = (SwitchItem) bdi;
        switchItem.a(!switchItem.e);
        this.g.a(anxx.DRIVING_MODE_FRX_AUTOLAUNCH_TRIGGER, anxw.DRIVING_MODE_FRX_SWITCH_TOGGLED);
        this.h.as();
    }
}
