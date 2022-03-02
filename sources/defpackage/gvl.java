package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: gvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gvl extends iby {
    private static final ibq a = new ibq("Checkin.API", l, b);
    private static final ibg b = new ibg();
    private static final ibn l = new gve();

    private gvl(Context context) {
        super(context, a, (ibm) null, (igu) new icz());
    }

    public static gvl a(Context context) {
        return new gvl(context);
    }

    public final acwa a(Bundle bundle) {
        return b((ihb) new gvf(bundle));
    }
}
