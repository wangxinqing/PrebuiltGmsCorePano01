package defpackage;

import android.content.DialogInterface;

/* renamed from: acmb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acmb implements DialogInterface.OnClickListener {
    final /* synthetic */ acmd a;

    public acmb(acmd acmd) {
        this.a = acmd;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        acmd acmd = this.a;
        acmd.b.a(acmd.a, 2);
        this.a.dismiss();
    }
}
