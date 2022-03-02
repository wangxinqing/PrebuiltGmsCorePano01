package defpackage;

import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;

/* renamed from: fnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fnd implements amrm {
    static final amrm a = new fnd();

    private fnd() {
    }

    public final boolean a(Object obj) {
        return !TextUtils.isEmpty(((InternalCredentialWrapper) obj).a.e);
    }
}
