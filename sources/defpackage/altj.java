package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: altj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class altj {
    public final alsk a;
    public final alss b;
    public final List c;

    public altj(alsk alsk, alss alss, List list) {
        this.a = alsk;
        this.b = alss;
        this.c = list;
    }

    public abstract altj a(alsk alsk);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        altj altj = (altj) obj;
        return alyr.a(this.b, altj.b, this.c, altj.c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }
}
