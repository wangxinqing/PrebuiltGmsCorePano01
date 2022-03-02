package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.google.android.gms.R;

/* renamed from: yy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class yy extends MultiAutoCompleteTextView {
    private static final int[] a = {16843126};
    private final yp b;
    private final zr c;

    public yy(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        yp ypVar = this.b;
        if (ypVar != null) {
            ypVar.a();
        }
        zr zrVar = this.c;
        if (zrVar != null) {
            zrVar.a();
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        yv.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        yp ypVar = this.b;
        if (ypVar != null) {
            ypVar.b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        yp ypVar = this.b;
        if (ypVar != null) {
            ypVar.a(i);
        }
    }

    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(uj.b(getContext(), i));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        zr zrVar = this.c;
        if (zrVar != null) {
            zrVar.a(context, i);
        }
    }

    public yy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aes.a(context);
        aeq.a((View) this, getContext());
        aev a2 = aev.a(getContext(), attributeSet, a, i, 0);
        if (a2.f(0)) {
            setDropDownBackgroundDrawable(a2.a(0));
        }
        a2.a();
        yp ypVar = new yp(this);
        this.b = ypVar;
        ypVar.a(attributeSet, i);
        zr zrVar = new zr(this);
        this.c = zrVar;
        zrVar.a(attributeSet, i);
        this.c.a();
    }
}
