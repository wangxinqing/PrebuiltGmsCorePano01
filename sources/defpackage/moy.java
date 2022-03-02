package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: moy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class moy implements View.OnClickListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ mpc b;

    public moy(mpc mpc, boolean z) {
        this.b = mpc;
        this.a = z;
    }

    public void onClick(View view) {
        String str;
        TextInputLayout textInputLayout = (TextInputLayout) this.b.c.findViewById(R.id.fm_credential_type);
        textInputLayout.b((CharSequence) null);
        String obj = ((EditText) this.b.c.findViewById(R.id.fm_reauth_password)).getText().toString();
        if (obj == null || obj.trim().length() == 0) {
            if (this.a) {
                str = this.b.getString(R.string.fm_missing_password);
            } else {
                str = this.b.getString(R.string.fm_missing_pin);
            }
            textInputLayout.b((CharSequence) str);
            return;
        }
        mpc mpc = this.b;
        mpc.getActivity().getSupportLoaderManager().initLoader(mpc.b.aS(), (Bundle) null, new moz(mpc, this.a, (EditText) mpc.c.findViewById(R.id.fm_reauth_password)));
    }
}
