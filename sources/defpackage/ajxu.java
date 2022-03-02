package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* renamed from: ajxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajxu {
    public static boolean a;
    public static Constructor b;
    public static Object c;
    public CharSequence d;
    public final TextPaint e;
    public final int f;
    public int g;
    public Layout.Alignment h = Layout.Alignment.ALIGN_NORMAL;
    public int i = Integer.MAX_VALUE;
    public boolean j = true;
    public boolean k;
    public TextUtils.TruncateAt l = null;

    public ajxu(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.d = charSequence;
        this.e = textPaint;
        this.f = i2;
        this.g = charSequence.length();
    }
}
