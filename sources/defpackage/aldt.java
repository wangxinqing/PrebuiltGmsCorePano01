package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView;

/* renamed from: aldt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aldt extends adn {
    final /* synthetic */ aldu d;
    private final RecyclerView e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aldt(aldu aldu, RecyclerView recyclerView) {
        super(recyclerView);
        this.d = aldu;
        this.e = recyclerView;
    }

    public final boolean a(View view, int i, Bundle bundle) {
        ExpandingScrollView expandingScrollView = this.d.c;
        int b = expandingScrollView.b(expandingScrollView.c);
        if (this.d.c.c == alfg.FULLY_EXPANDED) {
            b -= this.d.e.getHeight();
        }
        if (i == 4096) {
            if (qb.a(view, 1)) {
                this.e.scrollBy(0, b);
            }
            return true;
        } else if (i != 8192) {
            return super.a(view, i, bundle);
        } else {
            if (qb.a(view, -1)) {
                this.e.scrollBy(0, -b);
            }
            return true;
        }
    }
}
