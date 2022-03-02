package defpackage;

import android.view.View;

/* renamed from: adqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adqe implements View.OnClickListener {
    final /* synthetic */ adqg a;

    public adqe(adqg adqg) {
        this.a = adqg;
    }

    public void onClick(View view) {
        adqg.a.b("Action button clicked.", new Object[0]);
        adqf adqf = this.a.b;
        if (adqf != null) {
            adqf.a();
        }
    }
}
