package defpackage;

import java.util.Arrays;

/* renamed from: yry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yry {
    String a = "";
    String b = "";
    String c = "";
    String d = "";

    public final boolean equals(Object obj) {
        if (!(obj instanceof yry)) {
            return super.equals(obj);
        }
        yry yry = (yry) obj;
        return ius.a(this.a, yry.a) && ius.a(this.b, yry.b) && ius.a(this.c, yry.c) && ius.a(this.d, yry.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        return String.format("Annotations[longText=%s text=%s, shortText=%s, bubbleText=%s]", new Object[]{this.a, this.b, this.c, this.d});
    }
}
