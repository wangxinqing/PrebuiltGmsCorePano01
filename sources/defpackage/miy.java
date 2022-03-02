package defpackage;

import android.content.DialogInterface;

/* renamed from: miy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class miy implements DialogInterface.OnClickListener {
    private final miz a;

    public miy(miz miz) {
        this.a = miz;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        miz miz = this.a;
        if (miz.a.o()) {
            miz.a.j();
            dialogInterface.dismiss();
            return;
        }
        miz.a.m();
    }
}
