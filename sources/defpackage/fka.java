package defpackage;

import android.util.Patterns;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: fka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fka implements amrm {
    static final amrm a = new fka();

    private fka() {
    }

    public final boolean a(Object obj) {
        iwd iwd = fkm.a;
        return Patterns.EMAIL_ADDRESS.matcher(((Credential) obj).a).matches();
    }
}
