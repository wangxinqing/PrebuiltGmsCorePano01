package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.SupportRequestHelp;

/* renamed from: ojt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ojt extends IInterface {
    void a(Bundle bundle, long j, GoogleHelp googleHelp, ojq ojq);

    void a(FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp, ojq ojq);

    @Deprecated
    void a(GoogleHelp googleHelp, String str, String str2, ojq ojq);

    void a(GoogleHelp googleHelp, ojq ojq);

    void a(InProductHelp inProductHelp, ojq ojq);

    void a(SupportRequestHelp supportRequestHelp, ojq ojq);

    void b(Bundle bundle, long j, GoogleHelp googleHelp, ojq ojq);

    @Deprecated
    void b(GoogleHelp googleHelp, String str, String str2, ojq ojq);

    void b(GoogleHelp googleHelp, ojq ojq);

    void b(SupportRequestHelp supportRequestHelp, ojq ojq);

    void c(GoogleHelp googleHelp, ojq ojq);

    void d(GoogleHelp googleHelp, ojq ojq);

    void e(GoogleHelp googleHelp, ojq ojq);
}
