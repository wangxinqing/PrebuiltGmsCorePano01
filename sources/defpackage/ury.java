package defpackage;

import android.nfc.tech.IsoDep;

/* renamed from: ury  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ury extends usd {
    private final IsoDep a;

    public ury(IsoDep isoDep) {
        this.a = isoDep;
    }

    public final IsoDep a() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("NfcDevice{isoDep=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
