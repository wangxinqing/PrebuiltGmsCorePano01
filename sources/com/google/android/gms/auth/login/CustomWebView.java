package com.google.android.gms.auth.login;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.chimera.WebView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CustomWebView extends WebView {
    public static final /* synthetic */ int c = 0;
    boolean a;
    public boolean b;

    public CustomWebView(Context context) {
        super(context);
    }

    public final void a() {
        this.a = true;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (!ent.W() || !this.b || onCreateInputConnection == null) {
            return onCreateInputConnection;
        }
        if (editorInfo.privateImeOptions != null) {
            editorInfo.privateImeOptions = String.valueOf(editorInfo.privateImeOptions).concat(",escapeNorth");
        } else {
            editorInfo.privateImeOptions = "escapeNorth";
        }
        return new ggg(this, onCreateInputConnection);
    }

    public final boolean performLongClick() {
        if (this.a) {
            return super.performLongClick();
        }
        return true;
    }

    public CustomWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
