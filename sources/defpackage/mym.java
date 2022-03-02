package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: mym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface mym extends IInterface {
    void a(Bundle bundle, long j);

    void a(ErrorReport errorReport, long j);

    void a(FeedbackOptions feedbackOptions);

    void a(FeedbackOptions feedbackOptions, Bundle bundle, long j);

    boolean a(ErrorReport errorReport);

    boolean b(ErrorReport errorReport);

    boolean b(FeedbackOptions feedbackOptions);
}
