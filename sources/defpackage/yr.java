package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* renamed from: yr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yr extends CheckedTextView {
    private static final int[] a = {16843016};
    private final zr b;

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        zr zrVar = this.b;
        if (zrVar != null) {
            zrVar.a();
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        yv.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(uj.b(getContext(), i));
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ry.a((TextView) this, callback));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        zr zrVar = this.b;
        if (zrVar != null) {
            zrVar.a(context, i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16843720);
        aes.a(context);
        aeq.a((View) this, getContext());
        zr zrVar = new zr(this);
        this.b = zrVar;
        zrVar.a(attributeSet, 16843720);
        this.b.a();
        aev a2 = aev.a(getContext(), attributeSet, a, 16843720, 0);
        setCheckMarkDrawable(a2.a(0));
        a2.a();
    }
}
