package defpackage;

import android.content.Context;
import android.util.SparseIntArray;

/* renamed from: itj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class itj {
    private final SparseIntArray a;
    private hxk b;

    public itj() {
        this(hxj.a);
    }

    public final int a(Context context, ibo ibo) {
        iva.a((Object) context);
        iva.a((Object) ibo);
        int i = 0;
        if (!ibo.n()) {
            return 0;
        }
        int d = ibo.d();
        int i2 = this.a.get(d, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.a.size()) {
                i = i2;
                break;
            }
            int keyAt = this.a.keyAt(i3);
            if (keyAt > d && this.a.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.b.b(context);
        }
        this.a.put(d, i);
        return i;
    }

    public itj(hxk hxk) {
        this.a = new SparseIntArray();
        iva.a((Object) hxk);
        this.b = hxk;
    }

    public final void a() {
        this.a.clear();
    }
}
