package defpackage;

import android.location.Location;
import java.util.Comparator;

/* renamed from: aiej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiej implements Comparator {
    static final Comparator a = new aiej();

    private aiej() {
    }

    public final int compare(Object obj, Object obj2) {
        int i = aien.m;
        long elapsedRealtimeNanos = ((Location) obj).getElapsedRealtimeNanos();
        long elapsedRealtimeNanos2 = ((Location) obj2).getElapsedRealtimeNanos();
        if (elapsedRealtimeNanos >= elapsedRealtimeNanos2) {
            return elapsedRealtimeNanos != elapsedRealtimeNanos2 ? 1 : 0;
        }
        return -1;
    }
}
