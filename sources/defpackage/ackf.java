package defpackage;

import android.content.DialogInterface;

/* renamed from: ackf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ackf implements DialogInterface.OnDismissListener {
    final /* synthetic */ ackh a;

    public ackf(ackh ackh) {
        this.a = ackh;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.c = null;
    }
}
