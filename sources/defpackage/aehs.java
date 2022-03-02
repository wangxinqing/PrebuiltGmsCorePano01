package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.bluetooth.fastpair.Event;

/* renamed from: aehs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aehs extends bhv implements aehu {
    public aehs(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.bluetooth.fastpair.IFastPairLoggingService");
    }

    public final void a(Event event) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) event);
        c(2, aQ);
    }

    public final void b(Event event) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) event);
        c(3, aQ);
    }

    public final void a(String str, String str2) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        aQ.writeString(str2);
        c(1, aQ);
    }
}
