package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: lum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lum extends DialogFragment {
    public luu a;
    public ltp b;
    public LinearLayout c;
    ss d;
    private final lut e = new lul(this);

    public final void a(LayoutInflater layoutInflater, CharSequence charSequence, CharSequence charSequence2, boolean z, String str) {
        View inflate = layoutInflater.inflate(R.layout.car_driving_mode_behavior_radio, this.c, false);
        inflate.setTag(R.id.car_driving_mode_behavior_option_tag_id, str);
        ((Checkable) inflate).setChecked(z);
        ((TextView) inflate.findViewById(16908310)).setText(charSequence);
        TextView textView = (TextView) inflate.findViewById(16908304);
        if (TextUtils.isEmpty(charSequence2)) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence2);
        }
        inflate.setOnClickListener(new luk(this, str));
        this.c.addView(inflate);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lww.a();
        luu f = lww.f(getContext());
        this.a = f;
        f.k();
        lww.a();
        this.b = lww.d(getContext());
        lww.a();
        lww.e(getContext()).a(anxx.DRIVING_MODE, anxw.DRIVING_MODE_BEHAVIOR_SETTINGS);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        ss b2 = new sr(getContext()).b();
        this.d = b2;
        b2.setTitle((int) R.string.car_driving_mode_behavior_title);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.car_driving_mode_behavior_dialog_container, (ViewGroup) null);
        this.d.a.b(inflate);
        this.c = (LinearLayout) inflate.findViewById(R.id.container);
        return this.d;
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
        Log.i("CAR.DRIVINGMODE", "DrivingModeBehaviorDialogFragment#onResume");
        this.a.a(this.e);
    }

    public final void a(String str) {
        Intent makeMainActivity = Intent.makeMainActivity(lto.c());
        makeMainActivity.putExtra("FRX_START_FRAGMENT", str);
        startActivity(makeMainActivity);
    }
}
