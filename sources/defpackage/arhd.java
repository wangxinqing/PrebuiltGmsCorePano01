package defpackage;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Set;

/* renamed from: arhd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class arhd implements Map {
    private arha a;
    public arhj c;
    public arhg d;

    public static void a(arhd arhd, arhg arhg, ByteBuffer byteBuffer) {
        arhd.d = arhg;
        if (arhh.a(byteBuffer, arhd.c())) {
            arhd.a(byteBuffer);
            return;
        }
        throw new IllegalArgumentException("The read checksum is not equal to the calculated checksum.");
    }

    public abstract Object a(Object obj, boolean z);

    /* access modifiers changed from: protected */
    public abstract void a(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public abstract void b(ByteBuffer byteBuffer);

    public boolean b(Object obj) {
        if (!isEmpty()) {
            argy b = entrySet().iterator();
            while (b.hasNext()) {
                if (b.d().equals(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract byte c();

    public void c(ByteBuffer byteBuffer) {
        this.d.c(byteBuffer);
        int d2 = d() + 12;
        if (byteBuffer.position() + d2 <= byteBuffer.limit()) {
            int i = d2 - 12;
            byteBuffer.putInt(i);
            byteBuffer.position(byteBuffer.position() + 8);
            b(byteBuffer);
            arhh.a(byteBuffer, c(), i);
            return;
        }
        throw new BufferOverflowException();
    }

    public final void clear() {
        this.d.clear();
    }

    public boolean containsKey(Object obj) {
        return a(obj);
    }

    public boolean containsValue(Object obj) {
        return b(obj);
    }

    /* access modifiers changed from: protected */
    public abstract int d();

    /* renamed from: e */
    public abstract argz entrySet();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.size() == size()) {
                try {
                    argy b = entrySet().iterator();
                    while (b.hasNext()) {
                        if (!b.a().equals(map.get(b.c()))) {
                            return false;
                        }
                    }
                    return true;
                } catch (ClassCastException e) {
                } catch (NullPointerException e2) {
                    return false;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public abstract arhc values();

    public final int g() {
        return this.d.g();
    }

    public Object get(Object obj) {
        return a(obj, true);
    }

    public final int h() {
        return d() + 12 + this.d.h();
    }

    public final int hashCode() {
        argy b = entrySet().iterator();
        int i = 0;
        while (b.hasNext()) {
            i += b.c().hashCode() ^ b.a().hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        if (this.a == null) {
            this.a = new arha(this);
        }
        return this.a;
    }

    public abstract Object put(Object obj, Object obj2);

    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public abstract Object remove(Object obj);

    public final int size() {
        return this.d.size();
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        argy b = entrySet().iterator();
        while (true) {
            Object c2 = b.c();
            Object a2 = b.a();
            if (c2 == this) {
                c2 = "(this Map)";
            }
            sb.append(c2);
            sb.append('=');
            if (a2 == this) {
                a2 = "(this Map)";
            }
            sb.append(a2);
            if (b.hasNext()) {
                sb.append(", ");
            } else {
                sb.append('}');
                return sb.toString();
            }
        }
    }

    public boolean a(Object obj) {
        return this.d.a(obj);
    }
}
