package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: yyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yyt extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), R.style.plus_oob_Interstitial);
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.plus_oob_interstitial, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(getArguments().getString("title_text"));
        ((TextView) inflate.findViewById(R.id.verbose_message)).setText(getArguments().getString("body_text"));
        inflate.findViewById(R.id.cancel_button).setVisibility(4);
        builder.setView(inflate);
        return builder.create();
    }
}
