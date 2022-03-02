package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class OverlayListView extends ListView {
    private final List a = new ArrayList();

    public OverlayListView(Context context) {
        super(context);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a.size() > 0) {
            List list = this.a;
            if (list.size() > 0) {
                alx alx = (alx) list.get(0);
                throw null;
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
