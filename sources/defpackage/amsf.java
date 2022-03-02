package defpackage;

/* renamed from: amsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amsf extends ampv {
    final /* synthetic */ amsg g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amsf(amsg amsg, amsk amsk, CharSequence charSequence) {
        super(amsk, charSequence);
        this.g = amsg;
    }

    public final int a(int i) {
        int i2 = i + this.g.a;
        if (i2 >= this.b.length()) {
            return -1;
        }
        return i2;
    }

    public final int b(int i) {
        return i;
    }
}
