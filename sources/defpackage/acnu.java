package defpackage;

import android.content.DialogInterface;

/* renamed from: acnu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class acnu implements DialogInterface.OnClickListener {
    private final acnx a;

    public acnu(acnx acnx) {
        this.a = acnx;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        acnx acnx = this.a;
        int i2 = acny.a;
        acnx.p();
        dialogInterface.dismiss();
    }
}
