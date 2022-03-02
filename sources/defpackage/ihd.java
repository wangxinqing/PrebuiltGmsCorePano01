package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: ihd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ihd {
    @Deprecated
    public static acwa a(acwa acwa) {
        return acwa.a((acvf) new ihc());
    }

    public static void a(Status status, acwd acwd) {
        a(status, (Object) null, acwd);
    }

    public static void a(Status status, Object obj, acwd acwd) {
        if (status.c()) {
            acwd.a(obj);
        } else {
            acwd.a((Exception) new ibr(status));
        }
    }
}
