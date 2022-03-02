package defpackage;

import android.content.DialogInterface;

/* renamed from: fdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fdt implements DialogInterface.OnShowListener {
    private final fdu a;
    private final ajtu b;

    public fdt(fdu fdu, ajtu ajtu) {
        this.a = fdu;
        this.b = ajtu;
    }

    public final void onShow(DialogInterface dialogInterface) {
        fdu fdu = this.a;
        fdu.b = this.b.a();
        fdu.c.a(fdu.b);
    }
}
