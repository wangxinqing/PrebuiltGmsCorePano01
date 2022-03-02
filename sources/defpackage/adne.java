package defpackage;

import android.content.Context;
import android.os.RecoverySystem;
import java.io.File;
import java.io.IOException;

/* renamed from: adne  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adne {
    private static final iwd a = adnt.e("RecoverySystemDelegate");

    public static void a(Context context) {
        if (jkr.c() && ((Boolean) ((adrn) adrn.a.b()).b(adls.j)).booleanValue()) {
            a.c("cancelScheduledUpdate()", new Object[0]);
            try {
                RecoverySystem.cancelScheduledUpdate(context);
                ((adrn) adrn.a.b()).a(adls.j.b(false));
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
    }

    public static void a(Context context, File file) {
        if (jkr.c()) {
            a.c("scheduleUpdateOnBoot()", new Object[0]);
            ((adrn) adrn.a.b()).a(adls.j.b(true));
            try {
                RecoverySystem.scheduleUpdateOnBoot(context, file);
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
    }
}
