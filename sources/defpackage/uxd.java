package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import java.util.Set;

/* renamed from: uxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uxd {
    public final Set a = new ob();
    public final ComponentCallbacks2 b;
    public final Context c;
    public final arwg d;

    public uxd(Context context) {
        int i = Build.VERSION.SDK_INT;
        jjg jjg = tgc.a;
        this.c = context;
        this.d = (arwg) thl.a(context, arwg.class);
        uxb uxb = new uxb(this);
        this.b = uxb;
        this.c.registerComponentCallbacks(uxb);
    }

    public final void a(uxc uxc) {
        int i = Build.VERSION.SDK_INT;
        this.a.add(uxc);
    }
}
