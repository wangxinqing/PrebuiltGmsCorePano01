package defpackage;

import android.app.AlertDialog;
import android.view.View;
import com.google.android.gms.R;

/* renamed from: xrf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xrf implements View.OnClickListener {
    public final wum a;
    public final icc b;

    public xrf(icc icc, wum wum) {
        this.a = wum;
        this.b = icc;
    }

    public void onClick(View view) {
        new AlertDialog.Builder(view.getContext()).setMessage(this.a.b).setPositiveButton(R.string.people_settings_apdl_i_agree, new xrc(this, view)).setNegativeButton(17039360, new xrb()).show();
    }
}
