package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: auab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class auab implements audw {
    public static void a(Iterable iterable, List list) {
        aucy.a((Object) iterable);
        if (iterable instanceof audh) {
            List d = ((audh) iterable).d();
            audh audh = (audh) list;
            int size = list.size();
            for (Object next : d) {
                if (next == null) {
                    int size2 = audh.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size3 = audh.size() - 1; size3 >= size; size3--) {
                        audh.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof auay) {
                    audh.a((auay) next);
                } else {
                    audh.add((String) next);
                }
            }
        } else if (!(iterable instanceof aueg)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object next2 : iterable) {
                if (next2 != null) {
                    list.add(next2);
                } else {
                    int size5 = list.size();
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(size5 - size4);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb4);
                }
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    /* renamed from: a */
    public abstract auab clone();

    /* access modifiers changed from: protected */
    public abstract void a(auac auac);

    public abstract void a(aubc aubc, aubs aubs);

    public void a(byte[] bArr, int i) {
        throw null;
    }

    public void a(byte[] bArr, int i, aubs aubs) {
        throw null;
    }

    public final void b(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public final void b(byte[] bArr, aubs aubs) {
        a(bArr, bArr.length, aubs);
    }

    public final /* bridge */ /* synthetic */ audw a(byte[] bArr) {
        b(bArr);
        return this;
    }

    public final /* bridge */ /* synthetic */ audw a(byte[] bArr, aubs aubs) {
        b(bArr, aubs);
        return this;
    }

    public final void a(aubc aubc) {
        a(aubc, aubs.b());
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        if (j().getClass().isInstance(audx)) {
            a((auac) audx);
            return;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
