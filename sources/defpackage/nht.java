package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fonts.FontFetchResult;
import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: nht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nht extends nis {
    public static final FontFetchResult a = FontFetchResult.a(Status.c);
    public static final FontFetchResult b = FontFetchResult.a(Status.e);
    public final FontMatchSpec c;
    public final ngu d;
    private final nhf e;
    private final String f;

    public nht(ngu ngu, FontMatchSpec fontMatchSpec, nhf nhf, String str) {
        super(132, "GetFont");
        iva.a((Object) ngu, (Object) "callback");
        this.d = ngu;
        iva.a((Object) fontMatchSpec, (Object) "fontMatchSpec");
        this.c = fontMatchSpec;
        iva.a((Object) nhf, (Object) "server");
        this.e = nhf;
        iva.a((Object) str, (Object) "requestingPackage");
        this.f = str;
        ngz.c("GetFontOperation", "ctor; requestingPackage=%s", str);
    }

    public final void a(Context context) {
        ngz.b("GetFontOperation", "Attempting to fetch %s", this.c);
        aorr a2 = this.e.a(this.c, this.f);
        a2.a(new nhs(this, a2), nhz.a.b());
    }

    public final void a(Status status) {
        ngz.a("GetFontOperation", "%s failed: %s", this.c, status);
        try {
            this.d.a(FontFetchResult.a(status));
        } catch (RemoteException e2) {
            ngz.a("GetFontOperation", "Lost remote: %s", e2.getMessage());
        }
    }
}
