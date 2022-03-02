package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: mvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mvd {
    public static final Status a = new Status(13);
    public static final ibq b = new ibq("Feedback.API", d, c);
    private static final ibg c = new ibg();
    private static final ibn d = new mux();

    public static iby a(Context context) {
        return new iby(context, (byte[]) null);
    }

    @Deprecated
    public static icf b(icc icc, FeedbackOptions feedbackOptions) {
        muz muz = new muz(icc, feedbackOptions);
        icc.a((idf) muz);
        return muz;
    }

    public static icf a(icc icc, Bundle bundle, long j) {
        mva mva = new mva(icc, bundle, j);
        icc.a((idf) mva);
        return mva;
    }

    @Deprecated
    public static icf a(icc icc, FeedbackOptions feedbackOptions) {
        return icc.a((idf) new muy(icc, feedbackOptions, icc.b(), System.nanoTime()));
    }

    public static icf a(icc icc, FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        mvb mvb = new mvb(icc, feedbackOptions, bundle, j);
        icc.a((idf) mvb);
        return mvb;
    }
}
