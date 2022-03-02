package defpackage;

/* renamed from: uwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uwj extends uya {
    public final auay a;
    public final int b;
    public final int c;
    public final double d;
    public final String e;
    public final int f;

    public uwj(auay auay, int i, int i2, double d2, String str, int i3) {
        this.a = auay;
        this.b = i;
        this.c = i2;
        this.d = d2;
        this.e = str;
        this.f = i3;
    }

    public final auay a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final double d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uya) {
            uya uya = (uya) obj;
            if (this.a.equals(uya.a()) && this.b == uya.b() && this.c == uya.c() && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(uya.d()) && this.e.equals(uya.e())) {
                int i = this.f;
                int f2 = uya.f();
                if (i == 0) {
                    throw null;
                } else if (i == f2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.d) >>> 32) ^ Double.doubleToLongBits(this.d)))) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i = this.f;
        if (i != 0) {
            return hashCode ^ i;
        }
        throw null;
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        int i2 = this.c;
        double d2 = this.d;
        String str2 = this.e;
        int i3 = this.f;
        if (i3 == 0) {
            str = "null";
        } else if (i3 == 0) {
            throw null;
        } else if (i3 != 0) {
            str = Integer.toString(i3 - 1);
        } else {
            throw null;
        }
        String valueOf2 = String.valueOf(str);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 133 + String.valueOf(str2).length() + String.valueOf(valueOf2).length());
        sb.append("FastPairBleDeviceCache{modelId=");
        sb.append(valueOf);
        sb.append(", rssi=");
        sb.append(i);
        sb.append(", txPower=");
        sb.append(i2);
        sb.append(", distance=");
        sb.append(d2);
        sb.append(", macAddress=");
        sb.append(str2);
        sb.append(", bleScanMode=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
