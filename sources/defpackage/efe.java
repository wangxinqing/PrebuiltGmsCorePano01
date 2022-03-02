package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.audiomodem.AudioStreamParams;
import com.google.android.gms.audiomodem.Snoop$Params;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;
import com.google.android.gms.audiomodem.TokenReceiver$Params;

/* renamed from: efe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface efe extends IInterface {
    void a(IBinder iBinder, efl efl, TokenBroadcaster$Params tokenBroadcaster$Params, efb efb);

    void a(IBinder iBinder, efo efo, TokenReceiver$Params tokenReceiver$Params, efb efb);

    void a(AudioStreamParams audioStreamParams, efi efi);

    void a(Snoop$Params snoop$Params, efh efh, efb efb);

    void a(efl efl, efb efb);

    void a(efo efo, efb efb);
}
