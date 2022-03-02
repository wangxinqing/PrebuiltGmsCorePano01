package defpackage;

import android.view.View;

/* renamed from: pvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pvn implements View.OnClickListener {
    final /* synthetic */ pvt a;

    public pvn(pvt pvt) {
        this.a = pvt;
    }

    public void onClick(View view) {
        new pvp(this.a).execute(new String[]{this.a.s});
    }
}
