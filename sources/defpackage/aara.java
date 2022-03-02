package defpackage;

import android.content.DialogInterface;

/* renamed from: aara  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aara implements DialogInterface.OnClickListener {
    private final aard a;

    public aara(aard aard) {
        this.a = aard;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        aapx aapx = this.a.a;
        if (aapx != null) {
            aapx.a(5, 8);
        }
    }
}
