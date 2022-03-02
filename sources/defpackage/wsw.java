package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: wsw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wsw extends bhv implements wsy {
    public wsw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.contactssync.internal.IContactsSyncService");
    }

    public final void a(wtb wtb) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wtb);
        b(192805, aQ);
    }

    public final void a(wtb wtb, Uri uri) {
        throw null;
    }

    public final void a(wtb wtb, List list, String str) {
        throw null;
    }

    public final void a(wtb wtb, int[] iArr) {
        throw null;
    }

    public final void b(wtb wtb) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wtb);
        b(192806, aQ);
    }

    public final void b(wtb wtb, int[] iArr) {
        throw null;
    }

    public final void c(wtb wtb) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wtb);
        b(192807, aQ);
    }

    public final void a(wtb wtb, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) wtb);
        aQ.writeString(str);
        b(192802, aQ);
    }
}
