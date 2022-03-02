package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.gms.R;

/* renamed from: msa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class msa implements View.OnClickListener {
    private final msl a;

    public msa(msl msl) {
        this.a = msl;
    }

    public void onClick(View view) {
        msl msl = this.a;
        if (msl.d.isChecked()) {
            new AlertDialog.Builder(msl.getContext()).setTitle(R.string.fast_pair_stop_saving_devices).setMessage(msl.getString(R.string.fast_pair_stop_saving_devices_description, msl.b().name)).setPositiveButton(R.string.fast_pair_turn_off, new msc(msl)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).show();
            return;
        }
        msl.d.toggle();
    }
}
