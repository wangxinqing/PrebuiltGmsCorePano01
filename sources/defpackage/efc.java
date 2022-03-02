package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audiomodem.AudioStreamParams;
import com.google.android.gms.audiomodem.Snoop$Params;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;
import com.google.android.gms.audiomodem.TokenReceiver$Params;

/* renamed from: efc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class efc extends bhv implements efe {
    public efc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.audiomodem.internal.IAudioModemService");
    }

    public final void a(IBinder iBinder, efl efl, TokenBroadcaster$Params tokenBroadcaster$Params, efb efb) {
        Parcel aQ = aQ();
        aQ.writeStrongBinder(iBinder);
        bhx.a(aQ, (IInterface) efl);
        bhx.a(aQ, (Parcelable) tokenBroadcaster$Params);
        bhx.a(aQ, (IInterface) efb);
        b(3, aQ);
    }

    public final void a(AudioStreamParams audioStreamParams, efi efi) {
        throw null;
    }

    public final void a(IBinder iBinder, efo efo, TokenReceiver$Params tokenReceiver$Params, efb efb) {
        Parcel aQ = aQ();
        aQ.writeStrongBinder(iBinder);
        bhx.a(aQ, (IInterface) efo);
        bhx.a(aQ, (Parcelable) tokenReceiver$Params);
        bhx.a(aQ, (IInterface) efb);
        b(1, aQ);
    }

    public final void a(Snoop$Params snoop$Params, efh efh, efb efb) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) snoop$Params);
        bhx.a(aQ, (IInterface) efh);
        bhx.a(aQ, (IInterface) efb);
        b(5, aQ);
    }

    public final void a(efl efl, efb efb) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) efl);
        bhx.a(aQ, (IInterface) efb);
        b(4, aQ);
    }

    public final void a(efo efo, efb efb) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) efo);
        bhx.a(aQ, (IInterface) efb);
        b(2, aQ);
    }
}
