package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: jpf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jpf implements igp {
    final /* synthetic */ Bundle a;

    public jpf(Bundle bundle) {
        this.a = bundle;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        jpe jpe = new jpe((acwd) obj2);
        jpk jpk = (jpk) ((jpj) obj).x();
        Bundle bundle = this.a;
        Parcel aQ = jpk.aQ();
        bhx.a(aQ, (IInterface) jpe);
        bhx.a(aQ, (Parcelable) bundle);
        jpk.b(1, aQ);
    }
}
