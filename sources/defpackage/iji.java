package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: iji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iji extends DialogFragment {
    public ijh a;

    public static iji a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, boolean z) {
        iji iji = new iji();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("message", charSequence2);
        bundle.putBoolean("cancelable", z);
        if (charSequence != null) {
            bundle.putCharSequence("title", charSequence);
        }
        if (charSequence3 != null) {
            bundle.putCharSequence("positive_button", charSequence3);
        }
        if (charSequence4 != null) {
            bundle.putCharSequence("neutral_button", charSequence4);
        }
        if (charSequence5 != null) {
            bundle.putCharSequence("negative_button", charSequence5);
        }
        iji.setArguments(bundle);
        return iji;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = (ijh) activity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.a.a(this, 4);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        AlertDialog.Builder message = new AlertDialog.Builder(getActivity()).setMessage(arguments.getCharSequence("message"));
        if (arguments.containsKey("title")) {
            message.setTitle(arguments.getCharSequence("title"));
        }
        if (arguments.containsKey("positive_button")) {
            message.setPositiveButton(arguments.getCharSequence("positive_button"), new ije(this));
        }
        if (arguments.containsKey("neutral_button")) {
            message.setNeutralButton(arguments.getCharSequence("neutral_button"), new ijf(this));
        }
        if (arguments.containsKey("negative_button")) {
            message.setNegativeButton(arguments.getCharSequence("negative_button"), new ijg(this));
        }
        AlertDialog create = message.create();
        boolean z = arguments.getBoolean("cancelable", true);
        create.setCanceledOnTouchOutside(z);
        create.setCancelable(z);
        return create;
    }

    public static iji a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z) {
        return a((CharSequence) null, charSequence, charSequence2, (CharSequence) null, charSequence3, z);
    }
}
