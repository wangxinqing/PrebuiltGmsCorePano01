package defpackage;

import java.util.List;

/* renamed from: cgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cgt {
    public final long a;
    public final List b;
    public final int c;

    public cgt(long j, List list, int i) {
        if (!list.isEmpty()) {
            this.a = j;
            this.b = list;
            this.c = i;
            return;
        }
        throw new IllegalArgumentException("snrs must be non-empty, even if they're all just NO_GPS_SNR");
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
        sb.append("GpsFeatureGroup{nanos=");
        sb.append(j);
        sb.append(", snrs=");
        sb.append(valueOf);
        sb.append(", numUsed=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
