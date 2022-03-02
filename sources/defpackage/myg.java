package defpackage;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: myg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class myg implements Runnable {
    private final Context a;
    private final mum b;
    private final long c;

    public myg(Context context, mum mum, long j) {
        this.a = context;
        this.b = mum;
        this.c = j;
    }

    public final void run() {
        List list;
        try {
            myp myp = new myp();
            myp.c();
            list = this.b.a();
            if (list == null) {
                list = new ArrayList(1);
            }
            try {
                list.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(myp.a())));
            } catch (UnsupportedOperationException e) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(myp.a())));
                list = arrayList;
            }
        } catch (Exception e2) {
            Log.w("gF_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e2);
            list = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
        }
        iby a2 = mvd.a(this.a);
        iux.a(mvd.a(a2.j, myo.a(list), this.c));
    }
}
