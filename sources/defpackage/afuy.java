package defpackage;

import java.io.IOException;
import java.util.List;

/* renamed from: afuy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afuy implements aoqb {
    static final aoqb a = new afuy();

    private afuy() {
    }

    public final aorr a(Object obj) {
        return anbs.c((List) obj, afuz.a) ? aorl.a((Object) null) : aorl.a((Throwable) new IOException("One or more file group removals failed"));
    }
}
