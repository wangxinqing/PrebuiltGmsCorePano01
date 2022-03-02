package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.audience.widgets.AudienceView;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: iil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iil extends bhw implements iim {
    final /* synthetic */ AudienceView a;

    public iil() {
        super("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
    }

    public final void a(AudienceMember audienceMember) {
        iip iip = this.a.b;
        ypj ypj = (ypj) iip;
        ypj.g().a(ixb.b(ypj.g().a, audienceMember), iip);
    }

    public final void b() {
        this.a.a.a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iil(AudienceView audienceView) {
        super("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
        this.a = audienceView;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 3) {
            a((AudienceMember) bhx.a(parcel, AudienceMember.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            b();
        }
        parcel2.writeNoException();
        return true;
    }
}
