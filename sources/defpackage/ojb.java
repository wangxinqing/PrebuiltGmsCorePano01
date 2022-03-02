package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ojb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ojb implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final mum c;
    private final long d;

    public ojb(Context context, GoogleHelp googleHelp, mum mum, long j) {
        this.a = context;
        this.b = googleHelp;
        this.c = mum;
        this.d = j;
    }

    public final void run() {
        List list;
        try {
            myp myp = new myp();
            myp.c();
            list = this.c.a();
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
            Log.w("gH_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e2);
            list = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
        }
        ojm a2 = nyy.a(this.a);
        GoogleHelp googleHelp = this.b;
        Bundle a3 = myo.a(list);
        long j = this.d;
        icc icc = a2.j;
        oje oje = new oje(icc, a3, j, googleHelp);
        icc.a((idf) oje);
        iux.a(oje);
    }
}
