package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: abjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abjr implements View.OnClickListener {
    private final abjs a;
    private final avju b;

    public abjr(abjs abjs, avju avju) {
        this.a = abjs;
        this.b = avju;
    }

    public void onClick(View view) {
        abjs abjs = this.a;
        avju avju = this.b;
        if (!avju.c.isEmpty()) {
            Intent a2 = abgn.a(abjs.a.getIntent(), avju.c, abjs.c);
            abjs.d.a(jth.REPORTING_CHAIN_PERSON_BUTTON, jth.REPORTING_CHAIN_CARD);
            abjs.a.startActivityForResult(a2, 0);
        }
    }
}
