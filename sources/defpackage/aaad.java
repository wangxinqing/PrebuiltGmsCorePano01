package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: aaad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaad implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int length;
        byte[] bArr = ((aaae) obj).a;
        byte[] bArr2 = ((aaae) obj2).a;
        if (Arrays.equals(bArr, bArr2)) {
            return 0;
        }
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || i >= bArr2.length) {
                int length2 = bArr2.length;
            } else {
                byte b = bArr[i];
                byte b2 = bArr2[i];
                if (b == b2) {
                    i++;
                } else if ((b & 255) > (b2 & 255)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
        int length22 = bArr2.length;
        if (length < length22) {
            return -1;
        }
        if (length > length22) {
            return 1;
        }
        return 0;
    }
}
