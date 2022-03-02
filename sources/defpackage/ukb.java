package defpackage;

import java.util.Arrays;

/* renamed from: ukb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ukb extends aejt {
    final /* synthetic */ int a;
    final /* synthetic */ ukz b;

    public ukb(ukz ukz, int i) {
        this.b = ukz;
        this.a = i;
    }

    public final byte[] a(int i) {
        ukd ukd = (ukd) this.b.a.get(Integer.valueOf(this.a));
        if (ukd == null) {
            return new byte[0];
        }
        byte[] bArr = ukd.b;
        return Arrays.copyOfRange(bArr, i, bArr.length);
    }
}
