package defpackage;

import android.view.View;

/* renamed from: pvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pvo implements View.OnClickListener {
    final /* synthetic */ pvt a;

    public pvo(pvt pvt) {
        this.a = pvt;
    }

    public void onClick(View view) {
        new pvs(this.a).execute(new String[]{this.a.s});
    }
}
