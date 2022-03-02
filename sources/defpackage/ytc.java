package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ytc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ytc extends bhv implements ytd {
    public ytc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.plus.dynamite.IAddToCirclesCallbacks");
    }

    public final void a(Intent intent) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) intent);
        b(2, aQ);
    }
}
