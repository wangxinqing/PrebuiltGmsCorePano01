package defpackage;

import android.content.DialogInterface;

/* renamed from: msc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class msc implements DialogInterface.OnClickListener {
    private final msl a;

    public msc(msl msl) {
        this.a = msl;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.d.toggle();
    }
}
