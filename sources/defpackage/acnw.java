package defpackage;

import android.view.View;

/* renamed from: acnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acnw implements View.OnClickListener {
    final /* synthetic */ acnx a;
    final /* synthetic */ acny b;

    public acnw(acny acny, acnx acnx) {
        this.b = acny;
        this.a = acnx;
    }

    public void onClick(View view) {
        this.b.a(this.a);
    }
}
