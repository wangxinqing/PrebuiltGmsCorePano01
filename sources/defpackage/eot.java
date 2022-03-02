package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: eot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eot extends bhv implements eov {
    public eot(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGetAccountsCallback");
    }

    public final void a(Status status, List list) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedList(list);
        c(2, aQ);
    }
}
