package defpackage;

import android.content.DialogInterface;
import android.widget.CheckBox;

/* renamed from: ajog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajog implements DialogInterface.OnDismissListener {
    final /* synthetic */ CheckBox a;

    public ajog(CheckBox checkBox) {
        this.a = checkBox;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.setChecked(false);
    }
}
