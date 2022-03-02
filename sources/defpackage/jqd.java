package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: jqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jqd implements View.OnClickListener {
    private final jqf a;
    private final Intent b;

    public jqd(jqf jqf, Intent intent) {
        this.a = jqf;
        this.b = intent;
    }

    public void onClick(View view) {
        jqf jqf = this.a;
        Intent intent = this.b;
        if (intent.resolveActivity(jqf.f.getPackageManager()) != null) {
            jqf.f.startActivity(intent);
        }
    }
}
