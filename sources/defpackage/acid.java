package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;

/* renamed from: acid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acid implements icl {
    public final Challenge[] a;
    private final Status b;

    public acid(Status status, Challenge[] challengeArr) {
        this.b = status;
        this.a = challengeArr;
    }

    public final Status aO() {
        return this.b;
    }
}
