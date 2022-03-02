package defpackage;

import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: aeb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeb implements View.OnKeyListener {
    final /* synthetic */ SearchView a;

    public aeb(SearchView searchView) {
        this.a = searchView;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        SearchView searchView = this.a;
        if (searchView.t == null) {
            return false;
        }
        if (searchView.a.isPopupShowing() && this.a.a.getListSelection() != -1) {
            SearchView searchView2 = this.a;
            if (searchView2.t == null || searchView2.q == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i == 66 || i == 84 || i == 61) {
                return searchView2.e(searchView2.a.getListSelection());
            }
            if (i == 21) {
                i2 = 0;
            } else if (i != 22) {
                return (i == 19 && searchView2.a.getListSelection() == 0) ? false : false;
            } else {
                i2 = searchView2.a.length();
            }
            searchView2.a.setSelection(i2);
            searchView2.a.setListSelection(0);
            searchView2.a.clearListSelection();
            searchView2.a.a();
            return true;
        } else if (TextUtils.getTrimmedLength(this.a.a.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
            return false;
        } else {
            view.cancelLongPress();
            SearchView searchView3 = this.a;
            searchView3.a(searchView3.a.getText().toString());
            return true;
        }
    }
}
