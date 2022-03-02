package defpackage;

import android.content.Context;
import com.google.android.gms.userlocation.internal.UserLocationClientIdentifier;
import com.google.android.gms.userlocation.internal.UserLocationParameters;
import java.util.HashMap;

/* renamed from: adut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adut extends iby {
    private static final ibq b = new ibq("UserLocation.SEMANTIC_LOCATION_PROVIDER_API", new advk(), l);
    private static final ibg l = new ibg();
    public final UserLocationParameters a;

    static {
        new HashMap();
    }

    public adut(Context context, aduv aduv) {
        super(context, b, (ibm) aduv, ibx.a);
        this.a = new UserLocationParameters(aduv.a, new UserLocationClientIdentifier(context.getPackageName(), aduv.b), aduv.c);
    }
}
