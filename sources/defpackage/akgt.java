package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: akgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akgt {
    List[] a;
    final int b;

    public akgt(int i) {
        this.b = i;
    }

    public final View a(int i) {
        List[] listArr = this.a;
        if (listArr != null && i >= 0 && i < listArr.length) {
            List list = listArr[i];
            if (list.size() > 0) {
                return (View) list.remove(list.size() - 1);
            }
        }
        return null;
    }

    public final void a(akgf akgf) {
        if (akgf != null) {
            int viewTypeCount = akgf.getViewTypeCount();
            List[] listArr = this.a;
            if (listArr == null || viewTypeCount != listArr.length) {
                this.a = new List[viewTypeCount];
                for (int i = 0; i < viewTypeCount; i++) {
                    this.a[i] = new ArrayList();
                }
            }
        }
    }

    public final void a(View view, int i) {
        List[] listArr = this.a;
        if (listArr != null && i >= 0 && i < listArr.length && listArr[i].size() < this.b) {
            this.a[i].add(view);
        }
    }
}
