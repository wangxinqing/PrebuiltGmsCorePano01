package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

/* renamed from: ajvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajvr implements AdapterView.OnItemClickListener {
    final /* synthetic */ MaterialCalendarGridView a;
    final /* synthetic */ ajvt b;

    public ajvr(ajvt ajvt, MaterialCalendarGridView materialCalendarGridView) {
        this.b = ajvt;
        this.a = materialCalendarGridView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ajvq a2 = this.a.getAdapter();
        if (i >= a2.a() && i <= a2.b()) {
            ajuy ajuy = this.b.a;
            if (ajuy.a.b.d.a(this.a.getAdapter().getItem(i).longValue())) {
                ajuy.a.a.h();
                Iterator it = ajuy.a.i.iterator();
                while (it.hasNext()) {
                    ((ajvu) it.next()).a(ajuy.a.a.a());
                }
                ajuy.a.f.getAdapter().as();
                RecyclerView recyclerView = ajuy.a.e;
                if (recyclerView != null) {
                    recyclerView.getAdapter().as();
                }
            }
        }
    }
}
