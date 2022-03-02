package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: gb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gb implements DialogInterface.OnDismissListener {
    final /* synthetic */ gc a;

    public gb(gc gcVar) {
        this.a = gcVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        gc gcVar = this.a;
        Dialog dialog = gcVar.h;
        if (dialog != null) {
            gcVar.onDismiss(dialog);
        }
    }
}
