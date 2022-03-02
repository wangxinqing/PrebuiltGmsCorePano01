package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.chimera.DialogFragment;

/* renamed from: znd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class znd extends DialogFragment implements DialogInterface.OnClickListener {
    private String a;

    public static znd a(String str) {
        znd znd = new znd();
        znd.setArguments(b(str));
        return znd;
    }

    public static Bundle b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        return bundle;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dismiss();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getArguments().getString("message");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 2132019132)).setMessage(this.a).setNeutralButton(17039370, this).setIcon(17301543).setInverseBackgroundForced(true).create();
    }
}
