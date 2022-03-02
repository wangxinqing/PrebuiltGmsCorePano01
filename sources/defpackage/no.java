package defpackage;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/* renamed from: no  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class no {
    public static Spanned a(String str, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, i);
        }
        return Html.fromHtml(str);
    }
}
