package defpackage;

import android.os.RecoverySystem;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: adlv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class adlv implements Callable {
    private final adlw a;

    public adlv(adlw adlw) {
        this.a = adlw;
    }

    public final Object call() {
        adlw adlw = this.a;
        try {
            if (!jkr.d()) {
                return null;
            }
            RecoverySystem.rebootWipeAb(adlw.h, new File((String) adlw.a(adlw.f)), "wipePackage");
            return null;
        } catch (IOException e) {
            adlw.e.e("Failed to execute RecoverySystem.rebootWipeAb().", e, new Object[0]);
            return null;
        }
    }
}
