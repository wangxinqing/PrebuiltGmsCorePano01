package defpackage;

import com.google.android.gms.drive.internal.FileUploadPreferencesImpl;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: kaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kaa {
    public static final jzy a = new jzz(1, true, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    public int b;
    public boolean c;
    public int d;

    public kaa() {
        this(a);
    }

    public final jzy a() {
        return new jzz(this.b, this.c, this.d);
    }

    public kaa(FileUploadPreferencesImpl fileUploadPreferencesImpl) {
        this.b = fileUploadPreferencesImpl.a();
        this.c = fileUploadPreferencesImpl.c;
        this.d = fileUploadPreferencesImpl.b();
    }

    public kaa(jzy jzy) {
        this.b = jzy.a();
        this.c = jzy.b();
        this.d = jzy.c();
    }
}
