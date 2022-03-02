package defpackage;

import android.content.Context;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

/* renamed from: acpf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acpf {
    private static final acpz a = acqa.a("AccountTransferUtils");

    public static void a(Context context) {
        if (azlf.a.a().z()) {
            jix.g(context);
            jix.h(context);
        }
    }

    public static boolean a(BootstrapOptions bootstrapOptions) {
        a.a("3pmfm supported by target device %s", Boolean.valueOf(bootstrapOptions.n));
        a.a("3pmfm allowed by target client %s", Boolean.valueOf(bootstrapOptions.o));
        a.a("3pmfm export allowed by smartsetup %s", Boolean.valueOf(azlf.b()));
        a.a("3pmfm forced %s", Boolean.valueOf(azlf.e()));
        abnb.e();
        if (!bootstrapOptions.n) {
            return false;
        }
        if (!azlf.e()) {
            return bootstrapOptions.o && azlf.b();
        }
        return true;
    }
}
