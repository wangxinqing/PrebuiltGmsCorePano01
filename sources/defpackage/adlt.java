package defpackage;

import android.os.RecoverySystem;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: adlt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class adlt implements Callable {
    private final adlw a;
    private final StringBuilder b;
    private final int c;

    public adlt(adlw adlw, StringBuilder sb, int i) {
        this.a = adlw;
        this.b = sb;
        this.c = i;
    }

    public final Object call() {
        adlw adlw = this.a;
        StringBuilder sb = this.b;
        int i = this.c;
        try {
            adkt adkt = (adkt) adkt.e.b();
            String sb2 = sb.toString();
            if (jkr.i()) {
                String valueOf = String.valueOf(adkt.d());
                adkt.a.c("Calling reboot with update token: %s.", valueOf);
                if (RecoverySystem.rebootAndApply(adkt.f, valueOf, sb2)) {
                    return null;
                }
            } else {
                adkt.a.d("Attempting to use unattended reboot on unsupported platform", new Object[0]);
            }
        } catch (IOException e) {
            adlw.e.e("Reboot with resume failed with exception.", e, new Object[0]);
        }
        adlw.e.e("Unable to reboot with resume.", new Object[0]);
        adlw.j.k.a(adla.d);
        adlw.j.a(i, -1.0d);
        return null;
    }
}
