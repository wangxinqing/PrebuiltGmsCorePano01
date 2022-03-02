package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.google.android.gms.R;

/* renamed from: iaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iaj extends WebViewClient {
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (iai.a(str)) {
            return false;
        }
        Toast.makeText(webView.getContext(), R.string.common_no_browser_for_restricted_url, 1).show();
        return true;
    }
}
