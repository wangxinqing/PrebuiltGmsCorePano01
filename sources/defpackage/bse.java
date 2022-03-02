package defpackage;

import android.content.DialogInterface;

/* renamed from: bse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bse implements DialogInterface.OnClickListener {
    final /* synthetic */ bsf a;

    public bse(bsf bsf) {
        this.a = bsf;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bsf bsf = this.a;
        bsf.a = i;
        bsf.b = -1;
        dialogInterface.dismiss();
    }
}
