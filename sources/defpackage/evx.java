package defpackage;

import android.content.DialogInterface;

/* renamed from: evx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class evx implements DialogInterface.OnShowListener {
    private final evy a;
    private final ajtu b;

    public evx(evy evy, ajtu ajtu) {
        this.a = evy;
        this.b = ajtu;
    }

    public final void onShow(DialogInterface dialogInterface) {
        evy evy = this.a;
        evy.b = this.b.a();
        evy.c.a(evy.b);
    }
}
