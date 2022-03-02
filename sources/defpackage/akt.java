package defpackage;

import androidx.leanback.widget.SearchBar;

/* renamed from: akt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akt implements Runnable {
    final /* synthetic */ aku a;

    public akt(aku aku) {
        this.a = aku;
    }

    public final void run() {
        SearchBar searchBar = this.a.a;
        searchBar.e = true;
        searchBar.b.requestFocus();
    }
}
