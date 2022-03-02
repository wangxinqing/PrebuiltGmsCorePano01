package defpackage;

import java.util.Arrays;

/* renamed from: uwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uwz {
    public final vcc a;

    public uwz(byte[] bArr) {
        boolean z;
        if (bArr.length == 20) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "iBeacon ID must be a UUID, a major, and a minor (20 total bytes).");
        this.a = new vcc(bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uwz) {
            return ius.a(this.a, ((uwz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a.b());
        short shortValue = this.a.c().shortValue();
        short shortValue2 = this.a.d().shortValue();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("IBeaconId{proximityUuid=");
        sb.append(valueOf);
        sb.append(", major=");
        sb.append(shortValue);
        sb.append(", minor=");
        sb.append(shortValue2);
        sb.append('}');
        return sb.toString();
    }
}
