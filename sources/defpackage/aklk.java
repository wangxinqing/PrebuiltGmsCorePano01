package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: aklk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aklk {
    public final List a;

    public aklk(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aklk) && akoy.a(((aklk) obj).a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("BeaconScan{sightings=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
