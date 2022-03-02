package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: efa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class efa extends bhw implements efb {
    private final idg a;

    public efa() {
        super("com.google.android.gms.audiomodem.internal.IAudioModemCallback");
    }

    public static efa a(acwd acwd) {
        return new efa(new eex(acwd));
    }

    private efa(idg idg) {
        super("com.google.android.gms.audiomodem.internal.IAudioModemCallback");
        this.a = idg;
    }

    public final void a(Status status) {
        this.a.a((Object) status);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
