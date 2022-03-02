package defpackage;

import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: jri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jri implements View.OnClickListener {
    private final jrk a;
    private final avju b;

    public jri(jrk jrk, avju avju) {
        this.a = jrk;
        this.b = avju;
    }

    public void onClick(View view) {
        jrk jrk = this.a;
        avju avju = this.b;
        jrk.a.a(jth.REPORTING_CHAIN_PERSON_BUTTON, jth.REPORTING_CHAIN_CARD);
        if (!avju.c.isEmpty()) {
            abfg abfg = jrk.g;
            String str = avju.c;
            Activity activity = abfg.a;
            activity.startActivityForResult(abgn.a(activity.getIntent(), str, abfg.b), 0);
        }
    }
}
