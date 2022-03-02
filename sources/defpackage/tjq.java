package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnStartAdvertisingResultParams;

/* renamed from: tjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tjq extends uhc {
    final /* synthetic */ ugr a;

    public tjq(ugr ugr) {
        this.a = ugr;
    }

    public final void a(OnStartAdvertisingResultParams onStartAdvertisingResultParams) {
        ugr ugr = this.a;
        int i = onStartAdvertisingResultParams.a;
        String str = onStartAdvertisingResultParams.b;
        Parcel aQ = ugr.aQ();
        aQ.writeInt(i);
        aQ.writeString(str);
        ugr.b(1009, aQ);
    }
}
