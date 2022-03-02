package defpackage;

import android.content.DialogInterface;

/* renamed from: mit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mit implements DialogInterface.OnClickListener {
    private final miw a;

    public mit(miw miw) {
        this.a = miw;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        miw miw = this.a;
        miw.a.r.a(3, 8, "updaterequired");
        miw.a.c(-3);
    }
}
