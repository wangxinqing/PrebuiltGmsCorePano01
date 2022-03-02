package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.udc.ui.AuthenticatingWebViewChimeraActivity;

/* renamed from: adex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adex extends agyp {
    final /* synthetic */ AuthenticatingWebViewChimeraActivity a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adex(AuthenticatingWebViewChimeraActivity authenticatingWebViewChimeraActivity, agyr agyr) {
        super(agyr, agyr);
        this.a = authenticatingWebViewChimeraActivity;
    }

    public final boolean b(String str) {
        ((anih) ((anih) AuthenticatingWebViewChimeraActivity.a.b()).a("adex", "b", 166, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Url is not whitelisted.");
        AuthenticatingWebViewChimeraActivity authenticatingWebViewChimeraActivity = this.a;
        Intent a2 = adgw.a(authenticatingWebViewChimeraActivity.e, authenticatingWebViewChimeraActivity.b, authenticatingWebViewChimeraActivity.getPackageName());
        if (jhg.a((Context) this.a, a2)) {
            this.a.startActivity(a2);
        } else {
            Toast.makeText(this.a, R.string.common_missing_url_viewer, 1).show();
        }
        return true;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        AuthenticatingWebViewChimeraActivity authenticatingWebViewChimeraActivity = this.a;
        jjg jjg = AuthenticatingWebViewChimeraActivity.a;
        if (authenticatingWebViewChimeraActivity.c) {
            authenticatingWebViewChimeraActivity.d.setVisibility(8);
        }
        sg aE = this.a.aE();
        if (aE.f() && TextUtils.isEmpty(aE.b()) && !TextUtils.isEmpty(webView.getTitle())) {
            aE.c(true);
            aE.a((CharSequence) webView.getTitle());
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        AuthenticatingWebViewChimeraActivity authenticatingWebViewChimeraActivity = this.a;
        jjg jjg = AuthenticatingWebViewChimeraActivity.a;
        if (authenticatingWebViewChimeraActivity.c) {
            authenticatingWebViewChimeraActivity.d.setVisibility(0);
        }
    }
}
