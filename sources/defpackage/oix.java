package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oix extends DialogFragment {
    public String[] a;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getArguments().getStringArray("phone_numbers");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(helpChimeraActivity);
        builder.setTitle(R.string.gh_pick_support_phone_number).setItems(this.a, new oiw(this, helpChimeraActivity));
        return builder.create();
    }
}
