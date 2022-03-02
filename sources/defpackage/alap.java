package defpackage;

import android.content.DialogInterface;

/* renamed from: alap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alap implements DialogInterface.OnClickListener {
    final /* synthetic */ alar a;

    public alap(alar alar) {
        this.a = alar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        akzz akzz = this.a.d.a;
        if (akzz != null) {
            akzz.a();
        }
    }
}
