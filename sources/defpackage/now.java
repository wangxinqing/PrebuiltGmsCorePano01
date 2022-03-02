package defpackage;

import java.io.File;
import java.security.GeneralSecurityException;

/* renamed from: now  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class now {
    final /* synthetic */ nox a;

    public now(nox nox) {
        this.a = nox;
    }

    public final boolean a(File file) {
        try {
            return this.a.a.a(file);
        } catch (GeneralSecurityException e) {
            return false;
        }
    }
}
