package defpackage;

import java.util.Map;

/* renamed from: audc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class audc implements Map.Entry {
    public final Map.Entry a;

    public audc(Map.Entry entry) {
        this.a = entry;
    }

    public final Object getKey() {
        return this.a.getKey();
    }

    public final Object getValue() {
        if (((aude) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof audx) {
            aude aude = (aude) this.a.getValue();
            audx audx = aude.a;
            aude.b = null;
            aude.a = (audx) obj;
            return audx;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
