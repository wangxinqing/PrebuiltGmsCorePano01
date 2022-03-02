package defpackage;

import com.google.android.gms.R;

/* renamed from: eys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class eys implements ow {
    private final ezb a;

    public eys(ezb ezb) {
        this.a = ezb;
    }

    public final Object a() {
        ezb ezb = this.a;
        return new eyh(ezb.getContext(), (int) ezb.getResources().getDimension(R.dimen.credentials_google_sign_in_consent_profile_avatar_size));
    }
}
