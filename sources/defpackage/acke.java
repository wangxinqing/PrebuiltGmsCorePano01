package defpackage;

import android.content.DialogInterface;

/* renamed from: acke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acke implements DialogInterface.OnClickListener {
    final /* synthetic */ ackh a;

    public acke(ackh ackh) {
        this.a = ackh;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.a.d.d();
        } else {
            dialogInterface.dismiss();
        }
    }
}
