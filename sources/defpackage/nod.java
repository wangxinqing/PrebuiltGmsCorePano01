package defpackage;

import android.content.Context;
import com.google.ads.afma.proto2api.c;
import java.util.concurrent.TimeUnit;

/* renamed from: nod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nod {
    public static c a(Context context, String str, String str2) {
        c cVar;
        try {
            cVar = (c) new noc(context, str, str2).b.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            cVar = null;
        }
        return cVar == null ? noc.c() : cVar;
    }
}
