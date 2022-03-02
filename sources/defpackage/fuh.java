package defpackage;

import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* renamed from: fuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fuh implements igp {
    private final SavePasswordRequest a;
    private final String b;

    public fuh(SavePasswordRequest savePasswordRequest, String str) {
        this.a = savePasswordRequest;
        this.b = str;
    }

    public final void a(Object obj, Object obj2) {
        SavePasswordRequest savePasswordRequest = this.a;
        String str = this.b;
        ((fto) ((ftz) obj).x()).a((ftu) new ftt((acwd) obj2), savePasswordRequest, str);
    }
}
