package defpackage;

import android.text.Html;
import android.text.Spanned;

/* renamed from: oag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oag {
    private static final String[] a = {"&", "&amp;", "<", "&lt;", ">", "&gt;", "\"", "&quot;", "'", "&#39;", "{", "&#123;", " ", "&nbsp;", "　", "&#x3000;"};

    public static Spanned a(String str) {
        int i = 0;
        while (true) {
            String[] strArr = a;
            if (i >= strArr.length) {
                return Html.fromHtml(str);
            }
            str = str.replace(strArr[i + 1], strArr[i]);
            i += 2;
        }
    }
}
