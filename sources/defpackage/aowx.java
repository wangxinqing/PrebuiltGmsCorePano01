package defpackage;

import android.os.Build;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: aowx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aowx {
    public aowx() {
        if (Build.VERSION.SDK_INT < 23) {
            throw new GeneralSecurityException("needs Android Keystore on Android M or newer");
        }
    }

    public static final aotx a(String str) {
        try {
            return new aoww(apdc.a("android-keystore://", str));
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
