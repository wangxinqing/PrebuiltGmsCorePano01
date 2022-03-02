package defpackage;

import java.util.Arrays;

/* renamed from: aklu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aklu {
    public final ou a = new ou();

    public final int a() {
        return this.a.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aklu) {
            return this.a.equals(((aklu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final void a(Integer num, Float f) {
        this.a.put(num, f);
    }
}
