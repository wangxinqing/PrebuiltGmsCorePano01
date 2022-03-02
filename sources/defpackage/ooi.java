package defpackage;

import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: ooi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ooi extends AsyncTask {
    private final WeakReference a;
    private final oab b;
    private final boolean c;
    private final aoru d;

    public ooi(WeakReference weakReference, oab oab, boolean z, aoru aoru) {
        this.a = weakReference;
        this.b = oab;
        this.c = z;
        this.d = aoru;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity = (GoogleHelpRenderingApiWebViewChimeraActivity) this.a.get();
        if (googleHelpRenderingApiWebViewChimeraActivity != null) {
            return omu.a(googleHelpRenderingApiWebViewChimeraActivity, this.b, this.c, this.d);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        oab oab = (oab) obj;
        GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity = (GoogleHelpRenderingApiWebViewChimeraActivity) this.a.get();
        if (googleHelpRenderingApiWebViewChimeraActivity == null) {
            return;
        }
        if (oab == null) {
            if (googleHelpRenderingApiWebViewChimeraActivity.e == null) {
                googleHelpRenderingApiWebViewChimeraActivity.e = (LinearLayout) googleHelpRenderingApiWebViewChimeraActivity.getLayoutInflater().inflate(R.layout.gh_request_error, (ViewGroup) null);
            }
            LinearLayout linearLayout = googleHelpRenderingApiWebViewChimeraActivity.e;
            if (linearLayout != null) {
                oay.a((View) linearLayout, (int) R.string.common_something_went_wrong, (View.OnClickListener) new oon(googleHelpRenderingApiWebViewChimeraActivity));
                googleHelpRenderingApiWebViewChimeraActivity.setContentView((View) googleHelpRenderingApiWebViewChimeraActivity.e);
                return;
            }
            return;
        }
        String r = oab.r();
        String str = oab.d;
        googleHelpRenderingApiWebViewChimeraActivity.a = r;
        googleHelpRenderingApiWebViewChimeraActivity.b = str;
        googleHelpRenderingApiWebViewChimeraActivity.runOnUiThread(new oom(googleHelpRenderingApiWebViewChimeraActivity));
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        GoogleHelpRenderingApiWebViewChimeraActivity googleHelpRenderingApiWebViewChimeraActivity = (GoogleHelpRenderingApiWebViewChimeraActivity) this.a.get();
        if (googleHelpRenderingApiWebViewChimeraActivity != null) {
            googleHelpRenderingApiWebViewChimeraActivity.setContentView((int) R.layout.gh_rendering_api_web_view_progress_bar);
        }
    }
}
