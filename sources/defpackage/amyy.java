package defpackage;

import java.util.Map;

/* renamed from: amyy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amyy extends amze {
    final /* synthetic */ amzf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amyy(amzf amzf) {
        super(amzf);
        this.a = amzf;
    }

    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new amyw(this.a, i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int a2 = this.a.a(key);
            return a2 != -1 && amqx.a(value, this.a.b[a2]);
        }
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int a2 = amzi.a(key);
        int a3 = this.a.a(key, a2);
        if (a3 == -1 || !amqx.a(value, this.a.b[a3])) {
            return false;
        }
        this.a.a(a3, a2);
        return true;
    }
}
