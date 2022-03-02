package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import com.google.android.gms.R;

/* renamed from: yq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class yq extends CheckBox {
    private final ys a;
    private final yp b;
    private final zr c;

    public yq(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
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

    public final int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (this.a != null) {
            int i = Build.VERSION.SDK_INT;
        }
        return compoundPaddingLeft;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        yp ypVar = this.b;
        if (ypVar != null) {
            ypVar.b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        yp ypVar = this.b;
        if (ypVar != null) {
            ypVar.a(i);
        }
    }

    public final void setButtonDrawable(int i) {
        setButtonDrawable(uj.b(getContext(), i));
    }

    public yq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        ys ysVar = this.a;
        if (ysVar != null) {
            ysVar.a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aes.a(context);
        aeq.a((View) this, getContext());
        ys ysVar = new ys(this);
        this.a = ysVar;
        ysVar.a(attributeSet, i);
        yp ypVar = new yp(this);
        this.b = ypVar;
        ypVar.a(attributeSet, i);
        zr zrVar = new zr(this);
        this.c = zrVar;
        zrVar.a(attributeSet, i);
    }
}
