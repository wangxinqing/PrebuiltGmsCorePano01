package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: akhy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akhy {
    public static final List a = new ArrayList(0);
    public final List b;
    public final int c;
    public final long d;
    public final String e;
    public final int f;
    public final boolean g;
    public final boolean h = false;
    public final boolean i;
    public final aklr j;
    public final int k;

    public akhy(List list, long j2, String str, int i2, boolean z, boolean z2, int i3, int i4, aklr aklr) {
        this.b = list;
        this.k = i3;
        this.c = i4;
        this.d = j2;
        this.e = str;
        this.f = i2;
        this.g = z;
        this.i = z2;
        this.j = aklr;
    }

    public static akhy a(List list, long j2, String str, int i2, boolean z, boolean z2, int i3, int i4, aklr aklr) {
        return new akhy(list, j2, str, i2, z, z2, i3, i4, aklr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akhy) {
            akhy akhy = (akhy) obj;
            if (this.d == akhy.d && this.f == akhy.f && this.b.equals(akhy.b) && this.k == akhy.k && this.c == akhy.c && akoy.a(this.e, akhy.e) && this.g == akhy.g) {
                boolean z = akhy.h;
                return this.i == akhy.i && akoy.a(this.j, akhy.j);
            }
        }
    }

    public final int hashCode() {
        long j2 = this.d;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        long j2 = this.d;
        String valueOf = String.valueOf(this.b);
        int i2 = this.k;
        String valueOf2 = String.valueOf(i2 != 0 ? Integer.toString(i2 - 1) : "null");
        int i3 = this.c;
        String str = this.e;
        int i4 = this.f;
        boolean z = this.g;
        boolean z2 = this.i;
        String valueOf3 = String.valueOf(this.j);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + PSKKeyManager.MAX_KEY_LENGTH_BYTES + length2 + String.valueOf(str).length() + String.valueOf(valueOf3).length());
        sb.append("PlaceInferenceResult { millisSinceBoot=");
        sb.append(j2);
        sb.append(" placeInferences=");
        sb.append(valueOf);
        sb.append(" modelVersion=");
        sb.append(valueOf2);
        sb.append(" modelWeightsVersion=");
        sb.append(i3);
        sb.append(" accountName=");
        sb.append(str);
        sb.append(" statusCode=");
        sb.append(i4);
        sb.append(" isFromMockProvider=");
        sb.append(z);
        sb.append(" isComputedByHomeWorkDetector=false isFromCheckIn=");
        sb.append(z2);
        sb.append(" checkInCentroid=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
