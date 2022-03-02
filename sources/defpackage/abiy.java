package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: abiy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abiy implements View.OnClickListener {
    private final abiz a;
    private final Intent b;
    private final jth c;

    public abiy(abiz abiz, Intent intent, jth jth) {
        this.a = abiz;
        this.b = intent;
        this.c = jth;
    }

    public void onClick(View view) {
        abiz abiz = this.a;
        Intent intent = this.b;
        jth jth = this.c;
        if (intent.resolveActivity(abiz.a.getPackageManager()) != null) {
            abiz.b.a(jth, jth.GENERIC_CARD);
            abiz.a.startActivity(intent);
        }
    }
}
