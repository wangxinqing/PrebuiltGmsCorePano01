package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* renamed from: atv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atv implements pq {
    final /* synthetic */ ViewPager a;
    private final Rect b = new Rect();

    public atv(ViewPager viewPager) {
        this.a = viewPager;
    }

    public final qn a(View view, qn qnVar) {
        qn a2 = qb.a(view, qnVar);
        if (a2.e()) {
            return a2;
        }
        Rect rect = this.b;
        rect.left = a2.a();
        rect.top = a2.b();
        rect.right = a2.c();
        rect.bottom = a2.d();
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            qn b2 = qb.b(this.a.getChildAt(i), a2);
            rect.left = Math.min(b2.a(), rect.left);
            rect.top = Math.min(b2.b(), rect.top);
            rect.right = Math.min(b2.c(), rect.right);
            rect.bottom = Math.min(b2.d(), rect.bottom);
        }
        qj qjVar = new qj(a2);
        qjVar.a.a(ll.a(rect));
        return qjVar.a.a();
    }
}
