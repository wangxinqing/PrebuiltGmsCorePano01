package defpackage;

import android.content.DialogInterface;

/* renamed from: acoh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acoh implements DialogInterface.OnClickListener {
    final /* synthetic */ acom a;

    public acoh(acom acom) {
        this.a = acom;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        new qvr().post(new acog(this));
    }
}
