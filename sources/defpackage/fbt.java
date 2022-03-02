package defpackage;

import android.view.View;
import com.google.android.gms.R;

/* renamed from: fbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class fbt extends adl {
    final View w;

    protected fbt(View view) {
        super(view);
        this.w = view.findViewById(R.id.container);
    }

    public abstract void a(pzh pzh, pzq pzq);
}
