package defpackage;

import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.drivingmode.ToggleButtonPreference;

/* renamed from: lxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class lxf implements View.OnClickListener {
    private final ToggleButtonPreference a;

    public lxf(ToggleButtonPreference toggleButtonPreference) {
        this.a = toggleButtonPreference;
    }

    public void onClick(View view) {
        boolean z;
        ToggleButtonPreference toggleButtonPreference = this.a;
        int id = view.getId();
        if (id == R.id.on_button) {
            z = false;
        } else {
            z = true;
        }
        toggleButtonPreference.h(z);
        lwo lwo = toggleButtonPreference.c;
        if (lwo != null) {
            lwr lwr = lwo.a;
            if (id == R.id.on_button) {
                lwr.d.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_MANUAL_TOGGLE_DISABLED);
                lwr.e.b(lxg.MANUAL);
                return;
            }
            lwr.d.a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_MANUAL_TOGGLE_ENABLED);
            lwr.e.c(lxg.MANUAL);
        }
    }
}
