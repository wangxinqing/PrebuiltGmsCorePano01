package defpackage;

import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import java.util.List;

/* renamed from: fui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fui implements igp {
    private final SavePasswordRequest a;
    private final List b;
    private final String c;

    public fui(SavePasswordRequest savePasswordRequest, List list, String str) {
        this.a = savePasswordRequest;
        this.b = list;
        this.c = str;
    }

    public final void a(Object obj, Object obj2) {
        SavePasswordRequest savePasswordRequest = this.a;
        List list = this.b;
        String str = this.c;
        ((fto) ((ftz) obj).x()).a((ifu) new fur((acwd) obj2), savePasswordRequest, list, str);
    }
}
