package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Map;

/* renamed from: adre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adre {
    private static final amsi b = amsk.a(',').a(amsk.a(':'));
    public final anbd a;

    public adre(anbd anbd) {
        iva.a((Object) anbd);
        this.a = anbd;
    }

    public static adrd a() {
        return new adrd();
    }

    public final adrd b() {
        return new adrd(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof adre) {
            return anet.b(((adre) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return anet.b((Map) this.a);
    }

    static adre a(String str) {
        anbb b2 = anbd.b();
        if (str.length() > 0) {
            for (Map.Entry entry : b.a(str).entrySet()) {
                try {
                    b2.a(new String(jhy.a((String) entry.getKey()), "UTF-8"), new String(jhy.a((String) entry.getValue()), "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return new adre(b2.a());
    }

    public static adre a(adrc... adrcArr) {
        adrd a2 = a();
        a2.a(adrcArr);
        return a2.a();
    }

    public final Object a(adri adri) {
        return this.a.containsKey(adri.a) ? adri.a((String) this.a.get(adri.a)) : adri.b;
    }
}
