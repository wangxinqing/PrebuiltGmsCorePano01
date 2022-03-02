package defpackage;

import android.view.View;
import android.widget.Button;

/* renamed from: dcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dcy implements View.OnClickListener {
    private final ddf a;
    private final Button b;

    public dcy(ddf ddf, Button button) {
        this.a = ddf;
        this.b = button;
    }

    public void onClick(View view) {
        ddf ddf = this.a;
        this.b.setOnClickListener((View.OnClickListener) null);
        dhn dhn = ddf.a;
        dhn.d.a(ddf.h, 1, dhn.e, 0, 9);
        dgk dgk = dhn.a;
        dfd dfd = dgk.a;
        dfd.a.a(Long.valueOf(dgk.c.b));
        int b2 = ddf.b(ddf.f.c);
        ddd ddd = ddf.c;
        aqpw aqpw = ((aqry) ddf.b.c.get(b2)).d;
        if (aqpw == null) {
            aqpw = aqpw.c;
        }
        ddd.a(aqpw, new ddb(ddf));
    }
}
