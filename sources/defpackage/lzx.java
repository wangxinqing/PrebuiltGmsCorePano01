package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;
import java.util.Map;

/* renamed from: lzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lzx extends bhv implements lzz {
    public lzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.droidguard.internal.IDroidGuardHandle");
    }

    public final DroidGuardInitReply a(String str, DroidGuardResultsRequest droidGuardResultsRequest) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) droidGuardResultsRequest);
        Parcel a = a(5, aQ);
        DroidGuardInitReply droidGuardInitReply = (DroidGuardInitReply) bhx.a(a, DroidGuardInitReply.CREATOR);
        a.recycle();
        return droidGuardInitReply;
    }

    public final void b() {
        c(3, aQ());
    }

    public final void a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        c(1, aQ);
    }

    public final byte[] a(Map map) {
        Parcel aQ = aQ();
        aQ.writeMap(map);
        Parcel a = a(2, aQ);
        byte[] createByteArray = a.createByteArray();
        a.recycle();
        return createByteArray;
    }
}
