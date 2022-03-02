package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.feedback.FeedbackAsyncChimeraService;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: mvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mvh extends qvy {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Context b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mvh(String str, FeedbackOptions feedbackOptions, Context context) {
        super(str);
        this.a = feedbackOptions;
        this.b = context;
    }

    public final void a(ComponentName componentName) {
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        FeedbackAsyncChimeraService.b.execute(new mvg(this, iBinder, this.a, this.b));
    }
}
