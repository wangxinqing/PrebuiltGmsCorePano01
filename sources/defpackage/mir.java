package defpackage;

import android.content.DialogInterface;

/* renamed from: mir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mir implements DialogInterface.OnClickListener {
    private final mis a;

    public mir(mis mis) {
        this.a = mis;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mis mis = this.a;
        if (mis.a.o()) {
            mis.a.j();
            dialogInterface.dismiss();
            return;
        }
        mis.a.m();
    }
}
