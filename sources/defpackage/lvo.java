package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.drivingmode.DrivingModeFrxDndAccessRequestFragment$1;

/* renamed from: lvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lvo extends lvi {
    public luu a;
    public ltp b;
    private BroadcastReceiver c;

    public final void a() {
        if (this.c != null) {
            getContext().getApplicationContext().unregisterReceiver(this.c);
            this.c = null;
        }
    }

    public final anxx b() {
        return anxx.DRIVING_MODE_FRX_DND_ACCESS_REQUEST;
    }

    public final CharSequence c() {
        return getString(R.string.car_driving_mode_frx_dnd_access_request_header);
    }

    public final CharSequence e() {
        return getString(R.string.common_continue);
    }

    public final void f() {
        if (this.b.a()) {
            g();
        } else {
            startActivity(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"));
        }
    }

    public final void g() {
        a("car_pref_key_driving_mode_behavior_dnd_preference");
    }

    public final CharSequence h() {
        return a((int) R.string.car_driving_mode_frx_dnd_access_request_body);
    }

    public final int i() {
        return R.drawable.car_driving_mode_frx_dnd_request;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lww.a();
        this.b = lww.d(getContext());
        lww.a();
        luu f = lww.f(getContext());
        this.a = f;
        f.k();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.app.action.NOTIFICATION_POLICY_CHANGED");
        this.c = new DrivingModeFrxDndAccessRequestFragment$1(this, "car_setup");
        getContext().getApplicationContext().registerReceiver(this.c, intentFilter);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.a.n();
        a();
    }

    public final void onPause() {
        super.onPause();
        this.a.a((lut) null);
    }

    public final void onResume() {
        super.onResume();
        Log.i("CAR.DRIVINGMODE", "DrivingModeFrxDndAccessRequestFragment#onResume");
        this.a.a((lut) new lvm(this));
    }

    public final /* bridge */ /* synthetic */ CharSequence j() {
        return getString(R.string.common_cancel);
    }
}
