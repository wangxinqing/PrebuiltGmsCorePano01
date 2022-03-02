package defpackage;

import android.content.Context;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.text.TextUtils;
import com.google.android.chimera.WebView;
import com.google.android.gms.R;
import java.util.List;

/* renamed from: ohe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ohe {
    public static String a(String str, List list, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("<h2>");
        sb.append(str);
        sb.append("</h2><ul>");
        for (int i = 0; i < list.size(); i++) {
            oab oab = (oab) list.get(i);
            sb.append("<li>");
            sb.append(oab.d);
            if (z && !TextUtils.isEmpty(oab.r())) {
                sb.append("<p class=\"ghelp-search-snippet\">");
                sb.append(oab.r());
                sb.append("</p>");
            }
            sb.append("</li>");
        }
        sb.append("</ul>");
        return sb.toString();
    }

    public static String a(nzu nzu, boolean z) {
        if (!z) {
            nzu.k();
            return ((Context) nzu).getResources().getString(R.string.gh_popular_articles);
        }
        nzu.k();
        return ((Context) nzu).getResources().getString(R.string.gh_help_search_title);
    }

    public static void a(nzu nzu, String str, WebView webView) {
        ((PrintManager) nzu.k().getSystemService("print")).print(nzu.k().getString(R.string.gh_print_job_name, new Object[]{str}), webView.createPrintDocumentAdapter(), new PrintAttributes.Builder().build());
    }

    public static void a(nzu nzu, String str, String str2) {
        nzu.k();
        WebView webView = new WebView((Context) nzu);
        opa.a(webView, (String) null, str, str2, omt.a(nzu.f()), false);
        a(nzu, str, webView);
    }
}
