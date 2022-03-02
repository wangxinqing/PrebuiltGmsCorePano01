package defpackage;

import android.content.Context;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.setupdesign.items.ItemGroup;

/* renamed from: aclq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aclq implements abst {
    final /* synthetic */ acly a;

    public aclq(acly acly) {
        this.a = acly;
    }

    public final void a() {
    }

    public final void a(int i) {
    }

    public final void b(D2DDevice d2DDevice) {
        aclx aclx = (aclx) this.a.h.get(d2DDevice.d);
        if (aclx != null) {
            this.a.h.remove(d2DDevice.d);
            ItemGroup itemGroup = this.a.g;
            int a2 = ItemGroup.a(itemGroup.a, (Object) aclx);
            int c = itemGroup.c(a2);
            itemGroup.c = true;
            if (a2 != -1) {
                int a3 = aclx.a();
                itemGroup.a.remove(a2);
                aclx.b(itemGroup);
                if (a3 > 0) {
                    itemGroup.b(c, a3);
                }
            }
            acly.a.b("onDeviceLost, remove %s from the list.", d2DDevice.d);
            if (this.a.g.a() == 0) {
                this.a.a();
            }
        }
    }

    public final void a(D2DDevice d2DDevice) {
        acly.a.b("onDeviceFound.", new Object[0]);
        if (!this.a.h.containsKey(d2DDevice.d)) {
            Context context = this.a.getContext();
            if (context == null) {
                acly.a.d("no context", new Object[0]);
                return;
            }
            aclx aclx = new aclx(context, d2DDevice);
            this.a.g.a((alih) aclx);
            this.a.h.put(d2DDevice.d, aclx);
            this.a.b();
            acly.a.b("onDeviceFound, add %s to the list.", d2DDevice.d);
        }
    }
}
