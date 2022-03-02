package defpackage;

import android.view.View;
import java.util.Iterator;

/* renamed from: ajvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajvi implements View.OnClickListener {
    final /* synthetic */ ajvl a;

    public ajvi(ajvl ajvl) {
        this.a = ajvl;
    }

    public void onClick(View view) {
        Iterator it = this.a.ah.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
        this.a.dismiss();
    }
}
