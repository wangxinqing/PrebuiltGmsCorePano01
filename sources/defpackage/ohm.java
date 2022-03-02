package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: ohm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ohm implements View.OnClickListener {
    final /* synthetic */ Intent a;
    final /* synthetic */ oho b;

    public ohm(oho oho, Intent intent) {
        this.b = oho;
        this.a = intent;
    }

    public void onClick(View view) {
        this.b.a(151);
        this.b.getActivity().startActivityForResult(this.a, 0);
    }
}
