package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: lvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lvt extends lvi {
    private boolean a;

    public final anxx b() {
        return anxx.DRIVING_MODE_FRX_GEARHEAD_SETUP;
    }

    public final CharSequence c() {
        return getString(R.string.car_driving_mode_frx_loading_screen_header);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder sb = new StringBuilder(85);
        sb.append("DrivingModeFrxGearheadSetupFragment#onActivityResult: ");
        sb.append(i);
        sb.append(" rescode:");
        sb.append(i2);
        Log.i("CAR.DRIVINGMODE", sb.toString());
        if (i == 1) {
            this.a = true;
            if (i2 == -1) {
                a("com.google.android.projection.gearhead");
            } else {
                getActivity().finish();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.car_driving_mode_frx_progress, viewGroup, false);
        a(inflate);
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        if (this.a) {
            a("com.google.android.projection.gearhead");
            return;
        }
        lww.a();
        lvy h = lww.h(getContext());
        if ((getArguments() == null || !getArguments().getBoolean("DrivingModeFrxGearheadSetupFragment.force_launch", false)) && h.b()) {
            a("com.google.android.projection.gearhead");
            return;
        }
        lww.a();
        lww.e(getContext()).a(anxx.DRIVING_MODE_FRX_GEARHEAD_SETUP, anxw.DRIVING_MODE_FRX_LAUNCHES_GEARHEAD_FRX);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.frx.SetupActivity"));
        intent.setAction("frx_vanagon_start");
        intent.addCategory("com.google.android.gms.car.drivingMode.category.DEFAULT");
        startActivityForResult(intent, 1);
    }
}
