package defpackage;

import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: apci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apci implements apcn {
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        if (provider != null) {
            return KeyFactory.getInstance(str, provider);
        }
        return KeyFactory.getInstance(str);
    }
}
