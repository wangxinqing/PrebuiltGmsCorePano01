package defpackage;

import android.view.View;
import androidx.leanback.widget.SearchBar;

/* renamed from: akp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akp implements View.OnFocusChangeListener {
    final /* synthetic */ SearchBar a;

    public akp(SearchBar searchBar) {
        this.a = searchBar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            SearchBar searchBar = this.a;
            searchBar.d.post(new akx(searchBar));
        } else {
            this.a.a();
        }
        this.a.a(z);
    }
}
