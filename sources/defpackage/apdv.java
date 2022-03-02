package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* renamed from: apdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apdv {
    public final BitSet a;
    public final List b;
    private final byte[] c;

    public apdv(DataInputStream dataInputStream) {
        boolean z;
        if (dataInputStream.readInt() == 1296389185) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z);
        dataInputStream.readInt();
        byte[] bArr = new byte[2];
        this.c = bArr;
        dataInputStream.readFully(bArr);
        BitSet bitSet = new BitSet();
        int a2 = arbl.a((InputStream) dataInputStream);
        boolean z2 = false;
        int i = 0;
        for (int i2 = 0; i2 < a2; i2++) {
            int a3 = arbl.a((InputStream) dataInputStream);
            if (a3 != 0 && z2) {
                bitSet.set(i, i + a3);
            }
            i += a3;
            z2 = !z2;
        }
        this.a = bitSet;
        int a4 = arbl.a((InputStream) dataInputStream);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < a4; i3++) {
            arrayList.add(Integer.valueOf(arbl.a((InputStream) dataInputStream)));
        }
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof apdv) {
            apdv apdv = (apdv) obj;
            if (!apdv.a.equals(this.a) || !Arrays.equals(apdv.c, this.c) || !apdv.b.equals(this.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + Arrays.hashCode(this.c)) * 31) + this.b.hashCode();
    }
}
