package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.chimera.Service;
import java.io.IOException;
import java.util.ArrayDeque;
import org.chromium.net.UrlRequest;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: atg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atg extends asx {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public ate c;
    public boolean d;
    private PorterDuffColorFilter e;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public atg() {
        this.d = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = new ate();
    }

    static int a(int i2, float f2) {
        return (((int) (((float) Color.alpha(i2)) * f2)) << 24) | (16777215 & i2);
    }

    static atg b(Resources resources, int i2, Resources.Theme theme) {
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                int next = xml.next();
                if (next == 2) {
                    return a(resources, xml, asAttributeSet, theme);
                }
                if (next == 1) {
                    throw new XmlPullParserException("No start tag found");
                }
            }
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        } catch (IOException e3) {
            Log.e("VectorDrawableCompat", "parser error", e3);
            return null;
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return false;
        }
        ma.c(drawable);
        return false;
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.b;
        if (drawable == null) {
            copyBounds(this.j);
            if (this.j.width() > 0 && this.j.height() > 0) {
                ColorFilter colorFilter = this.f;
                if (colorFilter == null) {
                    colorFilter = this.e;
                }
                canvas.getMatrix(this.i);
                this.i.getValues(this.h);
                float abs = Math.abs(this.h[0]);
                float abs2 = Math.abs(this.h[4]);
                float abs3 = Math.abs(this.h[1]);
                float abs4 = Math.abs(this.h[3]);
                if (abs3 != 0.0f) {
                    abs = 1.0f;
                    abs2 = 1.0f;
                } else if (abs4 != 0.0f) {
                    abs = 1.0f;
                    abs2 = 1.0f;
                }
                int width = this.j.width();
                int height = this.j.height();
                int min = Math.min(2048, (int) (((float) width) * abs));
                int min2 = Math.min(2048, (int) (((float) height) * abs2));
                if (min > 0 && min2 > 0) {
                    int save = canvas.save();
                    canvas.translate((float) this.j.left, (float) this.j.top);
                    int i2 = Build.VERSION.SDK_INT;
                    if (isAutoMirrored() && ma.h(this) == 1) {
                        canvas.translate((float) this.j.width(), 0.0f);
                        canvas.scale(-1.0f, 1.0f);
                    }
                    this.j.offsetTo(0, 0);
                    ate ate = this.c;
                    Bitmap bitmap = ate.f;
                    if (!(bitmap != null && min == bitmap.getWidth() && min2 == ate.f.getHeight())) {
                        ate.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                        ate.k = true;
                    }
                    if (this.d) {
                        ate ate2 = this.c;
                        if (!(!ate2.k && ate2.g == ate2.c && ate2.h == ate2.d && ate2.j == ate2.e && ate2.i == ate2.b.getRootAlpha())) {
                            this.c.a(min, min2);
                            ate ate3 = this.c;
                            ate3.g = ate3.c;
                            ate3.h = ate3.d;
                            ate3.i = ate3.b.getRootAlpha();
                            ate3.j = ate3.e;
                            ate3.k = false;
                        }
                    } else {
                        this.c.a(min, min2);
                    }
                    ate ate4 = this.c;
                    Rect rect = this.j;
                    if (ate4.b.getRootAlpha() >= 255 && colorFilter == null) {
                        paint = null;
                    } else {
                        if (ate4.l == null) {
                            ate4.l = new Paint();
                            ate4.l.setFilterBitmap(true);
                        }
                        ate4.l.setAlpha(ate4.b.getRootAlpha());
                        ate4.l.setColorFilter(colorFilter);
                        paint = ate4.l;
                    }
                    canvas.drawBitmap(ate4.f, (Rect) null, rect, paint);
                    canvas.restoreToCount(save);
                    return;
                }
                return;
            }
            return;
        }
        drawable.draw(canvas);
    }

    public final int getAlpha() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return this.c.b.getRootAlpha();
        }
        return ma.b(drawable);
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return super.getChangingConfigurations() | this.c.getChangingConfigurations();
        }
        return drawable.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.b;
        return drawable != null ? ma.d(drawable) : this.f;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.b != null && Build.VERSION.SDK_INT >= 24) {
            return new atf(this.b.getConstantState());
        }
        this.c.a = getChangingConfigurations();
        return this.c;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return (int) this.c.b.f;
        }
        return drawable.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return (int) this.c.b.e;
        }
        return drawable.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public final void invalidateSelf() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return this.c.e;
        }
        return ma.a(drawable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r0 = r3.c.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isStateful() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.b
            if (r0 != 0) goto L_0x0027
            boolean r0 = super.isStateful()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0025
            ate r0 = r3.c
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0025
            ate r0 = r3.c
            android.content.res.ColorStateList r0 = r0.c
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            return r1
        L_0x0024:
            goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            return r1
        L_0x0027:
            boolean r0 = r0.isStateful()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atg.isStateful():boolean");
    }

    public final Drawable mutate() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            this.c = new ate(this.c);
            this.g = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        ate ate = this.c;
        ColorStateList colorStateList = ate.c;
        boolean z = false;
        if (!(colorStateList == null || (mode = ate.d) == null)) {
            this.e = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (ate.a()) {
            boolean a2 = ate.b.d.a(iArr);
            ate.k |= a2;
            if (a2) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public final void setAlpha(int i2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.c.b.getRootAlpha() != i2) {
            this.c.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.b;
        if (drawable == null) {
            this.c.e = z;
        } else {
            ma.a(drawable, z);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable == null) {
            this.f = colorFilter;
            invalidateSelf();
            return;
        }
        drawable.setColorFilter(colorFilter);
    }

    public final void setTint(int i2) {
        Drawable drawable = this.b;
        if (drawable == null) {
            setTintList(ColorStateList.valueOf(i2));
        } else {
            ma.a(drawable, i2);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.b;
        if (drawable == null) {
            ate ate = this.c;
            if (ate.c != colorStateList) {
                ate.c = colorStateList;
                this.e = a(colorStateList, ate.d);
                invalidateSelf();
                return;
            }
            return;
        }
        ma.a(drawable, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.b;
        if (drawable == null) {
            ate ate = this.c;
            if (ate.d != mode) {
                ate.d = mode;
                this.e = a(ate.c, mode);
                invalidateSelf();
                return;
            }
            return;
        }
        ma.a(drawable, mode);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static atg a(Resources resources, int i2, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT < 24) {
            return b(resources, i2, theme);
        }
        atg atg = new atg();
        atg.b = li.a(resources, i2, theme);
        return atg;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        ColorStateList colorStateList;
        int i2;
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Drawable drawable = this.b;
        if (drawable == null) {
            ate ate = this.c;
            ate.b = new atd();
            TypedArray a2 = lj.a(resources2, theme2, attributeSet2, aso.a);
            ate ate2 = this.c;
            atd atd = ate2.b;
            int a3 = lj.a(a2, xmlPullParser2, "tintMode", 6, -1);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            int i3 = 3;
            if (a3 == 3) {
                mode = PorterDuff.Mode.SRC_OVER;
            } else if (a3 == 5) {
                mode = PorterDuff.Mode.SRC_IN;
            } else if (a3 != 9) {
                switch (a3) {
                    case UrlRequest.Status.READING_RESPONSE /*14*/:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case Service.START_CONTINUATION_MASK /*15*/:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
            ate2.d = mode;
            int i4 = 1;
            if (lj.a(xmlPullParser2, "tint")) {
                TypedValue typedValue = new TypedValue();
                a2.getValue(1, typedValue);
                if (typedValue.type == 2) {
                    throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
                } else if (typedValue.type < 28 || typedValue.type > 31) {
                    Resources resources3 = a2.getResources();
                    try {
                        colorStateList = ku.a(resources3, resources3.getXml(a2.getResourceId(1, 0)), theme2);
                    } catch (Exception e2) {
                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                        colorStateList = null;
                    }
                } else {
                    colorStateList = ColorStateList.valueOf(typedValue.data);
                }
            } else {
                colorStateList = null;
            }
            if (colorStateList != null) {
                ate2.c = colorStateList;
            }
            boolean z = ate2.e;
            if (lj.a(xmlPullParser2, "autoMirrored")) {
                z = a2.getBoolean(5, z);
            }
            ate2.e = z;
            atd.g = lj.a(a2, xmlPullParser2, "viewportWidth", 7, atd.g);
            float a4 = lj.a(a2, xmlPullParser2, "viewportHeight", 8, atd.h);
            atd.h = a4;
            if (atd.g <= 0.0f) {
                throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
            } else if (a4 > 0.0f) {
                atd.e = a2.getDimension(3, atd.e);
                float dimension = a2.getDimension(2, atd.f);
                atd.f = dimension;
                if (atd.e <= 0.0f) {
                    throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires width > 0");
                } else if (dimension > 0.0f) {
                    atd.setAlpha(lj.a(a2, xmlPullParser2, "alpha", 4, atd.getAlpha()));
                    String string = a2.getString(0);
                    if (string != null) {
                        atd.j = string;
                        atd.l.put(string, atd);
                    }
                    a2.recycle();
                    ate.a = getChangingConfigurations();
                    ate.k = true;
                    ate ate3 = this.c;
                    atd atd2 = ate3.b;
                    ArrayDeque arrayDeque = new ArrayDeque();
                    arrayDeque.push(atd2.d);
                    int eventType = xmlPullParser.getEventType();
                    int depth = xmlPullParser.getDepth() + 1;
                    boolean z2 = true;
                    while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != i3)) {
                        if (eventType == 2) {
                            String name = xmlPullParser.getName();
                            ata ata = (ata) arrayDeque.peek();
                            if ("path".equals(name)) {
                                asz asz = new asz();
                                TypedArray a5 = lj.a(resources2, theme2, attributeSet2, aso.c);
                                asz.a = null;
                                if (lj.a(xmlPullParser2, "pathData")) {
                                    String string2 = a5.getString(0);
                                    if (string2 != null) {
                                        asz.n = string2;
                                    }
                                    String string3 = a5.getString(2);
                                    if (string3 != null) {
                                        asz.m = lo.a(string3);
                                    }
                                    asz.d = lj.a(a5, xmlPullParser2, theme2, "fillColor", 1);
                                    i2 = depth;
                                    asz.f = lj.a(a5, xmlPullParser2, "fillAlpha", 12, asz.f);
                                    int a6 = lj.a(a5, xmlPullParser2, "strokeLineCap", 8, -1);
                                    Paint.Cap cap = asz.j;
                                    if (a6 == 0) {
                                        cap = Paint.Cap.BUTT;
                                    } else if (a6 == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (a6 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                    asz.j = cap;
                                    int a7 = lj.a(a5, xmlPullParser2, "strokeLineJoin", 9, -1);
                                    Paint.Join join = asz.k;
                                    if (a7 == 0) {
                                        join = Paint.Join.MITER;
                                    } else if (a7 == 1) {
                                        join = Paint.Join.ROUND;
                                    } else if (a7 == 2) {
                                        join = Paint.Join.BEVEL;
                                    }
                                    asz.k = join;
                                    asz.l = lj.a(a5, xmlPullParser2, "strokeMiterLimit", 10, asz.l);
                                    asz.b = lj.a(a5, xmlPullParser2, theme2, "strokeColor", 3);
                                    asz.e = lj.a(a5, xmlPullParser2, "strokeAlpha", 11, asz.e);
                                    asz.c = lj.a(a5, xmlPullParser2, "strokeWidth", 4, asz.c);
                                    asz.h = lj.a(a5, xmlPullParser2, "trimPathEnd", 6, asz.h);
                                    asz.i = lj.a(a5, xmlPullParser2, "trimPathOffset", 7, asz.i);
                                    asz.g = lj.a(a5, xmlPullParser2, "trimPathStart", 5, asz.g);
                                    asz.o = lj.a(a5, xmlPullParser2, "fillType", 13, asz.o);
                                } else {
                                    i2 = depth;
                                }
                                a5.recycle();
                                ata.b.add(asz);
                                if (asz.getPathName() != null) {
                                    atd2.l.put(asz.getPathName(), asz);
                                }
                                int i5 = ate3.a;
                                z2 = false;
                            } else {
                                i2 = depth;
                                if ("clip-path".equals(name)) {
                                    asy asy = new asy();
                                    if (lj.a(xmlPullParser2, "pathData")) {
                                        TypedArray a8 = lj.a(resources2, theme2, attributeSet2, aso.d);
                                        String string4 = a8.getString(0);
                                        if (string4 != null) {
                                            asy.n = string4;
                                        }
                                        String string5 = a8.getString(1);
                                        if (string5 != null) {
                                            asy.m = lo.a(string5);
                                        }
                                        asy.o = lj.a(a8, xmlPullParser2, "fillType", 2, 0);
                                        a8.recycle();
                                    }
                                    ata.b.add(asy);
                                    if (asy.getPathName() != null) {
                                        atd2.l.put(asy.getPathName(), asy);
                                    }
                                    int i6 = ate3.a;
                                } else if ("group".equals(name)) {
                                    ata ata2 = new ata();
                                    TypedArray a9 = lj.a(resources2, theme2, attributeSet2, aso.b);
                                    ata2.l = null;
                                    ata2.c = lj.a(a9, xmlPullParser2, "rotation", 5, ata2.c);
                                    ata2.d = a9.getFloat(1, ata2.d);
                                    ata2.e = a9.getFloat(2, ata2.e);
                                    ata2.f = lj.a(a9, xmlPullParser2, "scaleX", 3, ata2.f);
                                    ata2.g = lj.a(a9, xmlPullParser2, "scaleY", 4, ata2.g);
                                    ata2.h = lj.a(a9, xmlPullParser2, "translateX", 6, ata2.h);
                                    ata2.i = lj.a(a9, xmlPullParser2, "translateY", 7, ata2.i);
                                    String string6 = a9.getString(0);
                                    if (string6 != null) {
                                        ata2.m = string6;
                                    }
                                    ata2.a();
                                    a9.recycle();
                                    ata.b.add(ata2);
                                    arrayDeque.push(ata2);
                                    if (ata2.getGroupName() != null) {
                                        atd2.l.put(ata2.getGroupName(), ata2);
                                    }
                                    int i7 = ate3.a;
                                }
                            }
                        } else {
                            i2 = depth;
                            if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                arrayDeque.pop();
                            }
                        }
                        eventType = xmlPullParser.next();
                        depth = i2;
                        i4 = 1;
                        i3 = 3;
                    }
                    if (!z2) {
                        this.e = a(ate.c, ate.d);
                        return;
                    }
                    throw new XmlPullParserException("no path defined");
                } else {
                    throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires height > 0");
                }
            } else {
                throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
            }
        } else {
            ma.a(drawable, resources2, xmlPullParser2, attributeSet2, theme2);
        }
    }

    public atg(ate ate) {
        this.d = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = ate;
        this.e = a(ate.c, ate.d);
    }

    public static atg a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        atg atg = new atg();
        atg.inflate(resources, xmlPullParser, attributeSet, theme);
        return atg;
    }

    /* access modifiers changed from: package-private */
    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
