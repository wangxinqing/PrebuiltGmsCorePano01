package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.slice.widget.GridRowView;

/* renamed from: app  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class app implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ GridRowView a;

    public app(GridRowView gridRowView) {
        this.a = gridRowView;
    }

    public final boolean onPreDraw() {
        GridRowView gridRowView = this.a;
        gridRowView.a.removeAllViews();
        gridRowView.setLayoutDirection(2);
        gridRowView.a.setOnTouchListener((View.OnTouchListener) null);
        gridRowView.a.setOnClickListener((View.OnClickListener) null);
        gridRowView.b.setBackground((Drawable) null);
        gridRowView.a.setClickable(false);
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
