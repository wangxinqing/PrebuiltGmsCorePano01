package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;

/* renamed from: aens  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aens implements TextWatcher {
    final /* synthetic */ OpenSearchView a;

    public aens(OpenSearchView openSearchView) {
        this.a = openSearchView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.j.setVisibility(charSequence.length() > 0 ? 0 : 8);
    }
}
