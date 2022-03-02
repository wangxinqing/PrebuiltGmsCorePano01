package defpackage;

import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: aicq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aicq implements amrm {
    static final amrm a = new aicq();

    private aicq() {
    }

    public final boolean a(Object obj) {
        LocationRequest locationRequest = ((LocationRequestInternal) obj).b;
        return locationRequest.g > 0.0f || (ayaw.c() && ((long) locationRequest.a) >= ayaw.b());
    }
}
