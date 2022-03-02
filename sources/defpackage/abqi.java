package defpackage;

import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: abqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abqi extends acbb {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ byte c;
    final /* synthetic */ abqo d;
    private int f;
    private boolean g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abqi(abqo abqo, tdb tdb, int i, String str, byte b2) {
        super(tdb);
        this.d = abqo;
        this.a = i;
        this.b = str;
        this.c = b2;
    }

    public final void a(int i) {
        if (this.g || this.f >= this.a) {
            super.a(i);
            return;
        }
        abqo.a.d("Error connecting to device, trying again", new Object[0]);
        this.f++;
        this.d.a(this.b, this.c, (tdb) this);
    }

    public final void b() {
        super.b();
        this.g = true;
    }

    public final void b(String str) {
        super.b(str);
        this.g = true;
    }

    public final void a(Device device, byte[] bArr) {
        super.a(device, bArr);
        this.g = true;
    }
}
