package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class MediaRouteVolumeSlider extends zd {
    private final float a;
    private Drawable b;

    public MediaRouteVolumeSlider(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        if (!isEnabled()) {
            i = (int) (this.a * 255.0f);
        } else {
            i = 255;
        }
        this.b.setColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.b.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
            layerDrawable.findDrawableByLayerId(16908288).setColorFilter(0, PorterDuff.Mode.SRC_IN);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(0, PorterDuff.Mode.SRC_IN);
        progressDrawable.setAlpha(i);
    }

    public final void setThumb(Drawable drawable) {
        this.b = drawable;
        super.setThumb(drawable);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedValue typedValue = new TypedValue();
        this.a = context.getTheme().resolveAttribute(16842803, typedValue, true) ? typedValue.getFloat() : 0.5f;
    }
}
