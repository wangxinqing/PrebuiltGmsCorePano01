package defpackage;

import java.util.Arrays;

/* renamed from: baej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baej {
    public String a = "unknown-authority";
    public azxa b = azxa.b;
    public String c;
    public azyp d;

    public final boolean equals(Object obj) {
        if (obj instanceof baej) {
            baej baej = (baej) obj;
            if (!this.a.equals(baej.a) || !this.b.equals(baej.b) || !amqx.a(this.c, baej.c) || !amqx.a(this.d, baej.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }
}
