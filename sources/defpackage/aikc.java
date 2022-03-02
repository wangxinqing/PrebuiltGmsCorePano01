package defpackage;

import android.location.Location;
import android.util.Pair;
import java.util.LinkedList;

/* renamed from: aikc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aikc {
    public final LinkedList a = new LinkedList();
    public Pair b = null;

    public final boolean a(long j, long j2, long j3, int i) {
        LinkedList<Pair> linkedList = null;
        if (this.a.size() != 0 && j - ((Long) ((Pair) this.a.getLast()).first).longValue() < 180000) {
            LinkedList linkedList2 = new LinkedList();
            for (int size = this.a.size() - 1; size >= 0; size--) {
                Pair pair = (Pair) this.a.get(size);
                if (((Long) pair.first).longValue() > j || j - ((Long) pair.first).longValue() > j2) {
                    break;
                }
                if (((Location) pair.second).getAccuracy() <= 80.0f) {
                    linkedList2.add(0, pair);
                }
            }
            if (linkedList2.size() < i || ((Long) ((Pair) linkedList2.getLast()).first).longValue() - ((Long) ((Pair) linkedList2.getFirst()).first).longValue() < j3) {
                boolean z = aikq.a;
            } else {
                linkedList = linkedList2;
            }
        }
        if (linkedList == null) {
            return false;
        }
        double d = Double.POSITIVE_INFINITY;
        double d2 = Double.NEGATIVE_INFINITY;
        double d3 = Double.NaN;
        double d4 = Double.NaN;
        for (Pair pair2 : linkedList) {
            Location location = (Location) pair2.second;
            d = Math.min(d, location.getLatitude());
            d2 = Math.max(d2, location.getLatitude());
            double longitude = location.getLongitude();
            if (Double.isNaN(d3)) {
                d3 = longitude;
                d4 = d3;
            } else {
                if (d3 > d4) {
                    if (d3 > longitude) {
                        if (longitude <= d4) {
                        }
                    }
                } else if (d3 <= longitude && longitude <= d4) {
                }
                if (((d3 - longitude) + 360.0d) % 360.0d < ((longitude - d4) + 360.0d) % 360.0d) {
                    d3 = longitude;
                } else {
                    d4 = longitude;
                }
            }
        }
        float[] fArr = new float[1];
        Location.distanceBetween(d, d3, d2, d4, fArr);
        boolean z2 = aikq.a;
        if (fArr[0] >= 30.0f) {
            return false;
        }
        return true;
    }
}
