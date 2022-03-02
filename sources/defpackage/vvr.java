package defpackage;

import android.os.Build;
import android.text.Html;
import java.util.List;

/* renamed from: vvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vvr {
    public static String a(anmd anmd) {
        String str = new anmc(anmd.a).a;
        return Build.VERSION.SDK_INT < 24 ? Html.fromHtml(str).toString() : no.a(str, 63).toString();
    }

    public static String a(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(a((anmd) list.get(i)));
        }
        return sb.toString();
    }
}
