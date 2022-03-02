package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.leanback.widget.SearchBar;

/* renamed from: aku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aku implements TextView.OnEditorActionListener {
    final /* synthetic */ SearchBar a;

    public aku(SearchBar searchBar) {
        this.a = searchBar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 2) {
            return false;
        }
        this.a.a();
        this.a.d.postDelayed(new akt(this), 500);
        return true;
    }
}
