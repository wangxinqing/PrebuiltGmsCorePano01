package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;

/* renamed from: yhc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yhc extends ygu {
    private final ygj a;
    private final yhe b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yhc(ygj ygj, String str, String str2, String str3, String str4, String str5) {
        super("GetConfigurationSnapshotOperationCall", ius.a(str, str4) ? avtj.GET_CONFIG_SNAPSHOT : avtj.GET_ALT_CONFIG_SNAPSHOT);
        iva.a((Object) ygj);
        this.a = ygj;
        this.b = new yhe(str, str2, str3, str4, str5);
    }

    public final avst a() {
        yhe yhe = this.b;
        avss avss = (avss) avst.m.o();
        String str = yhe.a;
        if (str != null) {
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst = (avst) avss.b;
            str.getClass();
            avst.a |= 128;
            avst.k = str;
        }
        String str2 = yhe.d;
        if (str2 != null) {
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst2 = (avst) avss.b;
            str2.getClass();
            avst2.a |= 1;
            avst2.b = str2;
        }
        String str3 = yhe.b;
        if (str3 != null) {
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst3 = (avst) avss.b;
            str3.getClass();
            avst3.a |= 4;
            avst3.f = str3;
        }
        String str4 = yhe.c;
        if (str4 != null) {
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst4 = (avst) avss.b;
            str4.getClass();
            avst4.a |= 8;
            avst4.g = str4;
        }
        return (avst) avss.i();
    }

    public final void b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public final void b(Context context, yfw yfw) {
        try {
            this.a.a(Status.a, this.b.a(context, yfw));
        } catch (yfx e) {
            if (e.a == 29512 && yhs.a(this.b.d, 21)) {
                yij.a(context, 21, this.b.d);
            }
            throw e;
        }
    }

    public final void a(Status status) {
        this.a.a(status, (Configurations) null);
    }
}
