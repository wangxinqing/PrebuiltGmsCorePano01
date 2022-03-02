package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: ajpf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajpf implements View.OnClickListener {
    private final ajpg a;

    public ajpf(ajpg ajpg) {
        this.a = ajpg;
    }

    public void onClick(View view) {
        ajpg ajpg = this.a;
        iwq a2 = iwq.a((Context) ajpg);
        if (a2 != null) {
            String str = ajpg.i().a;
            if (str != null) {
                a2.d(str);
            }
            ajpg.finish();
        }
    }
}
