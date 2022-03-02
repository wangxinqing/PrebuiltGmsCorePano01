package defpackage;

import java.util.List;

/* renamed from: cgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cgz {
    public final long a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    public cgz(long j, List list, List list2, List list3, List list4) {
        if (list.isEmpty() || list3.isEmpty() || list2.isEmpty() || list4.isEmpty()) {
            String valueOf = String.valueOf(list);
            String valueOf2 = String.valueOf(list2);
            String valueOf3 = String.valueOf(list3);
            String valueOf4 = String.valueOf(list4);
            int length = String.valueOf(valueOf).length();
            int length2 = String.valueOf(valueOf2).length();
            StringBuilder sb = new StringBuilder(length + 54 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
            sb.append("Expected non-empty feature sequences, but found ");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(", ");
            sb.append(valueOf3);
            sb.append(", ");
            sb.append(valueOf4);
            throw new IllegalArgumentException(sb.toString());
        }
        this.a = j;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 98 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("WifiFeatureGroup{nanos=");
        sb.append(j);
        sb.append(", rssiLows=");
        sb.append(valueOf);
        sb.append(", rssiLowDiffs=");
        sb.append(valueOf2);
        sb.append(", rssiHighs=");
        sb.append(valueOf3);
        sb.append(", rssiHighDiffs=");
        sb.append(valueOf4);
        sb.append('}');
        return sb.toString();
    }
}
