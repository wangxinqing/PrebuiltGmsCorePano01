package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;

/* renamed from: dxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dxb extends jba {
    private final ClientContext a;
    private final dwj d;
    private final dwn e;

    public dxb(ClientContext clientContext, dwj dwj, dwn dwn) {
        super(106, "AppInviteGetSuggestedInvitees");
        this.a = clientContext;
        this.d = dwj;
        this.e = dwn;
    }

    public final void a(Context context) {
        ArrayList a2 = this.d.a(this.a);
        Status status = a2 == null ? Status.c : Status.a;
        dwn dwn = this.e;
        if (dwn != null) {
            Parcel aQ = dwn.aQ();
            bhx.a(aQ, (Parcelable) status);
            aQ.writeList(a2);
            dwn.c(2, aQ);
        }
    }
}
