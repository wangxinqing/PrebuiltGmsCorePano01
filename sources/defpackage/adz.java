package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.SearchView;
import android.view.View;
import com.google.android.gms.R;

/* renamed from: adz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adz implements View.OnLayoutChangeListener {
    final /* synthetic */ SearchView a;

    public adz(SearchView searchView) {
        this.a = searchView;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        SearchView searchView = this.a;
        if (searchView.j.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.b.getPaddingLeft();
            Rect rect = new Rect();
            boolean a2 = afs.a(searchView);
            if (searchView.o) {
                i9 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left);
            } else {
                i9 = 0;
            }
            searchView.a.getDropDownBackground().getPadding(rect);
            if (a2) {
                i10 = -rect.left;
            } else {
                i10 = paddingLeft - (rect.left + i9);
            }
            searchView.a.setDropDownHorizontalOffset(i10);
            int width = searchView.j.getWidth();
            int i11 = rect.left;
            searchView.a.setDropDownWidth((((width + i11) + rect.right) + i9) - paddingLeft);
        }
    }
}
