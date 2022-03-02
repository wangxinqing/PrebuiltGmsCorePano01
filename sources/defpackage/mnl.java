package defpackage;

import android.content.DialogInterface;

/* renamed from: mnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mnl implements DialogInterface.OnClickListener {
    private final mnm a;

    public mnl(mnm mnm) {
        this.a = mnm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        mnm mnm = this.a;
        mnm.a.c.clear();
        mnm.a.a.c();
    }
}
