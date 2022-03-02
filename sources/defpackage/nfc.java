package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.vision.internal.Flags;
import java.util.Collections;

/* renamed from: nfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nfc {
    public static void a(Context context) {
        nfp nfp;
        apwf.a(context);
        gur.a(context);
        Flags.a(context);
        try {
            SharedPreferences.Editor edit = nfr.a(context).edit();
            for (nez nez : Collections.unmodifiableCollection(nfg.b().a)) {
                if (nez instanceof nev) {
                    nfp = new nfi((nev) nez);
                } else if (nez instanceof Cnew) {
                    nfp = new nfk((Cnew) nez);
                } else if (nez instanceof nex) {
                    nfp = new nfm((nex) nez);
                } else if (nez instanceof ney) {
                    nfp = new nfo((ney) nez);
                } else {
                    String valueOf = String.valueOf(nez.getClass().getName());
                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unexpected flag type: ") : "Unexpected flag type: ".concat(valueOf));
                }
                nfp.a(edit, nfp.a().c());
            }
            jle.a(context, edit, "google_sdk_flags");
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("FlagsServiceApi", valueOf2.length() == 0 ? new String("Failed to write shared flags: ") : "Failed to write shared flags: ".concat(valueOf2));
        }
    }
}
