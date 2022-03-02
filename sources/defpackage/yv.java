package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: yv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yv {
    public static void a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                if (!(parent instanceof aft)) {
                    parent = parent.getParent();
                } else {
                    editorInfo.hintText = ((aft) parent).a();
                    return;
                }
            }
        }
    }
}
