package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: fcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fcb implements Comparable {
    private final String a;
    private final String b;

    public fcb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static fcb a(Credential credential) {
        return new fcb(credential.a.toLowerCase(Locale.US), amrk.b(credential.f));
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        fcb fcb = (fcb) obj;
        return amya.b.a((Comparable) this.a, (Comparable) fcb.a).a((Comparable) this.b, (Comparable) fcb.b).a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fcb) {
            fcb fcb = (fcb) obj;
            if (!ius.a(this.a, fcb.a) || !ius.a(this.b, fcb.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
