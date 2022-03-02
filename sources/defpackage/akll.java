package defpackage;

import java.util.Arrays;

/* renamed from: akll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akll {
    public final aklj a;
    public final Integer b;
    public final Integer c;
    public final long d;

    public akll(aklj aklj, Integer num, Integer num2, long j) {
        this.a = aklj;
        this.b = num;
        this.c = num2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akll)) {
            return false;
        }
        akll akll = (akll) obj;
        return akoy.a(akll.a, this.a) && akoy.a(akll.b, this.b) && akoy.a(akll.c, this.c) && akll.d == this.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        long j = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 90 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("BeaconSighting{beaconId=");
        sb.append(valueOf);
        sb.append(", rssi=");
        sb.append(valueOf2);
        sb.append(", txPower=");
        sb.append(valueOf3);
        sb.append(", timestampMillisSinceEpoch=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
