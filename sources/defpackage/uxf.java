package defpackage;

import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.ble.BleFilter;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: uxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uxf {
    public boolean a;
    private final Set b = new HashSet();
    private final List c = new ArrayList();
    private final Set d = new HashSet();

    private final void b(String str, String str2) {
        this.b.add(new MessageType(str, str2));
    }

    public final MessageFilter a() {
        boolean z = true;
        if (!this.a && this.b.isEmpty()) {
            z = false;
        }
        iva.a(z, (Object) "At least one of the include methods must be called.");
        return new MessageFilter(2, new ArrayList(this.b), this.c, this.a, new ArrayList(this.d), 0);
    }

    public final void a(BleFilter bleFilter) {
        b("__reserved_namespace", "__ble_record");
        this.d.add(bleFilter);
    }

    public final void a(String str, String str2) {
        boolean z;
        boolean z2;
        if (str == null || str.isEmpty() || str.contains("*")) {
            z = false;
        } else {
            z = true;
        }
        iva.b(z, "namespace(%s) cannot be null, empty or contain (*).", str);
        if (str2 == null || str2.contains("*")) {
            z2 = false;
        } else {
            z2 = true;
        }
        iva.b(z2, "type(%s) cannot be null or contain (*).", str2);
        b(str, str2);
    }
}
