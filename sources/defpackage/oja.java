package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;
import java.util.List;

/* renamed from: oja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oja implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final mum c;
    private final long d;

    public oja(Context context, GoogleHelp googleHelp, mum mum, long j) {
        this.a = context;
        this.b = googleHelp;
        this.c = mum;
        this.d = j;
    }

    public final void run() {
        List<FileTeleporter> list;
        Bundle bundle = new Bundle(1);
        try {
            myp myp = new myp();
            myp.c();
            list = this.c.b();
            File cacheDir = this.a.getCacheDir();
            if (list != null) {
                if (!list.isEmpty() && cacheDir != null) {
                    for (FileTeleporter a2 : list) {
                        a2.a(cacheDir);
                    }
                }
            }
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(myp.a()));
        } catch (Exception e) {
            Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            list = null;
        }
        FeedbackOptions a3 = FeedbackOptions.a(list);
        ojm a4 = nyy.a(this.a);
        GoogleHelp googleHelp = this.b;
        long j = this.d;
        icc icc = a4.j;
        ojg ojg = new ojg(icc, a3, bundle, j, googleHelp);
        icc.a((idf) ojg);
        iux.a(ojg);
    }
}
