package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: mpc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mpc extends DialogFragment {
    public String a;
    public mpb b;
    public View c;

    public static mpc a(String str, String str2, String str3) {
        mpc mpc = new mpc();
        Bundle bundle = new Bundle(3);
        bundle.putString("accountName", str);
        bundle.putString("passwordTitle", str2);
        bundle.putString("pinTitle", str3);
        mpc.setArguments(bundle);
        return mpc;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.b = (mpb) mfy.a(mpb.class, getActivity());
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.getWindow().requestFeature(1);
        return onCreateDialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a = getArguments().getString("accountName");
        View inflate = layoutInflater.inflate(R.layout.fm_fragment_reauth_dialog, viewGroup, false);
        this.c = inflate;
        ((TextView) inflate.findViewById(R.id.fm_reauth_title)).setText(getArguments().getString("passwordTitle"));
        ((TextView) this.c.findViewById(R.id.fm_reauth_label)).setText(this.a);
        ((Button) this.c.findViewById(R.id.fm_reauth_cancel)).setOnClickListener(new mox(this));
        getActivity().getSupportLoaderManager().initLoader(this.b.aR(), (Bundle) null, new mpa(this));
        return this.c;
    }

    public final void onDetach() {
        super.onDetach();
        this.b = null;
    }

    public final void a(boolean z) {
        TextView textView = (TextView) this.c.findViewById(R.id.fm_reauth_title);
        EditText editText = (EditText) this.c.findViewById(R.id.fm_reauth_password);
        if (z) {
            textView.setText(getArguments().getString("passwordTitle"));
            editText.setInputType(129);
        } else {
            textView.setText(getArguments().getString("pinTitle"));
            editText.setInputType(18);
        }
        editText.requestFocus();
        ((Button) this.c.findViewById(R.id.fm_reauth_submit)).setOnClickListener(new moy(this, z));
    }
}
