package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: aegt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aegt {
    public final byte[] a;
    public final short[] b;

    public aegt(byte[] bArr, short[] sArr) {
        List list;
        this.a = bArr;
        int length = sArr.length;
        if (length == 0) {
            list = Collections.emptyList();
        } else {
            list = new aool(sArr, 0, length);
        }
        HashSet hashSet = new HashSet(list);
        if (hashSet.contains((short) 4363)) {
            hashSet.remove((short) 4360);
            hashSet.remove((short) 4382);
        }
        this.b = aoom.a((Collection) hashSet);
    }

    public final String toString() {
        String str;
        String a2 = aeez.a(this.a);
        short[] sArr = this.b;
        int length = sArr.length;
        if (length > 0) {
            amrl.a((Object) ",");
            StringBuilder sb = new StringBuilder(length * 6);
            sb.append(sArr[0]);
            for (int i = 1; i < sArr.length; i++) {
                sb.append(",");
                sb.append(sArr[i]);
            }
            str = sb.toString();
        } else {
            str = "(none)";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 37 + String.valueOf(str).length());
        sb2.append("BrEdrHandoverInformation{");
        sb2.append(a2);
        sb2.append(", profiles=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
