package defpackage;

import android.view.View;
import java.util.List;

/* renamed from: abi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abi {
    boolean a = true;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h = 0;
    int i = 0;
    boolean j = false;
    int k;
    List l = null;
    boolean m;

    /* access modifiers changed from: package-private */
    public final View a(adb adb) {
        List list = this.l;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = ((adl) this.l.get(i2)).a;
                acu acu = (acu) view.getLayoutParams();
                if (!acu.a() && this.d == acu.c()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View b2 = adb.b(this.d);
        this.d += this.e;
        return b2;
    }

    public final void a() {
        a((View) null);
    }

    public final void a(View view) {
        int c2;
        int size = this.l.size();
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            View view3 = ((adl) this.l.get(i3)).a;
            acu acu = (acu) view3.getLayoutParams();
            if (view3 != view && !acu.a() && (c2 = (acu.c() - this.d) * this.e) >= 0 && c2 < i2) {
                view2 = view3;
                if (c2 == 0) {
                    break;
                }
                i2 = c2;
            }
        }
        this.d = view2 != null ? ((acu) view2.getLayoutParams()).c() : -1;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(adi adi) {
        int i2 = this.d;
        return i2 >= 0 && i2 < adi.a();
    }
}
