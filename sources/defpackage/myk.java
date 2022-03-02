package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: myk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class myk extends bhv implements mym {
    public myk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.feedback.internal.IFeedbackService");
    }

    public final void a(Bundle bundle, long j) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) bundle);
        aQ.writeLong(j);
        b(4, aQ);
    }

    public final boolean b(ErrorReport errorReport) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) errorReport);
        Parcel a = a(3, aQ);
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final void a(ErrorReport errorReport, long j) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) errorReport);
        aQ.writeLong(j);
        c(6, aQ);
    }

    public final boolean b(FeedbackOptions feedbackOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) feedbackOptions);
        Parcel a = a(7, aQ);
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final void a(FeedbackOptions feedbackOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) feedbackOptions);
        b(8, aQ);
    }

    public final void a(FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) feedbackOptions);
        bhx.a(aQ, (Parcelable) bundle);
        aQ.writeLong(j);
        b(5, aQ);
    }

    public final boolean a(ErrorReport errorReport) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) errorReport);
        Parcel a = a(1, aQ);
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }
}
