package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.File;
import java.util.List;

/* renamed from: myf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class myf implements Runnable {
    private final Context a;
    private final mum b;
    private final long c;

    public myf(Context context, mum mum, long j) {
        this.a = context;
        this.b = mum;
        this.c = j;
    }

    public final void run() {
        List<FileTeleporter> list;
        Bundle bundle = new Bundle(1);
        try {
            myp myp = new myp();
            myp.c();
            list = this.b.b();
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
            Log.w("gF_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            list = null;
        }
        long j = this.c;
        iux.a(mvd.a(mvd.a(this.a).j, FeedbackOptions.a(list), bundle, j));
    }
}
