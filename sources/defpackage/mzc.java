package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import java.util.UUID;

/* renamed from: mzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mzc extends iby {
    private static final ibq b = new ibq("Fido.FIDO2_ZERO_PARTY_API", new naz(), l);
    private static final ibg l = new ibg();
    public final UUID a = UUID.randomUUID();

    public mzc(Context context) {
        super(context, b, (ibm) null, (igu) new icz());
    }

    public final void a(StateUpdate stateUpdate) {
        iha b2 = ihb.b();
        b2.a = new myz(this, stateUpdate);
        b2.b = new Feature[]{myr.d, myr.c};
        a(b2.a());
    }
}
