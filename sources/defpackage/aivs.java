package defpackage;

import android.location.LocationListener;
import java.lang.ref.WeakReference;

/* renamed from: aivs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aivs {
    public final WeakReference a;
    public final int b;
    final LocationListener c = new aivr(this, "location", "CallbackRunner");

    public aivs(aivu aivu, int i) {
        this.a = new WeakReference(aivu);
        this.b = i;
    }
}
