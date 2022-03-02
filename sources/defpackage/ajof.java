package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.CheckBox;

/* renamed from: ajof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajof implements DialogInterface.OnShowListener {
    final /* synthetic */ AlertDialog a;
    final /* synthetic */ CheckBox b;

    public ajof(AlertDialog alertDialog, CheckBox checkBox) {
        this.a = alertDialog;
        this.b = checkBox;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.a.getButton(-1).setEnabled(this.b.isChecked());
    }
}
