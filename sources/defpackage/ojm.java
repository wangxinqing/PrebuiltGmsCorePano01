package defpackage;

import android.app.Activity;
import android.content.Context;

/* renamed from: ojm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ojm extends iby {
    public static final nyu a = new ojl();
    public final Activity b;

    public ojm(Activity activity) {
        super(activity, nyy.a, ibx.a);
        this.b = activity;
    }

    public ojm(Context context) {
        super(context, nyy.a, (ibm) null, ibx.a);
        this.b = null;
    }

    public ojm(com.google.android.chimera.Activity activity) {
        super(activity, nyy.a, ibx.a);
        this.b = activity.getContainerActivity();
    }
}
