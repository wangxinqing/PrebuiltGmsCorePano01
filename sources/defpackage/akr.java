package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.leanback.widget.SearchBar;

/* renamed from: akr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akr implements TextWatcher {
    final /* synthetic */ Runnable a;
    final /* synthetic */ SearchBar b;

    public akr(SearchBar searchBar, Runnable runnable) {
        this.b = searchBar;
        this.a = runnable;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.d.removeCallbacks(this.a);
        this.b.d.post(this.a);
    }
}
