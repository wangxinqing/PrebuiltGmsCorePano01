package defpackage;

import android.content.DialogInterface;

/* renamed from: albk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class albk implements DialogInterface.OnClickListener {
    final /* synthetic */ albm a;

    public albk(albm albm) {
        this.a = albm;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        albl albl = this.a.a;
        if (albl != null) {
            albl.h();
        }
    }
}
