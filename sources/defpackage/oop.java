package defpackage;

import android.webkit.JavascriptInterface;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewChimeraActivity;

/* renamed from: oop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oop {
    final /* synthetic */ GoogleHelpRenderingApiWebViewChimeraActivity a;

    public oop(GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity) {
        this.a = googleHelpRenderingApiWebViewChimeraActivity;
    }

    @JavascriptInterface
    public void onSubmit() {
        int i;
        GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity = this.a;
        if (!googleHelpRenderingApiWebViewChimeraActivity.d) {
            if (!googleHelpRenderingApiWebViewChimeraActivity.c) {
                i = R.string.gh_c2c_success_message;
            } else {
                i = R.string.gh_chat_thanks_feedback;
            }
            Toast.makeText(googleHelpRenderingApiWebViewChimeraActivity, googleHelpRenderingApiWebViewChimeraActivity.getString(i), 0).show();
        }
    }

    @JavascriptInterface
    public void onSubmitError() {
        GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity = this.a;
        Toast.makeText(googleHelpRenderingApiWebViewChimeraActivity, googleHelpRenderingApiWebViewChimeraActivity.getString(R.string.gh_server_failure_dialog_message), 0).show();
        googleHelpRenderingApiWebViewChimeraActivity.runOnUiThread(new ooq(googleHelpRenderingApiWebViewChimeraActivity));
    }
}
