package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: ymw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ymw extends DialogFragment implements DialogInterface.OnClickListener {
    private ymv a;
    private CharSequence b;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof ymv) {
            this.a = (ymv) activity;
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        ymv ymv = this.a;
        if (ymv != null) {
            ymv.a();
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ymv ymv;
        if (i == -1 && (ymv = this.a) != null) {
            ymv.a();
        }
        dismiss();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = getArguments().getCharSequence("message");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(getActivity()).setIcon(0).setPositiveButton(17039370, this);
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.plus_delete_moment_dialog_contents, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.message);
        textView.setText(this.b);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return positiveButton.setView(inflate).setInverseBackgroundForced(true).create();
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }
}
