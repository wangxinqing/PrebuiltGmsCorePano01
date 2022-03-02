package defpackage;

import android.app.AlertDialog;
import android.widget.CompoundButton;

/* renamed from: ajoe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajoe implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ AlertDialog a;

    public ajoe(AlertDialog alertDialog) {
        this.a = alertDialog;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.getButton(-1).setEnabled(z);
    }
}
