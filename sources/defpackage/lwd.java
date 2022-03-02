package defpackage;

import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: lwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lwd extends lut {
    final /* synthetic */ lwe a;

    public lwd(lwe lwe) {
        this.a = lwe;
    }

    public final void a() {
        int i;
        lwe lwe = this.a;
        if (!lwe.o()) {
            i = R.string.car_driving_mode_frx_success_body_generic_trigger;
        } else {
            i = R.string.car_driving_mode_frx_success_body_car_dock_trigger;
        }
        ((TextView) lwe.getView().findViewById(R.id.body)).setText(lwe.b(lwe.getString(R.string.car_driving_mode_frx_success_body, lwe.a(i), lwe.a((int) R.string.car_driving_mode_frx_success_body_generic))));
    }
}
