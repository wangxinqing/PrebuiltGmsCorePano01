package defpackage;

import android.content.DialogInterface;

/* renamed from: cyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cyt implements DialogInterface.OnClickListener {
    private final cza a;
    private final String b;

    public cyt(cza cza, String str) {
        this.a = cza;
        this.b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        cza cza = this.a;
        String str = this.b;
        iva.c(str);
        cza.a(cza.b(str), 3);
    }
}
