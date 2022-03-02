package defpackage;

import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: aiff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiff implements amrm {
    static final amrm a = new aiff();

    private aiff() {
    }

    public final boolean a(Object obj) {
        int i = ((LocationRequestInternal) obj).b.a;
        return i == 100 || i == 102;
    }
}
