package defpackage;

import android.content.Context;
import android.telecom.InCallService;
import android.telecom.Phone;

/* renamed from: bji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bji extends InCallService {
    final /* synthetic */ com.google.android.chimera.InCallService a;

    public bji(com.google.android.chimera.InCallService inCallService) {
        this.a = inCallService;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void onPhoneCreated(Phone phone) {
        this.a.onPhoneCreated(phone);
    }

    public final void onPhoneDestroyed(Phone phone) {
        this.a.onPhoneDestroyed(phone);
    }
}
