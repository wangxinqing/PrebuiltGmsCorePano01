package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;

/* renamed from: acic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acic implements icl {
    public final UserBootstrapInfo[] a;
    private final Status b;

    public acic(Status status, UserBootstrapInfo[] userBootstrapInfoArr) {
        this.b = status;
        this.a = userBootstrapInfoArr;
    }

    public final Status aO() {
        return this.b;
    }
}
