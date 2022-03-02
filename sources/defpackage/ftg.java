package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;

/* renamed from: ftg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ftg extends bhw implements fth {
    final /* synthetic */ acwd a;

    public ftg() {
        super("com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback");
    }

    public final void a(Status status, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        ihd.a(status, saveAccountLinkingTokenRequest, this.a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ftg(acwd acwd) {
        super("com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), (SaveAccountLinkingTokenRequest) bhx.a(parcel, SaveAccountLinkingTokenRequest.CREATOR));
        return true;
    }
}
