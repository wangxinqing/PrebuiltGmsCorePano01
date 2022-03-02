package defpackage;

/* renamed from: ajux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajux extends ajvy {
    final /* synthetic */ int a;
    final /* synthetic */ ajvf b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajux(ajvf ajvf, int i, int i2) {
        super(i);
        this.b = ajvf;
        this.a = i2;
    }

    /* access modifiers changed from: protected */
    public final void a(adi adi, int[] iArr) {
        if (this.a == 0) {
            iArr[0] = this.b.f.getWidth();
            iArr[1] = this.b.f.getWidth();
            return;
        }
        iArr[0] = this.b.f.getHeight();
        iArr[1] = this.b.f.getHeight();
    }
}
