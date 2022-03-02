package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: ga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ga implements DialogInterface.OnCancelListener {
    final /* synthetic */ gc a;

    public ga(gc gcVar) {
        this.a = gcVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        gc gcVar = this.a;
        Dialog dialog = gcVar.h;
        if (dialog != null) {
            gcVar.onCancel(dialog);
        }
    }
}
