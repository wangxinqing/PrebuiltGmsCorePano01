package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: auem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auem {
    public final ArrayDeque a = new ArrayDeque();

    private static final int a(int i) {
        int binarySearch = Arrays.binarySearch(auep.a, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public final void a(auay auay) {
        if (auay.d()) {
            int a2 = a(auay.a());
            int e = auep.e(a2 + 1);
            if (this.a.isEmpty() || ((auay) this.a.peek()).a() >= e) {
                this.a.push(auay);
                return;
            }
            int e2 = auep.e(a2);
            auay auay2 = (auay) this.a.pop();
            while (!this.a.isEmpty() && ((auay) this.a.peek()).a() < e2) {
                auay2 = new auep((auay) this.a.pop(), auay2);
            }
            auep auep = new auep(auay2, auay);
            while (!this.a.isEmpty() && ((auay) this.a.peek()).a() < auep.e(a(auep.d) + 1)) {
                auep = new auep((auay) this.a.pop(), auep);
            }
            this.a.push(auep);
        } else if (auay instanceof auep) {
            auep auep2 = (auep) auay;
            int i = auep.h;
            a(auep2.e);
            a(auep2.f);
        } else {
            String valueOf = String.valueOf(auay.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("Has a new type of ByteString been created? Found ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
