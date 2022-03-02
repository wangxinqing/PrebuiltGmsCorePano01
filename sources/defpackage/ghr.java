package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ghr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ghr extends bhv implements ght {
    public ghr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.managed.internal.IEmmService");
    }

    public final void a(ghq ghq, String str, Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ghq);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) bundle);
        b(9, aQ);
    }

    public final void a(ghq ghq, String str, String str2) {
        throw null;
    }
}
