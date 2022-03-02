package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.ExperimentTokens;

/* renamed from: yhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yhg extends ygu {
    public final yhj a;
    private final ygj b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yhg(ygj ygj, String str, String str2, String str3, String str4, String str5) {
        super("GetExperimentTokensOperationCall", str == null ? avtj.GET_EXP_FOR_LOGGING : avtj.GET_EXP, !"com.google.android.gms".equals(str5));
        iva.a((Object) ygj);
        this.b = ygj;
        this.a = new yhj(str, str2, str3, str4);
    }

    public final avst a() {
        yhj yhj = this.a;
        avss avss = (avss) avst.m.o();
        String str = yhj.a;
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
        String str2 = yhj.b;
        if (str2 != null) {
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst2 = (avst) avss.b;
            str2.getClass();
            avst2.c();
            avst2.d.add(str2);
        }
        return (avst) avss.i();
    }

    public final void b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public final void b(Context context, yfw yfw) {
        this.b.a(Status.a, this.a.b(yfw));
    }

    public final void a(Status status) {
        this.b.a(status, (ExperimentTokens) null);
    }
}
