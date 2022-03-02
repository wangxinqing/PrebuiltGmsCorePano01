package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.gms.R;

/* renamed from: yw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class yw extends ImageButton {
    private final yp a;
    private final yx b;

    public yw(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        yp ypVar = this.a;
        if (ypVar != null) {
            ypVar.a();
        }
        yx yxVar = this.b;
        if (yxVar != null) {
            yxVar.b();
        }
    }

    public final boolean hasOverlappingRendering() {
        return this.b.a() && super.hasOverlappingRendering();
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        yp ypVar = this.a;
        if (ypVar != null) {
            ypVar.b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        yp ypVar = this.a;
        if (ypVar != null) {
            ypVar.a(i);
        }
    }

    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        yx yxVar = this.b;
        if (yxVar != null) {
            yxVar.b();
        }
    }

    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        yx yxVar = this.b;
        if (yxVar != null) {
            yxVar.b();
        }
    }

    public final void setImageResource(int i) {
        this.b.a(i);
    }

    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        yx yxVar = this.b;
        if (yxVar != null) {
            yxVar.b();
        }
    }

    public yw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aes.a(context);
        aeq.a((View) this, getContext());
        yp ypVar = new yp(this);
        this.a = ypVar;
        ypVar.a(attributeSet, i);
        yx yxVar = new yx(this);
        this.b = yxVar;
        yxVar.a(attributeSet, i);
    }
}
