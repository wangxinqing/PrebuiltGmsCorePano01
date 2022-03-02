package defpackage;

import java.util.Map;

/* renamed from: amza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amza extends amze {
    public amza(amzf amzf) {
        super(amzf);
    }

    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new amyx(this.b, i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int b = this.b.b(key);
            return b != -1 && amqx.a(this.b.a[b], value);
        }
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int a = amzi.a(key);
        int b = this.b.b(key, a);
        if (b == -1 || !amqx.a(this.b.a[b], value)) {
            return false;
        }
        this.b.b(b, a);
        return true;
    }
}
