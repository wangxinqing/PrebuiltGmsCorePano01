package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.chimera.Activity;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import com.google.android.gms.feedback.SuggestionsChimeraActivity;

/* renamed from: mxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mxm extends WebViewClient {
    final /* synthetic */ Activity a;
    final /* synthetic */ SuggestionsChimeraActivity b;

    public mxm(SuggestionsChimeraActivity suggestionsChimeraActivity, Activity activity) {
        this.b = suggestionsChimeraActivity;
        this.a = activity;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        opa.a(this.a, Uri.parse(str), FeedbackChimeraActivity.j, this.b.h());
        return true;
    }
}
