package defpackage;

import android.content.DialogInterface;

/* renamed from: acnp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acnp implements DialogInterface.OnClickListener {
    final /* synthetic */ acnt a;

    public acnp(acnt acnt) {
        this.a = acnt;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(true);
    }
}
