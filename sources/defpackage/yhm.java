package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: yhm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yhm extends ygu {
    private final ygj a;
    private final yhn b;

    public yhm(ygj ygj, String str) {
        super("GetServingVersionOperationCall", avtj.GET_SERVING_VERSION, !str.equals("com.google.android.gms"));
        iva.a((Object) ygj);
        this.a = ygj;
        this.b = new yhn(str);
    }

    public final avst a() {
        yhn yhn = this.b;
        avss avss = (avss) avst.m.o();
        String str = yhn.a;
        if (str != null) {
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst = (avst) avss.b;
            str.getClass();
            avst.a |= 1;
            avst.b = str;
        }
        long j = yhn.b;
        if (avss.c) {
            avss.c();
            avss.c = false;
        }
        avst avst2 = (avst) avss.b;
        avst2.a |= 32;
        avst2.i = j;
        return (avst) avss.i();
    }

    public final void b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public final void b(Context context, yfw yfw) {
        yhn yhn = this.b;
        long a2 = yfh.a(yfw);
        yhn.b = a2;
        this.a.b(Status.a, Long.valueOf(a2).longValue());
    }

    public final void a(Status status) {
        this.a.b(status, -1);
    }
}
