package defpackage;

import android.os.Bundle;
import com.google.android.gms.instantapps.InstantAppIntentData;

/* renamed from: qkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qkj extends qfd {
    final /* synthetic */ qkk b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qkj(qkk qkk) {
        super("method_getInstantAppIntentData");
        this.b = qkk;
    }

    public final Bundle a(qfc qfc, String str, Bundle bundle) {
        Bundle bundle2;
        qlo qlo = new qlo();
        qlo.a(1404);
        try {
            InstantAppIntentData a = this.b.a(qfc, str, bundle, qlo);
            if (a.c == 1) {
                if (a.b == null) {
                    return null;
                }
            }
            bundle2 = new Bundle();
            if (bundle != null) {
                if (bundle.getBoolean("key_preferParcelableIntentData")) {
                    bundle2.putParcelable("key_instantAppIntentDataParcelable", a);
                }
            }
            bundle2.putByteArray("key_instantAppIntentData", ivy.a(a));
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class) {
                qkk.a.b(e, "Ignoring extra that could not be marshalled.", new Object[0]);
            } else {
                throw e;
            }
        } catch (qfi e2) {
            qkk.a.a(e2);
            return null;
        }
        return bundle2;
    }
}
