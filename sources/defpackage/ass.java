package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: ass  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ass extends asx implements Animatable {
    final Drawable.Callback a;
    private asq c;
    private Context d;

    public ass() {
        this((Context) null);
    }

    public static ass a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        ass ass = new ass(context);
        ass.inflate(resources, xmlPullParser, attributeSet, theme);
        return ass;
    }

    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.b;
        if (drawable != null) {
            ma.a(drawable, theme);
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return ma.c(drawable);
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable == null) {
            this.c.b.draw(canvas);
            if (this.c.c.isStarted()) {
                invalidateSelf();
                return;
            }
            return;
        }
        drawable.draw(canvas);
    }

    public final int getAlpha() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return this.c.b.getAlpha();
        }
        return ma.b(drawable);
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        int i = this.c.a;
        return changingConfigurations;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return this.c.b.getColorFilter();
        }
        return ma.d(drawable);
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new asr(this.b.getConstantState());
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return this.c.b.getIntrinsicHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return this.c.b.getIntrinsicWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return this.c.b.getOpacity();
        }
        return drawable.getOpacity();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return this.c.b.isAutoMirrored();
        }
        return ma.a(drawable);
    }

    public final boolean isRunning() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return this.c.c.isRunning();
        }
        return ((AnimatedVectorDrawable) drawable).isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return this.c.b.isStateful();
        }
        return drawable.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.b;
        if (drawable == null) {
            this.c.b.setBounds(rect);
        } else {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.b;
        if (drawable == null) {
            return this.c.b.setLevel(i);
        }
        return drawable.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.b;
        if (drawable == null) {
            return this.c.b.setState(iArr);
        }
        return drawable.setState(iArr);
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.b;
        if (drawable == null) {
            this.c.b.setAlpha(i);
        } else {
            drawable.setAlpha(i);
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.b;
        if (drawable == null) {
            this.c.b.setAutoMirrored(z);
        } else {
            ma.a(drawable, z);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable == null) {
            this.c.b.setColorFilter(colorFilter);
        } else {
            drawable.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i) {
        Drawable drawable = this.b;
        if (drawable == null) {
            this.c.b.setTint(i);
        } else {
            ma.a(drawable, i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.b;
        if (drawable == null) {
            this.c.b.setTintList(colorStateList);
        } else {
            ma.a(drawable, colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.b;
        if (drawable == null) {
            this.c.b.setTintMode(mode);
        } else {
            ma.a(drawable, mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.c.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public final void start() {
        Drawable drawable = this.b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.c.c.isStarted()) {
            this.c.c.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        Drawable drawable = this.b;
        if (drawable == null) {
            this.c.c.end();
        } else {
            ((AnimatedVectorDrawable) drawable).stop();
        }
    }

    private ass(Context context) {
        this.a = new asp(this);
        this.d = context;
        this.c = new asq();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Animator animator;
        Drawable drawable = this.b;
        if (drawable == null) {
            int eventType = xmlPullParser.getEventType();
            int depth = xmlPullParser.getDepth() + 1;
            while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if ("animated-vector".equals(name)) {
                        TypedArray a2 = lj.a(resources, theme, attributeSet, aso.e);
                        int resourceId = a2.getResourceId(0, 0);
                        if (resourceId != 0) {
                            atg a3 = atg.a(resources, resourceId, theme);
                            a3.d = false;
                            a3.setCallback(this.a);
                            atg atg = this.c.b;
                            if (atg != null) {
                                atg.setCallback((Drawable.Callback) null);
                            }
                            this.c.b = a3;
                        }
                        a2.recycle();
                    } else if ("target".equals(name)) {
                        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, aso.f);
                        String string = obtainAttributes.getString(0);
                        int resourceId2 = obtainAttributes.getResourceId(1, 0);
                        if (resourceId2 != 0) {
                            Context context = this.d;
                            if (context != null) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    animator = AnimatorInflater.loadAnimator(context, resourceId2);
                                } else {
                                    animator = asv.a(context, context.getResources(), context.getTheme(), resourceId2);
                                }
                                animator.setTarget(this.c.b.c.b.l.get(string));
                                int i = Build.VERSION.SDK_INT;
                                asq asq = this.c;
                                if (asq.d == null) {
                                    asq.d = new ArrayList();
                                    this.c.e = new nz();
                                }
                                this.c.d.add(animator);
                                this.c.e.put(animator, string);
                            } else {
                                obtainAttributes.recycle();
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }
                        }
                        obtainAttributes.recycle();
                    } else {
                        continue;
                    }
                }
                eventType = xmlPullParser.next();
            }
            asq asq2 = this.c;
            if (asq2.c == null) {
                asq2.c = new AnimatorSet();
            }
            asq2.c.playTogether(asq2.d);
            return;
        }
        ma.a(drawable, resources, xmlPullParser, attributeSet, theme);
    }
}
