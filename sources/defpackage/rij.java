package defpackage;

import android.content.Context;

@Deprecated
/* renamed from: rij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rij {
    public static final ibq a = new ibq("Places.GEO_DATA_API", new rjm(), c);
    public static final ibq b = new ibq("Places.PLACE_DETECTION_API", new rkh(), d);
    public static final ibg c = new ibg();
    public static final ibg d = new ibg();
    @Deprecated
    public static final rjl e = new rjl();

    @Deprecated
    public static rhv a(Context context) {
        return a(context, (rir) null);
    }

    @Deprecated
    public static rhh b(Context context, rir rir) {
        if (rir == null) {
            rir = new riq().a();
        }
        return new rhh(context, rir);
    }

    @Deprecated
    public static rhv a(Context context, rir rir) {
        if (rir == null) {
            rir = new riq().a();
        }
        return new rhv(context, b, rir);
    }
}
