package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: abxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abxm extends bhw implements abxn {
    public final abtb a;
    protected Handler b;

    public abxm() {
        super("com.google.android.gms.smartdevice.d2d.internal.ITargetBootstrapListener");
    }

    public final void a(int i) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(5, Integer.valueOf(i)));
    }

    public final void b() {
        this.b.sendEmptyMessage(1);
    }

    public final void c() {
        this.b.sendEmptyMessage(2);
    }

    public final void a(BootstrapCompletionResult bootstrapCompletionResult) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(2, bootstrapCompletionResult));
    }

    public final void b(String str) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(4, str));
    }

    public abxm(abtb abtb) {
        super("com.google.android.gms.smartdevice.d2d.internal.ITargetBootstrapListener");
        this.b = new abze(this, Looper.getMainLooper());
        this.a = abtb;
    }

    public final void a(TargetConnectionArgs targetConnectionArgs) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(0, targetConnectionArgs));
    }

    public final void a(String str) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(3, str));
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((TargetConnectionArgs) bhx.a(parcel, TargetConnectionArgs.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                b();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean a2 = a((BootstrapProgressResult) bhx.a(parcel, BootstrapProgressResult.CREATOR));
                parcel2.writeNoException();
                bhx.a(parcel2, a2);
                return true;
            case 4:
                c();
                parcel2.writeNoException();
                return true;
            case 5:
                a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                b(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 7:
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 8:
                a((BootstrapCompletionResult) bhx.a(parcel, BootstrapCompletionResult.CREATOR));
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: finally extract failed */
    public final boolean a(BootstrapProgressResult bootstrapProgressResult) {
        FutureTask futureTask = new FutureTask(new abzf(this, bootstrapProgressResult));
        this.b.post(futureTask);
        try {
            Log.v("SmartDevice", "Waiting on client onProgress() response.");
            boolean booleanValue = ((Boolean) futureTask.get()).booleanValue();
            StringBuilder sb = new StringBuilder(35);
            sb.append("Client returned onProgress(): ");
            sb.append(booleanValue);
            Log.v("SmartDevice", sb.toString());
            Log.v("SmartDevice", "Done waiting for onProgress() FutureTask from client.");
            return booleanValue;
        } catch (InterruptedException | ExecutionException e) {
            Log.e("SmartDevice", "Failed while waiting for TargetBootstrapListener.onProgress()", e);
            Log.v("SmartDevice", "Done waiting for onProgress() FutureTask from client.");
            return false;
        } catch (Throwable th) {
            Log.v("SmartDevice", "Done waiting for onProgress() FutureTask from client.");
            throw th;
        }
    }
}
