package defpackage;

import android.app.Activity;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: nyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nyw {
    public final Activity a;
    private final Object b;

    public nyw(com.google.android.chimera.Activity activity) {
        this.b = activity;
        this.a = activity.getContainerActivity();
    }

    public final void a(Intent intent) {
        ojm ojm;
        if (!intent.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        int i = ojn.a;
        int i2 = hxy.a;
        Object obj = this.b;
        if (obj == null) {
            ojm = nyy.a(this.a);
        } else {
            ojm = nyy.a((com.google.android.chimera.Activity) obj);
        }
        iva.a((Object) ojm.b);
        icc icc = ojm.j;
        ojh ojh = new ojh(icc, intent, new WeakReference(ojm.b));
        icc.a((idf) ojh);
        iux.a(ojh);
    }
}
