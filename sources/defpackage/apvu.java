package defpackage;

import com.google.firebase.auth.internal.FederatedSignInActivity;

/* renamed from: apvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apvu implements Runnable {
    final /* synthetic */ FederatedSignInActivity a;

    public apvu(FederatedSignInActivity federatedSignInActivity) {
        this.a = federatedSignInActivity;
    }

    public final void run() {
        this.a.e();
        FederatedSignInActivity.k = null;
    }
}
