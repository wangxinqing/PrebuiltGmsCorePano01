package defpackage;

import android.util.SparseArray;

/* renamed from: aska  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aska extends arwm {
    final /* synthetic */ asfz a;
    final /* synthetic */ askb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aska(askb askb, String str, asfz asfz) {
        super(str);
        this.b = askb;
        this.a = asfz;
    }

    public final void run() {
        boolean z;
        this.b.c.b(this.a.b);
        synchronized (this.b.c.a) {
            SparseArray sparseArray = this.b.c.a;
            z = false;
            int i = 0;
            while (true) {
                if (i >= sparseArray.size()) {
                    break;
                }
                asis asis = (asis) sparseArray.valueAt(i);
                if (asis instanceof asjh) {
                    asjb asjb = ((asjh) asis).a;
                    if (!(asjb instanceof ascb)) {
                        if (asjb instanceof asbz) {
                            z = true;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                } else if (asis instanceof ashp) {
                    ashj ashj = ((ashp) asis).a;
                    if ((ashj instanceof asba) || (ashj instanceof asbt) || (ashj instanceof asbv) || (ashj instanceof asbx)) {
                        z = true;
                    }
                } else {
                    continue;
                }
                i++;
            }
        }
        if (!z) {
            jjg jjg = asil.a;
            this.b.c.e.a((asiz) null);
        }
    }
}
