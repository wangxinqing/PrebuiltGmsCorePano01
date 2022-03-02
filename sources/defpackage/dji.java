package defpackage;

import android.content.Context;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: dji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dji {
    public final WebView a;
    public final List b = Arrays.asList(awhb.a.a().a().split(Pattern.quote("|")));
    public amsn c;

    public dji(Context context) {
        WebView webView = new WebView(context);
        this.a = webView;
        webView.getSettings().setAllowFileAccess(false);
    }
}
