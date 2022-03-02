package defpackage;

import android.os.Bundle;
import android.widget.EditText;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: moz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class moz implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ boolean a;
    final /* synthetic */ EditText b;
    final /* synthetic */ mpc c;

    public moz(mpc mpc, boolean z, EditText editText) {
        this.c = mpc;
        this.a = z;
        this.b = editText;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new mpr(this.c.getActivity(), this.c.a, this.a, this.b.getText().toString());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        String str;
        mhn mhn = (mhn) obj;
        mpc mpc = this.c;
        if (mpc.b != null) {
            if (mhn.a) {
                mfv.c("ReAuthDialogFragment", "Auth successful continue with action", new Object[0]);
                this.c.dismissAllowingStateLoss();
                this.c.b.aT();
            } else {
                TextInputLayout textInputLayout = (TextInputLayout) mpc.c.findViewById(R.id.fm_credential_type);
                int i = mhn.b;
                if (i == 0 || i != 1) {
                    if (this.a) {
                        str = this.c.getString(R.string.common_password);
                    } else {
                        str = this.c.getString(R.string.fm_pin_description);
                    }
                    textInputLayout.b((CharSequence) this.c.getResources().getString(R.string.fm_reauth_error, new Object[]{str}));
                } else if (this.a) {
                    textInputLayout.b((CharSequence) this.c.getResources().getString(R.string.fm_invalid_password));
                } else {
                    textInputLayout.b((CharSequence) this.c.getResources().getString(R.string.fm_invalid_pin));
                }
            }
            this.c.getActivity().getSupportLoaderManager().destroyLoader(this.c.b.aS());
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
