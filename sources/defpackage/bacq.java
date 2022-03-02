package defpackage;

import com.google.android.chimera.FragmentTransaction;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: bacq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bacq extends bagw {
    public static final /* synthetic */ int i = 0;
    public final Object a;
    public final Collection b = new ArrayList();
    public boolean c;
    public boolean d = false;
    public babj e;
    public boolean f;
    public boolean g;
    final /* synthetic */ bacr h;
    private int t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bacq(bacr bacr, balm balm, Object obj, balu balu) {
        super(4194304, balm, balu);
        this.h = bacr;
        amrl.a(obj, (Object) "lock");
        this.a = obj;
    }

    static /* synthetic */ void a(bacq bacq, ByteBuffer byteBuffer) {
        bacq.t += byteBuffer.remaining();
        super.a(bakp.a(byteBuffer), false);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        super.a();
    }

    public final void a(int i2) {
        bacr bacr = this.h;
        ByteBuffer byteBuffer = bacr.a;
        amrl.a((Object) bacr.k, (Object) "stream must not be null");
        int i3 = this.t - i2;
        this.t = i3;
        if (i3 == 0 && !this.f) {
            this.h.k.read(ByteBuffer.allocateDirect(FragmentTransaction.TRANSIT_ENTER_MASK));
        }
    }

    /* access modifiers changed from: protected */
    public final void a(babj babj, boolean z, baaf baaf) {
        bacr bacr = this.h;
        ByteBuffer byteBuffer = bacr.a;
        amrl.a((Object) bacr.k, (Object) "stream must not be null");
        this.h.k.cancel();
        b(babj, z, baaf);
    }

    public final void a(Throwable th) {
        a(babj.a(th), true, new baaf());
    }
}
