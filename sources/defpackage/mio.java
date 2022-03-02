package defpackage;

import android.content.DialogInterface;

/* renamed from: mio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mio implements DialogInterface.OnClickListener {
    private final mip a;

    public mio(mip mip) {
        this.a = mip;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a.j();
        dialogInterface.dismiss();
    }
}
