package defpackage;

import android.view.View;
import com.google.android.gms.R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: mox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mox implements View.OnClickListener {
    final /* synthetic */ mpc a;

    public mox(mpc mpc) {
        this.a = mpc;
    }

    public void onClick(View view) {
        ((TextInputLayout) this.a.c.findViewById(R.id.fm_credential_type)).b((CharSequence) null);
        this.a.dismiss();
    }
}
