package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.android.setupwizardlib.items.Item;
import com.google.android.gms.R;

/* renamed from: lvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lvl extends lwc {
    public luu a;

    public final bdk a() {
        return (bdk) new bdq(getContext()).a((int) R.xml.car_driving_mode_frx_choose_behavior_item_group);
    }

    public final anxx b() {
        return anxx.DRIVING_MODE_FRX_CHOOSE_BEHAVIOR;
    }

    public final CharSequence c() {
        return getString(R.string.car_driving_mode_frx_choose_behavior_header);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lww.a();
        luu f = lww.f(getContext());
        this.a = f;
        f.k();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.a.n();
    }

    public final void onResume() {
        int i;
        super.onResume();
        Log.i("CAR.DRIVINGMODE", "DrivingModeFrxChooseBehaviorFragment#onResume");
        if (!new lta().d(getContext())) {
            i = R.string.car_driving_mode_frx_choose_behavior_android_auto_not_installed_item_summary;
        } else {
            i = R.string.car_driving_mode_frx_choose_behavior_android_auto_item_summary;
        }
        Item item = (Item) this.h.a.c();
        if (item != null && !awqj.d() && item.d) {
            item.d = false;
            item.c(0);
        }
        item.a((CharSequence) getString(i));
    }

    public final void a(bdi bdi) {
        int i = ((Item) bdi).a;
        if (i == R.id.android_auto_item) {
            this.a.a((lut) new lvj(this));
        } else if (i == R.id.do_not_disturb_item) {
            lww.a();
            if (!lww.d(getContext()).a()) {
                m().c(new lvo());
            } else {
                this.a.a((lut) new lvk(this));
            }
        }
    }
}
