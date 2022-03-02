package defpackage;

import java.util.Arrays;

/* renamed from: akln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akln {
    public final aklr a;
    public final akoh b;
    public final aklk c;
    public final aklh d;
    public final boolean e;
    public final boolean f;

    public akln(aklr aklr, akoh akoh, aklk aklk, aklh aklh, boolean z, boolean z2) {
        this.a = aklr;
        this.b = akoh;
        this.c = aklk;
        this.d = aklh;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akln)) {
            return false;
        }
        akln akln = (akln) obj;
        return akoy.a(akln.a, this.a) && akoy.a(akln.b, this.b) && akoy.a(akln.c, this.c) && akoy.a(akln.d, this.d) && akln.e == this.e && akln.f == this.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        boolean z = this.f;
        boolean z2 = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 117 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("InferenceSignals{position=");
        sb.append(valueOf);
        sb.append(", wifiScan=");
        sb.append(valueOf2);
        sb.append(", beaconScan=");
        sb.append(valueOf3);
        sb.append(", activityRecord=");
        sb.append(valueOf4);
        sb.append(", isFromMockProvider=");
        sb.append(z);
        sb.append(", isWifiConnected=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
