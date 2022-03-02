package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: iik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iik extends bhv implements iim {
    public iik(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
    }

    public final void a(AudienceMember audienceMember) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) audienceMember);
        b(3, aQ);
    }

    public final void b() {
        b(4, aQ());
    }
}
