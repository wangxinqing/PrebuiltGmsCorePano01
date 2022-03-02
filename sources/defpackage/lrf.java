package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.gms.drive.ui.select.view.FileListView;

/* renamed from: lrf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lrf extends acy {
    final /* synthetic */ FileListView a;

    public lrf(FileListView fileListView) {
        this.a = fileListView;
    }

    public final void a(RecyclerView recyclerView, int i) {
        acy acy = this.a.c;
        if (acy != null) {
            acy.a(recyclerView, i);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        abk abk = (abk) recyclerView.getLayoutManager();
        int m = abk.m();
        int n = abk.n();
        int a2 = recyclerView.getAdapter().a();
        lrb lrb = this.a.a;
        int i3 = (n - m) + 1;
        if (lrb.l != a2 && i3 > 0) {
            lrb.l = a2;
            lrb.m = a2 / i3 >= 4;
        }
        if (lrb.m) {
            int i4 = a2 - i3;
            if (i4 > 0 && lrb.r != 3) {
                int i5 = lrb.f;
                lrb.f = ((lrb.i.getHeight() - lrb.d) * m) / i4;
                if (lrb.v) {
                    lrb.c();
                    lrb.v = false;
                }
                if (lrb.f != i5) {
                    lrb.w.invalidate();
                }
            }
            lrb.j = true;
            if (m != lrb.k) {
                lrb.k = m;
                if (lrb.r != 3) {
                    lrb.a(2);
                    lrb.s.postDelayed(lrb.q, 1500);
                }
            }
        } else if (lrb.r != 0) {
            lrb.a(0);
        }
        acy acy = this.a.c;
        if (acy != null) {
            acy.a(recyclerView, i, i2);
        }
    }
}
