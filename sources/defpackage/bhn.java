package defpackage;

import com.google.android.gms.ads.internal.config.n;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* renamed from: bhn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bhn {
    static aoub a;

    static void a(bhm bhm) {
        Method a2;
        if (a == null) {
            String str = (String) n.h.a();
            if (str == null || str.length() == 0) {
                str = null;
                if (!(bhm == null || (a2 = bhm.a("4qyeHVLdR2BpVZ/9MkK6HNeJRuvdZpok2ml+qCM18QEPJAStXXleeDElqkUhV/8Z", "GU2WP8XtllQhiTSD7/T7mgvNQQ8dfZxwOUN2ptkRE5g=")) == null)) {
                    str = (String) a2.invoke((Object) null, new Object[0]);
                }
                if (str == null) {
                    return;
                }
            }
            try {
                try {
                    aouj a3 = aouo.a(bfr.a(str, true));
                    for (aoyx aoyx : aowl.a.a) {
                        if (aoyx.b.isEmpty()) {
                            throw new GeneralSecurityException("Missing type_url.");
                        } else if (aoyx.a.isEmpty()) {
                            throw new GeneralSecurityException("Missing primitive_name.");
                        } else if (aoyx.d.isEmpty()) {
                            throw new GeneralSecurityException("Missing catalogue_name.");
                        } else if (!aoyx.d.equals("TinkAead") && !aoyx.d.equals("TinkMac") && !aoyx.d.equals("TinkHybridDecrypt") && !aoyx.d.equals("TinkHybridEncrypt") && !aoyx.d.equals("TinkPublicKeySign") && !aoyx.d.equals("TinkPublicKeyVerify") && !aoyx.d.equals("TinkStreamingAead") && !aoyx.d.equals("TinkDeterministicAead")) {
                            aoty a4 = aovb.a(aoyx.d);
                            aovb.a(a4.a());
                            aovb.a(a4.b(), aoyx.c);
                        }
                    }
                    a = aowo.a(a3);
                } catch (GeneralSecurityException e) {
                }
            } catch (IllegalArgumentException e2) {
            }
        }
    }
}
