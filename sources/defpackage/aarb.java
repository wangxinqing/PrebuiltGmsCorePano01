package defpackage;

import android.content.DialogInterface;

/* renamed from: aarb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aarb implements DialogInterface.OnClickListener {
    final /* synthetic */ aarc a;
    final /* synthetic */ aard b;

    public aarb(aard aard, aarc aarc) {
        this.b = aard;
        this.a = aarc;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        aapx aapx = this.b.a;
        if (aapx != null) {
            aapx.a(4, 8);
        }
        aarc aarc = this.a;
        if (aarc != null) {
            aarc.e();
        }
    }
}
