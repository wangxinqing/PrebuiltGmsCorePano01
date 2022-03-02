package defpackage;

import android.content.DialogInterface;

/* renamed from: acma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acma implements DialogInterface.OnClickListener {
    final /* synthetic */ acmd a;

    public acma(acmd acmd) {
        this.a = acmd;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        acmd acmd = this.a;
        acmd.b.a(acmd.a, 1);
        this.a.dismiss();
    }
}
