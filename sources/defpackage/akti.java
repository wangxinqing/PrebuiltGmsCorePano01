package defpackage;

import android.content.Context;
import android.os.Binder;

/* renamed from: akti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akti extends izd {
    private static final String e = azda.a.a().b();

    public akti(Context context, String str, String str2, String str3) {
        super(context, e, 443, Binder.getCallingUid(), 10240);
        a("X-Goog-Api-Key", str);
        a("X-Android-Package", str2);
        a("X-Android-Cert", str3);
    }
}
