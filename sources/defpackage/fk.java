package defpackage;

import java.util.ArrayList;

/* renamed from: fk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fk {
    public int a;
    public int b;
    public int c;
    public int d;
    public ArrayList e = new ArrayList();

    public fk(fg fgVar) {
        this.a = fgVar.w;
        this.b = fgVar.x;
        this.c = fgVar.c();
        this.d = fgVar.f();
        ArrayList arrayList = fgVar.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new fj((ff) arrayList.get(i)));
        }
    }
}
