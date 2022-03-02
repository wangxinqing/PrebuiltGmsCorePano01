package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: amxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amxc extends amvv {
    private static final long serialVersionUID = 0;
    transient int c;

    private amxc() {
        this(12, 3);
    }

    public static amxc a(int i, int i2) {
        return new amxc(i, i2);
    }

    public static amxc p() {
        return new amxc(12, 3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = 3;
        int readInt = objectInputStream.readInt();
        a((Map) amxr.a());
        anga.a(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        anga.a((aneu) this, objectOutputStream);
    }

    public final /* bridge */ /* synthetic */ Collection a() {
        return new ArrayList(this.c);
    }

    private amxc(int i, int i2) {
        super(amxr.a(i));
        amxg.a(i2, "expectedValuesPerKey");
        this.c = i2;
    }
}
