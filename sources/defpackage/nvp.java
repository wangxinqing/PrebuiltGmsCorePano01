package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.nio.charset.Charset;

/* renamed from: nvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nvp extends nvo {
    public nvp(Context context) {
        super(context, "fcm_package_info.ldb");
    }

    private static final byte[] a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append(":");
        sb.append(i);
        return sb.toString().getBytes(Charset.forName("UTF-8"));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ amri c(aucj aucj) {
        nrm nrm = (nrm) aucj;
        if (nrm == null) {
            Log.w("GCM", "Provided package info is null.");
        } else if ((nrm.a & 2) != 0) {
            return amri.b(a(nrm.c, nrm.b));
        } else {
            Log.w("GCM", "Package was not populated.");
        }
        return ampu.a;
    }

    public final amri a(ntx ntx) {
        return a(a(ntx.a, ntx.b));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ aucj c(byte[] bArr) {
        return (nrm) aucj.a((aucj) nrm.h, bArr);
    }
}
