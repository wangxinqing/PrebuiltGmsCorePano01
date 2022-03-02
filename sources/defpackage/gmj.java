package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;

/* renamed from: gmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gmj extends gni {
    final /* synthetic */ PreAddAccountChimeraActivity a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gmj(PreAddAccountChimeraActivity preAddAccountChimeraActivity, Context context, boolean z) {
        super(context, z);
        this.a = preAddAccountChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        new gck(this.a).a();
        Bundle bundle = new Bundle();
        bundle.putBoolean("loader_result_certified", true);
        return bundle;
    }
}
