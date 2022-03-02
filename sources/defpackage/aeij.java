package defpackage;

import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: aeij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeij {
    public final aeia a;
    public final List b = new CopyOnWriteArrayList();
    private final String c;

    public aeij(String str, aeia aeia) {
        this.c = str;
        this.a = aeia;
    }

    private final long a(long j) {
        return j - ((aeii) this.b.get(0)).b;
    }

    private static final String a(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        return sb.toString();
    }

    public final void a() {
        if (this.a.U()) {
            ArrayDeque arrayDeque = new ArrayDeque();
            for (aeii aeii : this.b) {
                if (aeii.a()) {
                    aeii aeii2 = (aeii) arrayDeque.removeFirst();
                    long j = aeii.b - aeii2.b;
                    aeii2.c += j;
                    aeii2.d += j;
                    if (!arrayDeque.isEmpty()) {
                        ((aeii) arrayDeque.peekFirst()).c -= j;
                    }
                } else {
                    arrayDeque.addFirst(aeii);
                }
            }
            ((anih) ((anih) aehd.a.d()).a("aeij", "a", 68, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s [Exclusive time] / [Total time] ([Timestamp])", (Object) this.c);
            int i = 0;
            for (aeii aeii3 : this.b) {
                if (!aeii3.a()) {
                    i++;
                    if (aeii3.c != aeii3.d) {
                        ((anih) ((anih) aehd.a.d()).a("aeij", "a", 84, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s%s %sms / %sms (%s)", a(i), aeii3.a, Long.valueOf(aeii3.c), Long.valueOf(aeii3.d), Long.valueOf(a(aeii3.b)));
                    } else {
                        ((anih) ((anih) aehd.a.d()).a("aeij", "a", 77, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s%s %sms (%s)", a(i), aeii3.a, Long.valueOf(aeii3.c), Long.valueOf(a(aeii3.b)));
                    }
                } else {
                    i--;
                }
            }
            String str = this.c;
            List list = this.b;
            ((anih) ((anih) aehd.a.d()).a("aeij", "a", 93, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s end, %sms", (Object) str, ((aeii) list.get(list.size() - 1)).b - ((aeii) this.b.get(0)).b);
        }
    }
}
