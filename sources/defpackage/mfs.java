package defpackage;

import android.content.DialogInterface;

/* renamed from: mfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mfs implements DialogInterface.OnClickListener {
    static final DialogInterface.OnClickListener a = new mfs();

    private mfs() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
