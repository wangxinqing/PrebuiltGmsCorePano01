package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import com.google.android.gms.R;

/* renamed from: mxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mxb implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ mxc a;

    public mxb(mxc mxc) {
        this.a = mxc;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        mxc mxc = this.a;
        if (i == 0) {
            ((CheckBox) mxc.a((int) R.id.gf_include_screenshot)).setChecked(false);
            ((CheckBox) mxc.a((int) R.id.gf_include_logs)).setChecked(false);
        }
        if (mxc.getActivity() instanceof mwa) {
            ((mwa) mxc.getActivity()).a(i);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
