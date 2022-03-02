package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: mvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mvg implements Runnable {
    private final mvh a;
    private final IBinder b;
    private final FeedbackOptions c;
    private final Context d;

    public mvg(mvh mvh, IBinder iBinder, FeedbackOptions feedbackOptions, Context context) {
        this.a = mvh;
        this.b = iBinder;
        this.c = feedbackOptions;
        this.d = context;
    }

    public final void run() {
        myj myj;
        mvh mvh = this.a;
        IBinder iBinder = this.b;
        FeedbackOptions feedbackOptions = this.c;
        Context context = this.d;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackAsyncService");
                myj = !(queryLocalInterface instanceof myj) ? new myh(iBinder) : (myj) queryLocalInterface;
            } catch (RemoteException e) {
                Log.e("gf_FeedbackAsyncService", e.getMessage());
            } catch (Throwable th) {
                jca.a().a(context, (ServiceConnection) mvh);
                throw th;
            }
        } else {
            myj = null;
        }
        myj.a(myj.a(feedbackOptions));
        jca.a().a(context, (ServiceConnection) mvh);
    }
}
