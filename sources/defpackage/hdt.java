package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.chimera.PersistentIntentOperationService;

/* renamed from: hdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hdt extends bnh {
    private static volatile hdt f = null;

    public hdt(ComponentName componentName) {
        super(componentName);
    }

    public static hdt b() {
        hdt hdt = f;
        if (hdt == null) {
            synchronized (hdt.class) {
                hdt = f;
                if (hdt == null) {
                    hdt hdt2 = new hdt(new ComponentName("com.google.android.gms", PersistentIntentOperationService.class.getName()));
                    f = hdt2;
                    hdt = hdt2;
                }
            }
        }
        return hdt;
    }

    /* access modifiers changed from: protected */
    public final Object a(Context context, String str, long j) {
        String valueOf = String.valueOf(str);
        acrz acrz = new acrz(context, 1, valueOf.length() == 0 ? new String("IntentOp:") : "IntentOp:".concat(valueOf), (String) null, "com.google.android.gms", str);
        acrz.a(false);
        acrz.a(j);
        return acrz;
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj) {
        if (obj != null) {
            iva.b(obj instanceof acrz);
            acrz acrz = (acrz) obj;
            if (acrz.e()) {
                acrz.c();
            }
        }
    }
}
