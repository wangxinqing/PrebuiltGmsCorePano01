package defpackage;

import android.view.View;
import java.util.Iterator;

/* renamed from: ajvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajvh implements View.OnClickListener {
    final /* synthetic */ ajvl a;

    public ajvh(ajvl ajvl) {
        this.a = ajvl;
    }

    public void onClick(View view) {
        Iterator it = this.a.ag.iterator();
        while (it.hasNext()) {
            this.a.ai.a();
            ((ajvm) it.next()).a();
        }
        this.a.dismiss();
    }
}
