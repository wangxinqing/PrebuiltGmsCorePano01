package defpackage;

import android.content.DialogInterface;

/* renamed from: vhu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vhu implements DialogInterface.OnClickListener {
    static final DialogInterface.OnClickListener a = new vhu();

    private vhu() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
