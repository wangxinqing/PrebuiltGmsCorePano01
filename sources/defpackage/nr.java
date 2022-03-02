package defpackage;

/* renamed from: nr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nr implements ns {
    static final nr a = new nr();

    private nr() {
    }

    public final int a(CharSequence charSequence, int i) {
        int i2 = 2;
        for (int i3 = 0; i3 < i && i2 == 2; i3++) {
            i2 = nw.b(Character.getDirectionality(charSequence.charAt(i3)));
        }
        return i2;
    }
}
