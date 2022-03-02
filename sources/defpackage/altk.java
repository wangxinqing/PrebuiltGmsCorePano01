package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: altk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class altk extends altj {
    public final List d = new ArrayList();
    public final List e;

    public altk(alsk alsk, alss alss, List list, List list2) {
        super(alsk, alss, list);
        this.e = list2;
    }

    public final altj a(alsk alsk) {
        return new altk(alsk, this.b, this.c, this.e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof altk)) {
            return false;
        }
        altk altk = (altk) obj;
        return alyr.a(this.a.d(), altk.a.d(), this.d, altk.d, this.b, altk.b, this.c, altk.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.d(), this.d, this.b, this.c});
    }
}
