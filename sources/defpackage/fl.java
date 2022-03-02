package defpackage;

import java.util.ArrayList;

/* renamed from: fl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class fl extends fg {
    public final ArrayList al = new ArrayList();

    public void a() {
        this.al.clear();
        super.a();
    }

    public final void l() {
        super.l();
        ArrayList arrayList = this.al;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                fg fgVar = (fg) this.al.get(i);
                fgVar.a(g(), h());
                if (!(fgVar instanceof fh)) {
                    fgVar.l();
                }
            }
        }
    }

    public void n() {
        l();
        ArrayList arrayList = this.al;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                fg fgVar = (fg) this.al.get(i);
                if (fgVar instanceof fl) {
                    ((fl) fgVar).n();
                }
            }
        }
    }

    public final void a(int i, int i2) {
        super.a(i, i2);
        int size = this.al.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((fg) this.al.get(i3)).a(this.w + this.A, this.x + this.B);
        }
    }

    public final void a(ez ezVar) {
        super.a(ezVar);
        int size = this.al.size();
        for (int i = 0; i < size; i++) {
            ((fg) this.al.get(i)).a(ezVar);
        }
    }

    public final void a(fg fgVar) {
        this.al.remove(fgVar);
        fgVar.r = null;
    }
}
