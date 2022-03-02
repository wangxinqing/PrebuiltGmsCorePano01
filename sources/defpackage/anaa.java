package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/* renamed from: anaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class anaa extends anau implements ancq {
    private static final long serialVersionUID = 0;

    public anaa(anaf anaf, int i) {
        super(anaf, i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            anab h = anaf.h();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    amzt j = amzy.j();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        j.c(objectInputStream.readObject());
                    }
                    h.a(readObject, j.a());
                    i2 += readInt2;
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Invalid value count ");
                    sb.append(readInt2);
                    throw new InvalidObjectException(sb.toString());
                }
            }
            try {
                try {
                    anas.a.a.set(this, h.a());
                    try {
                        anas.b.a.set(this, Integer.valueOf(i2));
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    }
                } catch (IllegalAccessException e2) {
                    throw new AssertionError(e2);
                }
            } catch (IllegalArgumentException e3) {
                throw ((InvalidObjectException) new InvalidObjectException(e3.getMessage()).initCause(e3));
            }
        } else {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Invalid key count ");
            sb2.append(readInt);
            throw new InvalidObjectException(sb2.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        anga.a((aneu) this, objectOutputStream);
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ List b(Object obj) {
        throw null;
    }

    /* renamed from: e */
    public final amzy g(Object obj) {
        amzy amzy = (amzy) this.b.get(obj);
        return amzy == null ? amzy.h() : amzy;
    }
}
