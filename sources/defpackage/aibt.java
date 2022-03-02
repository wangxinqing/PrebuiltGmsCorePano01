package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: aibt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aibt extends aibw implements Comparable {
    public final long a;
    public final ArrayList b;
    public final aibv[] c;
    public aqek d;
    public final boolean e;

    public aibt(long j, ArrayList arrayList, aibv[] aibvArr, boolean z) {
        this.a = j;
        this.b = arrayList;
        this.e = z;
        this.c = aibvArr;
        Collections.sort(arrayList);
    }

    public final long a(int i) {
        return c(i).e;
    }

    public final byte b(int i) {
        int i2 = c(i).g + aibs.j;
        if (i2 > 127) {
            return Byte.MAX_VALUE;
        }
        if (i2 < -128) {
            return Byte.MIN_VALUE;
        }
        return (byte) i2;
    }

    public final aibs c(int i) {
        return (aibs) this.b.get(i);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.a;
        long j2 = ((aibt) obj).a;
        if (j >= j2) {
            return j > j2 ? 1 : 0;
        }
        return -1;
    }

    public final long d() {
        return this.a;
    }

    public final aibv[] e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aibt) {
            aibt aibt = (aibt) obj;
            return this.a == aibt.a && this.b.equals(aibt.b);
        }
    }

    public final boolean f() {
        aibv[] aibvArr = this.c;
        return aibvArr != null && aibvArr.length > 0;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) + 31) * 31) + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WifiFullScan [deliveryTime=");
        sb.append(this.a);
        sb.append(", devices=[");
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((aibs) arrayList.get(i)).toString());
            sb.append(", ");
        }
        sb.append("]]");
        return sb.toString();
    }

    public final int b() {
        return this.b.size();
    }

    public final long d(int i) {
        return c(i).i;
    }
}
