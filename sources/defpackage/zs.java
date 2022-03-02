package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.support.v7.widget.AppCompatEditText;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: zs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zs {
    private static final RectF j = new RectF();
    private static final ConcurrentHashMap k = new ConcurrentHashMap();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public final TextView h;
    public final Context i;
    private TextPaint l;

    static {
        new ConcurrentHashMap();
    }

    public zs(TextView textView) {
        this.h = textView;
        this.i = textView.getContext();
    }

    private static Object a(Object obj, String str, Object obj2) {
        try {
            obj2 = a(str).invoke(obj, new Object[0]);
            if (obj2 != null) {
                return obj2;
            }
            return null;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return Math.round(this.d);
    }

    /* access modifiers changed from: package-private */
    public final int c() {
        return Math.round(this.e);
    }

    public final boolean d() {
        boolean z;
        int[] iArr = this.f;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        if (z) {
            this.a = 1;
            this.d = (float) iArr[0];
            this.e = (float) iArr[length - 1];
            this.c = -1.0f;
        }
        return z;
    }

    public final boolean e() {
        if (!h() || this.a != 1) {
            this.b = false;
            return false;
        }
        if (!this.g || this.f.length == 0) {
            int floor = ((int) Math.floor((double) ((this.e - this.d) / this.c))) + 1;
            int[] iArr = new int[floor];
            for (int i2 = 0; i2 < floor; i2++) {
                iArr[i2] = Math.round(this.d + (((float) i2) * this.c));
            }
            this.f = a(iArr);
        }
        this.b = true;
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        boolean z;
        StaticLayout staticLayout;
        int i2;
        if (g()) {
            if (this.b) {
                if (this.h.getMeasuredHeight() > 0 && this.h.getMeasuredWidth() > 0) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        z = this.h.isHorizontallyScrollable();
                    } else {
                        z = ((Boolean) a((Object) this.h, "getHorizontallyScrolling", (Object) false)).booleanValue();
                    }
                    int measuredWidth = !z ? (this.h.getMeasuredWidth() - this.h.getTotalPaddingLeft()) - this.h.getTotalPaddingRight() : 1048576;
                    int height = (this.h.getHeight() - this.h.getCompoundPaddingBottom()) - this.h.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        synchronized (j) {
                            j.setEmpty();
                            j.right = (float) measuredWidth;
                            j.bottom = (float) height;
                            RectF rectF = j;
                            int length = this.f.length;
                            if (length != 0) {
                                int i3 = length - 1;
                                int i4 = 0;
                                int i5 = 1;
                                while (i5 <= i3) {
                                    int i6 = (i5 + i3) / 2;
                                    int i7 = this.f[i6];
                                    CharSequence text = this.h.getText();
                                    TransformationMethod transformationMethod = this.h.getTransformationMethod();
                                    if (transformationMethod != null) {
                                        CharSequence transformation = transformationMethod.getTransformation(text, this.h);
                                        if (transformation != null) {
                                            text = transformation;
                                        }
                                    }
                                    int i8 = Build.VERSION.SDK_INT;
                                    int maxLines = this.h.getMaxLines();
                                    TextPaint textPaint = this.l;
                                    if (textPaint == null) {
                                        this.l = new TextPaint();
                                    } else {
                                        textPaint.reset();
                                    }
                                    this.l.set(this.h.getPaint());
                                    this.l.setTextSize((float) i7);
                                    Layout.Alignment alignment = (Layout.Alignment) a((Object) this.h, "getLayoutAlignment", (Object) Layout.Alignment.ALIGN_NORMAL);
                                    int round = Math.round(rectF.right);
                                    if (Build.VERSION.SDK_INT < 23) {
                                        int i9 = Build.VERSION.SDK_INT;
                                        staticLayout = new StaticLayout(text, this.l, round, alignment, this.h.getLineSpacingMultiplier(), this.h.getLineSpacingExtra(), this.h.getIncludeFontPadding());
                                    } else {
                                        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.l, round);
                                        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.h.getLineSpacingExtra(), this.h.getLineSpacingMultiplier()).setIncludePad(this.h.getIncludeFontPadding()).setBreakStrategy(this.h.getBreakStrategy()).setHyphenationFrequency(this.h.getHyphenationFrequency());
                                        if (maxLines == -1) {
                                            i2 = Integer.MAX_VALUE;
                                        } else {
                                            i2 = maxLines;
                                        }
                                        hyphenationFrequency.setMaxLines(i2);
                                        try {
                                            obtain.setTextDirection(Build.VERSION.SDK_INT < 29 ? (TextDirectionHeuristic) a((Object) this.h, "getTextDirectionHeuristic", (Object) TextDirectionHeuristics.FIRSTSTRONG_LTR) : this.h.getTextDirectionHeuristic());
                                        } catch (ClassCastException e2) {
                                            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                                        }
                                        staticLayout = obtain.build();
                                    }
                                    if (maxLines != -1) {
                                        if (staticLayout.getLineCount() <= maxLines) {
                                            if (staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != text.length()) {
                                            }
                                        }
                                        i4 = i6 - 1;
                                        i3 = i4;
                                    }
                                    if (((float) staticLayout.getHeight()) <= rectF.bottom) {
                                        i4 = i5;
                                        i5 = i6 + 1;
                                    }
                                    i4 = i6 - 1;
                                    i3 = i4;
                                }
                                float f2 = (float) this.f[i4];
                                if (f2 != this.h.getTextSize()) {
                                    a(0, f2);
                                }
                            } else {
                                throw new IllegalStateException("No available text sizes to choose from.");
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.b = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return h() && this.a != 0;
    }

    public final boolean h() {
        return !(this.h instanceof AppCompatEditText);
    }

    private static Method a(String str) {
        try {
            Method method = (Method) k.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                k.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static final int[] a(int[] iArr) {
        if (r0 != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0) {
                    Integer valueOf = Integer.valueOf(i2);
                    if (Collections.binarySearch(arrayList, valueOf) < 0) {
                        arrayList.add(valueOf);
                    }
                }
            }
            if (r0 != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return Math.round(this.c);
    }

    public final void a(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.a = 1;
            this.d = f2;
            this.e = f3;
            this.c = f4;
            this.g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, float f2) {
        Context context = this.i;
        float applyDimension = TypedValue.applyDimension(i2, f2, (context != null ? context.getResources() : Resources.getSystem()).getDisplayMetrics());
        if (applyDimension != this.h.getPaint().getTextSize()) {
            this.h.getPaint().setTextSize(applyDimension);
            int i3 = Build.VERSION.SDK_INT;
            boolean isInLayout = this.h.isInLayout();
            if (this.h.getLayout() != null) {
                this.b = false;
                try {
                    Method a2 = a("nullLayouts");
                    if (a2 != null) {
                        a2.invoke(this.h, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (isInLayout) {
                    this.h.forceLayout();
                } else {
                    this.h.requestLayout();
                }
                this.h.invalidate();
            }
        }
    }
}
