package defpackage;

import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: aktf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aktf {
    public final String a;

    public aktf(String str) {
        this.a = str;
    }

    protected static final anui a(int i, int i2, long j, PlacesParams placesParams) {
        return akig.a(i, i2, Long.valueOf(System.currentTimeMillis() - j).intValue(), placesParams, 2);
    }

    public abstract anui a(int i, long j, PlacesParams placesParams, Object obj);

    public abstract Object a();
}
