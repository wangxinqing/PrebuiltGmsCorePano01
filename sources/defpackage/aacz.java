package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.Feature;

/* renamed from: aacz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aacz extends iby implements aabf {
    public static final /* synthetic */ int a = 0;
    private static final ibq b = new ibq("Scheduler.API", m, l);
    private static final ibg l = new ibg();
    private static final ibn m = new aacy();

    public aacz(Context context) {
        super(context, b, (ibm) null, ibx.a);
    }

    public final void a(Intent intent) {
        iha b2 = ihb.b();
        b2.b = new Feature[]{aaao.a};
        b2.a = new aacv(intent);
        a(b2.a());
    }
}
