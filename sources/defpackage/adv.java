package defpackage;

import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* renamed from: adv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adv implements TextWatcher {
    final /* synthetic */ SearchView a;

    public adv(SearchView searchView) {
        this.a = searchView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SearchView searchView = this.a;
        Editable text = searchView.a.getText();
        searchView.s = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.o();
        searchView.c(isEmpty);
        searchView.g();
        searchView.f();
        if (searchView.m != null && !TextUtils.equals(charSequence, searchView.r)) {
            searchView.m.b(charSequence.toString());
        }
        searchView.r = charSequence.toString();
    }
}
