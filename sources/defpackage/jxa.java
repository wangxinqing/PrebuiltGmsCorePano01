package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.ContextData;

/* renamed from: jxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jxa extends bhv implements jxc {
    public jxa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.contextmanager.internal.IContextListener");
    }

    public final void a(ContextData contextData) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) contextData);
        b(1, aQ);
    }
}
