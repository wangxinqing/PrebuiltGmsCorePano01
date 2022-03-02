package defpackage;

import java.io.OutputStream;

/* renamed from: ahcr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ahcr {
    public static OutputStream a(ahcs ahcs, OutputStream outputStream) {
        if (outputStream != null) {
            outputStream.close();
        }
        String valueOf = String.valueOf(ahcs.a());
        throw new ahbp(valueOf.length() == 0 ? new String("wrapForAppend not supported by ") : "wrapForAppend not supported by ".concat(valueOf));
    }
}
