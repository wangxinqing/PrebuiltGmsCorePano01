package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: jry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jry implements View.OnClickListener {
    private final jrz a;
    private final Intent b;

    public jry(jrz jrz, Intent intent) {
        this.a = jrz;
        this.b = intent;
    }

    public void onClick(View view) {
        jrz jrz = this.a;
        Intent intent = this.b;
        if (intent.resolveActivity(jrz.getActivity().getPackageManager()) != null) {
            jrz.getActivity().startActivity(intent);
        }
    }
}
