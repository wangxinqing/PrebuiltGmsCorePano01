package defpackage;

import java.util.ArrayList;

/* renamed from: baxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baxa {
    public boolean a;
    private boolean b;
    private boolean c;

    public final int[] a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(12324);
        arrayList.add(8);
        arrayList.add(12323);
        arrayList.add(8);
        arrayList.add(12322);
        arrayList.add(8);
        if (this.b) {
            arrayList.add(12321);
            arrayList.add(8);
        }
        arrayList.add(12352);
        arrayList.add(4);
        if (this.c) {
            arrayList.add(12339);
            arrayList.add(1);
        }
        if (this.a) {
            arrayList.add(12610);
            arrayList.add(1);
        }
        arrayList.add(12344);
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        return iArr;
    }

    public final void b() {
        this.b = true;
    }

    public final void c() {
        this.c = true;
    }
}
