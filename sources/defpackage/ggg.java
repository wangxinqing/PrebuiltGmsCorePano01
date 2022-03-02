package defpackage;

import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.auth.login.CustomWebView;

/* renamed from: ggg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ggg extends InputConnectionWrapper {
    final /* synthetic */ CustomWebView a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ggg(CustomWebView customWebView, InputConnection inputConnection) {
        super(inputConnection, true);
        this.a = customWebView;
    }

    public final boolean performEditorAction(int i) {
        if (i != 1) {
            return super.performEditorAction(i);
        }
        CustomWebView customWebView = this.a;
        int i2 = CustomWebView.c;
        InputMethodManager inputMethodManager = (InputMethodManager) customWebView.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(customWebView.getWindowToken(), 0);
        }
        return true;
    }
}
