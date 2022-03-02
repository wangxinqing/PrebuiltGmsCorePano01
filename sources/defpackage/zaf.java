package defpackage;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: zaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zaf extends FrameLayout {
    public ysw a;
    public yuv b;

    public zaf(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public static String a(String str) {
        if (str != null) {
            return Html.fromHtml(str).toString();
        }
        return null;
    }
}
