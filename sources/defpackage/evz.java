package defpackage;

import com.google.android.gms.auth.api.credentials.assistedsignin.ui.GoogleSignInChimeraActivity;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;

/* renamed from: evz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class evz implements amry {
    private final GoogleSignInChimeraActivity a;
    private final GetSignInIntentRequest b;

    public evz(GoogleSignInChimeraActivity googleSignInChimeraActivity, GetSignInIntentRequest getSignInIntentRequest) {
        this.a = googleSignInChimeraActivity;
        this.b = getSignInIntentRequest;
    }

    public final void a(Object obj) {
        this.a.a.a((audx) qbv.a(205, (qbu) obj, this.b.c)).b();
    }
}
