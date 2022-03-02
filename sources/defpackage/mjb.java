package defpackage;

import android.content.DialogInterface;

/* renamed from: mjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mjb implements DialogInterface.OnClickListener {
    private final mjc a;

    public mjb(mjc mjc) {
        this.a = mjc;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a.j();
        dialogInterface.dismiss();
    }
}
