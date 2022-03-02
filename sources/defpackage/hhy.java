package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.net.URISyntaxException;

/* renamed from: hhy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hhy extends iby {
    public final auef a;
    public final int b;

    public hhy(auef auef, int i, Context context, hid hid) {
        super(context, hhz.a, (ibm) hid, ibx.a);
        this.a = auef;
        this.b = i;
    }

    private static String a(Context context, Intent intent) {
        intent.setPackage(context.getPackageName());
        String a2 = hkd.a(intent);
        try {
            hkd.a(a2);
            return a2;
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Notification intent contains invalid data. It must be serializable using toUri() and parseUri().");
        }
    }

    public final acwa b(Intent intent) {
        iva.a((Object) intent);
        return a((ihb) new hhu(this, a(this.c, intent)));
    }

    public final acwa a(Intent intent) {
        iva.a((Object) intent);
        return a((ihb) new hht(this, a(this.c, intent)));
    }

    public final acwa a(Bundle bundle) {
        return a((ihb) new hhv(this, bundle));
    }

    public final acwa a(audx audx, Bundle bundle) {
        iva.a((Object) audx);
        return b((ihb) new hhw(this, audx, bundle));
    }
}
