package defpackage;

/* renamed from: nq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nq implements ns {
    static final nq a = new nq();

    private nq() {
    }

    public final int a(CharSequence charSequence, int i) {
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            int a2 = nw.a(Character.getDirectionality(charSequence.charAt(i2)));
            if (a2 == 0) {
                return 0;
            }
            if (a2 == 1) {
                z = true;
            }
        }
        return !z ? 2 : 1;
    }
}
