package defpackage;

import android.content.DialogInterface;

/* renamed from: dik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dik implements DialogInterface.OnClickListener {
    static final DialogInterface.OnClickListener a = new dik();

    private dik() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
