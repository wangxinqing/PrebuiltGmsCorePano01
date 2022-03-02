package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: dds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dds implements View.OnFocusChangeListener {
    private final dee a;

    public dds(dee dee) {
        this.a = dee;
    }

    public final void onFocusChange(View view, boolean z) {
        dee dee = this.a;
        if (z) {
            InputMethodManager inputMethodManager = dee.e;
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(view.findFocus(), 1);
                return;
            }
            return;
        }
        dee.d.setFocusable(false);
        dee.e.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
