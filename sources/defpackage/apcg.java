package defpackage;

import java.security.Provider;
import javax.crypto.Cipher;

/* renamed from: apcg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apcg implements apcn {
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        if (provider != null) {
            return Cipher.getInstance(str, provider);
        }
        return Cipher.getInstance(str);
    }
}
