package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: hjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hjz extends hjt {
    private final auef a;
    private final acwd b;

    public hjz(auef auef, acwd acwd) {
        this.a = auef;
        this.b = acwd;
    }

    public final void a(Bundle bundle) {
        amzy amzy;
        try {
            auef auef = this.a;
            Status status = (Status) qbx.a(bundle, "status", Status.class);
            amzt j = amzy.j();
            if (bundle.containsKey("entities")) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bundle.getByteArray("entities"));
                while (true) {
                    audx audx = (audx) auef.c(byteArrayInputStream, aubs.c());
                    if (audx == null) {
                        break;
                    }
                    j.c(audx);
                }
                amzy = j.a();
            } else {
                amzy = j.a();
            }
            hkc hkc = new hkc(status, amzy);
            if (hkc.a.c()) {
                this.b.a((Object) hkc.b);
            } else {
                this.b.a((Exception) irj.a(hkc.a));
            }
        } catch (IOException e) {
            this.b.a((Exception) irj.a(Status.c));
        }
    }
}
