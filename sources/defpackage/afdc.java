package defpackage;

import java.util.BitSet;

/* renamed from: afdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afdc {
    private final BitSet a;

    public afdc(BitSet bitSet) {
        BitSet bitSet2 = (BitSet) bitSet.clone();
        this.a = bitSet2;
        bitSet2.set(92);
    }

    public static afdb a() {
        return new afdb();
    }

    public final auay a(auay auay) {
        auas i = auay.iterator();
        int i2 = 0;
        int i3 = 0;
        while (i.hasNext()) {
            if (this.a.get(((Byte) i.next()).byteValue())) {
                i3++;
            }
        }
        byte[] bArr = new byte[(auay.a() + i3)];
        auas i4 = auay.iterator();
        while (i4.hasNext()) {
            byte byteValue = ((Byte) i4.next()).byteValue();
            if (this.a.get(byteValue)) {
                bArr[i2] = 92;
                i2++;
            }
            bArr[i2] = byteValue;
            i2++;
        }
        return auay.a(bArr);
    }
}
