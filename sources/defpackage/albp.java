package defpackage;

import android.view.View;

/* renamed from: albp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class albp implements View.OnClickListener {
    final /* synthetic */ albv a;

    public albp(albv albv) {
        this.a = albv;
    }

    public void onClick(View view) {
        albv albv = this.a;
        albu albu = albv.a;
        if (albu != null) {
            albu.a(albv.g);
        }
    }
}
