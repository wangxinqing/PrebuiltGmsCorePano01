package defpackage;

/* renamed from: amsb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amsb extends ampv {
    final /* synthetic */ amsc g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amsb(amsc amsc, amsk amsk, CharSequence charSequence) {
        super(amsk, charSequence);
        this.g = amsc;
    }

    public final int a(int i) {
        int length = this.g.a.length();
        int length2 = this.b.length() - length;
        while (i <= length2) {
            int i2 = 0;
            while (i2 < length) {
                if (this.b.charAt(i2 + i) == this.g.a.charAt(i2)) {
                    i2++;
                } else {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    public final int b(int i) {
        return i + this.g.a.length();
    }
}
