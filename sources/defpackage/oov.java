package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.google.android.gms.R;

/* renamed from: oov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class oov extends WebViewClient {
    protected final oow a;
    protected final nzu b;

    public oov(nzu nzu) {
        this.a = new oow(nzu);
        this.b = nzu;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        nzu nzu = this.b;
        if ((nzu instanceof oiy) && opa.a(str, (oiy) nzu, new agxz())) {
            return true;
        }
        if (oow.a(Uri.parse(str), true)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Context k = this.b.k();
        if (!jhg.a(k, intent)) {
            Toast.makeText(k, k.getResources().getString(R.string.gh_action_not_supported_message), 0).show();
        } else {
            k.startActivity(intent);
        }
        return true;
    }
}
