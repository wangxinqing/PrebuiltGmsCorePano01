package defpackage;

import android.view.MenuItem;
import java.util.List;

/* renamed from: oct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oct {
    private final List a;
    private final MenuItem b;

    public oct(List list, MenuItem menuItem) {
        this.a = list;
        this.b = menuItem;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((obf) list.get(i)).a(this);
        }
    }

    public final void a() {
        List list = this.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            obf obf = (obf) list.get(i);
            if (obf.b() && !obf.a()) {
                break;
            }
            i++;
        }
        this.b.setEnabled(z);
    }
}
