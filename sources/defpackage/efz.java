package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.HandlerThread;
import android.os.IBinder;
import com.google.android.gms.audiomodem.AudioStreamParams;
import com.google.android.gms.audiomodem.Snoop$Params;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;
import com.google.android.gms.audiomodem.TokenReceiver$Params;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: efz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class efz extends efd implements egg {
    public final qvr a;
    public final eda b;
    private final PackageManager c;

    public efz(Context context) {
        this.c = context.getPackageManager();
        HandlerThread handlerThread = new HandlerThread("AudioModemThread");
        handlerThread.start();
        this.a = new qvr(handlerThread.getLooper());
        this.b = new eda(context, this.a);
    }

    public final void a(IBinder iBinder, efl efl, TokenBroadcaster$Params tokenBroadcaster$Params, efb efb) {
        this.a.post(new eft(this, iBinder, efl, this.c.getNameForUid(Binder.getCallingUid()), tokenBroadcaster$Params, efb));
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("\nAudioModem State:");
        printWriter.println("\nEnd AudioModem State\n");
    }

    public final void a(IBinder iBinder, efo efo, TokenReceiver$Params tokenReceiver$Params, efb efb) {
        this.a.post(new efr(this, iBinder, efo, this.c.getNameForUid(Binder.getCallingUid()), tokenReceiver$Params, efb));
    }

    public final void a(AudioStreamParams audioStreamParams, efi efi) {
        this.a.post(new efw(this, audioStreamParams, efi));
    }

    public final void a(Snoop$Params snoop$Params, efh efh, efb efb) {
        this.a.post(new efv(this, efh, snoop$Params, efb));
    }

    public final void a(efl efl, efb efb) {
        this.a.post(new efu(this, efl, this.c.getNameForUid(Binder.getCallingUid()), efb));
    }

    public final void a(efo efo, efb efb) {
        this.a.post(new efs(this, efo, this.c.getNameForUid(Binder.getCallingUid()), efb));
    }

    public final void a(Runnable runnable) {
        this.a.post(new efx(this, runnable));
    }
}
