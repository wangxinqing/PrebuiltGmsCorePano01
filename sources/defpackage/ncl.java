package defpackage;

import com.google.android.gms.fido.u2f.api.common.ResponseData;

@Deprecated
/* renamed from: ncl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ncl {
    public final nce a;

    public ncl(nce nce) {
        iva.a((Object) nce);
        boolean z = true;
        if (!(ncg.SIGN == ncg.REGISTER || ncg.SIGN == ncg.SIGN)) {
            z = false;
        }
        String valueOf = String.valueOf(ncg.SIGN);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Unsupported request type ");
        sb.append(valueOf);
        iva.b(z, sb.toString());
        this.a = nce;
    }

    public final nci a(ResponseData responseData) {
        String str;
        ncg ncg = ncg.SIGN;
        nch nch = new nch();
        if (ncg != null) {
            try {
                str = ncj.a(ncg).c;
            } catch (ncf e) {
                str = ncg.c;
            }
        } else {
            str = null;
        }
        nch.a = str;
        nch.b = ((nck) this.a).a;
        nch.a(responseData);
        return nch.a();
    }
}
