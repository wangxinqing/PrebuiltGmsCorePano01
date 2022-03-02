package defpackage;

import android.os.Bundle;
import com.google.android.gms.instantapps.InstantAppIntentData;

/* renamed from: qki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qki extends qfd {
    final /* synthetic */ qkk b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qki(qkk qkk) {
        super("method_getInstantAppIntent");
        this.b = qkk;
    }

    public final Bundle a(qfc qfc, String str, Bundle bundle) {
        qlo qlo = new qlo();
        qlo.a(1404);
        try {
            InstantAppIntentData a = this.b.a(qfc, str, bundle, qlo);
            if (a.c == 3 || a.b == null) {
                return null;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("key_instantAppIntent", a.b);
            return bundle2;
        } catch (qfi e) {
            qkk.a.a(e);
            return null;
        }
    }
}
