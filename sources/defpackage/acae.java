package defpackage;

import android.util.SparseArray;

/* renamed from: acae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class acae {
    public final aucd a = anwg.c.o();
    private final SparseArray b = new SparseArray();

    public final void a(int i) {
        int i2 = i - 1;
        aucd aucd = (aucd) this.b.get(i2);
        if (aucd == null) {
            aucd = anvg.d.o();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anvg anvg = (anvg) aucd.b;
            anvg.b = i2;
            anvg.a |= 1;
            this.b.put(i2, aucd);
        }
        int i3 = ((anvg) aucd.b).c + 1;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anvg anvg2 = (anvg) aucd.b;
        anvg anvg3 = anvg.d;
        anvg2.a |= 2;
        anvg2.c = i3;
    }

    public final anvg[] a() {
        anvg[] anvgArr = new anvg[this.b.size()];
        for (int i = 0; i < this.b.size(); i++) {
            anvgArr[i] = (anvg) ((aucd) this.b.valueAt(i)).i();
        }
        return anvgArr;
    }
}
