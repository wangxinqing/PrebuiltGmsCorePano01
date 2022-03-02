package defpackage;

import android.bluetooth.BluetoothAdapter;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

/* renamed from: ascd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ascd extends ashi {
    public static final UUID a = UUID.fromString("87a0a8a8-a12b-4d0e-bd8c-97c9eba167cd");
    private final BluetoothAdapter b = BluetoothAdapter.getDefaultAdapter();

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ashv a(asfs asfs) {
        if ((asfs.a & 4) == 0) {
            return null;
        }
        BluetoothAdapter bluetoothAdapter = this.b;
        asfu asfu = asfs.d;
        if (asfu == null) {
            asfu = asfu.c;
        }
        return new ascc(new asce(bluetoothAdapter, asgt.a(asfu.b.k()), a));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ashv a(asfs asfs, Set set) {
        asfu asfu = asfs.d;
        if (asfu == null) {
            asfu = asfu.c;
        }
        if ((asfu.a & 1) != 0) {
            asfu asfu2 = asfs.d;
            if (asfu2 == null) {
                asfu2 = asfu.c;
            }
            String a2 = asgt.a(asfu2.b.k());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ascc ascc = (ascc) it.next();
                if (ascc.g().equals(a2)) {
                    return ascc;
                }
            }
            return null;
        }
        asfw asfw = asfs.c;
        if (asfw == null) {
            asfw = asfw.c;
        }
        if ((asfw.a & 1) == 0) {
            return null;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            ascc ascc2 = (ascc) it2.next();
            asfw asfw2 = asfs.c;
            if (asfw2 == null) {
                asfw2 = asfw.c;
            }
            if (asfw2.equals(ascc2.h())) {
                return ascc2;
            }
        }
        return null;
    }
}
