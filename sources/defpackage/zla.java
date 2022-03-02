package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.chimera.DialogFragment;

/* renamed from: zla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zla extends DialogFragment implements DialogInterface.OnClickListener {
    public zkz a;
    private String b;
    private String c;

    public static zla a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("title", (String) null);
        bundle.putString("message", str);
        zla zla = new zla();
        zla.setArguments(bundle);
        return zla;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zkz zkz = this.a;
        if (zkz != null && i == -1) {
            zkz.c();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.b = arguments.getString("title");
        this.c = arguments.getString("message");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 2132019132));
        String str = this.b;
        if (str != null) {
            builder.setTitle(str);
        }
        return builder.setMessage(this.c).setPositiveButton(17039370, this).setNegativeButton(17039360, this).setCancelable(true).create();
    }
}
