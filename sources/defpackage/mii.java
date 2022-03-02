package defpackage;

import android.content.DialogInterface;

/* renamed from: mii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mii implements DialogInterface.OnClickListener {
    private final mij a;

    public mii(mij mij) {
        this.a = mij;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mij mij = this.a;
        if (mij.a.o()) {
            mij.a.j();
            dialogInterface.dismiss();
            return;
        }
        mij.a.m();
    }
}
