package defpackage;

import android.content.DialogInterface;

/* renamed from: mjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mjh implements DialogInterface.OnClickListener {
    private final mjk a;

    public mjh(mjk mjk) {
        this.a = mjk;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mjk mjk = this.a;
        if (mjk.a.o()) {
            mjk.a.j();
            dialogInterface.dismiss();
            return;
        }
        mjk.a.m();
    }
}
