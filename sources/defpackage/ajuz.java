package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Calendar;

/* renamed from: ajuz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajuz extends acq {
    final /* synthetic */ ajvf a;
    private final Calendar b = ajvz.c();
    private final Calendar c = ajvz.c();

    public ajuz(ajvf ajvf) {
        this.a = ajvf;
    }

    public final void a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        if ((recyclerView.getAdapter() instanceof ajwc) && (recyclerView.getLayoutManager() instanceof abd)) {
            ajwc ajwc = (ajwc) recyclerView.getAdapter();
            abd abd = (abd) recyclerView.getLayoutManager();
            for (oq oqVar : this.a.a.d()) {
                Object obj = oqVar.a;
                if (!(obj == null || oqVar.b == null)) {
                    this.b.setTimeInMillis(((Long) obj).longValue());
                    this.c.setTimeInMillis(((Long) oqVar.b).longValue());
                    int f = ajwc.f(this.b.get(1));
                    int f2 = ajwc.f(this.c.get(1));
                    View b2 = abd.b(f);
                    View b3 = abd.b(f2);
                    int i2 = abd.b;
                    int i3 = f / i2;
                    int i4 = f2 / i2;
                    int i5 = i3;
                    while (i5 <= i4) {
                        View b4 = abd.b(abd.b * i5);
                        if (b4 != null) {
                            int top = b4.getTop() + this.a.d.d.a();
                            int bottom = b4.getBottom() - this.a.d.d.b();
                            if (i5 == i3) {
                                i = b2.getLeft() + (b2.getWidth() / 2);
                            } else {
                                i = 0;
                            }
                            canvas.drawRect((float) i, (float) top, (float) (i5 == i4 ? b3.getLeft() + (b3.getWidth() / 2) : recyclerView.getWidth()), (float) bottom, this.a.d.h);
                        }
                        i5++;
                    }
                }
            }
        }
    }
}
