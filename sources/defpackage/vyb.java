package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: vyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vyb extends bhv implements vyd {
    public vyb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.sharing.internal.IContactsResultListener");
    }

    public final void a(List list) {
        Parcel aQ = aQ();
        aQ.writeTypedList(list);
        c(1, aQ);
    }
}
