package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: mvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mvj extends qvy {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Context b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mvj(String str, FeedbackOptions feedbackOptions, Context context) {
        super(str);
        this.a = feedbackOptions;
        this.b = context;
    }

    public final void a(ComponentName componentName) {
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        myj myj;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackAsyncService");
                myj = !(queryLocalInterface instanceof myj) ? new myh(iBinder) : (myj) queryLocalInterface;
            } catch (RemoteException e) {
                Log.e("gf_FeedbackAsyncService", e.getMessage());
            } catch (Throwable th) {
                jca.a().a(this.b, (ServiceConnection) this);
                throw th;
            }
        } else {
            myj = null;
        }
        myj.a(this.a);
        Intent className = new Intent().setClassName(this.b, "com.google.android.gms.feedback.FeedbackActivity");
        className.putExtra("com.android.feedback.SAFEPARCELABLE_SESSION_ID", this.a.n);
        long j = this.a.p;
        if (j != 0) {
            className.putExtra("ASYNC_PSD_START_TICK_NANOS", j);
        }
        className.addFlags(268435456);
        this.b.startActivity(className);
        jca.a().a(this.b, (ServiceConnection) this);
    }
}
