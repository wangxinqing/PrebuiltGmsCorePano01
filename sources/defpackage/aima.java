package defpackage;

import android.location.Location;
import java.util.Comparator;

/* renamed from: aima  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aima implements Comparator {
    final /* synthetic */ Location a;

    public aima(Location location) {
        this.a = location;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Double.compare(((aijt) obj).a(this.a), ((aijt) obj2).a(this.a));
    }
}
