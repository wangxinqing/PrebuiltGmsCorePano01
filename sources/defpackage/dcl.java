package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: dcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dcl implements View.OnClickListener {
    private final dcm a;
    private final cyf b;

    public dcl(dcm dcm, cyf cyf) {
        this.a = dcm;
        this.b = cyf;
    }

    public void onClick(View view) {
        dcm dcm = this.a;
        cyf cyf = this.b;
        if (!cyf.e) {
            Intent intent = cyf.f;
            if (intent != null) {
                dcm.startActivityForResult(intent, 9);
                return;
            }
            return;
        }
        dgw dgw = dcm.a;
        dgw.b.a(((dfh) dgw.a).a);
    }
}
