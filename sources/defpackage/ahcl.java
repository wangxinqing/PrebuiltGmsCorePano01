package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Collection;

/* renamed from: ahcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahcl implements agzr {
    private ahcl() {
    }

    public static ahcl a() {
        return new ahcl();
    }

    public final /* bridge */ /* synthetic */ Object a(agzq agzq) {
        ArrayDeque arrayDeque = new ArrayDeque();
        agzs agzs = agzq.a;
        anbs.a((Collection) arrayDeque, agzs.f(agzq.e.buildUpon().fragment((String) null).build()));
        long j = 0;
        while (!arrayDeque.isEmpty()) {
            Uri uri = (Uri) arrayDeque.remove();
            if (agzs.d(uri)) {
                anbs.a((Collection) arrayDeque, agzs.f(uri));
            } else if (agzs.c(uri)) {
                j += agzs.e(uri);
            } else {
                throw new FileNotFoundException(String.format("Child %s could not be opened", new Object[]{uri}));
            }
        }
        return Long.valueOf(j);
    }
}
