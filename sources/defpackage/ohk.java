package defpackage;

import android.content.DialogInterface;

/* renamed from: ohk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ohk implements DialogInterface.OnClickListener {
    final /* synthetic */ oho a;

    public ohk(oho oho) {
        this.a = oho;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }
}
