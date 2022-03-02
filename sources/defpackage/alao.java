package defpackage;

import android.content.DialogInterface;

/* renamed from: alao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alao implements DialogInterface.OnCancelListener {
    final /* synthetic */ alar a;

    public alao(alar alar) {
        this.a = alar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        akzz akzz = this.a.d.a;
        if (akzz != null) {
            akzz.a();
        }
    }
}
