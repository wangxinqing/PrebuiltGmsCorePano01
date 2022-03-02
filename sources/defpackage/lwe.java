package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.R;

/* renamed from: lwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lwe extends lvi {
    private luu a;

    private final void a() {
        lww.a();
        lww.h(getContext()).c();
        if (n()) {
            r();
        } else {
            getActivity().finish();
        }
    }

    public final anxx b() {
        return anxx.DRIVING_MODE_FRX_SUCCESS;
    }

    public final CharSequence c() {
        return getString(R.string.car_driving_mode_frx_success_header);
    }

    public final void d() {
        startActivity(Intent.makeMainActivity(lto.b()));
        a();
    }

    public final CharSequence e() {
        return getString(R.string.common_done);
    }

    public final void f() {
        a();
    }

    public final CharSequence h() {
        return "";
    }

    public final int i() {
        return R.drawable.car_driving_mode_frx_success_aa;
    }

    public final CharSequence j() {
        return getString(R.string.common_settings);
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

    public final void onPause() {
        super.onPause();
        this.a.a((lut) null);
    }

    public final void onResume() {
        super.onResume();
        Log.i("CAR.DRIVINGMODE", "DrivingModeFrxSuccessFragment#onResume");
        this.a.a((lut) new lwd(this));
    }
}
