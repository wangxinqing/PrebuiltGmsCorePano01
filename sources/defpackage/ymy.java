package defpackage;

import android.content.DialogInterface;

/* renamed from: ymy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ymy implements DialogInterface.OnClickListener {
    final /* synthetic */ yna a;

    public ymy(yna yna) {
        this.a = yna;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ((ymz) this.a.getActivity()).a();
    }
}
