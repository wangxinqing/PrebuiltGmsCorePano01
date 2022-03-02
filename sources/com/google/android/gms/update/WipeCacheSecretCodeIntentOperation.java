package com.google.android.gms.update;

import android.os.RecoverySystem;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WipeCacheSecretCodeIntentOperation extends hee {
    private static final iwd b = adnt.a("WipeCacheSecretCodeIntentOperation");

    public WipeCacheSecretCodeIntentOperation() {
        super("947322243");
    }

    public final void a() {
        if (aypp.a.a().a()) {
            b.a("wiping cache from SecretCodeIntentOperation", new Object[0]);
            try {
                if (!jgu.f(this)) {
                    b.b("Can't reboot to wipe cache from non-primary user", new Object[0]);
                } else {
                    RecoverySystem.rebootWipeCache(this);
                }
            } catch (IOException e) {
                b.d("failed to reboot to wipe cache:", e, new Object[0]);
            }
        } else {
            b.a("Cache wiping is not enabled.", new Object[0]);
        }
    }
}
