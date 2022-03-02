package defpackage;

import java.util.List;

/* renamed from: aizd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aizd {
    public int[] a;
    public final aiyt b;

    public aizd(aiyt aiyt, int[] iArr, List list) {
        this.b = aiyt;
        this.a = new int[iArr.length];
        int i = 0;
        while (i < iArr.length) {
            int indexOf = list.indexOf(aiyu.a(iArr[i]));
            if (indexOf != -1) {
                this.a[i] = indexOf;
                i++;
            } else {
                this.a = null;
                return;
            }
        }
    }
}
