package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

/* renamed from: amzg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amzg extends amxb {
    private static final long serialVersionUID = 0;
    transient int c = 2;

    public static amzg q() {
        return new amzg();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = 2;
        int readInt = objectInputStream.readInt();
        a((Map) amxr.a(12));
        anga.a(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        anga.a((aneu) this, objectOutputStream);
    }

    public final /* bridge */ /* synthetic */ Collection a() {
        return amxt.a(this.c);
    }

    private amzg() {
        super(amxr.a(12));
        amrl.a(true);
        this.c = 2;
    }
}
