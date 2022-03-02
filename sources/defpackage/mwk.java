package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.lang.ref.WeakReference;

/* renamed from: mwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mwk extends AsyncTask {
    public static final /* synthetic */ int a = 0;
    private final WeakReference b;
    private final ErrorReport c;
    private final mxg d = new mxg();

    public mwk(FeedbackChimeraActivity feedbackChimeraActivity, ErrorReport errorReport) {
        this.b = new WeakReference(feedbackChimeraActivity);
        this.c = errorReport;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        FeedbackChimeraActivity feedbackChimeraActivity;
        Context context;
        HelpConfig[] helpConfigArr = (HelpConfig[]) objArr;
        if (helpConfigArr.length == 0 || (feedbackChimeraActivity = (FeedbackChimeraActivity) this.b.get()) == null) {
            return null;
        }
        try {
            HelpConfig helpConfig = helpConfigArr[0];
            ErrorReport errorReport = this.c;
            if (!ofy.b()) {
                context = feedbackChimeraActivity.getApplicationContext();
            } else {
                context = feedbackChimeraActivity;
            }
            return mxl.a(context, helpConfig, feedbackChimeraActivity.a, errorReport);
        } catch (Exception e) {
            Log.w("gF_FetchSuggestionTask", "Error retrieving suggestions.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Pair pair = (Pair) obj;
        FeedbackChimeraActivity feedbackChimeraActivity = (FeedbackChimeraActivity) this.b.get();
        if (feedbackChimeraActivity != null) {
            try {
                ErrorReport errorReport = this.c;
                mxg mxg = this.d;
                if (pair == null) {
                    errorReport.ab = false;
                    errorReport.H = true;
                    mxj.a(errorReport, (Context) feedbackChimeraActivity);
                    feedbackChimeraActivity.a(errorReport, true);
                    return;
                }
                if (mxg != null) {
                    mxg.dismiss();
                }
                errorReport.ab = true;
                errorReport.H = false;
                FeedbackChimeraActivity.k = (oab) pair.second;
                oab oab = FeedbackChimeraActivity.k;
                mxp mxp = new mxp();
                Bundle bundle = new Bundle();
                bundle.putCharSequence("help_response_title", oab.d);
                bundle.putCharSequence("help_response_snippet", (String) pair.first);
                mxp.setArguments(bundle);
                mxp.setCancelable(false);
                mxp.show(feedbackChimeraActivity.getSupportFragmentManager(), "suggestionDialog");
                feedbackChimeraActivity.a(43, errorReport, errorReport.b, FeedbackChimeraActivity.k.e);
                feedbackChimeraActivity.a(errorReport, false);
            } catch (IllegalStateException e) {
                Log.w("gF_FetchSuggestionTask", "Exception when trying to return suggestions.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        FeedbackChimeraActivity feedbackChimeraActivity = (FeedbackChimeraActivity) this.b.get();
        if (feedbackChimeraActivity != null) {
            this.d.show(feedbackChimeraActivity.getSupportFragmentManager(), "progress_dialog");
        }
    }
}
