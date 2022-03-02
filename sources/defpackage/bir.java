package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bir {
    public final int a;
    public final arpv b;
    public List c = new ArrayList();
    public List d = new ArrayList();
    public long e;
    public final int[] f;
    public int g = 0;

    public bir(int i, long j, arpv arpv) {
        this.a = i;
        this.e = j;
        this.b = arpv;
        this.f = new int[(i + 1)];
    }

    public final List a(int i) {
        ArrayList arrayList = new ArrayList();
        List list = this.c;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            i--;
            arrayList.add(((biq) list.get(i2)).a);
            i2++;
            if (i <= 0) {
                break;
            }
        }
        return arrayList;
    }
}
