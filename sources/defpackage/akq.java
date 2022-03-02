package defpackage;

import android.text.TextUtils;
import androidx.leanback.widget.SearchBar;

/* renamed from: akq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akq implements Runnable {
    final /* synthetic */ SearchBar a;

    public akq(SearchBar searchBar) {
        this.a = searchBar;
    }

    public final void run() {
        SearchBar searchBar = this.a;
        String obj = searchBar.a.getText().toString();
        if (!TextUtils.equals(searchBar.c, obj)) {
            searchBar.c = obj;
        }
    }
}
