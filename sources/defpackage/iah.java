package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import com.google.android.chimera.Activity;
import com.google.android.chimera.WebView;

/* renamed from: iah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class iah extends Activity {
    public static void a(Activity activity, Intent intent, int i) {
        intent.setClassName(activity, "com.google.android.gms.common.activity.WhitelistWebViewActivity");
        activity.startActivityForResult(intent, i);
    }

    /* access modifiers changed from: protected */
    public WebViewClient a() {
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        setContentView((View) webView);
        if (!"com.google.android.gms".equals(jhg.a((Activity) this))) {
            setResult(0);
            finish();
            return;
        }
        Intent intent = getIntent();
        if (!(intent == null || intent.getData() == null)) {
            webView.loadUrl(intent.getData().toString());
        }
        webView.setWebViewClient(a());
        setResult(-1);
    }
}
