package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.feedback.FeedbackChimeraActivity;

/* renamed from: mvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mvu extends qvy {
    final /* synthetic */ Intent a;
    final /* synthetic */ FeedbackChimeraActivity b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mvu(FeedbackChimeraActivity feedbackChimeraActivity, String str, Intent intent) {
        super(str);
        this.b = feedbackChimeraActivity;
        this.a = intent;
    }

    public final void a(ComponentName componentName) {
        this.b.m = null;
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        myj myj;
        FeedbackChimeraActivity feedbackChimeraActivity = this.b;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackAsyncService");
            myj = queryLocalInterface instanceof myj ? (myj) queryLocalInterface : new myh(iBinder);
        } else {
            myj = null;
        }
        feedbackChimeraActivity.m = myj;
        FeedbackChimeraActivity feedbackChimeraActivity2 = this.b;
        feedbackChimeraActivity2.setContentView((View) feedbackChimeraActivity2.e());
        this.b.b(this.a);
    }
}
