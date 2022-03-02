package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: aroo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aroo {
    final SparseArray a = new SparseArray();

    public final aron a(arok arok) {
        amrl.a((Object) arok);
        int i = arok.a;
        arol arol = (arol) this.a.get(i);
        boolean z = false;
        if (arok.a()) {
            if (arol != null) {
                Locale locale = Locale.ENGLISH;
                Object[] objArr = {arol, Integer.valueOf(i)};
            }
            arol = new arol(arok);
            this.a.append(i, arol);
        }
        arnt arnt = null;
        if (arol != null) {
            int i2 = arol.b.a;
            int i3 = arok.a;
            if (i2 != i3) {
                Locale locale2 = Locale.ENGLISH;
                Integer valueOf = Integer.valueOf(i2);
                Integer valueOf2 = Integer.valueOf(i3);
                Object[] objArr2 = {valueOf, valueOf, valueOf2, valueOf2};
            } else {
                int i4 = arok.b;
                if (arol.c + 1 != i4) {
                    Locale locale3 = Locale.ENGLISH;
                    Object[] objArr3 = {Integer.valueOf(arol.c), Integer.valueOf(i4)};
                } else {
                    arol.c = i4;
                    byte[] bArr = arok.f;
                    if (bArr != null) {
                        arol.d += bArr.length;
                        arol.a.add(bArr);
                    }
                    int i5 = arok.d & 1;
                    if (i5 != 0) {
                        byte[] bArr2 = new byte[arol.d];
                        ArrayList arrayList = arol.a;
                        int size = arrayList.size();
                        int i6 = 0;
                        for (int i7 = 0; i7 < size; i7++) {
                            byte[] bArr3 = (byte[]) arrayList.get(i7);
                            int length = bArr3.length;
                            System.arraycopy(bArr3, 0, bArr2, i6, length);
                            i6 += length;
                        }
                        aroj aroj = arol.b.e;
                        arnt = new arnt(aroj.a, aroj.b, bArr2);
                    }
                    if (i5 != 0) {
                        this.a.delete(i);
                    }
                    if (i5 != 0) {
                        z = true;
                    }
                    return new aron(z, arnt);
                }
            }
            this.a.delete(i);
        } else {
            new Object[1][0] = arok;
        }
        return null;
    }
}
