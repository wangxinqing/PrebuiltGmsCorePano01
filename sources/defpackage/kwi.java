package defpackage;

import android.os.Parcel;
import com.google.android.gms.drive.internal.OnEventResponse;

/* renamed from: kwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kwi extends bhw implements kwj {
    public kwi() {
        super("com.google.android.gms.drive.internal.IEventCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((OnEventResponse) bhx.a(parcel, OnEventResponse.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
