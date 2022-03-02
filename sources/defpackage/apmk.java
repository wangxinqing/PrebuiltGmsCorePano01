package defpackage;

import com.google.firebase.appindexing.internal.GetIndexableResponse;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: apmk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apmk extends apmp {
    private final acwd a;
    private final Class b;

    public final void a(GetIndexableResponse getIndexableResponse) {
        Thing thing;
        if (!getIndexableResponse.a.c() || ((thing = getIndexableResponse.b) != null && !this.b.isInstance(thing))) {
            this.a.a((Exception) apnd.a(getIndexableResponse.a, "GetIndexable error, please try again."));
        } else {
            this.a.a(this.b.cast(getIndexableResponse.b));
        }
    }

    public apmk(acwd acwd, Class cls) {
        this.a = acwd;
        this.b = cls;
    }
}
