package defpackage;

import java.io.Serializable;
import java.util.zip.Checksum;

/* renamed from: anlc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anlc extends ankv implements Serializable {
    private static final long serialVersionUID = 0;
    private final anlp a;
    private final String b;

    public anlc(anlp anlp, String str) {
        amrl.a((Object) anlp);
        this.a = anlp;
        amrl.a(true, "bits (%s) must be either 32 or 64", 32);
        amrl.a((Object) str);
        this.b = str;
    }

    public final anlj a() {
        return new anlb((Checksum) this.a.a());
    }

    public final String toString() {
        return this.b;
    }
}
