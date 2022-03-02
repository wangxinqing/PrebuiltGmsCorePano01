package defpackage;

import android.view.View;
import androidx.leanback.widget.SearchBar;

/* renamed from: akw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akw implements View.OnFocusChangeListener {
    final /* synthetic */ SearchBar a;

    public akw(SearchBar searchBar) {
        this.a = searchBar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.a();
            SearchBar searchBar = this.a;
            if (searchBar.e) {
                searchBar.b();
                this.a.e = false;
            }
        }
        this.a.a(z);
    }
}
